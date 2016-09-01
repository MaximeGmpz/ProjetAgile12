package lesCases;

import java.util.ArrayList;
import java.util.List;

public class Serpent {
	int id ;
	private int taille;
	private List<Case> serpent;
	private int direction ;
	
	public Serpent(int id , int x , int y){
		serpent = new ArrayList<Case>() ;
		serpent.add(new Corp(id, x, y));
		test.plateau.placer(x, y, new Corp(id, x, y));
		
	}
	
	public void grandir(){
		taille = taille++ ;
	}
	
	public void deplacer(int direction){
		if(direction == Directions.NORD){
			for(Case a : serpent){
				test.plateau.placer(a.getX(), a.getY(), new CaseNormal(new int[]{a.getX() , a.getY() , 0 }));
				test.plateau.placer(a.getX(), a.getY() - 1, a );
				a.y-- ;
			}
		}
		if(direction == Directions.EST){
			for(Case a : serpent){
				test.plateau.placer(a.getX(), a.getY(), new CaseNormal(new int[]{a.getX() , a.getY() , 0 }));
				test.plateau.placer(a.getX() + 1 , a.getY(), a );
				a.x++ ;
			}
		}
		if(direction == Directions.SUD){
			for(Case a : serpent){
				test.plateau.placer(a.getX(), a.getY(), new CaseNormal(new int[]{a.getX() , a.getY() , 0 }));
				test.plateau.placer(a.getX() , a.getY() + 1, a );
				a.y++ ;
			}
		}
		if(direction == Directions.OUEST){
			for(Case a : serpent){
				test.plateau.placer(a.getX(), a.getY(), new CaseNormal(new int[]{a.getX() , a.getY() , 0 }));
				test.plateau.placer(a.getX() - 1 , a.getY(), a );
				a.y-- ;
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
