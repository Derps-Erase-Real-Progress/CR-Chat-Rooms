package com.github.lukevers.CR;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class CMD_Version {
	
	public CMD_Version(CommandSender sender) {
		String version = Bukkit.getServer().getPluginManager().getPlugin("CR").getDescription().getFullName();
		sender.sendMessage(ChatColor.GRAY+"Current version: "+ChatColor.WHITE+version);
		sender.sendMessage(ChatColor.GRAY+"To check for the most available update visit:");
		sender.sendMessage(ChatColor.WHITE+"dev.bukkit.org/server-mods/cr-chat-rooms/");
	}//close constructor
}//close CMD_Version
