
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Robo robo1 = new Robo(1111, 1000);
        Robo robo2 = new Robo(2222, 2000);

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
