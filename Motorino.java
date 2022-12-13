class Motorino{
    private String marca;
    private String colore;
    private int velocita;
    private boolean accensione;
    private boolean controlloV;

    public Motorino(String marca, String colore){
        this.marca = marca;
        this.colore = colore;
        this.velocita = 0;
        this.accensione = false;
        this.controlloV = false;
    }

    public Motorino(Motorino m){
        this.marca = m.marca;
        this.colore = m.colore;
        this.velocita = m.velocita;
        this.accensione = m.accensione;
        this.controlloV = m.controlloV;
    }

    //accelera incrementa la velocita di 10 solo se controlloV è false
    public void accelera(){
        if(controlloV == false){
            velocita += 10;
        }
    }
    //inserisciControllo dove la velocità non può superare controlloV
    public void inserisciControllo(int controlloV){
        this.controlloV = true;
        this.velocita = controlloV;
    }
    
}