package lesCases;

public class test {
	public static Plateau plateau = new Plateau(3);

	public static void main(String[] args) {
		Serpent python = new Serpent(1, 8, 8);
		plateau.afficher();
		python.deplacer(Directions.NORD);
		plateau.afficher(); 
		python.deplacer(Directions.NORD);
		plateau.afficher(); 
		python.deplacer(Directions.NORD);
		plateau.afficher(); 
		python.deplacer(Directions.NORD);
		plateau.afficher(); 
		python.deplacer(Directions.NORD);
		plateau.afficher(); 
		python.deplacer(Directions.EST);
		plateau.afficher(); 
		python.deplacer(Directions.SUD);
		plateau.afficher();
		python.deplacer(Directions.OUEST);
		plateau.afficher();
	}

}
