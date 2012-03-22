package com.github.lukevers.CR;

import org.bukkit.command.CommandSender;

public class CMD_List {
	
	public CMD_List (CommandSender sender) {
		new Get().getCurrentRooms(sender);
	}//close constructor

}//close CMD_List
