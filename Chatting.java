package P09;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
	}
		
	class Chat{
			public void start(String nickName) {
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+nickName+"]"+ inputData;
					sendMessage(message);
					break;
				}
			}
		
		
			void sendMessage(String message) {
				System.out.println(message);
			}
	}
	
	
	public static void main(String[] args) {
		Chatting chat = new Chatting();
		Chatting.Chat c = chat.new Chat();
		c.start("바보");
		
		
	}
}
