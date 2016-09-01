//////////////////////////////////////////////////////////////////////////////
//                         AUTEUR : THIBAULT CORBRION                       //
//////////////////////////////////////////////////////////////////////////////
package lesCases;
/**
 * 
 * @author thibault corbrion
 *
 */
public enum ObjetATrouver {
	
	hache(1,"R"), pelle(2,"T"), scoubidou(3," "), bidou(4," "), wha(5," "), Goal(6,"G"), bois(7,"B");

//////////////////////////////////////////////////////////////////////////////
//                               ATRIBUS                                    //
//////////////////////////////////////////////////////////////////////////////	
	private int numeroOBJ ;
	private static ObjetATrouver[] vecteurOBJ =values();
	private String representation;
	/**
	 * Objet a trouver  qui prend un numero et une representation
	 * @param numero
	 *        numero entier : ici entre 1 et 7
	 * @param representation
	 *        representation  string : en vu de l affichage
	 */
	private ObjetATrouver(int numero,String representation){
		this.numeroOBJ=numero;
		this.representation= representation;
	}
	/**
	 * Retourne le numero associer a un objet
	 * @retrun le numero associer a un objet		
	 */
	public int getnumeroObjetATrouver() {
		return numeroOBJ ;
	}
	/**
	 * Retourne la representaion associer a un objet
	 * @return la representaion associer a un objet
	 */
	public String getRepresentationObjetATrouver() {
		return representation ;
	}
	/**
	 * Retourne l objet associer au numero
	 * @param numero
	 * @return
	 */
	public static ObjetATrouver getObjetATrouver(int numero){
		return vecteurOBJ[numero+1];
	
	}
	/**
	 * Retourne la hauteur sur le plateau ici 2	
	 * @return 2
	 */
	public int getHauteur(){
		return 2;
	}

}

