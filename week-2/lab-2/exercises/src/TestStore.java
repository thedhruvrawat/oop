public class TestStore {
    public static void main(String[] args) {

        Customer customer = new Customer("Dhruv", "F20190537");

        Item keyboard = new Item("Keyboard", "KEY123");
        Item football = new Item("Football", "BALL114", 2, 670);

        customer.buyItem(keyboard);
        customer.buyItem(football);
    }
}