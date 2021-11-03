public class MeongAdapter implements Bebek {
    Kucing koceng;

    public MeongAdapter(Kucing koceng) {
        this.koceng = koceng;
    }

    @Override
    public void kwek() {
        koceng.meong();
    }
}
