public class Client {
    public static void main(String[] args) {
        VietnameseTarget vietnameseTarget = new TraslatorAdapter(new EnglishAdaptee());
        vietnameseTarget.send("dahghsas");
    }
}
