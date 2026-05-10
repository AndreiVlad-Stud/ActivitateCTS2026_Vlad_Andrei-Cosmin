package pregatireTest1.prototype.Restaurant.Main;

import pregatireTest1.prototype.Restaurant.Prototype.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare = new Rezervare("Popescu", 2, "0040798734523");
		Rezervare rezervare2=(Rezervare) rezervare.copiere();
		

	}

}
