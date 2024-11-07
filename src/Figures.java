import java.util.Scanner;
public class Figures {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Character  ASTERISK = '*';
        System.out.println("Introduce el tamaño del cuadrado");
        int num = sc.nextInt();
    }

    public static void writeSqare(Character ASTERISK, int num) {
        for (int i=0;i<num;i++) {
            for (int j = 0; j<num;j++) {
                System.out.print(ASTERISK);
            } System.out.println();
        }
    }
}
