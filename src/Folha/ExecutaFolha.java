package Folha;

import Interfaces.ICalculoFolha;

public class ExecutaFolha {
	
	private static double realizarCalculo(ICalculoFolha folha) {
		return folha.calculoFolha();
	}
	
	public static void main(String[] args) {

		//Todos os funcionários agora são pessoas normais. O que define agora são os calculos
			Pessoa pres = new Pessoa("Alan", "PRESIDENTE", 15000);
			Pessoa diretorComercial = new Pessoa("Janaina", "Diretora Comercial", 5500, 20, 12300);
			Pessoa diretorProducao = new Pessoa("Maria", "Diretor Produção", 4000);
			Pessoa func1 = new Pessoa("Isabella", "Vendedora", 3000, 8,16400);
			Pessoa func2 = new Pessoa("Jaqueline", "Vendedora", 2500, 10, 8900);
			Pessoa diretorComer2 = new Pessoa("Jacqueline","Diretora Comercial", 2500, 10, 8900);
			
			Pessoa func3 = new Pessoa("Vinicius", "Desenvolvedor", 2500);
			Pessoa func4 = new Pessoa("Antonio","Desenvolvedor", 1500);
			Pessoa func5 = new Pessoa("Mariana","Desenvolvedor", 2000);
			
						
		//CLASSES DE CÁLCULOS
				
			//Invoca a classe para o calculo de Funcionario
			CalculoFuncionario calcFunc = new CalculoFuncionario();
			
			//Invoca a classe para o calculo de Gerente
			CalculoGerente calcGer = new CalculoGerente();
			
			//Invoca a classe para o calculo de Presidente
			CalculoPresidente calcPres = new CalculoPresidente();
		
		
		//TESTES
			//defino a pessoa para o calculo presidente
			calcPres.incluiFuncionario(pres);
			System.out.println(calcPres.getPessoa().getNome());
			System.out.println(realizarCalculo(calcPres));
			System.out.println("\n");
			
			//defino a pessoa para o calculo do gerente comercial
			calcGer.incluiFuncionario(diretorComercial);	
			System.out.println(calcGer.getPessoa().getNome());
			System.out.println(realizarCalculo(calcGer));
			System.out.println("\n");
			
			calcGer.incluiFuncionario(diretorComer2);	
			System.out.println(calcGer.getPessoa().getNome());
			System.out.println(realizarCalculo(calcGer));
			System.out.println("\n");
			
			//defino a pessoa para o calculo do gerente produção
			calcGer.incluiFuncionario(diretorProducao);
			System.out.println(calcGer.getPessoa().getNome());
			System.out.println(realizarCalculo(calcGer));
			System.out.println("\n");
			
			
			//defino a pessoa para o calculo do funcionario
			calcFunc.incluiFuncionario(func1);
			System.out.println(calcFunc.getPessoa().getNome());
			System.out.println(realizarCalculo(calcFunc));
			System.out.println("\n");
			
			//defino a pessoa para o calculo do funcionario
			calcFunc.incluiFuncionario(func2);
			System.out.println(calcFunc.getPessoa().getNome());
			System.out.println(realizarCalculo(calcFunc));
			System.out.println("\n");
			
			
			calcFunc.incluiFuncionario(func3);
			System.out.println(calcFunc.getPessoa().getNome());
			System.out.println(realizarCalculo(calcFunc));
			System.out.println("\n");
			
			
			
			calcFunc.incluiFuncionario(func4);
			System.out.println(calcFunc.getPessoa().getNome());
			System.out.println(realizarCalculo(calcFunc));
			System.out.println("\n");
			
			
			
			calcFunc.incluiFuncionario(func5);
			System.out.println(calcFunc.getPessoa().getNome());
			System.out.println(realizarCalculo(calcFunc));
			System.out.println("\n");
			
			
			
			
			
	}

}
