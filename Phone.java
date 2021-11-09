public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;

    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();

    // getters and setters removed for brevity. Please implement them yourself

    // Setters
    public void setVersionNumber(String numString){
        versionNumber = numString;
    }

    public void setBatteryPercentage(int batPercent){
        batteryPercentage = batPercent;
    }

    public void setPhoneCarrier(String phoneCarrier){
        carrier = phoneCarrier;
    }

    public void setRingTone(String tone){
        ringTone = tone;
    }

    // Getters
    public String getVersionNumber(){
        return versionNumber;
    }

    public Integer getBatteryPercentage(){
        return batteryPercentage;
    }

    public String getPhoneCarrier(){
        return carrier;
    }

    public String getRingTone(){
        return ringTone;
    }
}

