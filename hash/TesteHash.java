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
    }
}
