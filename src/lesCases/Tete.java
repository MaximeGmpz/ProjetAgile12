package lesCases;

public class Tete extends Case {
	private int equipe;
	public Tete(int x , int y , int equipe) {
		super(x , y);
		this.equipe = equipe;
		franchissable = false ;
	}

	@Override
	public String getRepresentation() {
		if(equipe == 1){
		return Case.BLUE + "O" + Case.RESET ;
		}else{
			return Case.RED + "O" + Case.RESET ;
		}
	}


	@Override
	public int getNumeroEquipe() {
		return equipe;
	}

}
