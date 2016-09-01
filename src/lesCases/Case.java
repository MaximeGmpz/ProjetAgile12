//////////////////////////////////////////////////////////////////////////////
//                         AUTEUR : THIBAULT CORBRION                       //
//////////////////////////////////////////////////////////////////////////////
/**
 * @author thibault CORBRION
 */
package lesCases;

import java.util.Scanner;

public abstract class Case implements Affichable
{
//////////////////////////////////////////////////////////////////////////////
//                               ATRIBUS                                    //
//////////////////////////////////////////////////////////////////////////////
	
	public int x;
	public int y;
	private boolean franchissableEquipe1;
    private boolean franchissableEquipe2;
    protected ObjetATrouver obj;
    private boolean Modifiable;
    public static Scanner scan = new Scanner(System.in);

	public static final String RESET = "\u001B[0m";
	public static final String BLACK = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String PURPLE = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";
	public static final String BOLD = "\033[0;1m";
   
   
	
//////////////////////////////////////////////////////////////////////////////
//                          CONSTRUCTEUR                                    //
//////////////////////////////////////////////////////////////////////////////
/**
 * Constructeur d'une case , qui a egalement en attribut :
 * franchissableEquipe1,franchissableEquipe2 deux boolean qui determine le caractere franchissable de la case 
 * obj de type ObjetATrouver voir l'enumeration "ObjetATrouver"
 * Modifiable un boolean utilise lors de la generation du plateau   
 * @param coordonnes
 * 		 coordonnnes de la case sur le plateau
 * 
 */
	public Case(int[] coordonnes)
	{
		this.x=coordonnes[0];
		this.y=coordonnes[1];
		
	}
	public Case(int x , int y){
		this.x = x ;
		this.y = y ;
	}

//////////////////////////////////////////////////////////////////////////////
//                    GETTER/SETTER ABSCISSE  X                              //
//////////////////////////////////////////////////////////////////////////////
/**
 *  renvoi l'abcisse de la case
 * @return x
 *         x entier : abcisse de la case	
 */
	public int getX() 
	{
		return x;
	}
/**
 * remplace l'abscisse de la case	
 * @param abscisse
 *        abscisse entier 
 *        
 */
	public void setX(int abscisse) {
		this.x= abscisse;
	}

/////////////////////////////////////////////////
	/////////////////////////////
//                    GETTER/SETTER ORDONNE     Y                            //
//////////////////////////////////////////////////////////////////////////////	
	/**
	 * renvoi l Ordonne de la case
	 * @return y
	 *         y entier :ordonne de la case
	 */
	public int getY() {
		return y;
	}
	 /**
	 * remplace l Ordonne de la case par le paramettre ordonne
	 * @param ordonne
	 *        ordonne entier
	 */
	public void setY(int ordonne) 
	{
		this.y = ordonne;
	}
//////////////////////////////////////////////////////////////////////////////
//					  GETTER HAUTEUR		Z                               //
//////////////////////////////////////////////////////////////////////////////
	/**
	 * renvoi la hauteur de la case sur le plateau
	 */
	public int getHauteur() 
	{
		return 0;
	}
	
//////////////////////////////////////////////////////////////////////////////
//                    GETTER/SETTER COORDONNE                               //
//////////////////////////////////////////////////////////////////////////////	
	
	/**
	 * renvoi un tableau avec toute les coodonne de la case
	 * @return tab 
	 *         tab  le tableau des coodonnes
	 */
	public int[] getCoordonnee()
	{
		int[] tab = new int [3];
		tab[0]= this.getX();
		tab[1]= this.getY();
		tab[2]= 0;
		
		return tab;
	}
	
//////////////////////////////////////////////////////////////////////////////
//                    GETTER/SETTER FRANCHISSABLE                           //
//////////////////////////////////////////////////////////////////////////////
	/**
	 * renvoi l'�tat de l atribut Francissable de  l'�quipe 1
	 * @return franchissableEquipe1
	 *         franchissableEquipe1 un boolean
	 */
	public boolean getFranchissableEquipe1(){
		return this.franchissableEquipe1;
	}
	/**
	 * renvoi l'�tat de l atribut Francissable de  l'�quipe 2
	 * @return franchissableEquipe2
	 *         franchissableEquipe2 un boolean
	 */
	public boolean getFranchissableEquipe2(){
		return this.franchissableEquipe2;
	}
	/**
	 * remplace franchissableEquipe1 par la valeur de b
	 * @param b
	 *        b boolean
	 */
	public void setFranchissableEquipe1(boolean b){
		this.franchissableEquipe1=b;
	}
	/**
	 * remplace franchissableEquipe2 par la valeur de b
	 * @param b
	 *        b boolean
	 */
	public void setFranchissableEquipe2(boolean b){
		this.franchissableEquipe2=b;
	}

	
//////////////////////////////////////////////////////////////////////////////
//                          TO STRING                                       //
//////////////////////////////////////////////////////////////////////////////
	/**
	 *  renvoi une String du type : Case : abscisse=" + x + "\n ordonne=" + y + "\ntype :
	 */
	public String toString() {
		return "Case : abscisse=" + x + "\n ordonne=" + y + "\ntype : ";
	}	
//////////////////////////////////////////////////////////////////////////////
//                        GESTION OBJ                                       //
//////////////////////////////////////////////////////////////////////////////	
	/**
	 * revoi  l'objet qui est sur la case
	 * @return obj
	 *         obj ObjetATrouver
	 */
	public ObjetATrouver getObj(){
		return this.obj;
	}
	/**
	 * Met l'objet obj dans la case
	 * @param obj
	 *        obj ObjetATrouver
	 */
	public void setObj(ObjetATrouver obj) {
		this.obj = obj;
	}
	/**
	 * renvoi true si la case contient un objet
	 */
	public boolean gotObjet(){
		if(this.obj.equals(null)){return false;}
		else return true;
	}
//////////////////////////////////////////////////////////////////////////////
//GESTION OBJ                                                               //
//////////////////////////////////////////////////////////////////////////////
	/**
	 * rend une case modifiable ou non 
	 * @param b
	 *        b boolean
	 */
	public void setModifiable(boolean b){
		this.Modifiable=b;
	}
	/**
	 * retourne l'etat modifiable
	 * @param b
	 *        b boolean
	 */
	public boolean getModifiable(){
	return	this.Modifiable;
	}
//////////////////////////////////////////////////////////////////////////////
//                               ABSTRACT ACTION                            //
//////////////////////////////////////////////////////////////////////////////
	public String getRepresentation() {
		// TODO Auto-generated method stub
		return null;
	}
  
  

}