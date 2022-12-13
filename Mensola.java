class Mensola{
    private static final int MAX_NUM_VOLUMI=15;
    private Libro volumi[];
    public Mensola(){
        volumi=new Libro[MAX_NUM_VOLUMI];
    }
    public Mensola(Mensola mensola){
        int posizione;
        volumi=new Libro[MAX_NUM_VOLUMI];
        for(posizione=0; posizione<MAX_NUM_VOLUMI; posizione++) {
            if (mensola.getVolume(posizione)!=null)
            volumi[posizione]=new Libro(mensola.getVolume(posizione));
        }
    }
    public int setVolume(Libro libro, int posizione) {
        try {
            if (volumi[posizione]!=null){
                if (getNumVolumi()==MAX_NUM_VOLUMI) 
                return -2; // mensola piena
                else
                for (int p=getNumVolumi();p>=posizione;p--)
                    volumi[p+1]=volumi[p];
                }
            else
                if (posizione!=getNumVolumi())
                    posizione=getNumVolumi();
                volumi[posizione]=new Libro(libro);
                return posizione; // restituisce la posizione di inserimento
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            return -1; // posizione non valida
        }
    }
    public Libro getVolume(int posizione) {
        try {
            return new Libro(volumi[posizione]);
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            return null; // posizione non valida: nessun libro restituito
        }
        catch (NullPointerException exception) {
            return null; // posizione vuota: nessun libro restituito
        }
    }
    public void compattaVolumi(){
        int i=0,j=0,k=0;
        for (j=0;j<MAX_NUM_VOLUMI;j++)
            if (volumi[j]==null)
                for (i=j;i<MAX_NUM_VOLUMI-1;i++){
                    volumi[i]=volumi[i+1];
                    volumi[i+1]=null;
                }
    }
    public int rimuoviVolume(int posizione) {
        int i;   
        try {
            volumi[posizione]=null; // rimozione libro in posizione
            compattaVolumi();
            return posizione; // restituisce la posizione liberata
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            return -1; // posizione non valida
        }
    } 
}