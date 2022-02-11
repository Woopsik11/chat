package january_chat;


import january_chat.auth.InMemoryAuthService;
import january_chat.server.Server;

public class App {
    public static void main(String[] args) {
        new Server(new InMemoryAuthService()).start();
    }
}