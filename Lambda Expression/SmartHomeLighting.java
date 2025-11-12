
interface LightBehavior {
    void activate();
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        LightBehavior motionTrigger = () -> 
            System.out.println("Motion detected! Turning on lights to 100% brightness.");

        LightBehavior timeTrigger = () -> 
            System.out.println("It's evening! Setting lights to warm 50% brightness.");
        LightBehavior voiceTrigger = () -> 
            System.out.println("Voice command received! Changing lights to party mode.");
        simulateTrigger("motion", motionTrigger);
        simulateTrigger("time", timeTrigger);
        simulateTrigger("voice", voiceTrigger);
    }
    public static void simulateTrigger(String triggerType, LightBehavior behavior) {
        System.out.println("\nTrigger: " + triggerType.toUpperCase());
        behavior.activate();
    }
}
