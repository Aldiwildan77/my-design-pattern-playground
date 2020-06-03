package creational.singleton;

public final class Database {

    public static volatile Database instance;
    private String value;

    private Database(String value) {
        this.value = value;
    }

    public static Database getInstance(String value) {
        Database db = instance;
        if (db != null) {
            return db;
        }

        synchronized (Database.class) {
            if (instance == null) {
                instance = new Database(value);
            }

            return instance;
        }
    }

    public String getValue() {
        return value;
    }
}
