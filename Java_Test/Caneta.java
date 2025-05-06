package Java_Test;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tamapada;

    void status() {
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Modelo " + this.modelo);
        System.out.println("Ponta " + this.ponta);
        System.err.println("Carga " + this.carga);
        System.err.println("Está Tampada " + this.tamapada);
    }

    void rabiscar() {
        if (this.tamapada) {
            System.err.println("Erro, não da pra rabiscar com caneta tampada");
        } else {
            System.out.println("Rabiscando");
        }
    }

    void tamapar() {
        this.tamapada = true;
    }
    void destampar() {
        this.tamapada = false;
    }
}
