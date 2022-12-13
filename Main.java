class Main{
    public static void main(String[] args){
        Libro[] libri = new Libro[5];
        libri[0] = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1000);
        libri[1] = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1000);
        libri[2] = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1000);
        libri[3] = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1000);
        libri[4] = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1000);
        Mensola mensola = new Mensola();
        Nodo nodo = new Nodo(mensola, null);
        for(int i = 0; i < 5; i++){
            mensola.setVolume(libri[i], i);
        }
        //metodo inserisciLibri
        mensola.inserisciLibri(libri);
        //print mensola
        for(int i = 0; i < 5; i++){
            System.out.println(mensola.toString());
        }
    }
}
