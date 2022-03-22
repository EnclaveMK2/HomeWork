package Essential.DZ_8;

public class Main {
    public static void main(String[] args) {
        Device device = new Device();
        Device device2 = new Device();
        Monitor monitor = new Monitor();
        EthernetAdapter ethernetAdapter = new EthernetAdapter();
        System.out.println(device);
        System.out.println(monitor);
        System.out.println(ethernetAdapter);

        System.out.println(device.equals(device2));
        System.out.println(device.equals(monitor));
        System.out.println(device.hashCode() == device2.hashCode());
        System.out.println(device.hashCode() == monitor.hashCode());


        device.hashCode();
        monitor.hashCode();
        ethernetAdapter.hashCode();

    }



}
