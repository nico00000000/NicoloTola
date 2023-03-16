package Es16Marzo;

public class utente {
    private String username;
    private String password;
    private int eta;
    private int anniEsp;

    String getUsername(){
        return this.username;
    }

    String getPassword(){
        return this.password;
    }

    int getEta(){
        return this.eta;
    }

    int getAnniEsp(){
        return this.anniEsp;
    }

    utente(String username, String password, int eta, int anniEsp){
        this.username = username;
        this.password = password;
    }

    class admin extends utente{
        
        private final String password = "nico13";

        admin(String username, String password){
            super(username, password, eta, anniEsp);
            if(super.password.equals(this.password)){
                System.out.println("sei un admin! ");
            }
        }

        void creaPosizione(){

        }
    
    }
}
