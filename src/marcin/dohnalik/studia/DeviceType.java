package marcin.dohnalik.studia;

public enum DeviceType {
    Blackberry("Blackberry"),
    iOS ("iOS"),
    Android("Android"),
    WindowsPhone("Windows Phone");

    private String deviceName;

    DeviceType(String deviceName){
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }
}
