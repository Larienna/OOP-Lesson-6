package Task2;

public enum Animals {
    DOG(3),
    CAT(5),
    RAT(2),
    HAMSTER(10);

    private final int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name() + " (" + age + " years)";
    }
}
