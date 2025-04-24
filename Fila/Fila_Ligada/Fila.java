public class Fila{
    private No primeiro;
    private No ultimo;
    //costrutor padrão
}

class No{
    private int info;
    private No proximo;
    public No(int info) {
        this.info = info;
    }
    public int getInfo() {
        return info;
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString () {
        return "[" + info + "]";
    }
    
    
}