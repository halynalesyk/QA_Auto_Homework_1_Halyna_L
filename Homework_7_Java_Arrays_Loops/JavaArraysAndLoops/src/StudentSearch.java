public class StudentSearch {
    public static void main(String[] args) {
        int[] studentIDs = {12345, 67890, 54321, 98765, 24680};
        int searchID = 54321;
        for (int i : studentIDs) {
            if (searchID == i) {
                System.out.println("This is your student: " + i);
                return;
            }
        }
        System.out.println("That student is missing");
    }
}