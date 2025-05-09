import java.util.Random;

public class TesteArvorePessoa {
    public static void main(String[] args) {
        Random random = new Random();
        ArvoreBinaria<Pessoa> abb = new ArvoreBinaria();
        for (int i = 1; i <= 10; i++){
            int n = random.nextInt(10);
            System.out.print(n + " ");
            Pessoa p = new Pessoa(n, "aaa");
            abb.insere(p);
        }
        System.out.println("\n" + abb);
    }
}
