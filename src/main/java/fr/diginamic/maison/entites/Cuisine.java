package fr.diginamic.maison.entites;

public class Cuisine extends Piece {

	public Cuisine(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public TypePiece getTypePiece() {
		return TypePiece.CUISINE;
	}

}
