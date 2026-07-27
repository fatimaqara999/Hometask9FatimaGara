public class wordsened extends sened {
    public wordsened(String baslik) {
        super(baslik);
    }

    @Override
    public void capEt() {
        System.out.println(getbaslik() + " Word formatında çap olunur.");
    }
}