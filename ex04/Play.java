public class Play {
    private Robo robo1;
    private Robo robo2;

    public Play(Robo r1, Robo r2){
        this.robo1 = r1;
        this.robo2 = r2;
    }

    public void Ligar(Robo r) {
        r.setLigar();
    }

    public void Desligar(Robo r) {
        r.setDesligar();
    }

    public void Andar(Robo r, int dx, int dy) {
        r.setAndar(dx, dy);
    }

    public void Aspirar(Robo r, int quantidade) {
        r.setAspirar(quantidade);
    }

    public void Parar(Robo r) {
        r.setParar();
    }

    public void DadosRobo(Robo r) {
        System.out.println(r);
    }
}

