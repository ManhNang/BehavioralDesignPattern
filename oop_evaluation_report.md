Lợi ích của Interface so với Switch-case trong bảo trì dài hạn
Sử dụng Interface thay cho cấu trúc switch-case mang lại ba lợi ích cốt lõi cho việc bảo trì dự án dài hạn:

1. Tuân thủ nguyên lý OCP (Open/Closed Principle): Khi thêm kênh thông báo mới (như Telegram, Zalo), ta chỉ cần tạo một lớp mới hiện thực MessageSender mà không cần can thiệp hay sửa đổi mã nguồn của lớp dịch vụ lõi NotificationService. Điều này loại bỏ hoàn toàn rủi ro gây lỗi dây chuyền (regression bugs) lên các tính năng cũ đang chạy ổn định.
2. Giảm độ kết dính (Loose Coupling) & Tăng tính đóng gói: Mỗi lớp cụ thể tự quản lý logic gửi và thư viện bên thứ ba của riêng mình. NotificationService không cần biết chi tiết triển khai của từng kênh, giúp mã nguồn sạch hơn và dễ kiểm thử độc lập (Unit Test).
3. Tránh bẫy phình to mã nguồn (Conditional Explosion): Loại bỏ được những hàm "phình to" với hàng chục nhánh rẽ phức tạp, giúp hệ thống đạt trạng thái "Plug-and-Play" (cắm và chạy), dễ dàng bàn giao và mở rộng quy mô dự án.
