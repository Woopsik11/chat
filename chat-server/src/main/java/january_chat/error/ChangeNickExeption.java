package january_chat.error;

public class ChangeNickExeption extends RuntimeException {
    public ChangeNickExeption(String message) {
        super(message);
    }
}