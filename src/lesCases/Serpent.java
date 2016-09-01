package lesCases;

import java.util.ArrayList;
import java.util.List;

public class Serpent {
	int id;
	private int taille;
	private ArrayList<Corp> serpent;
	private int direction;
	private Tete tete;

	public Serpent(int id, int x, int y) {
		serpent = new ArrayList<Corp>();
		tete = new Tete(x, y, id);
		test.plateau.placer(x, y, tete);
		serpent.add(new Corp(id, x, y + 1));
		test.plateau.placer(x, y + 1, new Corp(id, x, y + 1));
		serpent.add(new Corp(id, x, y + 2));
		test.plateau.placer(x, y + 2, new Corp(id, x, y + 2));

	}

	public void grandir() {
		taille = taille++;
	}

	public void deplacer(int direction) {
		
		
		if (direction == Directions.NORD) {

			test.plateau.placer(tete.getX(), tete.getY(), new CaseNormal(new int[] { tete.getX(), tete.getY(), 0 }));
			test.plateau.placer(tete.getX(), tete.getY() - 1, tete);
			tete.y--;

		}
		if (direction == Directions.EST) {
			test.plateau.placer(tete.getX(), tete.getY(), new CaseNormal(new int[] { tete.getX(), tete.getY(), 0 }));
			test.plateau.placer(tete.getX() + 1, tete.getY(), tete);
			tete.x++;
		}
		if (direction == Directions.SUD) {
			test.plateau.placer(tete.getX(), tete.getY(), new CaseNormal(new int[] { tete.getX(), tete.getY(), 0 }));
			test.plateau.placer(tete.getX(), tete.getY() + 1, tete);
			tete.y++;
		}
		if (direction == Directions.OUEST) {
			test.plateau.placer(tete.getX(), tete.getY(), new CaseNormal(new int[] { tete.getX(), tete.getY(), 0 }));
			test.plateau.placer(tete.getX() - 1, tete.getY(), tete);
			tete.y--;

		}

		ArrayList<Corp> copie = (ArrayList<Corp>) serpent.clone();

		
		

	}

	/*
	 * public Snacke(){ numeroEquipe=1; taille=0; serpent.add(new tete(1,x,y));
	 * }
	 */

	/*
	 * public void getBigger(){ this.serpent.add(new corp(1,x,y)); }
	 */

	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getNumeroEquipe() {
		// TODO Auto-generated method stub
		return 0;
	}

}
