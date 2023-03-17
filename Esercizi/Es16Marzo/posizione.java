package Esercizi.Es16Marzo;

public abstract class posizione implements programmatore, tester, tecnicoReti, designer{
    @Override
    public String programma(){
        
        return "ciao";
    }

    @Override
    public String testa(){
        return "test";
    }

    @Override
    public String reti(){
        return "reti";
    }

    @Override
    public String desig(){
        return "design";
    }
}
