package homework8.task3;

import Console.ConsoleColors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Price> stores = new ArrayList<>();

        fillStores(stores);

        System.out.println("Список всех товаров: ");
        System.out.println("----------------------------------");

        stores.sort(Comparator.comparing(Price::getStoreName));

        for (Price price: stores) {
            System.out.println(price);
        }

        getGoodsInStore(stores);

    }

    private static void getGoodsInStore(ArrayList<Price> stores) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите название магазина: ");
        String storeName = input.nextLine();

        boolean storeIsPresent = false;

        for (Price store : stores) {
            if(store.getStoreName().equals(storeName)) {
                System.out.println(store);
                storeIsPresent = true;
            }
        }

        if(!storeIsPresent) {
            try{
                throw new Exception("Магазин не найден или введен с ошибкой!");
            } catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
    }

    private static void fillStores(ArrayList<Price> stores) {
        for (int i = 0; i < 2; i++) {
            Scanner input = new Scanner(System.in);

            System.out.print("Введите название товара: ");
            String name = input.nextLine();

            System.out.print("Введите название магазина: ");
            String storeName = input.nextLine();

            double goodsPrice = -1;

            do {
                try {
                    System.out.print("Введите цену товара: ");
                    if(input.hasNextDouble()) {
                        goodsPrice = input.nextDouble();
                    }

                    if(goodsPrice < 0) throw new InputMismatchException();

                } catch (InputMismatchException e) {
                    System.out.println(ConsoleColors.RED.color + "Введена неверная цена" + ConsoleColors.RESET.color);

                    if (input.hasNextLine()) {
                        input.nextLine();
                    }

                    goodsPrice = -1;
                }

            } while (goodsPrice == -1);

            Price price = new Price(name, storeName, goodsPrice);
            stores.add(price);
        }
    }
}
