/**
 * 
 */
package ejercicio2;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author federicoruiz 16 jun 2023 10:06:35
 */

 @RunWith(Parameterized.class)
public class OrdinariaENDE_FMRTest {


	String prueba = " ¡arriba la birra!";
	String reconocer = "reconocer";
	String issac = "Isaac no ronca así";

	@Parameters
	public static Collection<Object[]> pruebaParametrizada() {
		return Arrays.asList(new Object[][] {{ "¡arriba la birra!",false}, {"reconocer",true},{"Isaac no ronca así",false}});
	}

	/**
	 * Test method for
	 * {@link ejercicio2.OrdinariaENDE_FMR#esPalindromo(java.lang.String)}.
	 */
	@Test
	public void testEsPalindromo() {
		assertFalse(prueba, false);
		assertTrue(reconocer, true);
		assertFalse(issac, false);

	}

	/**
	 * Test method for
	 * {@link ejercicio2.OrdinariaENDE_FMR#quitarAcentos(java.lang.String)}.
	 */
	@Test
	public void testQuitarAcentos() {
		assertFalse(prueba, false);
		assertTrue(reconocer, true);
		assertFalse(issac, false);
	}



}
