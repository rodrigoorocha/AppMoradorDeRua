package testes;

import auxiliar.Constante;

public class TestaApp {

	public static void main(String[] args) {
		
		System.out.println("versao :" + Constante.VERSAO);
		
		String [] titulos = new String [4];
		titulos[0] = "nome : ";
		titulos[1] = "filhos : ";
		titulos[2] = "idade : ";
		titulos[3] = "salario : ";
		
		//String[] header = {"nome ","filho ","idade ","salario "};
		
		if(args.length == 4) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(titulos[i] + args[i]);
			}
			System.out.println( titulos[0] + args[0] );
			System.out.println(	titulos[1] + args[1] );
			System.out.println(	titulos[2] + args[2] );
			System.out.println(	titulos[3] + args[3] );
		}else {
			System.err.println("impossivel executar a aplicaçao ");	
		}
		
	}
}
