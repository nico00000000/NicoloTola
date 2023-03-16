package TEST.NicoloTolaTest13;

public class cargoPlane extends Aereo {
    private double caricoMax;
    Aereo plane = new Aereo();

    cargoPlane(String nome, double carico, int Nposti, double caricoMax){
        plane.setNome(nome);
        plane.setNposti(Nposti);
        plane.setCarico(carico);
        this.caricoMax = caricoMax;
    }
}
