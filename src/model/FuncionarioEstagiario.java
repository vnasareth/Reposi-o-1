package model;

public class FuncionarioEstagiario extends Funcionario {

	private String instituicaoParceira;
	
	public FuncionarioEstagiario() {
		
	}
	
	public String getInstituicaoParceira() {
		return instituicaoParceira;
	}
	
	public void setInstituicaoParceira(String instituicaoParceira) {
		this.instituicaoParceira = instituicaoParceira;
	}
	
	@Override
	public String toString() {
		return "Funcionario Estagiario [id = " + getId() + ", nome = " + getNome() + ", salario = " + getSalario()
				+ ", instituicaoParceira = " + instituicaoParceira + "]";
	}
	
}
