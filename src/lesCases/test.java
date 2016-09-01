package lesCases;

public class test {
	public static Plateau plateau;

	public static void main(String[] args) {
		Menu menu=new Menu();
		plateau=menu.choixPlateau;
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
