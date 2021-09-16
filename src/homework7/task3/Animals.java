package homework7.task3;

public enum Animals {
    CAT_1(5), CAT_2(15), DOG(3), FISH(1);

    Animals(int age) {
        this.age = age;
    }

    public final int age;

    @Override
    public String toString() {
        return super.toString() + " {age=" + age + "}";
    }
}
