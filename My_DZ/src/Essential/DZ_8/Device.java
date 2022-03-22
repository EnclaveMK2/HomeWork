package Essential.DZ_8;

import java.util.Objects;

public class Device {
    static private final String manufacturer = "Samsung";
    static private final Float price = 120f;
    static private final String serial = "AB1234567CD";


    static public String getManufacturer() {
        return manufacturer;
    }

    static public Float getPrice() {
        return price;
    }

    static public String getSerial() {
        return serial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Objects.equals(manufacturer, device.manufacturer) && Objects.equals(price, device.price) && Objects.equals(serial, device.serial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serial);
    }

    @Override
    public String toString() {
        return "Device{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", price=" + getPrice() +
                ", serial='" + getSerial() + '\'' +
                '}';
    }
}
