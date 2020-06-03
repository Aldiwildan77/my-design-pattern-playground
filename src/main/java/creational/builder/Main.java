package creational.builder;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person.Builder()
                .setName("Muhammad")
                .setHeight(165)
                .setWeight(55)
                .setRace("Jawa")
                .build();

        Person p2 = new Person.Builder()
                .setName("Aldi")
                .setRace("Sunda")
                .build();

        Person p3 = new Person.Builder()
                .setName("Wildan")
                .setHeight(170)
                .setWeight(60)
                .build();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

}
