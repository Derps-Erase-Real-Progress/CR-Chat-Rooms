package com.github.lukevers.CR;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_ShowGroupMembers {
	
	public CMD_ShowGroupMembers (CommandSender sender) {
		if (!sender.getName().equalsIgnoreCase("Console"))
			new Groups().showGroupMembers(new Get().getGroup((Player) sender), sender);
		else sender.sendMessage(ChatColor.GRAY+"You cannot show who is in your group because you are the console!");
	}//close constructor
	
}//close CMD_ShowGroupMembers
