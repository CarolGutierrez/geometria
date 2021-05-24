import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circulo_NCGCTest {
	Circulo_NCGC calculo= new Circulo_NCGC(7.0 ,"circulo");
	@Test
	void testArea() {
		
		assertEquals(153.9384, calculo);
	}

	@Test
	void testPerimetro() {
		
		assertEquals(43.9824, calculo);
	}

	
}
