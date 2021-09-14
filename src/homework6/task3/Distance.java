package homework6.task3;

public class Distance {
    public static double distance;
    private static String metric = "метров";

    public static class Converter{

        static void metersToKilometers() {
            if(metric.equals("метров")) {
                distance /= 1000;
                metric = "километров";
            }
        }

        static void kilometersToMiles() {
            if(metric.equals("километров")) {
                distance /= 1.609;
                metric = "миль";
            }
        }

        static void milesToKilometers() {
            if(metric.equals("миль")) {
                distance *= 1.609;
                metric = "километров";
            }
        }

        static void kilometersToMetres() {
            if(metric.equals("километров")) {
                distance *= 1000;
                metric = "метров";
            }
        }
    }

    public static void print() {
        System.out.println(distance + " " + metric);
    }
}
