package fr.diginamic.maison.entites;

public class Salon extends Piece {

	public Salon(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public TypePiece getTypePiece() {
		return TypePiece.SALON;
	}

}
