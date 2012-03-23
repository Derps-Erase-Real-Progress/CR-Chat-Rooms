package com.github.lukevers.CR;

import java.util.ArrayList;

import org.bukkit.command.CommandSender;

public class Commands {
	
	public Commands (CommandSender sender, String cmd, String name, String [] args, ArrayList <String> colors) {
		if (cmd.equalsIgnoreCase("cr")) {
			
			if (args.length == 0) {
				new CMD_setToDefault(sender, name);
				}//close args length 0
			
			else if (args.length == 1) {
				
				if (args[0].equalsIgnoreCase("show") || args[0].equalsIgnoreCase("who"))
					new CMD_ShowGroupMembers(sender);
				
				else if (args[0].equalsIgnoreCase("list") || args[0].equalsIgnoreCase("ls"))
					new CMD_List(sender);
				
				else if (args[0].equalsIgnoreCase("nick"))
					new CMD_Nicknames(args.length, sender, name, args);
				
				else if (args[0].equalsIgnoreCase("private"))
					new CMD_Private(args.length, sender, name, args);
				
				else if (args[0].equalsIgnoreCase("public"))
					new CMD_Public(sender, name);
				
				else if (args[0].equalsIgnoreCase("version") || args[0].equalsIgnoreCase("v"))
					new CMD_Version(sender);
				
				else if (args[0].equalsIgnoreCase("help") || args[0].equalsIgnoreCase("h"))
					new CMD_Help(sender, args);
				
				else if (args[0].equalsIgnoreCase("banned") || args[0].equalsIgnoreCase("ban"))
					new CMD_Banned(sender, colors);
				
				else if (args[0].equalsIgnoreCase("color"))
					new CMD_Color(sender, name, args, colors);
				
				// ---- KEEP THIS ONE LAST ----
				else new CMD_RoomChange(sender, name, args);
				
				}//close args length 1
			
			else if (args.length == 2) {
				
				if (args[0].equalsIgnoreCase("nick"))
					new CMD_Nicknames(args.length, sender, name, args);
				
				else if (args[0].equalsIgnoreCase("private"))
					new CMD_Private(args.length, sender, name, args);
				
				else if (args[0].equalsIgnoreCase("help") || args[0].equalsIgnoreCase("h"))
					new CMD_Help(sender, args);
				
				else if (args[0].equalsIgnoreCase("color"))
					new CMD_Color(sender, name, args, colors);
				
				// ---- KEEP THIS ONE LAST ----
				else new CMD_RoomChange(sender, name, args);
				
				}//close args length 2
			
			else if (args.length == 3) {
				
				if (args[0].equalsIgnoreCase("private"))
					new CMD_Private(args.length, sender, name, args);
				
				else if (args[0].equalsIgnoreCase("color"))
					new CMD_Color(sender, name, args, colors);
				
				}//close args length 3
			
			
		} //close if command is "cr"
	}//close constructor
	
}//close commands
