import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User implements UserInterface {
    private String name;
    private Set<User> contacts;
    private List<Message> messages;

    public User(String name) {
        this.name = name;
        this.contacts = new HashSet<>();
        this.messages = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Set<User> getContacts() {
        return contacts;
    }

    @Override
    public List<Message> getMessages() {
        return messages;
    }

    @Override
    public void addContact(User contact) {
        contacts.add(contact);
    }

    @Override
    public void sendMessage(User receiver, String text) {
        Message message = new Message(this, receiver, text);
        message.setStatus(MessageStatus.SENT);
        receiver.receiveMessage(message);
        System.out.println(this.name + " sent a message to " + receiver.getName() + ": " + text);
    }

    @Override
    public void receiveMessage(Message message) {
        message.setStatus(MessageStatus.RECEIVED);
        messages.add(message);
        System.out.println(this.name + " received a message from " + message.getSender().getName() + ": " + message.getText());
    }

    public void readMessage(Message message) {
        if (message.getStatus() == MessageStatus.RECEIVED) {
            message.setStatus(MessageStatus.READ);
            System.out.println(this.name + " read a message from " + message.getSender().getName());
        }
    }
}
