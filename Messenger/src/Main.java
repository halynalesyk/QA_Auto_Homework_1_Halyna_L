public class Main {
    public static void main(String[] args) {
        User user1 = new User("Monica");
        User user2 = new User("Joey");
        User user3 = new User("Rachel");

        user1.addContact(user2);
        user2.addContact(user1);
        user2.addContact(user3);
        user3.addContact(user2);

        user1.sendMessage(user2, "Hi, Joey!");
        user2.sendMessage(user1, "Hey, Monica!");
        user2.sendMessage(user3, "Hey Rachel, how you doin?");

        System.out.println("\nMessages for " + user2.getName() + ":");
        for (Message message : user2.getMessages()) {
            System.out.println("From: " + message.getSender().getName() + " - Status: " + message.getStatus());
        }

        System.out.println("\n" + user2.getName() + " is reading messages:");
        for (Message message : user2.getMessages()) {
            user2.readMessage(message);
        }

        System.out.println("\nMessages for " + user2.getName() + " after reading:");
        for (Message message : user2.getMessages()) {
            System.out.println("From: " + message.getSender().getName() + " - Status: " + message.getStatus());
        }
    }
}
