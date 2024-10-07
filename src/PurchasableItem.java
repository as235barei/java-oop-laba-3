public class PurchasableItem {
    private String name;
    private int quantity;
    private String supplier;

    public PurchasableItem(String name, int quantity, String supplier) {
        this.name = name;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    public String getSupplier() {
        return supplier;
    }

    @Override
    public String toString() {
        return "Item: " + name + ", Quantity: " + quantity + ", Supplier: " + supplier;
    }

}

