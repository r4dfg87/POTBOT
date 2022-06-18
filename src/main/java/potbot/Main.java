package potbot;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.server.Server;
import org.javacord.api.interaction.SlashCommand;

import potbot.listeners.MessageListener;

import org.javacord.*;

public class Main {

	public static void main(String[] args) {
		// Setup API, do not touch.
		DiscordApi api = new DiscordApiBuilder()
		.setToken("OTcyNTEyMjY1MzQ3NjcwMDY2.GcOoYC.U3dVMeVDedUbyrcx_7m2LmNWYxNLUDbfDaDsy8")
		.login()
		.join();

		api.addListener(new MessageListener());
	}
}
