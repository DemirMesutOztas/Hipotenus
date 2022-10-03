import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int b, c;
        double a;
        Scanner input = new Scanner(System.in);
        System.out.println("1.kenarı giriniz:");
        b = input.nextInt();
        System.out.println("2.kenarı giriniz:");
        c = input.nextInt();
        a = Math.sqrt((b*b)+(c*c));
        System.out.println("Hipotenüs: " + a);
    }
}