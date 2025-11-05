import java.util.Scanner;

public class Robot {

    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comandes = scanner.nextLine();

        System.out.println(comandes.toCharArray());

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




