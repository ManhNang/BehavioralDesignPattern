/**
 * HỆ THỐNG OMNINOTIFY (LEGACY CODE)
 * Vấn đề: Thiết kế cứng nhắc, vi phạm SRP và OCP. Phụ thuộc chặt chẽ vào cấu
 * trúc switch-case.
 */
public class NotificationService {
    MessageSender mSender;

    public void setService(MessageSender mSender) {
        this.mSender = mSender;
    }

    public void sendNotification(String message, String recipient) {
        mSender.send(message, recipient);
    }

    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.setService(new EmailSender());
        service.sendNotification("Bạn có 1 hóa đơn mới", "user@email.com");

        service.setService(new SmsSender());
        service.sendNotification("Ma OTP cua ban la 123456", "0901234567");

        service.setService(new TelegramSender());
        service.sendNotification("Tôi yêu codegym", "Codegym");

        service.setService(new ZaloSender());
        service.sendNotification("Chị Hoa ơi cho e xin phép nghỉ hôm nay", "Lý Diệu Hoa");
    }
}