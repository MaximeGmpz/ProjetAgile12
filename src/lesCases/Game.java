package lesCases;

public class Game {
	boolean victoire=false;

	public Game(){
		char c;
		
		boolean b=true;
		

		Serpent s1 = new Serpent(1, 8, 8);
		Serpent s2 = new Serpent(2, 2, 2);
		
		while(!victoire){
			test.plateau.afficher();
			
			c=' ';
			
			while (c==' '){
				c= new MonScanner().c;
			}
			System.out.println(b);
			if(b){
			
				if(c=='z'){
					s1.deplacer(Directions.NORD);
				}else if (c=='q'){
					s1.deplacer(Directions.OUEST);
				}else if (c=='d'){
					s1.deplacer(Directions.EST);
				}else if (c=='s'){
					s1.deplacer(Directions.SUD);
				}
				b=false;
			}else {
				if(c=='o'){
					s2.deplacer(Directions.NORD);
				}else if (c=='1'){
					s2.deplacer(Directions.OUEST);
				}else if (c=='3'){
					s2.deplacer(Directions.EST);
				}else if (c=='2'){
					s2.deplacer(Directions.SUD);
				}
				b=!b;
				
			}
			
		}
	
	}
}
