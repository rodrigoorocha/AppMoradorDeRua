package negocio;

public class Mendigo {
	private String nome;
	private int idade;
	private String[] moradores;
	private boolean masculino;
	private Localizacao localizacao;
	private Habilidade habilidade;
	private Servico servico;
	
	
	
	public void divulgar() {
		System.out.printf("mendigo :: nome: %s - idade: %d - "
				+ "   masculino: %s \n",
				nome,
				idade,
				masculino ? "Verdadeiro" : "Falso"
				);
		
		
		for (String m : moradores) {
			System.out.println("-----morador-----");
			
			System.out.println(m);
			
		}
			
		
		localizacao.divulgar();
		habilidade.divulgar();
		servico.divulgar();
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public boolean isMasculino() {
		return masculino;
	}


	public void setMasculino(boolean masculino) {
		this.masculino = masculino;
	}


	public Localizacao getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}


	public Habilidade getHabilidade() {
		return habilidade;
	}


	public void setHabilidade(Habilidade habilidade) {
		this.habilidade = habilidade;
	}


	public Servico getServico() {
		return servico;
	}


	public String[] getMoradores() {
		return moradores;
	}


	public void setMoradores(String[] moradores) {
		this.moradores = moradores;
	}


	public void setServico(Servico servico) {
		this.servico = servico;
	}
}



	