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
		//serpent.add(new Corp(id, x, y + 2));
		//test.plateau.placer(x, y + 2, new Corp(id, x, y + 2));

	}

	public void grandir() {
		taille = taille++;
	}

	public void deplacer(int direction) {
		
		int teteX = tete.getX() ;
		int teteY = tete.getY();
		
 		
		if (direction == Directions.NORD) {
			
			
			tete.y--;
			

		}
		if (direction == Directions.EST) {
			
			tete.x++;
		}
		if (direction == Directions.SUD) {
			
			tete.y++;
		}
		if (direction == Directions.OUEST) {
			
			tete.x--;

		}
		if(!test.plateau.getCase(teteX, teteY).estfranchissable()){
			
		}
		test.plateau.placer(tete);
		ArrayList<Corp> copie = (ArrayList<Corp>) serpent.clone(); 
		serpent.get(0).x = teteX ;
		serpent.get(0).y = teteY ;
		test.plateau.placer(serpent.get(0));
		for(int i = 1 ; i < serpent.size() ; i++){
			serpent.get(i).x = copie.get(i - 1).getX() ;
			serpent.get(i).y = copie.get(i - 1).getY();
			test.plateau.placer(serpent.get(i));
					
		}
if(!test.plateau.getCase(teteX, teteY).estfranchissable()){
			System.out.println("L'équipe 1 à perdu");
		}
		
		

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
