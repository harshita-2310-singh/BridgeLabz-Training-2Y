import java.util.ArrayList;

public class SensorDataLogger {


    public static void logData(Double data, ArrayList<Double> storage) {
        storage.add(data); 
    }

    public static void main(String[] args) {
        ArrayList<Double> sensorData = new ArrayList<>();

        
        double temp1 = 23.5;
        logData(temp1, sensorData); 


        Double temp2 = 27.8;
        logData(temp2, sensorData);

        for (Double d : sensorData) {
            double value = d;
            System.out.println("Sensor reading: " + value);
        }
    }
}
