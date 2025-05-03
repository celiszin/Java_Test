package Java_Test;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status()
    {
        System.out.println("Modelo" + this.modelo);
        System.out.println("Uma Caneta" + this.cor );
        System.out.println("Esta Tampada? " + this.tampada );
        System.out.println("Carga" + this.carga);
        System.out.println("Ponta" + this.ponta);
    }

    
    void rabiscar()
    {
        if(tampada)
            System.out.println("Erro");
        else
            System.out.println("Rabisco");
    }
    void tampar() 
    {

    }
    void destampar()
    {

    }
}
