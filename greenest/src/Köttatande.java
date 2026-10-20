public class Köttatande extends Vaxt { //arv
    public Köttatande(String vaxtNamn, double langd) {
        super(vaxtNamn, langd);
    }

    @Override
    public double totalVatskeMangd() { //arv & polymorfism
        return VatskeTyp.BASNIVA.getMangd() + (VatskeTyp.PROTEINDRYCK.getMangd() * langd);
    }
    @Override
    public String getVatskeTyp() { //arv & polymorfism
        return VatskeTyp.PROTEINDRYCK.getVatskaTxt();
    }

}