package Essential.DZ_13.Second;

public class Price {
    String name;
    String store;
    String price;

    public String getStore() {
        return store;
    }

    @Override
    public String toString() {
        return "Price{" +
                "name='" + name + '\'' +
                ", store='" + store + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
