package negocio;

public class Localizacao {
	private String cidade;
	private String bairro;
	private String rua;

	
	public void divulgar() {
		System.out.printf("localizaçao :: cidade: %s - bairro: %s - "
				+ "  - rua %s \n",
				cidade,
				bairro,
				rua
				);
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}
	
}
