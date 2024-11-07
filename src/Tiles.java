public class Tiles {
    public static void writeTitle(String cad) {
        for (int i = 1; i<=80;i++) {
            System.out.print("*");
        }
        System.out.println(cad);
        for (int i = 1; i<=80;i++) {
            System.out.print("*");
        }
    }
}
