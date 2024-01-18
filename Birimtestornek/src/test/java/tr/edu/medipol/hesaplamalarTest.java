package tr.edu.medipol;

import static org.junit.Assert.*;

import org.junit.Test;

public class hesaplamalarTest {

	@Test
	public void testTopla() {
		int sonuc = hesaplamalar.topla(10,5,1);
		assertEquals(16,sonuc);

	}

	@Test
	public void testCikar() {
		int sonuc = hesaplamalar.cikar(10,5,1);
		assertEquals(4,sonuc);
	}

	@Test
	public void testCarp() {
		int sonuc = hesaplamalar.carp(10,5,1);
		assertEquals(50,sonuc);
	}

}
