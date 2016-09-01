package lesCases;

public class Corp extends Case {
	int equipe ;
	String representationEqipe1 = Case.BLUE + "+" + Case.RESET ;
	
	public Corp(int equipe , int x , int y) {
		super(x , y) ;
		this.equipe = equipe ;
	}

	@Override
	public String getRepresentationEquipe1() {
		// TODO Auto-generated method stub
		return Case.BLUE + "+" + Case.RESET ;
	}

	@Override
	public String getRepresentationEquipe2() {
		// TODO Auto-generated method stub
		return Case.RED + "+" + Case.RESET ;
	}

	@Override
	public int getNumeroEquipe() {
		// TODO Auto-generated method stub
		return 0;
	}

}
