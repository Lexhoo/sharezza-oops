public class Car extends Vehicle {

    public Car(String brand) {
	super(brand);
    }

    @Override
    public String doStuff() {
        return  "je fais vroum vroum !";
    }

}
