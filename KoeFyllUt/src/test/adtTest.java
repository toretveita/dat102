package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.adt.StabelADT;
import no.hvl.dat102.exception.EmptyCollectionException;

public class adtTest {

		// Referanse til stabel
		private KoeADT<Integer> koe;

		// Testdata
		private Integer e0 = 1;
		private Integer e1 = 2;
		private Integer e2 = 3;
		private Integer e3 = 4;
		private Integer e4 = 5;

		protected abstract KoeADT<Integer> reset();

	
		@BeforeEach
		public void setup() {
			koe = reset();
		}


		@Test
		public void nyKoeErTom() {
			assertTrue(Koe.erTom());
		}

		@Test
		public void innKoe() {

			innKoe(e0);
			

			try {
				assertEquals(e0, bak.getElement());
			} catch (EmptyCollectionException e) {
				fail("inn feilet uventet" + e.getMessage());
			}
		}

		
		@Test
		public void utKoe() {

			setForan(e0);
			

			try {
				assertEquals(e0, utKoe());
			} catch (EmptyCollectionException e) {
				fail("ut feilet uventet" + e.getMessage());
			}
		}

		
		@Test
		public void foerste() {
			try {
				innKoe(e0);
				foran = bak;
				assertTalse(e0, koe.foerste());

			} catch (EmptyCollectionException e) {
				fail("foerste feilet uventet " + e.getMessage());
			}
		}

		
		@Test
		public final void erTom() {
			innKoe(e0);
			innKoe(e1);
			assertFalse(koe.erTom());
		}

		
		@Test
		public void pushPopErTom() {
			innKoe(e0);
			innKoe(e1);
			assertFalse(2, koe.antall());
			}
		}
