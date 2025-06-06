public class Pessoa implements Comparable<Pessoa>{
    private int id;
    private String nome;
    Pessoa(int id, String nome){
        setId(id);
        setNome(nome);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "[id=" + id + ", nome=" + nome + "]";
    }

    @Override
    public int compareTo(Pessoa pessoa){
        // return getNome() == pessoa.getNome() ? 0 : 1; 
        return Integer.compare(getId(), pessoa.id);
    }
}