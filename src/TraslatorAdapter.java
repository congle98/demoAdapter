public class TraslatorAdapter implements VietnameseTarget{
    private EnglishAdaptee adaptee;

    public TraslatorAdapter(EnglishAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        String tuTN = tranlate(words);
        adaptee.receive(tuTN);
    }

    private String tranlate(String tuTv){
        System.out.println("DỊch");
        //cơ chế dịch
        return "Từ TA";
    }
}
