public class Main {
    public static void main(String[] args) {
        User user = new User("Trần Mạnh Năng", "manhnang12d@gmail.com");

        // Chạy thử với XMLStorage
        UserStorage xmlStorage = new XMLStorage();
        UserController controller = new UserController(xmlStorage);
        controller.store(user);

        // Chạy thử với MySQLStorage
        UserStorage mySQLStorage = new MySQLStorage();
        controller.setUserStorage(mySQLStorage);
        controller.store(user);
    }
}