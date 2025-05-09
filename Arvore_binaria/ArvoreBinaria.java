public class ArvoreBinaria {
    private No raiz;
    // construtor padrão
    public boolean arvoreVazia(){
        return raiz == null;
    }
    public void insere (int info) {
        No novo = new No(info);
        if (arvoreVazia()){
            raiz = novo;
        }
        else{
            insereRec (novo, raiz);
        }
    }
    private void insereRec (No novo, No atual) {
        if (novo .getInfo() > atual.getInfo()) {
            if (atual.getDireita() == null){
                atual.setDireita(novo);
            }
            else{
                insereRec(novo, atual.getDireita());
            }
        }
        else {
            if (atual.getEsquerda() == null){
                atual.setEsquerda(novo);
            }
            else{
                insereRec(novo, atual.getEsquerda());
            }
        }
    }
    @Override
    public String toString() {
        if (arvoreVazia()) return "arvore vazia";
        return toStringRec(raiz);
    }
    private String toStringRec (No atual) {
        String s = "";
        if (atual.getEsquerda() != null){
            s += toStringRec(atual.getEsquerda());
        }
        s += atual + " ";
        if (atual.getDireita()!=null) {
            s += toStringRec(atual.getDireita());
        }
        return s;
    }
    public void insereComOcorrencias (int info) {
        if (arvoreVazia()) {
            raiz = new NoOcorrencias(info);
        }
        else{
            insereComOcorrenciasRec(info, raiz);
        }
    }
    private void insereComOcorrenciasRec(int info, No atual){ 
        if (info == atual.getInfo()) {
            NoOcorrencias noOcorrencias = (NoOcorrencias)atual;
            noOcorrencias.incrementaOcorrencias();
        }
        else if (info > atual.getInfo()){
            if (atual.getDireita() == null)
                atual.setDireita(new NoOcorrencias(info));
            else
                insereComOcorrenciasRec(info, atual.getDireita());
        }   
        else{
            if (atual.getEsquerda() == null)
                atual.setEsquerda(new NoOcorrencias(info));
            else
                insereComOcorrenciasRec(info, atual.getEsquerda());
        }
    }

    public int altura (){
        if (arvoreVazia() || raiz.getDireita() == null && raiz.getEsquerda() == null)
            return 0;
        return alturaRec(raiz);
    }
    private int alturaRec (No atual){
        if (atual == null || atual.getDireita() == null && atual.getEsquerda() == null)
            return 0;
        int alturaEsquerda = alturaRec(atual.getEsquerda());
        int alturaDireita = alturaRec(atual.getDireita());
        return alturaDireita > alturaEsquerda ? alturaDireita + 1 : alturaEsquerda + 1;
    }
}

