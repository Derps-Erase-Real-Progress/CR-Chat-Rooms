package com.github.lukevers.CR;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Get {
	
	Plugin config = Bukkit.getServer().getPluginManager().getPlugin("CR");
	
	public Get () {
		super();
	}
	
	
	public String getGroup(Player player) {
		String str = config.getConfig().getString("Player."+player.getName()+".CR");
		Bukkit.getServer().getPluginManager().getPlugin("CR").saveConfig();
		return str; 
	}//close getGroup
	
	
	public String getPassword(String chatroom) {
		Player [] player = Bukkit.getServer().getOnlinePlayers();
		for (int i = 0; i < player.length; i++)
			if (config.getConfig().getString("Player."+player[i].getName()+".CR").equalsIgnoreCase(chatroom))
				return config.getConfig().getString("Player."+player[i].getName()+".PW");
		return "n/a";
	}//close getPassword
	
	
	public void getCurrentRooms(CommandSender sender) {
		ArrayList <String> current = new ArrayList <String> ();
		Player [] player = Bukkit.getServer().getOnlinePlayers();
		for (int i = 0; i < player.length; i++) {
			if (current.contains(config.getConfig().getString("Player."+player[i].getName()+".CR"))) {
				}
			else {
				if (new isPrivate().IsPrivate(config.getConfig().getString("Player."+player[i].getName()+".CR")))
					current.add(ChatColor.LIGHT_PURPLE+config.getConfig().getString("Player."+player[i].getName()+".CR"));
				else current.add(ChatColor.DARK_AQUA+config.getConfig().getString("Player."+player[i].getName()+".CR"));
				}
		}//close for
		
		int x = 0;
		for (int i = 0; i < current.size(); i++) {
			x+=i;
			for (x += 1; x < current.size(); x++)
				if (current.get(i).equalsIgnoreCase(current.get(x)))
					current.remove(x);
			}//close for

		sender.sendMessage(ChatColor.GRAY+"Current chatrooms in use: ("+ChatColor.DARK_AQUA+"public"+ChatColor.GRAY+","+ChatColor.LIGHT_PURPLE+" private"+ChatColor.GRAY+")");
		String subed = (current.toString()).substring(1,current.toString().length()-1);
		sender.sendMessage(subed);
		
	} //close get current rooms
	
	
	public ChatColor getCC(String player) {
		String color = config.getConfig().getString("Player."+player+".CC");
		if (color.equalsIgnoreCase("AQUA"))
			 return ChatColor.AQUA;
		else if (color.equalsIgnoreCase("BLACK"))
			 return ChatColor.BLACK;
		else if (color.equalsIgnoreCase("BLUE"))
			 return ChatColor.BLUE;
		else if (color.equalsIgnoreCase("DARK_AQUA"))
			 return ChatColor.DARK_AQUA;
		else if (color.equalsIgnoreCase("DARK_BLUE"))
			 return ChatColor.DARK_BLUE;
		else if (color.equalsIgnoreCase("DARK_GRAY"))
			 return ChatColor.DARK_GRAY;
		else if (color.equalsIgnoreCase("DARK_GREEN"))
			 return ChatColor.DARK_GREEN;
		else if (color.equalsIgnoreCase("DARK_PURPLE"))
			 return ChatColor.DARK_PURPLE;
		else if (color.equalsIgnoreCase("DARK_RED"))
			 return ChatColor.DARK_RED;
		else if (color.equalsIgnoreCase("GOLD"))
			 return ChatColor.GOLD;
		else if (color.equalsIgnoreCase("GRAY"))
			 return ChatColor.GRAY;
		else if (color.equalsIgnoreCase("GREEN"))
			 return ChatColor.GREEN;
		else if (color.equalsIgnoreCase("LIGHT_PURPLE"))
			 return ChatColor.LIGHT_PURPLE;
		else if (color.equalsIgnoreCase("RED"))
			 return ChatColor.RED;
		else if (color.equalsIgnoreCase("WHITE"))
			 return ChatColor.WHITE;
		else if (color.equalsIgnoreCase("YELLOW"))
			 return ChatColor.YELLOW;
		else return ChatColor.WHITE;
	}//close getCC
}//close Get
