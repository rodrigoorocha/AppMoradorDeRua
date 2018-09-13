package negocio;

//import java.util.Scanner;

import auxiliar.Constante;

public class Servico {
	private double 	Horas_trabalhadas;
	private Constante constante;

	private double CacularValorPadrao() {

		//System.out.println("horas trabalhadas");
		//Scanner teclado =  new Scanner(System.in); 
		//Horas_trabalhadas = teclado.nextDouble();
		return (Horas_trabalhadas * Constante.VALOR_HORA_PADRAO);

	}

	public void divulgar() {
		System.out.printf("serviço :: valor padrao : %f \n",
				CacularValorPadrao()

				);
	}

	public double getHoras_trabalhadas() {
		return Horas_trabalhadas;
	}

	public void setHoras_trabalhadas(double horas_trabalhadas) {
		Horas_trabalhadas = horas_trabalhadas;
	}

	public Constante getConstante() {
		return constante;
	}

	public void setConstante(Constante constante) {
		this.constante = constante;
	}

}
