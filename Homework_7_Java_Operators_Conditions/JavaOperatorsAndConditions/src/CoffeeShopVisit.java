import java.util.Scanner;

public class CoffeShopVisit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість еспресо: ");
        int espresso = scanner.nextInt();
        System.out.println("Введіть кількість лате: ");
        int latte = scanner.nextInt();
        System.out.println("Введіть кількість капучіно: ");
        int cappuccino = scanner.nextInt();
        int espressoPrice = 3;
        int lattePrice = 4;
        int cappucinoPrice = 5;
        int yourOrder = ((espresso * espressoPrice) + (latte * lattePrice) + cappuccino * cappucinoPrice);
        System.out.println("Сума вашого замовлення: " + yourOrder);
    }
}