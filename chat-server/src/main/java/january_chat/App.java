package january_chat;


import january_chat.auth.DatabaseAuthService;
import january_chat.server.Server;

public class App {
    public static void main(String[] args) {
        new Server(new DatabaseAuthService()).start();
    }
}