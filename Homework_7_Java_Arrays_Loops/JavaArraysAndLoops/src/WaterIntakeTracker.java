public class WaterIntakeTracker {
       public static void main(String[] args) {
            int[] waterIntake = {3, 1, 4, 2, 0, 5, 2};
            int waterCounter = 0;
            int i = 0;
            while (i < waterIntake.length) {
                if (waterIntake[i] >= 2 ) {
                    waterCounter += waterIntake[i];
                }
                i++;
            }
            System.out.println("During a week you drink " + waterCounter + " glasses of water");
       }
}