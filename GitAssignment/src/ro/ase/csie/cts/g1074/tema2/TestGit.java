package ro.ase.csie.cts.g1074.tema2;


public class TestGit {

	public static void main(String[] args) {
		
		System.out.println("Hello Git ! Denumirea proiectului de licență este "
				+ "Dezvoltarea unei aplicații în sectorul HoReCa");
		
		Restaurant restaurant=new Restaurant("Capsa","Calea Victoriei 36");
		System.out.println(restaurant);
		restaurant.deschidere();
		restaurant.inchidere();
	}
}

