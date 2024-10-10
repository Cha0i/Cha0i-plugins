package com.cha0iplugins;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class cha0ipluginsTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(cha0iplugins.class);
		RuneLite.main(args);
	}
}