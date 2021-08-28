package homework1.task2;

public class Rectangle {
    final private double side1;
    final private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public void printRectangle() {
        System.out.println("Площадь: " + this.side1 * this.side2);
        System.out.println("Периметр: " + ((this.side1 + this.side2) * 2));
    }
}
