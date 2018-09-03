package negocio;

public class Mendigo {
	private String nome;
	private int idade;
	private boolean masculino;
	private Localizacao localizacao;
	private Habilidade habilidade;
	
	
	
	public void divulgar() {
		System.out.printf("mendigo :: nome: %s - idade: %d - "
				+ "  - genero %s \n",
				nome,
				idade,
				masculino ? "Verdadeiro" : "Falso"
				
					
				);
		localizacao.divulgar();
		habilidade.divulgar();
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
	
}
