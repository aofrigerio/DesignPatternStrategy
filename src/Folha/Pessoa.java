package Folha;

public class Pessoa {

	private String nome;
	private String setor;
	private int comissao;
	private int totVendas;
	private int salario_bruto;

	// sem comissão
	public Pessoa(String nome, String setor, int salario) {
		this.nome = nome;
		this.setor = setor;
		this.salario_bruto = salario;
	}

	// Com comissão
	public Pessoa(String nome, String setor, int salario, int comissao, int totVendas) {
		this.nome = nome;
		this.setor = setor;
		this.salario_bruto = salario;
		this.comissao = comissao;
		this.totVendas = totVendas;
	}

	public String getNome() {
		return nome;
	}

	public String getSetor() {
		return setor;
	}

	public int getComissao() {
		return comissao;
	}

	public int getTotVendas() {
		return totVendas;
	}

	public int getSalario_bruto() {
		return salario_bruto;
	}
	
	

}
