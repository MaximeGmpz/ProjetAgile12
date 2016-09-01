package lesCases;

public class test {
	public static Plateau plateau = new Plateau();

	public static void main(String[] args) {
		Serpent python = new Serpent(1, 8, 8);
		plateau.afficher();
		python.deplacer(Directions.NORD);
		plateau.afficher(); 

	}

}
