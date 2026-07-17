public class TelegramSender implements MessageSender {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Kết nối Telegram...");
        System.out.println("Gửi tin nhắn tới " + recipient + ": " + message);
    }
}
