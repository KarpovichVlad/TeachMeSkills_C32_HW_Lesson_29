package main.D.right;

public class DataFetcher {
    private final Database database;

    public DataFetcher(Database database) {
        this.database = database;
    }

    public void fetchData() {
        database.connect();
        System.out.println("Data fetched.");
    }
}
