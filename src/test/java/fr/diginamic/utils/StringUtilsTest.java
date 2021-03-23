/**
 * 
 */
package fr.diginamic.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Antoine
 *
 */
public class StringUtilsTest {

	/**
	 * Test method for
	 * {@link fr.diginamic.utils.StringUtils#levenshteinDistance(java.lang.CharSequence, java.lang.CharSequence)}.
	 */
	@Test
	public void testLevenshteinDistance1() {
		int result = StringUtils.levenshteinDistance("chat", "chats");
		assertEquals(1, result);
	}

	/**
	 * Test method for
	 * {@link fr.diginamic.utils.StringUtils#levenshteinDistance(java.lang.CharSequence, java.lang.CharSequence)}.
	 */
	@Test
	public void testLevenshteinDistance2() {
		int result = StringUtils.levenshteinDistance("machins", "machine");
		assertEquals(1, result);
	}

	/**
	 * Test method for
	 * {@link fr.diginamic.utils.StringUtils#levenshteinDistance(java.lang.CharSequence, java.lang.CharSequence)}.
	 */
	@Test
	public void testLevenshteinDistance3() {
		int result = StringUtils.levenshteinDistance("aviron", "avion");
		assertEquals(1, result);
	}

	/**
	 * Test method for
	 * {@link fr.diginamic.utils.StringUtils#levenshteinDistance(java.lang.CharSequence, java.lang.CharSequence)}.
	 */
	@Test
	public void testLevenshteinDistance4() {
		int result = StringUtils.levenshteinDistance("distance", "instance");
		assertEquals(2, result);
	}

	/**
	 * Test method for
	 * {@link fr.diginamic.utils.StringUtils#levenshteinDistance(java.lang.CharSequence, java.lang.CharSequence)}.
	 */
	@Test
	public void testLevenshteinDistance5() {
		int result = StringUtils.levenshteinDistance("chien", "chine");
		assertEquals(2, result);
	}

	/**
	 * Test method for
	 * {@link fr.diginamic.utils.StringUtils#levenshteinDistance(java.lang.CharSequence, java.lang.CharSequence)}.
	 */
	@Test
	public void testLevenshteinDistance6() {
		int result = StringUtils.levenshteinDistance(" ", " ");
		assertEquals(0, result);
	}

	/**
	 * Test method for
	 * {@link fr.diginamic.utils.StringUtils#levenshteinDistance(java.lang.CharSequence, java.lang.CharSequence)}.
	 */
	@Test
	public void testLevenshteinDistance7() {
		int result = StringUtils.levenshteinDistance(null, " ");
		assertEquals(-1, result);
	}
	/**
	 * Test method for
	 * {@link fr.diginamic.utils.StringUtils#levenshteinDistance(java.lang.CharSequence, java.lang.CharSequence)}.
	 */
	@Test
	public void testLevenshteinDistance8() {
		int result = StringUtils.levenshteinDistance(null, null);
		assertEquals(-1, result);
	}

	/**
	 * Test method for
	 * {@link fr.diginamic.utils.StringUtils#levenshteinDistance(java.lang.CharSequence, java.lang.CharSequence)}.
	 */
	@Test
	public void testLevenshteinDistance9() {
		int result = StringUtils.levenshteinDistance(" ", null);
		assertEquals(-1, result);
	}

	/**
	 * Test method for
	 * {@link fr.diginamic.utils.StringUtils#levenshteinDistance(java.lang.CharSequence, java.lang.CharSequence)}.
	 */
	@Test
	public void testLevenshteinDistance10() {
		int result = StringUtils.levenshteinDistance("98", "98");
		assertEquals(0, result);
	}

}
