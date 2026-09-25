class Device
{
    int deviceID;
    String deviceName;
    String powerStatus;

    // Constructor
    Device(int id, String name, String status)
    {
        deviceID = id;
        deviceName = name;
        powerStatus = status;
    }

    // Turn ON
    void turnOn()
    {
        powerStatus = "ON";
    }

    // Turn OFF
    void turnOff()
    {
        powerStatus = "OFF";
    }
}

class SmartLight extends Device
{
    int brightnessLevel;
    String colorMode;

    // Constructor
    SmartLight(int id, String name, String status, int brightness, String color)
    {
        super(id, name, status);

        brightnessLevel = brightness;
        colorMode = color;
    }

    // Change Brightness
    void changeBrightness(int brightness)
    {
        brightnessLevel = brightness;
    }

    // Display Information
    void displayInfo()
    {
        System.out.println("Device ID: " + deviceID);
        System.out.println("Device Name: " + deviceName);
        System.out.println("Power Status: " + powerStatus);
        System.out.println("Brightness Level: " + brightnessLevel);
        System.out.println("Color Mode: " + colorMode);
    }

    public static void main(String[] args)
    {
        // Create SmartLight object
        SmartLight light = new SmartLight(
            101,
            "Living Room Light",
            "OFF",
            50,
            "Warm"
        );

        System.out.println("----- Initial Details -----");
        light.displayInfo();

        // Turn ON
        light.turnOn();

        // Change brightness
        light.changeBrightness(80);

        System.out.println("\n----- Updated Details -----");
        light.displayInfo();

        // Turn OFF
        light.turnOff();

        System.out.println("\n----- After Turning OFF -----");
        light.displayInfo();
    }
}