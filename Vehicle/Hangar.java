import java.util.ArrayList;

public class Hangar {

    public static void main(String[] args) {
	Car clio = new Car("une Clio");
	Boat boat = new Boat("le Titanic");

	System.out.println("Je suis " + clio.getBrand() + " et " + clio.doStuff());
	System.out.println("Je suis " + boat.getBrand() + " et " + boat.doStuff());
  }
}
