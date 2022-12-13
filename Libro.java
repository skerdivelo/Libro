class Libro{
    private String titolo;
    private String autore;
    private int numeroPagine;
    private static double costoPagina = 0.05;
    final double COSTO_FISSO = 5.5;

    public Libro(String titolo, String autore, int numeroPagine){
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }
    //costruttore di copia
    public Libro(Libro l){
        this.titolo = l.titolo;
        this.autore = l.autore;
        this.numeroPagine = l.numeroPagine;
    }

    //get
    public String getTitolo(){
        return titolo;
    }
    public String getAutore(){
        return autore;
    }
    public int getNumeroPagine(){
        return numeroPagine;
    }
    public double getCostoPagina(){
        return costoPagina;
    }
    public double getCOSTO_FISSO(){
        return COSTO_FISSO;
    }

    //set
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public void setAutore(String autore){
        this.autore = autore;
    }
    public void setNumeroPagine(int numeroPagine){
        this.numeroPagine = numeroPagine;
    }
    public static void setCostoPagina(double costoPagina){
        Libro.costoPagina = costoPagina;
    }

    public double prezzo(){
        return COSTO_FISSO + (costoPagina * numeroPagine);
    }
}