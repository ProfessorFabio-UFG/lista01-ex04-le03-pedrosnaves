import java.util.Scanner;

public class TesteRobo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Robo 01");
        System.out.println("ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Limite de po: ");
        int lmt_po1 = sc.nextInt();
        sc.nextLine();
        Robo robo1 = new Robo(id1, lmt_po1);

        System.out.println("Robo 02");
        System.out.println("ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Limite de po: ");
        int lmt_po2 = sc.nextInt();
        sc.nextLine();
        Robo robo2 = new Robo(id2, lmt_po2);


        robo1.ligar();
        robo1.andar(10, 25);
        robo1.aspirar(500);
        robo1.andar(25, 25);
        robo1.parar();
        robo1.parar();
        robo1.andar(10, 20);
        robo1.desligar();

        robo2.ligar();
        robo2.aspirar(500);
        robo2.aspirar(1000);
        robo2.andar(55, 25);
        robo2.parar();
        robo2.andar(10, 10);
        robo2.aspirar(1000);


        System.out.println(robo1);
        System.out.println(robo2);

    }
}
