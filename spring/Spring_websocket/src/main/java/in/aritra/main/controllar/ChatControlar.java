package in.aritra.main.controllar;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import in.aritra.main.model.ChatMessage;

@Controller
public class ChatControlar {
	@MessageMapping("/chat.register")
	@SendTo("/topic/public")
	public ChatMessage register(@Payload  ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
		return chatMessage;
	}
	@MessageMapping("/chat.send")
	@SendTo("/topic/public")
	public ChatMessage sendMessage(@Payload ChatMessage chatMessage)
	{
		return chatMessage;
	}
	@MessageMapping("/chat.register1")
	@SendTo("/topic/public1")
	public ChatMessage register1(@Payload  ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor) {
		headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
		return chatMessage;
	}
	@MessageMapping("/chat.send1")
	@SendTo("/topic/public1")
	public ChatMessage sendMessage2(@Payload ChatMessage chatMessage)
	{
		return chatMessage;
	}
}