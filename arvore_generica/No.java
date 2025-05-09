public class No<T extends Comparable<T>>{
    private T info;
    private No<T> esquerda;
    private No<T> direita;

    public No (T info){
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public No<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No<T> esquerda) {
        this.esquerda = esquerda;
    }

    public No<T> getDireita() {
        return direita;
    }

    public void setDireita(No<T> direita) {
        this.direita = direita;
    }

    @Override
    public String toString() {
        return info + "";
    }
    
    public int compareTo(T o){
        return 0;
    }
}
