public abstract class  Vehicule {
    private int kilometers;
    private String brand;


    public Vehicule(int kilometers, String brand) {
        this.kilometers = kilometers;
        this.brand = brand;
    }

    public abstract String doStuff();


    public int getKilometers() {
        return kilometers;
    }


    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }
    

    
    
}
