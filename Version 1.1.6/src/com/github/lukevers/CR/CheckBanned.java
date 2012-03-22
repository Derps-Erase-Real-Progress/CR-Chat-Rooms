package com.github.lukevers.CR;

import org.bukkit.Bukkit;
import org.bukkit.configuration.Configuration;

public class CheckBanned {
	
	public CheckBanned () {
			
			Configuration config = Bukkit.getServer().getPluginManager().getPlugin("CR").getConfig();

			if (config.getString("BANNED.AQUA") == null) {
				config.set("BANNED.AQUA", "false");
				}
			if (config.getString("BANNED.BLACK") == null) {
				config.set("BANNED.BLACK", "false");
				}
			if (config.getString("BANNED.BLUE") == null) {
				config.set("BANNED.BLUE", "false");
				}
			if (config.getString("BANNED.DARK_AQUA") == null) {
				config.set("BANNED.DARK_AQUA", "false");
				}
			if (config.getString("BANNED.DARK_BLUE") == null) {
				config.set("BANNED.DARK_BLUE", "false");
				}
			if (config.getString("BANNED.DARK_GRAY") == null) {
				config.set("BANNED.DARK_GRAY", "false");
				}
			if (config.getString("BANNED.DARK_GREEN") == null) {
				config.set("BANNED.DARK_GREEN", "false");
				}
			if (config.getString("BANNED.DARK_PURPLE") == null) {
				config.set("BANNED.DARK_PURPLE", "false");
				}
			if (config.getString("BANNED.DARK_RED") == null) {
				config.set("BANNED.DARK_RED", "false");
				}
			if (config.getString("BANNED.GOLD") == null) {
				config.set("BANNED.GOLD", "false");
				}
			if (config.getString("BANNED.GRAY") == null) {
				config.set("BANNED.GRAY", "false");
				}
			if (config.getString("BANNED.GREEN") == null) {
				config.set("BANNED.GREEN", "false");
				}
			if (config.getString("BANNED.LIGHT_PURPLE") == null) {
				config.set("BANNED.LIGHT_PURPLE", "false");
				}
			if (config.getString("BANNED.RED") == null) {
				config.set("BANNED.RED", "false");
				}
			if (config.getString("BANNED.WHITE") == null) {
				config.set("BANNED.WHITE", "false");
				}
			if (config.getString("BANNED.YELLOW") == null) {
				config.set("BANNED.YELLOW", "false");
				}			
			Bukkit.getServer().getPluginManager().getPlugin("CR").saveConfig();
	
	}//close constructor
	
}//close check banned
