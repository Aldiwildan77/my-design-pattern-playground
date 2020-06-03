package creational.builder;

public class Person {

    private String name = null;
    private int height = 0;
    private int weight = 0;
    private String race = null;

    public Person() {
    }

    public Person(String name, int height, int weight, String race) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getRace() {
        return race;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
                + "Height: " + getHeight() + "\n"
                + "Weight: " + getWeight() + "\n"
                + "Race: " + getRace() + "\n";
    }

    public static class Builder implements PersonBuilder {

        private String name = null;
        private int height = 0;
        private int weight = 0;
        private String race = null;

        @Override
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        @Override
        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        @Override
        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Builder setRace(String race) {
            this.race = race;
            return this;
        }

        public Person build() {
            return new Person(name, height, weight, race);
        }
    }

}
