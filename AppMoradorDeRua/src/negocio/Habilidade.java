package negocio;

public class Habilidade {
	private boolean EnsinoFundamental;
	private boolean EnsinoMedio;
	private boolean tecnico;
	
	
	public void divulgar() {
		System.out.printf("habilidade :: EnsinoFundamental: %s - :EnsinoMedio %s - "
				+ "- tecnico: %s \n",
				EnsinoFundamental,
				EnsinoMedio,
				tecnico
				);
	}


	public boolean isEnsinoFundamental() {
		return EnsinoFundamental;
	}


	public void setEnsinoFundamental(boolean ensinoFundamental) {
		EnsinoFundamental = ensinoFundamental;
	}


	public boolean isEnsinoMedio() {
		return EnsinoMedio;
	}


	public void setEnsinoMedio(boolean ensinoMedio) {
		EnsinoMedio = ensinoMedio;
	}


	public boolean isTecnico() {
		return tecnico;
	}


	public void setTecnico(boolean tecnico) {
		this.tecnico = tecnico;
	}

}
