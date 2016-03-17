package mancala;

public class Cup {

	protected int count;

	public Cup() {
		reset();
	}

	public void addPiece() {
		count++;
	}

	public int getCount() {
		return count;
	}

	public int removePieces() {
		int temp = count;
		count = 0;
		return temp;
	}

	public void reset() {
		count = 4;
	}
}
