package com.github.lukevers.CR;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.configuration.Configuration;
import org.bukkit.entity.Player;

public class isPrivate {
	
	Configuration config = Bukkit.getServer().getPluginManager().getPlugin("CR").getConfig();
	
	public isPrivate () {
		super();
	}
	
	public boolean IsPrivate (String chatroom) {
		ArrayList <String> privates = new ArrayList <String> ();
		Player [] player = Bukkit.getServer().getOnlinePlayers();
		for (int i = 0; i < player.length; i++) {
			if (!privates.contains(config.getString("Player."+player[i].getName()+".CR")))
				if (config.getString("Player."+player[i].getName()+".PR").equalsIgnoreCase("true"))
					privates.add(config.getString("Player."+player[i].getName()+".CR"));
			}
		if (privates.contains(chatroom))
			return true;
		else return false;
	}//close is private
	
}//close isPrivate 
