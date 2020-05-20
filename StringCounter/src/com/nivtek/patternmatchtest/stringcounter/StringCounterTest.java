/**
 * 
 */
package com.nivtek.patternmatchtest.stringcounter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Bootcamp User 007
 *
 */
class StringCounterTest {

	/**
	 * Test method for {@link com.nivtek.patternmatchtest.stringcounter.StringCounter#getPrint(java.lang.String)}.
	 */
	@Test
	void testGetPrint() {
		
		StringCounter st = new StringCounter();
		
		
		
		String expectedResult = "p3r";
		String actualResult = st.getPrint("peter");
		
		assertEquals(expectedResult,actualResult);
		
		
		
	}

}
