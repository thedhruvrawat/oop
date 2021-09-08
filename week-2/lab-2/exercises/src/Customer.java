public class Customer {
    private String name;
    private String idNo;
    private double balance;
    private Item item;

    public Customer(String name, String id, double bal) {
        this.name = name;
        this.idNo = id;
        this.balance = bal;
    }
    
    public Customer(String name, String id) {
        this.name = name;
        this.idNo = id;
        this.balance = 5000;
    }

    public String getName() {
        return this.name;
    }
    
    public String getIdNo() {
        return this.idNo;
    }

    public double getBalance() {
        return this.balance;
    }

    public Item getItem() {
        return this.item;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNo(String id) {
        this.idNo = id;
    }

    public void print() {
        System.out.println("Item Name: \t" + this.item.getItemName());
        System.out.println("Item ID: \t" + this.item.getItemIdNo());
        System.out.println("Item Quantity: \t" + this.item.getItemQty());
        System.out.println("Item Price: \t" + this.item.getItemPrice());
        System.out.println("**********************************");
        System.out.println("Balance left: \tRs. " + this.balance);
        System.out.println("**********************************");
    }

    public void buyItem(Item item) {
        double balanceNeeded = item.getItemQty()*item.getItemPrice();
        if (this.balance >= balanceNeeded && item.getItemQty()>=1) {
            this.item = item;
            this.balance -= balanceNeeded;
            print();
        } else if (this.balance < item.getItemPrice()) {
            System.out.println("Insufficient Balance!");
        } else if (item.getItemQty() < 1) {
            System.out.println("Order is not valid!");
        } else {
            System.out.println("Error!!");
        }
    }
}