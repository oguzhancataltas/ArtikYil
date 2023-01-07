import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age, mod;

        System.out.print("Yıl Giriniz : ");
        age = input.nextInt();

        mod = age % 4;

        if (mod == 0) {
            System.out.println(age + " bir artık yıldır");
        }else {
            System.out.println(age + " bir artık yıl değildir!!!");
        }
    }
}
