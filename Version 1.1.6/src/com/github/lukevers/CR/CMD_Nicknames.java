package com.github.lukevers.CR;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.Configuration;

public class CMD_Nicknames {
	
	Configuration config = Bukkit.getServer().getPluginManager().getPlugin("CR").getConfig();
	
	public CMD_Nicknames (int length, CommandSender sender, String name, String [] args) {
		
		if (sender.hasPermission(new Permissions().nick)) {
			Bukkit.getServer().getPluginManager().getPlugin("CR").reloadConfig();
			if (length == 1) {
				config.set("Player."+sender.getName()+".NM", sender.getName());
				sender.sendMessage(ChatColor.GRAY+"Your nickname has been reset to your username");
				}//close args 1
			else if (length == 2) {
				config.set("Player."+sender.getName()+".NM", args[1]);
				sender.sendMessage(ChatColor.GRAY+"Your nickname has been changed to "+ChatColor.WHITE+args[1]);
				}//close args 2
			Bukkit.getServer().getPluginManager().getPlugin("CR").saveConfig();
			}//close if has permissions
		
		else sender.sendMessage(ChatColor.GRAY+"You don't have permission to do that!");
		
	}//close constructor
	
}//close CMD_Nicknames
