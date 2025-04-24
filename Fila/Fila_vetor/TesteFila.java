package Fila_vetor;
import java.util.Random;

public class TesteFila {
    public static void main(String[] args) {
        Random random = new Random();
        Fila fila = new Fila();
        for (int i = 1; i <= 20; i++){
            try{
                if (random.nextBoolean()) {
                    fila.enfilera(i);
                }
                else{
                    System.out.println(fila.desenfileira() + " saiu");
                }
            }
            catch(RuntimeException rt){
                System.out.println(rt.getMessage());
            }
        }
    }
}
