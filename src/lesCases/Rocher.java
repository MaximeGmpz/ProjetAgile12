//////////////////////////////////////////////////////////////////////////////
//                         AUTEUR : THIBAULT CORBRION                       //
//////////////////////////////////////////////////////////////////////////////
package lesCases;
/**
 * 
 * @author corbrion thibault
 *
 */
public class Rocher extends Case   {
//////////////////////////////////////////////////////////////////////////////
//                              ATTRIBUT                                    //
//////////////////////////////////////////////////////////////////////////////

private String representationEquipe1=Case.BLACK+'X'+Case.RESET;
private String representationEquipe2=Case.BLACK+'X'+Case.RESET;
private int numeroEquipe=0;

//////////////////////////////////////////////////////////////////////////////
//CONSTRUCTEUR                                //
//////////////////////////////////////////////////////////////////////////////
/**
 * Constructeur de Rocher
 * @param coordonnes
 *        coordonnes tableau d'entier : coordonne sur le plateau
 */
public Rocher(int[] coordonnes) {
super(coordonnes);

this.setFranchissableEquipe1(false);
this.setFranchissableEquipe2(false);
this.setObj(null);
this.setModifiable(false);

}
//////////////////////////////////////////////////////////////////////////////
//                              METHODE ACTION                              //
//////////////////////////////////////////////////////////////////////////////

/**
 * on ne peut pas effectuer d'action sur  un rocher
 */
public boolean action(Affichable affich) {

return false;
}
/**
 * on ne peut pas effectuer d'action sur  un rocher
 */
public boolean action(Affichable affich,int num) { 

return false;}	
//////////////////////////////////////////////////////////////////////////////
//GETTER/SETTER REPRESENTATION                          //
//////////////////////////////////////////////////////////////////////////////

/**
 * retourne la representation courante de l equipe 1
 * @return la representation courante de l equipe 1
 */
public String getRepresentationEquipe1() {

return this.representationEquipe1;
}

/**
 * retourne la representation courante de l equipe 2
 * @return la representation courante de l equipe 2
 */

public String getRepresentationEquipe2() {

return this.representationEquipe2;
}

//////////////////////////////////////////////////////////////////////////////
//                            GETTER EQUIPE                                 //
//////////////////////////////////////////////////////////////////////////////
/**
 * retourn le numero d'equipe ici 0 car les rocher sont toujours neutre
 */
public int getNumeroEquipe() {

return this.numeroEquipe;
}

//////////////////////////////////////////////////////////////////////////////
//                          TO STRING                                       //
//////////////////////////////////////////////////////////////////////////////

@Override
public String toString() 
{
return "Rocher\n";
}



}
