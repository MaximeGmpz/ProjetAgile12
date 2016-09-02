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
			
			c=getCar();
			
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
				}else if (c=='e'){
					System.out.println("Quitter le jeu ? (o/n)");
					if(getCar()=='o'){
						victoire=true;
					}					
				}
				b=false;
			}else {
				if(c=='5'){
					s2.deplacer(Directions.NORD);
				}else if (c=='1'){
					s2.deplacer(Directions.OUEST);
				}else if (c=='3'){
					s2.deplacer(Directions.EST);
				}else if (c=='2'){
					s2.deplacer(Directions.SUD);
				}else if (c=='e'){
					System.out.println("Quitter le jeu ? (o/n)");
					if(getCar()=='o'){
						victoire=true;
					}	
				}
				b=!b;
				
			}
			
		}
		
	
	}
	public char getCar(){
		char c=' ';
		while (c==' '){
			try{
				c= new MonScanner().c;
			}catch(Exception e){
				c=' ';
			}
		}
		return c;
	}
}
