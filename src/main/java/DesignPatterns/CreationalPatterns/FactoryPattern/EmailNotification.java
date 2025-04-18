package DesignPatterns.CreationalPatterns.FactoryPattern;

public class EmailNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
