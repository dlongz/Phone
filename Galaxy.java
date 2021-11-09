public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "RING RING RING";
    }
    @Override
    public String unlock() {
        return "Galaxy Unlocked via Finger Print";
    }
    @Override
    public void displayInfo() {
        String versionNumber = getVersionNumber();
        int batteryPercentage = getBatteryPercentage();
        String carrier = getPhoneCarrier();
        String ringTone = getRingTone();
        System.out.printf("Version Number: %s%n", versionNumber);            
        System.out.printf("Battery Percentage: %d%n", batteryPercentage);            
        System.out.printf("Phone Carrier: %s%n", carrier);            
        System.out.printf("Ring Tone: %s%n", ringTone);            
    }
}

