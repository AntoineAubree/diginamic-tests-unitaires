package fr.diginamic.maison.entites;

public class Chambre extends Piece {

	public Chambre(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public TypePiece getTypePiece() {
		return TypePiece.CHAMBRE;
	}

}
