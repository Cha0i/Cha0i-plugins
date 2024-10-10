package com.cha0iplugins;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("Cha0i Plugins")
public interface cha0ipluginsConfig extends Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Welcome Greeting",
		description = "We be sideloading like a mf"
	)
	default String greeting()
	{
		return "Hello";
	}
}
