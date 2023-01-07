import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;

        System.out.print("Yıl Giriniz : ");
        age = input.nextInt();

        if (age % 100 == 0) {
            if (age % 400 == 0) {
                System.out.print(age + " artık bir yıldır!");
            } else {
                System.out.print(age + " artık bir yıl değildir.");
            }
        } else if (age % 4 == 0) {
            System.out.print(age + " artık bir yıldır!");
        } else {
            System.out.print(age + " artık bir yıl değildir.");
        }
    }
}
