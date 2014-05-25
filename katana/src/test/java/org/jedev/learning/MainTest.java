package org.jedev.learning;

/**
 * Created by svnwnk on 25/05/14.
 */
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;


public class MainTest {

	@Test
	public void testTriple() {
		assertThat( Main.triple( "AB" ), equalTo("ABABAB"));
	}
}
