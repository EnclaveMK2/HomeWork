package Essential.DZ_8;

import java.util.Objects;

public class Monitor extends Device{

    private final int resolutionX = 1280;
    private final int resolutionY = 1024;

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, resolutionY);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "manufacturer='" + getManufacturer() + '\'' +
                ", price=" + getPrice() +
                ", serial='" + getSerial() + '\'' +
                ", resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }
}
