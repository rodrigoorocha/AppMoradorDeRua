package testes;

import negocio.Habilidade;
import negocio.Localizacao;
import negocio.Mendigo;

public class Testemendigo {
	public static void main(String[] args) {
		
		Habilidade h = new Habilidade();
		h.setEnsinoFundamental(true);
		h.setEnsinoMedio(false);
		h.setTecnico(false);
		
		Localizacao l = new Localizacao();
		l.setCidade("rio de janeiro");
		l.setBairro("centro");
		l.setRua("sao jose");
		
		Mendigo m = new Mendigo ();
		m.setNome("ze");
		m.setMasculino(true);
		m.setIdade(43);
		m.setHabilidade(h);
		m.setLocalizacao(l);
		m.divulgar();
		
		
	}

}
