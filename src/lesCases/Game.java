package lesCases;

public class Game {
	boolean victoire=false;

	public Game(){
		char c;
		
		Serpent s1 = new Serpent(1, 8, 8);
		Serpent s2 = new Serpent(2, 2, 2);
		
		while(!victoire){
			test.plateau.afficher();
			
			c=' ';
			
			while (c==' '){
				c= new MonScanner().c;
			}
			
			if(c=='z'){
				s1.deplacer(Directions.NORD);
			}else if (c=='q'){
				s1.deplacer(Directions.OUEST);
			}else if (c=='d'){
				s1.deplacer(Directions.EST);
			}else if (c=='s'){
				s1.deplacer(Directions.SUD);
			}
			
			
		}
	
	}
}
