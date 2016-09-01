package lesCases;

public class test {
	public static Plateau plateau = new Plateau(3);

	public static void main(String[] args) {

		Menu menu = new Menu() ;
		plateau = menu.choixPlateau ;
		new Game();
	}

}
