public class XMLStorage implements UserStorage {
    @Override
    public void store(User user) {
        System.out.println("Saving " + user + " to XML file...");
        System.out.println("Data written to file successfully!");
    }
}