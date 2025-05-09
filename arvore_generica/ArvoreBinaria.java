public class ArvoreBinaria <T extends Comparable<T>> {
    private No<T> raiz;
    public ArvoreBinaria() {
        raiz = null;
    }
    public boolean arvoreVazia(){
        return raiz == null;
    }
    public void insere (T info){
        No<T> novo = new No<>(info);
        if (arvoreVazia())
            raiz = novo;
        else
            insereRec(novo, raiz);
    }
    public void insereRec (No<T> novo, No<T> atual) {
        if (novo.getInfo().compareTo(atual.getInfo()) > 0) {
            if (atual.getDireita() == null)
                atual.setDireita(novo);
            else
                insereRec(novo, atual.getDireita());
        }
        else {
            if (atual.getEsquerda() == null)
                atual.setEsquerda(novo);
            else
                insereRec(novo, atual.getEsquerda());
        }
    }

    //toString com percurso em ordem simétrica
    @Override
    public String toString() {
        if (arvoreVazia()) return "arvore Vazia";
        return toStringRec(raiz);
    }
    public String toStringRec (No<T> atual) {
        String s = "";
        if (atual != null){
            s += toStringRec(atual.getEsquerda());
            s += atual;
            s += toStringRec(atual.getDireita());
        }
        return s;
    }
}
