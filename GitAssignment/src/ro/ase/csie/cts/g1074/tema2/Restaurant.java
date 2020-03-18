package ro.ase.csie.cts.g1074.tema2;

public class Restaurant implements Program {

	String denumire;
	String adresa;
	
	public Restaurant(String denumire, String adresa) {
		super();
		this.denumire = denumire;
		this.adresa = adresa;
	}

	@Override
	public void deschidere() {
		System.out.println("Restaurantul " + denumire +
				" a deschis!");
	}

	@Override
	public void inchidere() {
		System.out.println("Restaurantul " + denumire +
				" a inchis!");		
	}

	@Override
	public String toString() {
		return "Restaurantul cu denumirea " + denumire + " se afla la adresa " + adresa;
	}
}

