public class ZaloSender implements MessageSender {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Kết nối Zalo...");
        System.out.println("Gửi tin nhắn tới " + recipient + ": " + message);
    }
}
