package creational.singleton;

public class Main {

    public static void main(String[] args) {
        Database db1 = Database.getInstance("Mongo");
        Database db2 = Database.getInstance("Influx");

        System.out.println("Memory Class of Db1: " + db1);
        System.out.println("Memory Class of Db1: " + db2);

        System.out.println("Value of Db1: " + db1.getValue());
        System.out.println("Value of Db2: " + db2.getValue());
    }

}
