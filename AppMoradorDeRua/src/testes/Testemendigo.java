package testes;

import java.util.Scanner;

import negocio.Habilidade;
import negocio.Localizacao;
import negocio.Mendigo;
import negocio.Servico;

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
		
		System.out.println("horas trabalhadas :");
		Scanner teclado =  new Scanner(System.in); 
		
		Servico s = new Servico();
		s.setHoras_trabalhadas(teclado.nextDouble());
		
		String[] moradores = {"ze" ,"jao", "kleber"};
		
		Mendigo m = new Mendigo ();
		m.setNome("ze");
		m.setMasculino(true);
		m.setIdade(43);
		m.setHabilidade(h);
		m.setLocalizacao(l);
		m.setServico(s);
		m.setMoradores (moradores);
		m.divulgar();
		
		
		

		
	}

}
