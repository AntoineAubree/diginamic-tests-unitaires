package fr.diginamic.maison.entites;

public class WC extends Piece {

	public WC(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public TypePiece getTypePiece() {
		return TypePiece.WC;
	}

}
