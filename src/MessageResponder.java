import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

import org.omg.CORBA.portable.InputStream;

public class MessageResponder extends ListenerAdapter {
	public void onMessageReceived(MessageReceivedEvent event) {
		String message = event.getMessage().getContent();
		int alan = 0;
		
		if (message.toLowerCase().contains("oh shit")) {
			event.getTextChannel().sendMessage("Whaddup.").queue();
		}

		if (message.startsWith("!")) {
			String sub_message = message.substring(1);
			if(sub_message.equals("test")) {
				event.getTextChannel().sendMessage("$play reeee").queue();
			}
		}
		
		if (message.trim().startsWith(":") && message.endsWith(":")) {
			event.getTextChannel().sendMessage("Number of times thumbs up have been used: " + ++alan + ".\nAs always, your sarcastic remarks are appreciated.").queue();
		}
		
		/*
		if (message.startsWith("Stan's meat sux")) {
			String name = event.getAuthor().getName();
			String response = "";

			event.getTextChannel().sendMessage(response).queue();
		}

		if (message.startsWith("!ETH")) {
			String name = event.getAuthor().getName();
			String response = "ETH is currently $XXX.XX";

			event.getTextChannel().sendMessage(response).queue();
		}

		if (message.startsWith("!SB")) {
			String name = event.getAuthor().getName();
			String response = "Cao ni de ma";

			event.getTextChannel().sendMessage(response).queue();
		}
		*/
	}
}
