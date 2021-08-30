package homework1.add_task;

import java.util.Scanner;

public class Address {
    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public void fillAddress() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите почтовый индекс: ");
        setIndex(input.nextInt());
        input.nextLine(); // Та хрень, что и в Си - надо очищать буфер, но не нашел

        System.out.print("Введите страну: ");
        setCountry(input.nextLine());

        System.out.print("Введите город: ");
        setCity(input.nextLine());

        System.out.print("Введите улицу: ");
        setStreet(input.nextLine());

        System.out.print("Введите дом: ");
        setHouse(input.nextInt());

        System.out.print("Введите квартиру: ");
        setApartment(input.nextInt());
    }

    public void print() {
        System.out.println("Почтовый индекс: " + this.index);
        System.out.println("Страна: " + this.country);
        System.out.println("Город: " + this.city);
        System.out.println("Улица: " + this.street);
        System.out.println("Дом: " + this.house);
        System.out.println("Квартира: " + this.apartment);
    }
}
