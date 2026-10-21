public enum VatskeTyp {

    MINERALVATTEN(0.02, "Mineralvatten"), //cl omvandlat till liter
    KRANVATTEN (0.5, "Kranvatten"),
    PROTEINDRYCK (0.2, "Proteindryck"),
    BASNIVA(0.1, "Basnivå");

    private final String vatskaTxt;
    private final double mangd; // Inkapsling

    VatskeTyp (double mangd, String vatskaTxt) {
        this.mangd = mangd;
        this.vatskaTxt= vatskaTxt;
    }

    public double getMangd() {
        return mangd;
    }

    public String getVatskaTxt() {
        return vatskaTxt;
    }
}


