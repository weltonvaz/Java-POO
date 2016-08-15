package aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        System.out.println("\n");
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "preta";
        c2.ponta = 1.0f;
        c2.carga = 100;
        c2.tampar();
        c2.status();
        c2.rabiscar();
    } 
  
}
