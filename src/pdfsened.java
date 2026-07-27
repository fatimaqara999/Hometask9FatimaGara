public class pdfsened extends sened {
    public pdfsened(String baslik) {
        super(baslik);
    }

    @Override
    public void capEt() {
        System.out.println(getbaslik() + " PDF formatında çap olunur.");
    }
}