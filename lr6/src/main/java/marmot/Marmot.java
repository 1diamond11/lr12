package marmot;

public class Marmot {
    private String name;
    private int age;

    String burrowLocation;

    protected boolean isHibernating;

    public int weight;

    public Marmot() {
        this.name = "Неизвестный сурок";
        this.age = 0;
        this.burrowLocation = "Неизвестно";
        this.isHibernating = false;
        this.weight = 0;
    }

    public Marmot(String name, int age, String burrowLocation, boolean isHibernating, int weight) {
        this.name = name;
        this.age = age;
        this.burrowLocation = burrowLocation;
        this.isHibernating = isHibernating;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void whistle() {
        System.out.println(name + " издает звук");
    }

    protected void hibernate() {
        isHibernating = true;
        System.out.println(name + " засыпает в спячку.");
    }

    void digBurrow() {
        System.out.println(name + " копает нору в " + burrowLocation);
    }

    private void eatGrass() {
        System.out.println(name + " ест траву.");
    }

    public void feed() {
        eatGrass();
    }

    @Override
    public String toString() {
        return "Marmot{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", burrowLocation='" + burrowLocation + '\'' +
                ", isHibernating=" + isHibernating +
                ", weight=" + weight +
                '}';
    }
}