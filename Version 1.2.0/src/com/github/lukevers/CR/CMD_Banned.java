package com.github.lukevers.CR;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class CMD_Banned {
	
	Plugin config = Bukkit.getServer().getPluginManager().getPlugin("CR");

	public CMD_Banned (CommandSender sender, ArrayList <String> colors) {
		ArrayList <String> bannedcolors = new ArrayList <String> ();
		for (int i = 0; i < colors.size(); i++)
			if (config.getConfig().getString("BANNED."+colors.get(i)).equalsIgnoreCase("true"))
				bannedcolors.add(colors.get(i));
		if (bannedcolors.size() > 0)
			sender.sendMessage(ChatColor.GRAY+"Banned chatroom colors: "+ChatColor.WHITE+bannedcolors);
		else sender.sendMessage(ChatColor.GRAY+"Banned chatroom colors: "+ChatColor.WHITE+"none!");
		
	}//close constructor
}//close CMD_Banned
