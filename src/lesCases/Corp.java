package lesCases;

public class Corp extends Case {
	int equipe ;
	String representationEqipe1 = Case.BLUE + "+" + Case.RESET ;
	
	public Corp(int equipe , int x , int y) {
		super(x , y) ;
		this.equipe = equipe ;
	}

	@Override
	public String getRepresentation() {
		// TODO Auto-generated method stub
		if(this.equipe==1){
		return Case.BLUE + "+" + Case.RESET ;
		}else{
			return Case.RED + "+" + Case.RESET;
		}
	}


	@Override
	public int getNumeroEquipe() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getRepresentationEquipe1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRepresentationEquipe2() {
		// TODO Auto-generated method stub
		return null;
	}

}
