
interface SmartDeviceControl {
    void turnOn();
    void turnOff();
}
class Light implements SmartDeviceControl {
    public void turnOn() {
        System.out.println("Light is turned ON");
    }

    public void turnOff() {
        System.out.println("Light is turned OFF");
    }
}


class AC implements SmartDeviceControl {
    public void turnOn() {
        System.out.println("AC is turned ON");
    }

    public void turnOff() {
        System.out.println("AC is turned OFF");
    }
}


class TV implements SmartDeviceControl {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

public class smartdevice1 {
    public static void main(String[] args) {
        SmartDeviceControl light = new Light();
        SmartDeviceControl ac = new AC();
        SmartDeviceControl tv = new TV();
        light.turnOn();
        ac.turnOn();
        tv.turnOn();
        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
