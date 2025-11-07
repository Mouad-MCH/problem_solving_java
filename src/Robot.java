import java.util.Scanner;

public class Robot {

    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("U->Up , R -> Right , D -> DOWN , L -> LEFT: ");
        String comandes = scanner.nextLine();
        System.out.println("*****série de commandes ******");
        System.out.println(comandes.toCharArray());
        System.out.println("*******************************");

        for(char comand : comandes.toCharArray()) {
            switch(comand) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
            }
        }

        System.out.println("Position finale : ("+ x +","+ y +")");
        if(x == 0 && y == 0) {
            System.out.println("Le robot est revenu au point de départ");
        }
    }

  /*  public static void extairnCommandes(String comandes) {

        for(char comand : comandes.toCharArray()) {
            switch(comand) {
                case 'U':
                    y++;
                break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'L':
                    y--;
                    break;
            }
        }

    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
*/

}




