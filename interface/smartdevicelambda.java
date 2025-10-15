@FunctionalInterface
interface TurnOn {
    void turnOn();
}

@FunctionalInterface
interface TurnOff {
    void turnOff();
}

public class smartdevicelambda {
    public static void main(String[] args) {
        TurnOn lightOn = () -> System.out.println("Light is turned ON");
        TurnOn acOn = () -> System.out.println("AC is turned ON");
        TurnOn tvOn = () -> System.out.println("TV is turned ON");

        TurnOff lightOff = () -> System.out.println("Light is turned OFF");
        TurnOff acOff = () -> System.out.println("AC is turned OFF");
        TurnOff tvOff = () -> System.out.println("TV is turned OFF");
        lightOn.turnOn();
        acOn.turnOn();
        tvOn.turnOn();
        lightOff.turnOff();
        acOff.turnOff();
        tvOff.turnOff();
    }
}
