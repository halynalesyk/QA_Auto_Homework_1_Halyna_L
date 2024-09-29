
public class Main {
    public static void main(String[] args) {
        int[] studentIDs = {12345, 67890, 54321, 98765, 24680};
        int searchID = 54321;
        boolean found = false;

        for (int id : studentIDs) {
            if (id == searchID) {
                System.out.println("Student`s test book number  " + searchID + " is found.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student`s test book number " + searchID + " is not found.");
        }
    }
}
