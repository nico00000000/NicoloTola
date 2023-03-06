package Ereditarietà;
class Car extends Veicolo{
    private String modelName = "Fiat";

    public static void main(String[] args){
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}