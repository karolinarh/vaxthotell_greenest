public class Kaktus extends Vaxt { //arv

    public Kaktus (String vaxtNamn, double langd) {
        super(vaxtNamn, langd);
    }

    @Override
    public double totalVatskeMangd() {  //arv & polymorfism
        return VatskeTyp.MINERALVATTEN.getMangd();
    }
    @Override
    public String getVatskeTyp() { //arv & polymorfism
        return VatskeTyp.MINERALVATTEN.getVatskaTxt();
    }
}

