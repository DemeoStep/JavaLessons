package homework7.add_task;

public enum Vehicles {
    BMW(30000, "black"),
    HYUNDAI(10000, "yellow"),
    MERCEDES(25000, "silver"),
    VAZ2101(500, "rust");


    public final int price;
    public final String color;

    Vehicles(int price, String color) {
      this.price = price;
      this.color = color;
    }

    public String getColor() {
        return this.color;
    }


    @Override
    public String toString() {
        return super.toString() + " {color: " + this.color + ", price: " + this.price + "}";
    }
}
