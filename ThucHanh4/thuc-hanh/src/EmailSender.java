public class EmailSender implements MessageSender {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Kết nối SMTP Server...");
        System.out.println("Gửi EMAIL tới " + recipient + ": " + message);
    }
}
