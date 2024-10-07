import java.util.ArrayList;

public class MeasuringDevice extends AbstractDevice {

    public MeasuringDevice(String deviceName, ArrayList<PurchasableItem> items) {
        super(deviceName, items);
    }

    public MeasuringDevice() {
        super();
    }

    @Override
    public void displayDeviceInfo() {
        System.out.println("Device: " + deviceName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Material: " + material);

        System.out.println("Purchasable items:");
        for (PurchasableItem item : items) {
        System.out.println(item);
        }
    }

}
