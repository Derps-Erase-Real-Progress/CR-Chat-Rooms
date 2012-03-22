package com.github.lukevers.CR;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.MemoryConfiguration;

public class CMD_RoomChange {
	
	MemoryConfiguration config = Bukkit.getServer().getPluginManager().getPlugin("CR").getConfig();
	//doesnt work ^^
	
	
	public CMD_RoomChange(CommandSender sender, String name, String [] args) {
		Bukkit.getServer().getPluginManager().getPlugin("CR").reloadConfig();
		if (args.length == 1) {
			if (!new isPrivate().IsPrivate(args[0])) {
				config.set("Player."+name+".CR", args[0]);
				sender.sendMessage(ChatColor.GRAY+"Success! You have changed your chat room to "+ChatColor.WHITE+args[0]);
				new Groups().sendtoGroup(args[0], name+" has joined "+args[0], name);
				}
			else sender.sendMessage(ChatColor.GRAY+"OH NO! This chat room is private and requires a password.");
			}//close args length 1
		else if (args.length == 2) {
			String pwd = new Get().getPassword(args[0]);
			if (pwd.equals(args[1])) {
				config.set("Player."+name+".CR", args[0]);
				config.set("Player."+name+".PW", args[1]);
				sender.sendMessage(ChatColor.GRAY+"Success! You have changed your chat room to "+ChatColor.WHITE+args[0]);
				new Groups().sendtoGroup(args[0], name+" has joined "+args[0], name);
				}
			else sender.sendMessage(ChatColor.GRAY+"Oops! The password you provided did not match up with the chat room password.");
			}//close args length 2
		Bukkit.getServer().getPluginManager().getPlugin("CR").saveConfig();
	}//close constructor
}//close CMD_RoomChange
