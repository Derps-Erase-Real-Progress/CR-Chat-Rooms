package com.github.lukevers.CR;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.Configuration;

public class CMD_Color {
	
	Configuration config = Bukkit.getServer().getPluginManager().getPlugin("CR").getConfig();
	
	public CMD_Color (CommandSender sender, String name, String [] args, ArrayList <String> colors) {
		
		if (args.length == 1) {
			sender.sendMessage(ChatColor.GRAY+"Chat colors: "+ChatColor.DARK_GRAY+"(including possible banned colors)");
			sender.sendMessage(ChatColor.AQUA+"Aqua, "+ChatColor.BLACK+"Black, "+ChatColor.BLUE+"Blue, "+ChatColor.DARK_AQUA+"Dark_Aqua, "+
						   	   ChatColor.DARK_BLUE+"Dark_Blue, "+ChatColor.DARK_GRAY+"Dark_Gray, "+ChatColor.DARK_GREEN+"Dark_Green, "+ChatColor.DARK_PURPLE+"Dark_Purple, "+
						       ChatColor.DARK_RED+"Dark_Red, "+ChatColor.GOLD+"Gold, "+ChatColor.GRAY+"Gray, "+ChatColor.GREEN+"Green, "+
						   	   ChatColor.LIGHT_PURPLE+"Light_Purple, "+ChatColor.RED+"Red, "+ChatColor.WHITE+"White, "+ChatColor.YELLOW+"Yellow");
			}//close set with arguments of only one
		else if (args.length == 2) {
			if (colors.contains(args[1].toUpperCase())) {
				if (config.getString("BANNED."+args[1].toUpperCase()).equalsIgnoreCase("false")) {
					config.set("Player."+name+".CC", args[1]);
					sender.sendMessage("Your chat color has been changed to: "+new Get().getCC(name)+args[1]);
					}//close if not banned
				else sender.sendMessage(ChatColor.GRAY+"The chat color "+args[1]+" has been banned!");
				}
			else sender.sendMessage(ChatColor.GRAY+"I'm sorry, but that color does not exist.");
			}//close set with arguments of two
		else if (args.length == 3 && args[1].equalsIgnoreCase("ban")) {
			if (sender.hasPermission(new Permissions().BAN_color_PERM)) {
				if (colors.contains(args[2].toUpperCase())) {
					config.set("BANNED."+args[2].toUpperCase(), "true");
					sender.sendMessage(ChatColor.GRAY+"The color "+args[2]+" has been banned from chatrooms!");
					}
				else sender.sendMessage(ChatColor.GRAY+"I'm sorry, but that color does not exist.");
				}//has permissions
			else sender.sendMessage(ChatColor.GRAY+"I'm sorry, but you do not have permission to do this.");
			}//close set with arguments of three ban
		else if (args.length == 3 && args[1].equalsIgnoreCase("unban")) {
			if (sender.hasPermission(new Permissions().BAN_color_PERM)) {
				if (colors.contains(args[2].toUpperCase())) {
					config.set("BANNED."+args[2].toUpperCase(), "false");
					sender.sendMessage(ChatColor.GRAY+"The color "+args[2]+" has been unbanned from chatrooms!");
					}
				else sender.sendMessage(ChatColor.GRAY+"I'm sorry, but that color does not exist.");
				}//has permissions
			else sender.sendMessage(ChatColor.GRAY+"I'm sorry, but you do not have permission to do this.");
			}//close set with arguments of three unban
		
		else if (args.length == 3 && args[1].equalsIgnoreCase("default")) {
			if (sender.hasPermission(new Permissions().SET_DEFAULT_color)) {
				if (colors.contains(args[2].toUpperCase())) {
					config.set("DEFAULT_color", args[2]);
					sender.sendMessage(ChatColor.GRAY+"The color "+ChatColor.WHITE+args[2]+ChatColor.GRAY+" has been set as the default chatroom color!");
					}
				else sender.sendMessage(ChatColor.GRAY+"I'm sorry, but that color does not exist.");
				}//has permissions
			else sender.sendMessage(ChatColor.GRAY+"I'm sorry, but you do not have permission to do this.");
			}//close set with arguments of three default
		
	}//close constructor
}//close CMD_Color
