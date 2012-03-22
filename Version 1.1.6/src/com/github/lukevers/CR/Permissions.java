package com.github.lukevers.CR;


import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

public class Permissions {
	
	public Permission BAN_color_PERM = new Permission("CR.bancolor","Bans a certain color from chatrooms",PermissionDefault.OP);
	public Permission UNBAN_color_PERM = new Permission("CR.unbancolor","Unbans a certain color from chatrooms",PermissionDefault.OP);
	public Permission SET_DEFAULT_color = new Permission("CR.setdefault","Allows setting the default chatroom color",PermissionDefault.OP);
	public Permission publicprivate = new Permission("CR.publicprivate","Allows someone to create a private room",PermissionDefault.OP);
	public Permission nick = new Permission("CR.nick","Allows a player to use a nickname in a chatroom",PermissionDefault.OP);
	
	public Permissions() {
		super();
	}
}
