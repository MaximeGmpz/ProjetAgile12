package lesCases;

import java.util.ArrayList;
import java.util.List;

public class Serpent {
	int id ;
	private int taille;
	private List<Affichable> serpent;
	private int direction ;
	
	public Serpent(int id , int x , int y){
		serpent = new ArrayList<Affichable>() ;
		serpent.add(new Corp(id, x, y));
		test.plateau.placer(x, y, new Corp(id, x, y));
		
	}
	
	public void grandir(){
		taille = taille++ ;
	}
	
	public void deplacer(int direction){
		if(direction == Directions.NORD){
			for(Affichable a : serpent){
				test.plateau.placer(a.getX(), a.getY(), new CaseNormal(new int[]{a.getX() , a.getY() , 0 }));
				test.plateau.placer(a.getX(), a.getY() - 1, new Corp(1, a.getX() , a.getY() - 1));
			}
		}
	}
	
/*	public Snacke(){
		numeroEquipe=1;
		taille=0;
		serpent.add(new tete(1,x,y));
        }*/
	
	/*public void getBigger(){
		this.serpent.add(new corp(1,x,y));
	}*/

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
