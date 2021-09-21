package homework9.add_task;

public class Main {
    public static void main(String[] args) {
        Animal vasiliy = new Animal("Васька", 45, false);
        Animal vasiliy1 = new Animal("Васька", 45, false);

        System.out.println(vasiliy);
        System.out.println("Animals are equal: " + vasiliy.equals(vasiliy1));
        System.out.println(vasiliy.hashCode());
        System.out.println(vasiliy1.hashCode());
    }
}
