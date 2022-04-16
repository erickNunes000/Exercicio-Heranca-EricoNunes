import java.util.Scanner;

public class FuncionarioComissionado extends Funcionario {//erico nunes
	
	private int vendas;	
	private double comissao;
	
	FuncionarioComissionado(String primeiro_nome, String segundo_nome, double salario, int vendas){
		
		super(primeiro_nome,segundo_nome, salario);
		this.vendas=vendas;
	}
	
	FuncionarioComissionado(){}
	
	public void comissao()	{
		
	
		comissao = getSalario()+(vendas * 0.10);
		this.comissao = comissao;
		
		System.out.println("Salario Comissionado: "+comissao);
		
	}
		
	public double getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}
	
	public void verFunc() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira o primeiro nome do funcionario: ");
		
	}

}