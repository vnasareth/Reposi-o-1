package model;

public class FuncionarioTempoIntegral extends Funcionario {

	private double bancoHoras;
	
	public FuncionarioTempoIntegral() {
		
	}
	
	public double getBancoHoras() {
		return bancoHoras;
	}
	
	public void setBancoHoras(double bancoHoras) {
		this.bancoHoras = bancoHoras;
	}
	
	@Override
	public String toString() {
		return "Funcionario Tempo Integral [id = " + getId() + ", nome = " + getNome() + ", salario = " + getSalario()
				+ ", bancoHoras = " + bancoHoras + "]";
	}
	
}
