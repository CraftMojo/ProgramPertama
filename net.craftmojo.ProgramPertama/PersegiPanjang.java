public class PersegiPanjang {
    private int p;
    private int l;

    public PersegiPanjang() {
    }

    public PersegiPanjang(int p, int l) {
        this.p = p;
        this.l = l;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int LuasPersegiPanjang() {
        //process
        return this.p * this.l;

        //output
    }


}
