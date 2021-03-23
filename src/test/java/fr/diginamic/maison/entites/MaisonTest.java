/**
 * 
 */
package fr.diginamic.maison.entites;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Antoine
 *
 */
public class MaisonTest {

	private static final double DELTA = 0.0000001;

	/**
	 * Test method for
	 * {@link fr.diginamic.maison.entites.Maison#ajouterPiece(fr.diginamic.maison.entites.Piece)}.
	 */
	@Test
	public void testAjouterPiece1() {
		Maison maMaison = new Maison();
		maMaison.ajouterPiece(new Cuisine(32.5, 0));
		double superficieTotale = maMaison.getSuperficieTotale();
		double superficieEtage0 = maMaison.getSuperficieParEtage(0);
		double superficieEtage1 = maMaison.getSuperficieParEtage(1);
		double superficieCuisine = maMaison.getSuperficieParTypePiece(TypePiece.CUISINE);
		double superficieSalon = maMaison.getSuperficieParTypePiece(TypePiece.SALON);
		double nbCuisine = maMaison.getNbPiecesParTypePiece(TypePiece.CUISINE);
		double nbSalon = maMaison.getNbPiecesParTypePiece(TypePiece.SALON);
		
		assertEquals(32.5, superficieTotale, DELTA);
		assertEquals(32.5, superficieEtage0, DELTA);
		assertEquals(0, superficieEtage1, DELTA);
		assertEquals(32.5, superficieCuisine, DELTA);
		assertEquals(0, superficieSalon, DELTA);
		assertEquals(1, nbCuisine, DELTA);
		assertEquals(0, nbSalon, DELTA);
	}

	/**
	 * Test method for
	 * {@link fr.diginamic.maison.entites.Maison#ajouterPiece(fr.diginamic.maison.entites.Piece)}.
	 */
	@Test
	public void testAjouterPiece2() {
		Maison maMaison = new Maison();
		maMaison.ajouterPiece(new Cuisine(-32.5, 0));
		double superficieTotale = maMaison.getSuperficieTotale();
		double superficieEtage0 = maMaison.getSuperficieParEtage(0);
		double superficieEtage1 = maMaison.getSuperficieParEtage(1);
		double superficieCuisine = maMaison.getSuperficieParTypePiece(TypePiece.CUISINE);
		double superficieSalon = maMaison.getSuperficieParTypePiece(TypePiece.SALON);
		double nbCuisine = maMaison.getNbPiecesParTypePiece(TypePiece.CUISINE);
		double nbSalon = maMaison.getNbPiecesParTypePiece(TypePiece.SALON);
		
		assertEquals(0, superficieTotale, DELTA);
		assertEquals(0, superficieEtage0, DELTA);
		assertEquals(0, superficieEtage1, DELTA);
		assertEquals(0, superficieCuisine, DELTA);
		assertEquals(0, superficieSalon, DELTA);
		assertEquals(0, nbCuisine, DELTA);
		assertEquals(0, nbSalon, DELTA);
	}

	/**
	 * Test method for
	 * {@link fr.diginamic.maison.entites.Maison#ajouterPiece(fr.diginamic.maison.entites.Piece)}.
	 */
	@Test
	public void testAjouterPiece3() {
		Maison maMaison = new Maison();
		maMaison.ajouterPiece(new Cuisine(32.5, -1));
		double superficieTotale = maMaison.getSuperficieTotale();
		double superficieEtage0 = maMaison.getSuperficieParEtage(0);
		double superficieEtage1 = maMaison.getSuperficieParEtage(1);
		double superficieCuisine = maMaison.getSuperficieParTypePiece(TypePiece.CUISINE);
		double superficieSalon = maMaison.getSuperficieParTypePiece(TypePiece.SALON);
		double nbCuisine = maMaison.getNbPiecesParTypePiece(TypePiece.CUISINE);
		double nbSalon = maMaison.getNbPiecesParTypePiece(TypePiece.SALON);
		
		assertEquals(0, superficieTotale, DELTA);
		assertEquals(0, superficieEtage0, DELTA);
		assertEquals(0, superficieEtage1, DELTA);
		assertEquals(0, superficieCuisine, DELTA);
		assertEquals(0, superficieSalon, DELTA);
		assertEquals(0, nbCuisine, DELTA);
		assertEquals(0, nbSalon, DELTA);
	}

	/**
	 * Test method for
	 * {@link fr.diginamic.maison.entites.Maison#ajouterPiece(fr.diginamic.maison.entites.Piece)}.
	 */
	@Test
	public void testAjouterPiece4() {
		Maison maMaison = new Maison();
		maMaison.ajouterPiece(null);
		double superficieTotale = maMaison.getSuperficieTotale();
		double superficieEtage0 = maMaison.getSuperficieParEtage(0);
		double superficieEtage1 = maMaison.getSuperficieParEtage(1);
		double superficieCuisine = maMaison.getSuperficieParTypePiece(TypePiece.CUISINE);
		double superficieSalon = maMaison.getSuperficieParTypePiece(TypePiece.SALON);
		double nbCuisine = maMaison.getNbPiecesParTypePiece(TypePiece.CUISINE);
		double nbSalon = maMaison.getNbPiecesParTypePiece(TypePiece.SALON);
		
		assertEquals(0, superficieTotale, DELTA);
		assertEquals(0, superficieEtage0, DELTA);
		assertEquals(0, superficieEtage1, DELTA);
		assertEquals(0, superficieCuisine, DELTA);
		assertEquals(0, superficieSalon, DELTA);
		assertEquals(0, nbCuisine, DELTA);
		assertEquals(0, nbSalon, DELTA);
	}
	
}
