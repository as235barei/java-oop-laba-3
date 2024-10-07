import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<PurchasableItem> itemsList = new ArrayList<>();
        itemsList.add(new PurchasableItem("Resistor", 5, "Resistor Supplier"));
        itemsList.add(new PurchasableItem("Capacitor",3, "Capacitor Supplier"));

        MeasuringDevice instrument1 = new MeasuringDevice("Multimeter", itemsList);

        AdvancedMeasuringDevice advanceInstr = new AdvancedMeasuringDevice( "Pro", itemsList, 3);
        AdvancedMeasuringDevice advanceInstr1 = new AdvancedMeasuringDevice(2);

        System.out.println("Device 1 info:\n——————————————");
        instrument1.displayDeviceInfo();

        System.out.println("\nDevice advanceInstr info:\n——————————————");
        advanceInstr.displayDeviceInfo();

        System.out.println("\n======================\nMaterial = "+MeasuringDevice.getMaterial());
        MeasuringDevice.setMaterial("Gold");
        System.out.println("Manufacturer = "+AdvancedMeasuringDevice.getManufacturer());
        AdvancedMeasuringDevice.setManufacturer("Neskazhu");
        System.out.println("Manufacturer = "+AbstractDevice.getManufacturer()+"\n======================");

        PurchasableItem newTestItem = new PurchasableItem("NewTestItem", 7, "Test supplier");
        instrument1.addNewItem(newTestItem);

        System.out.println("\n——————————————");
        instrument1.displayDeviceInfo();
        System.out.println("——————————————\n");

        instrument1.removeItem(newTestItem);

        instrument1.items.get(1).setName("Fiffa");
        instrument1.items.get(1).setQuantity(1);
        instrument1.items.get(1).setSupplier("Fiffa Sup");
        System.out.println("\n\n——————————————\nnameItem= "+instrument1.items.get(1).getName());
        System.out.println("nameQuantity= "+instrument1.items.get(1).getQuantity());
        System.out.println("nameSupplier= "+instrument1.items.get(1).getSupplier()+"\n——————————————\n");

        instrument1.displayDeviceInfo();

        System.out.println("\nadvanceInstr warrantyPeriod = "+advanceInstr.getWarrantyPeriod());
        System.out.println("\nadvanceInstr1 warrantyPeriod = "+advanceInstr1.getWarrantyPeriod());
        advanceInstr1.setWarrantyPeriod(7);
        System.out.println("\nadvanceInstr1 new warrantyPeriod = "+advanceInstr1.getWarrantyPeriod());

    }
}