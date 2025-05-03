package Java_Test;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    
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
