package annotations.spring;

import org.springframework.stereotype.Component;

@Component
public class ChatRoomService {

	public void start() {
		System.out.println("Starting the chat room...");
	}
}
