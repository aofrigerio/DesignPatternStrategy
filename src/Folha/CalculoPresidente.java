package Folha;

import Interfaces.ICalculoFolha;

public class CalculoPresidente implements ICalculoFolha {

	Pessoa pessoa;

	public void incluiFuncionario(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public double calculoFolha() {

		return this.pessoa.getSalario_bruto() * (1 - 0.02);

	}

	public Pessoa getPessoa() {

		return pessoa;
	}

}
