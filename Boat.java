public class Boat extends Vehicule {
   
    public Boat(String brand, int kilometers) {
        super(kilometers,brand);
    }

    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais glou glou !";
    }
}
