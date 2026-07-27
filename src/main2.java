public class main2 {
    public static void main(String[] args) {
        Bildiris bildiris = new Bildiris();
        EmailBildiris emailBildiris = new EmailBildiris();
        TeciliEmailBildiris teciliEmailBildiris = new TeciliEmailBildiris();

        bildiris.gonder();
        System.out.println("---");
        emailBildiris.gonder();
        System.out.println("---");
        teciliEmailBildiris.gonder();
    }
}