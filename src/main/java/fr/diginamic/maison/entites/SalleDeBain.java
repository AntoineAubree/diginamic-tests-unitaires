package fr.diginamic.maison.entites;

public class SalleDeBain extends Piece {

	public SalleDeBain(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public TypePiece getTypePiece() {
		return TypePiece.SALLE_DE_BAIN;
	}

}
