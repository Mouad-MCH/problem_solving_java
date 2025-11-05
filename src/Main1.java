import java.util.Scanner;

public class Main1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Consommation: ");
        double x = scanner.nextInt();
        double y = (consommation(x) * 10)/100;
        System.out.println("Facture avant taxe : " + consommation(x) + " MAD");
        System.out.println("Taxe (10%) : " + y + " MAD");
        System.out.println("Facture totale : " + (consommation(x) + y) + " MAD");

    }

    static double consommation(double c) {
        double d = 0;
        if(c<=100) {
            d = c * 0.8;
        }else if(c>100 && c <= 300) {
            d = 80 + (c - 100) * 1.2;
        }else if(c > 300) {
            d = 80 + 240 +((c - 300) * 1.5);
        }
        return d;
    }

}