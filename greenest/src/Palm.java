public class Palm extends Vaxt { //arv, subklass till Växt som bygger vidare på växtklassen, ärver fält och metoder

    public Palm (String vaxtNamn, double langd) {
            super(vaxtNamn, langd);
        }


    @Override
    public double totalVatskeMangd() {  // Polymorfism och arv: Palmklassen implementerar sin egen version av den abstrakta metoden i Vaxt.
        return VatskeTyp.KRANVATTEN.getMangd()* langd;
    }

    @Override
    public String getVatskeTyp() { // Polymorfism och arv:
            return VatskeTyp.KRANVATTEN.getVatskaTxt();
    }

    }

