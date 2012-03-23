package com.github.lukevers.CR;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Groups {
	
	Plugin config = Bukkit.getServer().getPluginManager().getPlugin("CR");
	
	public Groups () {
		super();
	}
	
	
	public void sendtoGroup(String group, String msg, String player) {
		Player [] players = Bukkit.getServer().getOnlinePlayers();
		for (int i = 0; i < players.length; i++) {
			if (config.getConfig().getString("Player."+players[i].getName()+".CR").equalsIgnoreCase(group)) {
				players[i].sendMessage(msg);
				Bukkit.getServer().getPluginManager().getPlugin("CR").saveConfig();
				}//close if
		}//close for
	}//close sendtoGroup
	
	
	public void showGroupMembers (String group, CommandSender sender) {
		ArrayList <String> players = new ArrayList <String> ();
		Player [] player = Bukkit.getServer().getOnlinePlayers();
		for (int i = 0; i < player.length; i++) {
			if (config.getConfig().getString("Player."+player[i].getName()+".CR").equalsIgnoreCase(group)) {
				if (config.getConfig().getString("Player."+player[i].getName()+".NM").equalsIgnoreCase(player[i].getName()))
					players.add(player[i].getName());
				else players.add(player[i].getName()+" ("+config.getConfig().getString("Player."+player[i].getName()+".NM")+")");
			}
		}//close for
		sender.sendMessage(ChatColor.GRAY+"Current chatroom members: ");
		String subbed = (players.toString()).substring(1, players.toString().length()-1);
		sender.sendMessage(subbed);
	}
	
}
