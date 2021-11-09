public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "Ding Ding Ding Ding";
    }
    @Override
    public String unlock() {
        return "IPhone Unlocked via Face ID";
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

