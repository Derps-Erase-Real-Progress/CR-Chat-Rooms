package com.github.lukevers.CR;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class CMD_setToDefault {
	
	Plugin config = Bukkit.getServer().getPluginManager().getPlugin("CR");
	
	public CMD_setToDefault (CommandSender sender, String name) {
		Bukkit.getServer().getPluginManager().getPlugin("CR").reloadConfig();
		config.getConfig().set("Player."+name+".CR", "Default");
		config.getConfig().set("Player."+name+".PW", "0000");
		config.getConfig().set("Player."+name+".PR", "false");
		Bukkit.getServer().getPluginManager().getPlugin("CR").saveConfig();
		sender.sendMessage(ChatColor.GRAY+"Success! You have changed your chat room to "+ChatColor.WHITE+"Default");
	}//close constructor
	
}//close CMD_setToDefault
