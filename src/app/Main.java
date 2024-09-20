package app;

public class Main {
    public static void main(String[] args) {
        User user = new User("Oleksiy");

        Address address = new Address("Dnipro", "Slobozhanskyi", "100", "50505");

        user.setAddress(address);

        System.out.println("name: " + user.getName() + ", " + user.getAddress().toString());
    }
}
