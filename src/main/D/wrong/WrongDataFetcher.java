package main.D.wrong;

public class WrongDataFetcher {
    private final MySQLDatabase database;

    public WrongDataFetcher() {
        this.database = new MySQLDatabase();
    }

    public void fetchData() {
        database.connect();
        System.out.println("Data fetched.");
    }
}
