public class MySQLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println("Connecting to MySQL Database...");
        System.out.println(user + " saved to MySQL successfully!");
    }
}