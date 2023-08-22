package aufgabe5;

public class TestAusleiher {

	public static void main(String[] args) {
		Person p1 = new Ausleiher();
		p1.setName("Musterfrau");
		p1.setVorname("Lisa");
		((Ausleiher)p1).setAusleiherNummer(100);
		
		System.out.println (p1.getName() + " " + p1.getVorname()
				+ "\nmit Nummer: " + ((Ausleiher)p1).getAusleiherNummer());
	}
	
}
