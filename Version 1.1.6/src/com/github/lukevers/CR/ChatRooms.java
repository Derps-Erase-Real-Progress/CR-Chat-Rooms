package com.github.lukevers.CR;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatRooms extends JavaPlugin implements Listener {
	
	Logger log = Logger.getLogger("Minecraft");
	
	@Override
	public void onDisable() {
		log.info("CR disabled!");
		saveConfig();
	}//close onDisable

	@Override
	public void onEnable() {
		new CheckBanned();
		getServer().getPluginManager().registerEvents(this, this);
		reloadConfig();
		if (getConfig().getString("DEFAULT_color") == null) {
			getConfig().set("DEFAULT_color", "GREEN");
			}
		saveConfig();
		log.info("CR enabled!");
	}//close onEnable
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		reloadConfig();
		ArrayList <String> colors = new AddColors().colors();
		new Commands(sender, cmd.getName(), sender.getName(), args, colors);
		saveConfig();
		return true;
	}
	
	@EventHandler (priority = EventPriority.HIGHEST)
	public void onPlayerChat (PlayerChatEvent event) {
		reloadConfig();
		if (!getConfig().getString("Player."+event.getPlayer().getName()+".CR").equalsIgnoreCase("Default")) {
			String ms0 = new Get().getCC(event.getPlayer().getName())+getConfig().getString("Player."+event.getPlayer().getName()+".NM")+": "+ChatColor.WHITE+event.getMessage();
			new Groups().sendtoGroup(new Get().getGroup(event.getPlayer()), ms0, event.getPlayer().getName());
			event.setCancelled(true);
			saveConfig();
			}//close not default stuffs
	}//close onPlayerChat
	
	@EventHandler (priority = EventPriority.HIGHEST)
	public void onPlayerLogin (PlayerLoginEvent event) {
		reloadConfig();
		if (getConfig().getString("Player."+event.getPlayer().getName()+".CR") == null)
			getConfig().set("Player."+event.getPlayer().getName()+".CR", "Default");
		if (getConfig().getString("Player."+event.getPlayer().getName()+".CC") == null)
			getConfig().set("Player."+event.getPlayer().getName()+".CC", "Default");
		if (getConfig().getString("Player."+event.getPlayer().getName()+".PR") == null)
			getConfig().set("Player."+event.getPlayer().getName()+".PR", "false");
		if (getConfig().getString("Player."+event.getPlayer().getName()+".PW") == null)
			getConfig().set("Player."+event.getPlayer().getName()+".PW", "0000");
		if (getConfig().getString("Player."+event.getPlayer().getName()+".NM") == null)
			getConfig().set("Player."+event.getPlayer().getName()+".NM", event.getPlayer().getName());
		saveConfig();
	}//close onPlayerLogin
	
} // close ChatRooms