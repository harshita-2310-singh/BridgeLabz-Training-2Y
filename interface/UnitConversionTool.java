public class UnitConversionTool {

    interface UnitConverter {
        double convert(double value);
    }

    
    static class KmToMilesConverter implements UnitConverter {
        public double convert(double km) {
            return km * 0.621371;
        }
    }


    static class KgToLbsConverter implements UnitConverter {
        public double convert(double kg) {
            return kg * 2.20462;
        }
    }

    public static void main(String[] args) {
        UnitConverter kmToMilesObj = new KmToMilesConverter();
        UnitConverter kgToLbsObj = new KgToLbsConverter();
        UnitConverter kmToMilesLambda = km -> km * 0.621371;
        UnitConverter kgToLbsLambda = kg -> kg * 2.20462;

        double kmValue = 10;
        double kgValue = 5;

        System.out.println("Unit Conversion Results:\n");

        System.out.printf("KM to Miles | Obj: %.4f | Lambda: %.4f%n",
                kmToMilesObj.convert(kmValue), kmToMilesLambda.convert(kmValue));
        System.out.printf("KG to LBS   | Obj: %.4f | Lambda: %.4f%n",
                kgToLbsObj.convert(kgValue), kgToLbsLambda.convert(kgValue));
    }
}
