public class Palm extends Vaxt { //arv

    public Palm (String vaxtNamn, double langd) {
            super(vaxtNamn, langd);
        }


    @Override
    public double totalVatskeMangd() {  // Polymorfism och arv
        return VatskeTyp.KRANVATTEN.getMangd()* langd;
    }

    @Override
    public String getVatskeTyp() { // Polymorfism och arv
            return VatskeTyp.KRANVATTEN.getVatskaTxt();
    }

    }

