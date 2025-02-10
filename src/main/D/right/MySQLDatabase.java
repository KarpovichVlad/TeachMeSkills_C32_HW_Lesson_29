package main.D.right;

public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL database.");
    }
}