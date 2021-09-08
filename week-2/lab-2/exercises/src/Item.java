public class Item {
    
    private String itemName;
    private String itemidNo;
    private int itemQuantity;
    private double itemPrice;

    public Item(String name, String idnum, int qty, double price) {
        this.itemName = name;
        this.itemidNo = idnum;
        this.itemQuantity = qty;
        this.itemPrice = price;
    }

    public Item(String name, String idnum, int qty) {
        this.itemName = name;
        this.itemidNo = idnum;
        this.itemQuantity = qty;
        this.itemPrice = 500;
    }

    public Item(String name, String idnum) {
        this.itemName = name;
        this.itemidNo = idnum;
        this.itemQuantity = 1;
        this.itemPrice = 500;
    }

    public String getItemName() {
        return this.itemName;
    }
    
    public void setItemName(String name) {
        this.itemName = name;
    }
    
    public String getItemIdNo() {
        return this.itemidNo;
    }
    
    public void setItemIdNo(String id) {
        this.itemidNo = id;
    }

    public int getItemQty() {
        return this.itemQuantity;
    }
    
    public void setItemQty(int qty) {
        this.itemQuantity = qty;
    }

    public double getItemPrice() {
        return this.itemPrice;
    }
    
    public void setItemPrice(double price) {
        this.itemPrice = price;
    }
}
