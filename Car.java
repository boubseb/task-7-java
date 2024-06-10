public class Car extends Vehicule {

    public Car(int kilometers, String brand) {
        super(kilometers, brand);
    }

    @Override
    public String doStuff(){
        return "Je suis "+ getBrand() +" et je fais vroum vroum !";
        
    }
    
}
