package Concetti.InnerClass.EsLibreria2;

class utenteLibreria{
    private String Password, Nome;
    private int ID;

    utenteLibreria(String Nome, String Password){
        this.Nome = Nome;
        this.Password = Password;
    }
    
    //getter

    String getPassword(){
        return this.Password;
    }

    String getNome(){
        return this.Nome;
    }

    int getID(){
        return this.ID;
    }

    //setter 

    void setPassword(String Password){
        this.Password = Password;
    }

    void setNome(String Nome){
        this.Nome = Nome;
    }

    void setID(){
        this.ID = (int)Math.random()*100;
    }
}