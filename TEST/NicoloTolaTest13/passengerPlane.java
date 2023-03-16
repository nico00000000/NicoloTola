package TEST.NicoloTolaTest13;

public class passengerPlane extends Aereo{
    private int nservizi;
    Aereo plane = new Aereo();

    passengerPlane(String nome, double carico, int Nposti, int nservizi){
        plane.setNome(nome);
        plane.setNposti(Nposti);
        plane.setCarico(carico);
        this.nservizi = nservizi;
    }
}
