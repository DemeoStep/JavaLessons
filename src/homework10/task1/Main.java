package homework10.task1;

public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> myDictionary = new MyDictionary<>();

        myDictionary.add(1, "23");
        myDictionary.add(2, "33");
        myDictionary.add(3, "4567");
        myDictionary.add(44, "wert");
        myDictionary.add(2, "86543");
        myDictionary.add(44, "qwerty");
        myDictionary.add(2354, "----");
        myDictionary.add(230, "####");

        System.out.println(myDictionary);
        System.out.println(myDictionary.size());
        System.out.println();
        System.out.println(myDictionary.getValue(44));
    }
}
