package com.github.lukevers.CR;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class CMD_Private {
	
	Plugin config = Bukkit.getServer().getPluginManager().getPlugin("CR");
	
	public CMD_Private (int length, CommandSender sender, String name, String [] args) {
		
		if (sender.hasPermission(new Permissions().publicprivate)) {
			if (name.equalsIgnoreCase("Console"))
				sender.sendMessage(ChatColor.GRAY+"You cannot set your chatroom to private because you are the console!");
			else {
				if (config.getConfig().getString("Player."+name+".CR").equalsIgnoreCase("Default")) {
					Bukkit.getServer().getPluginManager().getPlugin("CR").reloadConfig();
					if (length == 3) {
						config.getConfig().set("Player."+sender.getName()+".PR", "true");
						config.getConfig().set("Player."+sender.getName()+".PW", args[2]);
						config.getConfig().set("Player."+sender.getName()+".CR", args[1]);
						sender.sendMessage(ChatColor.GRAY+"You have set the chat room "+ChatColor.WHITE+config.getConfig().getString("Player."+name+".CR")+ChatColor.GRAY+" to "
								+ChatColor.LIGHT_PURPLE+"private" +ChatColor.GRAY+ " with the password of "+ChatColor.WHITE+config.getConfig().getString("Player."+name+".PW"));
						}//close length of 3
					else if (length == 2) {
						config.getConfig().set("Player."+sender.getName()+".PR", "true");
						config.getConfig().set("Player."+sender.getName()+".PW",args[1]);
						sender.sendMessage(ChatColor.GRAY+"You have set the chat room "+ChatColor.WHITE+config.getConfig().getString("Player."+name+".CR")+ChatColor.GRAY+" to "
								+ChatColor.LIGHT_PURPLE+"private" +ChatColor.GRAY+ " with the password of "+ChatColor.WHITE+config.getConfig().getString("Player."+name+".PW"));
						}//close length of 2
					else if (length == 1) {
						sender.sendMessage(ChatColor.GRAY+"You must provide a password!");
						}//close length of 1
					else sender.sendMessage(ChatColor.GRAY+"You can't make the default chatroom private!");
					Bukkit.getServer().getPluginManager().getPlugin("CR").saveConfig();
					}//close if player is in the default chatroom
				else if (config.getConfig().getString("Player."+name+".PR").equalsIgnoreCase("true"))
					sender.sendMessage(ChatColor.GRAY+"You can't make a chat room private when it already is! Use "+ChatColor.WHITE+"/cr public"+ChatColor.GRAY+" to make it public!");
				}//close if not the console
			}//close if has permissions
		else sender.sendMessage(ChatColor.GRAY+"You don't have permission to do that!");
		
	}//close constructor
	
}//close CMD_Private
