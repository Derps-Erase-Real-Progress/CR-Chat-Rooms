package com.github.lukevers.CR;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class CMD_Public {
	
	Plugin config = Bukkit.getServer().getPluginManager().getPlugin("CR");
	
	public CMD_Public (CommandSender sender, String name) {
		if (sender.hasPermission(new Permissions().publicprivate)) {
			if (!name.equalsIgnoreCase("Console")) {
				if (config.getConfig().getString("Player."+name+".CR").equalsIgnoreCase("Default"))
					sender.sendMessage(ChatColor.GRAY+"The default chat room is already public!");
				else if (config.getConfig().getString("Player."+name+".PR").equalsIgnoreCase("false"))
					sender.sendMessage(ChatColor.GRAY+"You can't make a chat room public when it already is! Use "+ChatColor.WHITE+"/cr private"+ChatColor.GRAY+" to make it private!");
				else {//change it public
					Bukkit.getServer().getPluginManager().getPlugin("CR").reloadConfig();
					config.getConfig().set("Player."+name+".PR", "false");
					config.getConfig().set("Player."+name+".PW", "0000");
					sender.sendMessage(ChatColor.GRAY+"You have set the chat room "+ChatColor.WHITE+config.getConfig().getString("Player."+name+".CR")+ChatColor.GRAY+" to "+
									   ChatColor.DARK_AQUA+"public");
					Bukkit.getServer().getPluginManager().getPlugin("CR").saveConfig();
					}//close change it public 
				}//if not the console
			else sender.sendMessage(ChatColor.GRAY+"You cannot make the group you are currently in public because you are the console!");
			}//if has permissions
		else sender.sendMessage(ChatColor.GRAY+"You don't have permission to do that!");
		
	}//close constructor
}//close CMD_Public
