import org.junit.*;
import static org.junit.Assert.*;

public class Automaattestid {
    @Test
    public void esimene(){
        Jook jook = new Jook("Aura Fresh | Apelsin", 1.32, 1.01, JoogiTyyp.APELSINIMAHL);
        Joogipudel pudel = new Joogipudel(1.5, 0.3, 0.1, jook, PudeliTyyp.PLASTPUDEL);
        assertEquals(1.815 ,pudel.getMass(), 0.01);
	}
	@Test
	public void teine(){
		Jook jook = new Jook("Külm Kohv", 5.5, 1.01, JoogiTyyp.KOHV);
		Joogipudel pudel = new Joogipudel(0.5, 0.3, 0.1, jook, PudeliTyyp.KLAASPUDEL);
		assertEquals(2.85, pudel.getOmahind(), 0.01);
	}
	@Test
	public void kolmas(){
		Jook jook = new Jook("FANTA", 0.99, 1.01, JoogiTyyp.APELSINIMAHL);
		Joogipudel pudel = new Joogipudel(2, 0.2, 0.1, jook, PudeliTyyp.PLASTPUDEL);
		Joogivaat vaat = new Joogivaat(1000, 1000);
		assertTrue(vaat.taidaPudel(pudel));
	}
	@Test 
	public void neljas(){
		JoogipudeliteKast kast = new JoogipudeliteKast(KastiTyyp.PUIT, 420, 6.9, 42);
		Jook jook = new Jook("Külm Kohv", 5.5, 1.01, JoogiTyyp.KOHV);
		Joogipudel pudel = new Joogipudel(0.5, 0.3, 0.1, jook, PudeliTyyp.KLAASPUDEL);
		Jook jook1 = new Jook("FANTA", 0.99, 1.01, JoogiTyyp.APELSINIMAHL);
		Joogipudel pudel1 = new Joogipudel(2, 0.2, 0.1, jook, PudeliTyyp.PLASTPUDEL);
		Joogivaat vaat = new Joogivaat(1000, 1000);
		kast.pudelid.add(pudel);
		kast.pudelid.add(pudel1);
		assertEquals(9.925, kast.getTotalMass(), 0.01);
		kast.fillBottles(vaat);
		assertEquals(433.95, kast.getTotalPrice(), 0.01);
		
	}
}