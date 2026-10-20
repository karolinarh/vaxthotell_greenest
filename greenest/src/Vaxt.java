public abstract class Vaxt implements Bevattning{
    /* Abstrakt: Basklassen är abstract, dvs är en gemensam grund(fält och m etoder) för andra typer. Går ej att skapa objekt utifrån denna klassen.
     Palm är en typ av växt.
     Implementerar Bevattning-interface, men lämnar vätskemetodernas implementationer till subklasserna.
     */
    protected String vaxtNamn;  //Inkapsling; protected: låter subklasser och klasser i samma paket komma åt fälten
    protected double langd;

    public Vaxt(String vaxtNamn, double langd) {
        this.vaxtNamn = vaxtNamn;
        this.langd = langd;

    }

    public String getVaxtNamn() {
        return vaxtNamn;
    }
    //arv


@Override
    public String toString() {      // Arv: Metoderna ärvs av växttyperna via extend.
    return "Växt: " + getVaxtNamn()
                + "\nVäxttyp: " + getClass().getSimpleName()
                + "\nVätska: " +  getVatskeTyp()
                + "\nMängd: " + totalVatskeMangd() +" liter per dag";
    }
}






