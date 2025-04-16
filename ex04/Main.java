public class Main {
    public static void main(String[] args) {
        
        Robo r1 = new Robo(1111, 1000);
        Robo r2 = new Robo(2222, 2000);

        Play play = new Play(r1, r2);

        play.Ligar(r1);
        play.Andar(r1, 10, 25);
        play.Aspirar(r1, 500);
        play.Andar(r1, 25, 25);
        play.Parar(r1);
        play.Andar(r1, 10, 20);
        play.Desligar(r1);


        play.Ligar(r2);
        play.Aspirar(r2, 500);
        play.Aspirar(r2, 1000);
        play.Andar(r2, 55, 25);
        play.Parar(r2);
        play.Andar(r2, 10, 10);
        play.Aspirar(r2, 1000);

        play.DadosRobo(r1);
        play.DadosRobo(r2);

    }

}
