public abstract class Vaxt implements Bevattning{

    protected String vaxtNamn;  //Inkapsling; protected:
    protected double langd;

    public Vaxt(String vaxtNamn, double langd) {
        this.vaxtNamn = vaxtNamn;
        this.langd = langd;

    }

    public String getVaxtNamn() { //arv
        return vaxtNamn;
    }
    //arv



    public String toString() {      // Arv
    return "Växt: " + getVaxtNamn()
                + "\nVäxttyp: " + getClass().getSimpleName()
                + "\nVätska: " +  getVatskeTyp()
                + "\nMängd: " + totalVatskeMangd() +" liter per dag";
    }
}






