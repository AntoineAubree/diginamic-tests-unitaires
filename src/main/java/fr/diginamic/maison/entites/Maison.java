package fr.diginamic.maison.entites;

public class Maison {

	private Piece[] pieces;

	public Maison() {
		this.pieces = new Piece[0];
	}

	public void ajouterPiece(Piece piece) {
		if (piece != null && piece.getSuperficie() > 0 && piece.getEtage() >= 0) {
			Piece[] newTab = new Piece[pieces.length + 1];
			for (int i = 0; i < pieces.length; i++) {
				newTab[i] = pieces[i];
			}
			pieces = newTab;
			pieces[pieces.length - 1] = piece;
		}
	}

	public double getSuperficieTotale() {
		double superficie = 0;
		for (int i = 0; i < pieces.length; i++) {
			superficie += pieces[i].getSuperficie();
		}
		return superficie;
	}

	public double getSuperficieParEtage(int etage) {
		double superficie = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getEtage() == etage) {
				superficie += pieces[i].getSuperficie();
			}
		}
		return superficie;
	}

	public double getSuperficieParTypePiece(TypePiece type) {
		double superficie = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getTypePiece().equals(type)) {
				superficie += pieces[i].getSuperficie();
			}
		}
		return superficie;
	}

	public int getNbPiecesParTypePiece(TypePiece type) {
		int nbPieces = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getTypePiece().equals(type)) {
				nbPieces ++;
			}
		}
		return nbPieces;
	}

}
