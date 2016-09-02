//////////////////////////////////////////////////////////////////////////////
//                         AUTEUR : THIBAULT CORBRION                       //
//////////////////////////////////////////////////////////////////////////////

package lesCases;

import java.util.Random;

/**
 * Cette classe h�rite des Case et 
 * @author thibault CORBRION
 */

//////////////////////////////////////////////////////////////////////////////
//AUTEUR : THIBAULT CORBRION                       //
//////////////////////////////////////////////////////////////////////////////

import java.util.Random;
/**
 * 
 * @author corbrion thibault
 *
 */
public class CaseNormal extends Case {

//////////////////////////////////////////////////////////////////////////////
// ATRIBUS //
//////////////////////////////////////////////////////////////////////////////

private Random random;
private String representation = Case.BLACK + " " + Case.RESET;


private int ratio = 0;

//////////////////////////////////////////////////////////////////////////////
// CONSTRUCTEUR //
//////////////////////////////////////////////////////////////////////////////
/**
 * Constructeur numero 1 des CaseNormal
 * @param coordonnes
 *        coordonnes tableau d'entier : elle representer les coordonnes spacial sur le plateau
 * @param ratio
 *        ratio entier : chance de trouver un objet sur la case sur 100
 */


/**
 * Constructeur numero2 CaseNormal
 * @param coordonnes
 * coordonnes tableau d'entier : elle representer les coordonnes spacial sur le plateau
 * @param obj
 *        obj ObjetATrouver : objet placer directement sur le case
 */
public CaseNormal(int[] coordonnes, ObjetATrouver obj) {
super(coordonnes);

super.obj = obj;
this.setModifiable(true);
this.setRepresentaion(obj.getRepresentationObjetATrouver());

}
 /**
  * Constructeur numero 2 des CaseNormal
  * @param coordonnes
  * coordonnes tableau d'entier : elle representer les coordonnes spacial sur le plateau
  */
public CaseNormal(int[] coordonnes) {
super(coordonnes);

franchissable = true ;

}

 
//////////////////////////////////////////////////////////////////////////////
// GETTER/SETTER REPRESENTATION //
//////////////////////////////////////////////////////////////////////////////

/**
 * retourne la representation courante de l equipe 1
 * @return la representation courante de l equipe 1
 */
public String getRepresentation() {

return this.representation ;
}

/**
* retourne la representation courante de l equipe 2
* @return la representation courante de l equipe 2
*/





//////////////////////////////////////////////////////////////////////////////
// GETTER RATIO //
//////////////////////////////////////////////////////////////////////////////
/**
 * Retourn le ratio
 * @return ratio entier entre 0 et 100
 */
public int getRatio() {
return this.ratio;
}

private void setRepresentaion(String nouvelle){
	this.representation=nouvelle;
	
}

//////////////////////////////////////////////////////////////////////////////
// TO STRING //
//////////////////////////////////////////////////////////////////////////////

public String toString() {
return "CaseNormal obj=" + obj + "\n representationEquipe1=" + representation
+ "\n representationEquipe2=" + representation + "\n ratio=" + ratio + "\n";
}
@Override
public int getNumeroEquipe() {
	
	return 0;
}

}
