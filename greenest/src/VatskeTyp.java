public enum VatskeTyp { // Enum: Definierar en bestämd uppsättning namngivna konstanter, här är vätsketyp och mängd konstanter.

    MINERALVATTEN(0.02, "Mineralvatten"), //cl omvandlat till liter
    KRANVATTEN (0.5, "Kranvatten"),
    PROTEINDRYCK (0.2, "Proteindryck"),
    BASNIVA(0.1, "Basnivå");

    private final String vatskaTxt;
    private final double mangd; // Inkapsling: Värdet är privat och kan inte ändras efter att det satts.

    VatskeTyp (double mangd, String vatskaTxt) {
        this.mangd = mangd;
        this.vatskaTxt= vatskaTxt;
    }

    public double getMangd() {  // Beräkningarna behöver använda gettern pga privat värde
        return mangd;
    }

    public String getVatskaTxt() {
        return vatskaTxt;
    }
}


