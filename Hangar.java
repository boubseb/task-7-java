public class Hangar {
    public static void main(String[] args) {

        Car car = new Car(100000, "mercedes");

        System.out.println(car.doStuff());


        Boat boat = new Boat("Titanic", 50000);

        System.out.println(boat.doStuff());
    }
}