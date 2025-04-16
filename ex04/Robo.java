public class Robo {
    private int id;
    private String status;
    private int posicaox;
    private int posicaoy;
    private int qnt_po;
    private int lmt_po;

    public Robo(int id, int lmt_po) {
        this.id = id;
        this.status = "desligado";
        this.posicaox = 0;
        this.posicaoy = 0;
        this.qnt_po = 0;
        this.lmt_po = lmt_po;
    }

    public int getID() {
        return this.id;
    }

    public String getStatus() {
        return this.status;
    }

    public int getPosX() {
        return this.posicaox;
    }

    public int getPosY() {
        return this.posicaoy;
    }

    public int getQtdPo() {
        return this.qnt_po;
    }

    public int getLmtPo() {
        return this.lmt_po;
    }

    public void setLigar() {
        this.status = "Ligado";
    }

    public void setDesligar() {
        this.status = "Desligado";
    }

    public void setAndar(int dx, int dy) {
        if(status.equals("Desligado")) {
            System.out.println("Ligue o Robo");
            return;
        }
        this.posicaox += dx;
        this.posicaoy += dy;
        this.status = "Andando";
    }

    public void setAspirar(int quantidade) {
        if(!status.equals("Ligado") && !status.equals("Andando")) {
            System.out.println("Limite de pó atingido! Robo desligando");
            setDesligar();
        }
        this.qnt_po +=quantidade;
        if(qnt_po >= lmt_po) {
            System.out.println("Robô " + this.id + " atingiu o limite de pó! Desligando...");
            setDesligar();
        }
    }

    public void setParar() {
        if(!status.equals("Andando")) {
            System.out.println("ERRO: Robo está desligado ou parado");
            return; 
        }
        this.status = "Parado";
    }

    public String toString(){
        return "Robô " + getID() +
                "\nstatus :" + getStatus() +
                "\nPosição: (" + getPosX() + ", " + getPosY() + ")" +
                "\nQuantidade de pó: " + getQtdPo() +
                "\nLimite de pó :" + getLmtPo() +
                "\n-----------------\n";
    }

}
