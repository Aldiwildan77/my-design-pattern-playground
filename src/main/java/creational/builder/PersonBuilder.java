package creational.builder;

public interface PersonBuilder {

    Person.Builder setName(String name);

    Person.Builder setHeight(int height);

    Person.Builder setWeight(int weight);

    Person.Builder setRace(String race);

}
