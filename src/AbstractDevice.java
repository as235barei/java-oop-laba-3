import java.util.ArrayList;
import java.util.Scanner;

abstract class AbstractDevice {

    protected String deviceName;
    protected ArrayList<PurchasableItem> items;

    public AbstractDevice(String deviceName, ArrayList<PurchasableItem> items) {
        this.deviceName = deviceName;
        this.items = items;
    }

    public AbstractDevice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter device name: ");
        this.deviceName = scanner.nextLine();

        this.items = new ArrayList<>();
        System.out.println("How many purchased products do you need?");
        scanner.nextLine(); // Очищення буфера

        System.out.print("Enter the number of products: ");
        int itemCount = scanner.nextInt();
        scanner.nextLine(); // Очищення буфера

        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();

            System.out.print("Enter product quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Очищення буфера

            System.out.print("Enter product supplier: ");
            String supplier = scanner.nextLine();

            items.add(new PurchasableItem(name, quantity, supplier));

        }
    }

    public abstract void displayDeviceInfo();

    public void addNewItem(PurchasableItem item) {
        items.add(item);
        System.out.println("\nItem added: " + item);
    }

//    public void removeItem(int index) {
//        if (index >= 0 && index < items.size()) {
//            items.remove(index);
//            System.out.printf("Item at index %s was successfully deleted.", index);
//        } else {
//            System.out.println("Invalid index.");
//        }
//    }

    public void removeItem(PurchasableItem item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.printf("Item «%s» removed successfully.", item);
        } else {
            System.out.println("Item not found in the device.");
        }
    }

    protected static String material = "Metal";
    protected static String manufacturer = "Global Devices Ltd.";

    public static String getMaterial() {
        return material;
    }
    public static void setMaterial(String newMaterial) {
         material = newMaterial;
    }

    public static String getManufacturer() {
        return manufacturer;
    }
    public static void setManufacturer(String newManufacturer) {
        manufacturer = newManufacturer;
    }

}
