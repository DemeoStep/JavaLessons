package homework9.task2;

import Console.ConsoleColor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Device> devices = new ArrayList<>();
        
        Device device1 = new Device("Samsung", 125.5f, "AB1234567CD");
        Device device2 = new Device("Samsung", 125.5f, "AB1234567CD");

        Monitor monitor1 = new Monitor("Philips", 200, "AB9994567CD", 1280, 1024);
        EthernetAdapter eth0 = new EthernetAdapter("D-Link", 12.5f, "AZ5554567CD", 100, "86:34:c5:6c:8a:a5");
        EthernetAdapter eth1 = new EthernetAdapter("D-Link", 12.5f, "AZ5554567CD", 100, "86:34:c5:6c:8a:a6");

        devices.add(device1);
        devices.add(device2);
        devices.add(monitor1);
        devices.add(eth0);
        devices.add(eth1);

        int it = 0;

        for (Device device: devices) {
            System.out.print("device " + it + ":\n\t");
            System.out.print(device);
            System.out.println(", hashCode: " + ConsoleColor.RED + device.hashCode() + ConsoleColor.RESET);
            it++;
        }

        System.out.println();

        searchEquals(devices);

    }

    private static void searchEquals(ArrayList<Device> devices) {
        for (int i = 0; i < devices.size() - 1; i++) {
            for (int j = i + 1; j < devices.size(); j++) {
                if(devices.get(i).equals(devices.get(j))) {
                    System.out.println(ConsoleColor.GREEN + "device" + (i+1) + " is equal device" + (j+1) + ConsoleColor.RESET);
                }
            }
        }
    }
}
