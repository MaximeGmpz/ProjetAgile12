package lesCases;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
	
	Plateau choixPlateau;
	
	public Menu(){
		int choix;
		System.out.println(Case.BOLD + "Bonjour, voulez-vous :" + Case.RESET);
		System.out.println("1 : Jouer");
		System.out.println("2 : Option");
		System.out.println("3 : Regles");
		System.out.println("4 : Quitter");
		Scanner s = new Scanner(System.in);
		choix = s.nextInt();
		choix_menu(choix);
	}
	public void choix_menu(int choix){
		switch (choix)
		{
		  case 1:
		    jouer();
		    break; 
		  case 2 :
			option();
			break;
		  case 3 :
			try {
				regles();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		  case 4 :
			quitter();
			break;
		  default:
			  System.out.println("Choisissez une option valide");
			  new Menu();
		              
		}
	}
	private void quitter() {
		// TODO Auto-generated method stub
		
	}
	private void regles() throws IOException {
		FileReader inputReader;
		BufferedReader inputBuffer;
		String name = "";
		try {
			inputReader = new FileReader("regles.txt");
			inputBuffer = new BufferedReader(inputReader);
			name = inputBuffer.readLine();
			while(name != null){
				System.out.println(name);
				name = inputBuffer.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new Menu();
	}
	private void option() {
		// TODO Auto-generated method stub
		
	}
	private void jouer() {
		int choix_plateau;
		System.out.println("Choisissez un plateau");
		
		for(int i = 1 ; i <5 ; i++){
			System.out.println(i);
			Plateau monPlateau = new Plateau(i-1);
			monPlateau.afficher();
			
		}
		Scanner s = new Scanner(System.in);
		choix_plateau = s.nextInt();
		while(choix_plateau<0 || choix_plateau>4){
			System.out.print("Entrez un choix valide entre 1 et 3");
			choix_plateau = s.nextInt();
		}
		
		choixPlateau=new Plateau(choix_plateau);
		
	}
}
