class Nodo{
    private Mensola info;
    private Nodo link;

    public Nodo(Mensola info, Nodo link){
        this.info=info;
        this.link=link;
    }

    public void setInfo(Mensola info) {
        this.info = info;
    }

    public Mensola getInfo() {
        return info;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

    public Nodo getLink() {
        return link;
    }
    
}