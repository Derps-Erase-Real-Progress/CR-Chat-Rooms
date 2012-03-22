package com.github.lukevers.CR;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class CMD_Help {
	
	public CMD_Help (CommandSender sender, String [] args) {
			if (args.length == 1) {
				sender.sendMessage(ChatColor.GOLD+"=================Chat Room Help (1/3)=================");
				sender.sendMessage(ChatColor.GRAY+"/cr"+ChatColor.YELLOW+" - Sets chatroom to Default");
				sender.sendMessage(ChatColor.GRAY+"/cr "+ChatColor.WHITE+"<name>"+ChatColor.YELLOW+" - Creates/sets your chatroom to "+ChatColor.WHITE+"<name>");
				sender.sendMessage(ChatColor.GRAY+"/cr "+ChatColor.WHITE+"<name>"+ChatColor.GRAY+" [password]"+ChatColor.YELLOW+" - Sets your chatroom to "+ChatColor.WHITE+"<name>");
				sender.sendMessage(ChatColor.GRAY+"/cr list"+ChatColor.YELLOW+" - Lists current chatrooms in use");
				sender.sendMessage(ChatColor.GRAY+"/cr help "+ChatColor.WHITE+"<page number>"+ChatColor.YELLOW+" - Shows the chatroom help");
				sender.sendMessage(ChatColor.GRAY+"/cr show"+ChatColor.YELLOW+" - Shows who is in your current chatroom");
				sender.sendMessage(ChatColor.GRAY+"/cr color"+ChatColor.YELLOW+" - Shows available colors to set your name");
				sender.sendMessage(ChatColor.GRAY+"/cr color "+ChatColor.WHITE+"<color>"+ChatColor.YELLOW+" - Sets chatroom color to "+ChatColor.WHITE+"<color>");
				}//close page one
			else if (args.length == 2 && args[1].equalsIgnoreCase("2")) {
				sender.sendMessage(ChatColor.GOLD+"=================Chat Room Help (2/3)=================");
				sender.sendMessage(ChatColor.GRAY+"/cr banned"+ChatColor.YELLOW+" - Shows the banned chatroom colors");
				sender.sendMessage(ChatColor.GRAY+"/cr version"+ChatColor.YELLOW+" - Shows the current version");
				sender.sendMessage(ChatColor.GRAY+"/cr ls"+ChatColor.YELLOW+" - Lists current chatrooms in use");
				sender.sendMessage(ChatColor.GRAY+"/cr h "+ChatColor.WHITE+"<page number>"+ChatColor.YELLOW+" - Shows the chatroom help");
				sender.sendMessage(ChatColor.GRAY+"/cr who"+ChatColor.YELLOW+" - Shows who is in your current chatroom");
				sender.sendMessage(ChatColor.GRAY+"/cr ban"+ChatColor.YELLOW+" - Shows the banned chatroom colors");
				sender.sendMessage(ChatColor.GRAY+"/cr v"+ChatColor.YELLOW+" - Shows the current version");
				}//close page two
			else if (args.length == 2 && args[1].equalsIgnoreCase("3")) {
				sender.sendMessage(ChatColor.GOLD+"=================Chat Room Help (3/3)=================");
				if (!sender.hasPermission(new Permissions().BAN_color_PERM) && !sender.hasPermission(new Permissions().UNBAN_color_PERM) && !sender.hasPermission(new Permissions().SET_DEFAULT_color) && !sender.hasPermission(new Permissions().nick) && !sender.hasPermission(new Permissions().publicprivate))
					sender.sendMessage(ChatColor.GRAY+"You do not have any permissions to view this page!");
				else {
					 	if (sender.hasPermission(new Permissions().nick))
						sender.sendMessage(ChatColor.GRAY+"/cr nick"+ChatColor.YELLOW+" - Sets chatroom nickname to username");
					if (sender.hasPermission(new Permissions().nick))
						sender.sendMessage(ChatColor.GRAY+"/cr nick"+ChatColor.WHITE+" <name>"+ChatColor.YELLOW+" - Sets chatroom nickname to "+ChatColor.WHITE+"<name>");
					if (sender.hasPermission(new Permissions().publicprivate))
						sender.sendMessage(ChatColor.GRAY+"/cr private "+ChatColor.WHITE+"<password>"+ChatColor.YELLOW+" - Sets your current chat room to private");
					if (sender.hasPermission(new Permissions().publicprivate))
						sender.sendMessage(ChatColor.GRAY+"/cr private "+ChatColor.WHITE+"<name> <password>"+ChatColor.YELLOW+" - Creates a private chatroom");
					if (sender.hasPermission(new Permissions().publicprivate))
						sender.sendMessage(ChatColor.GRAY+"/cr public"+ChatColor.YELLOW+" - Sets your current chat room to public");
					if (sender.hasPermission(new Permissions().BAN_color_PERM))
						sender.sendMessage(ChatColor.GRAY+"/cr color ban "+ChatColor.WHITE+"<color>"+ChatColor.YELLOW+" - Bans a certain color from chatrooms");
					if (sender.hasPermission(new Permissions().UNBAN_color_PERM))
						sender.sendMessage(ChatColor.GRAY+"/cr color unban "+ChatColor.WHITE+"<color>"+ChatColor.YELLOW+" - Unbans a certain color from chatrooms");
					if (sender.hasPermission(new Permissions().SET_DEFAULT_color))
						sender.sendMessage(ChatColor.GRAY+"/cr color default "+ChatColor.WHITE+"<color>"+ChatColor.YELLOW+" - Sets default chatroom color");
					}
				}//close page three
	}//close constructor
}//close CMD_Help
