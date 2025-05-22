public class TesteHash {
    public static void main(String[] args) {
        NossoHash<Integer, String> mapa = new NossoHash<>();
        mapa.put(new Integer("1234"), "aaaaaaa");
        mapa.put(new Integer("4567"), "bbbbbb");
        mapa.put(new Integer("876543"), "werty");
        mapa.put(new Integer("23456"), "oiuyg");
        mapa.put(new Integer("756"), "afrth");
        mapa.put(new Integer("23456"), "hdthd");
        mapa.put(new Integer("0987"), "yrgdd");
        mapa.put(new Integer("34576"), "hjrt");
        mapa.imprime();

        String valor = mapa.get(23456);
        if ( valor != null) {
            System.out.println("Chave encontrada, valor = " + valor);
        }
        else {
            System.out.println("Chave nao econtrada");
        }


        if (mapa.containsKey(4567)) {
            System.out.println("Chave encontrada");
        }
        else{
            System.out.println("Chave nao encontrada");
        }

        if (mapa.containsValue("FFFFFF")) {
            System.out.println("Valor encontrado");
        }
        else{
            System.out.println("Valor nao encontrado");
        }

        System.out.println("Tamanho da estrutura: " + mapa.size());
    }
}
