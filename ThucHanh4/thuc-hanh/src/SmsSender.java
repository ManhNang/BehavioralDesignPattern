public class SmsSender implements MessageSender {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Kết nối Telecom API...");
        System.out.println("Gửi SMS tới " + recipient + ": " + message);
    }
}
