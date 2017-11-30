package Folha;

import Interfaces.ICalculoFolha;

public class CalculoFuncionario implements ICalculoFolha {
	
	Pessoa pessoa;
	
	public void incluiFuncionario(Pessoa pessoa){
		this.pessoa = pessoa;
	}
	
	@Override
	public double calculoFolha() {

		double salario_final;

		salario_final = this.pessoa.getSalario_bruto() * (1 - 0.06);
		salario_final = salario_final * (1 - 0.11);

		// soma a comissão caso for de vendas
		if (this.pessoa.getComissao() > 0) {
			salario_final = salario_final + ((this.pessoa.getTotVendas() * this.pessoa.getComissao()) / 100);
		}

		// return salario_final;
		return salario_final;

	}

	public Pessoa getPessoa() {
		return pessoa;
	}
	
	
}
