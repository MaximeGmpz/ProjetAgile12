package lesCases;

public class test {

	public static void main(String[] args) {
		Plateau plateau = new Plateau();
		plateau.placer(2, 3, new Corp(1, 2, 3));
		plateau.afficher();

	}

}
