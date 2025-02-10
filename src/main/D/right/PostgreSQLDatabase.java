package main.D.right;

public class PostgreSQLDatabase implements Database{
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL database.");
    }
}
