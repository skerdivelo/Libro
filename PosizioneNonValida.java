public class PosizioneNonValida extends Exception {
    private int posizione;
    private int ripiano;
    
    public PosizioneNonValida(int posizione, int ripiano) {
        this.posizione = posizione;
        this.ripiano = ripiano;
    }
    public int getPosizione() { return posizione; }
    public int getRipiano() { return ripiano; }
    
    public String toString() {
        return ("Posizione ("+ripiano+","+posizione+") NON valida!");
    }
}