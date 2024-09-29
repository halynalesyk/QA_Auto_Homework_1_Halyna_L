public class WaterIntakeTracker {
    public static void main(String[] args) {
        int[] waterIntake = {3, 1, 4, 2, 0, 5, 2};
        int totalWater = 0;
        int index = 0;

        while (index < waterIntake.length) {
            if (waterIntake[index] < 2) {
                index++;
                continue;
            }
            totalWater += waterIntake[index];
            index++;
        }


        System.out.println("Total amount of drunk glasses of water per week: " + totalWater);
    }
}

