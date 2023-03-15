package Esercito;

abstract class forzeSpeciali{
    private String campo;
    private int annoInizio;

    abstract void gradiSpeciali(int nsoldato);
    abstract void annoDiInizio(int nsoldato);
    abstract void specializzazione(int nsoldato);

    public String getCampo(){
        return this.campo;
    }

    public int getAnnoInizio(){
        return this.annoInizio;
    }
}
