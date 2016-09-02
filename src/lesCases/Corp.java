package lesCases;

public class Corp extends Case {
	int equipe ;
	String representationEqipe1 = Case.BLUE + "+" + Case.RESET ;
	
	public Corp(int equipe , int x , int y) {
		super(x , y) ;
		this.equipe = equipe ;
		franchissable = false ;
	}

	@Override
	public String getRepresentation() {
		if(equipe == 1){
		return Case.BLUE + "+" + Case.RESET ;
		}else{
			return Case.RED + "+" + Case.RESET ;
		}
	}

	

	@Override
	public int getNumeroEquipe() {
		// TODO Auto-generated method stub
		return 0;
	}

}
