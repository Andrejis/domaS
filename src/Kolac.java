public class Kolac implements Cinnosti{
    private String aPrichut;
    private String aFarba;
    private int aVaha;

    public Kolac(String aPrichut, String aFarba, int aVaha) {
        this.aPrichut = aPrichut;
        this.aFarba = aFarba;
        this.aVaha = aVaha;
    }

    public String getaPrichut() {
        return aPrichut;
    }

    public void setaPrichut(String aPrichut) {
        this.aPrichut = aPrichut;
    }

    public String getaFarba() {
        return aFarba;
    }

    public void setaFarba(String aFarba) {
        this.aFarba = aFarba;
    }

    public int getaVaha() {
        return aVaha;
    }

    public void setaVaha(int aVaha) {
        this.aVaha = aVaha;
    }

    @Override
    public void kysne() {
        System.out.println("Kysnem");
    }

    @Override
    public void variSa() {
        System.out.println("Varim sa ");
    }

    @Override
    public void pecieSa() {
        System.out.println("Peciem sa");
    }

    @Override
    public void VypisInfo() {
        System.out.println("Vaha kolaca je: " + aVaha + "g");
        System.out.println("Farba kolaca je: " + aFarba);
        System.out.println("A prichut kolaca je: " + aPrichut);
    }

}
