import java.util.Scanner;

public class Salle_de_Classe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbre de bancs : ");
        int m = scanner.nextInt();

        System.out.print("Enter numbre d’étudiants : ");
        int n = scanner.nextInt();

        int e = 1;
        int place = m * 2;



        for(int banc = 0; banc < m; banc++) {
            System.out.print("banc "+ banc + " : ");
            if(e <= n) {
                System.out.print("Étudiant "+ e + ", ");
                e++;
            }

            if(e <= n) {
                System.out.print("Étudiant "+ e);
                e++;
            }

            if(e>n) {
                break;
            }
            System.out.println();
        }

        if(place < n) {
            System.out.println( (n - place) +" Étudiant ne trouve pas de place");
        }

    }
}
