import java.util.ArrayList;

public class AdvancedMeasuringDevice extends MeasuringDevice{
    private int warrantyPeriod;

    public AdvancedMeasuringDevice(String deviceName, ArrayList<PurchasableItem> items, int warrantyPeriod ) {
        super(deviceName, items);
        this.warrantyPeriod = warrantyPeriod;
    }
    public AdvancedMeasuringDevice(int warrantyPeriod) {
        super();
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    public void setWarrantyPeriod(int newWarrantyPeriod) {
        warrantyPeriod = newWarrantyPeriod;
    }

    @Override
    public void displayDeviceInfo() {
        super.displayDeviceInfo();
        System.out.println("Warranty period: " + warrantyPeriod + " years");
    }


}
