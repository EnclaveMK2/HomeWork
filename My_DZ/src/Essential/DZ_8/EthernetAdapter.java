package Essential.DZ_8;

import java.util.Objects;

public class EthernetAdapter extends Device{
    private final int speed = 512;
    private final String mac = "A0-B6-87-J8-I4";

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed && Objects.equals(mac, that.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }

    @Override
    public String toString() {
        return "EthernetAdapter{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", price=" + getPrice() +
                ", serial='" + getSerial() + '\'' +
                ", speed=" + speed +
                ", mac='" + mac + '\'' +
                '}';
    }
}
