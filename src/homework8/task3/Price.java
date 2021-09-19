package homework8.task3;

public class Price {
    private final String name;
    private final String storeName;
    private final double goodsPrice;

    public Price(String name, String storeName, double goodsPrice) {
        this.name = name;
        this.storeName = storeName;
        this.goodsPrice = goodsPrice;
    }

    public String getStoreName() {
        return storeName;
    }

    @Override
    public String toString() {
        return "Наименование товара: " + name +
                "\n\tмагазин: " + storeName +
                "\n\tцена: " + goodsPrice +
                "\n----------------------------------";
    }
}
