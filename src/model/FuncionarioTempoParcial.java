package model;

public class FuncionarioTempoParcial extends Funcionario {

	private double horaEntrada;
	private double horaSaida;
	
	public FuncionarioTempoParcial() {
		
	}
	
	public double getHoraEntrada() {
		return horaEntrada;
	}
	
	public void setHoraEntrada(double horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	
	public double getHoraSaida() {
		return horaSaida;
	}
	
	public void setHoraSaida(double horaSaida) {
		this.horaSaida = horaSaida;
	}
	
	@Override
	public String toString() {
		return "Funcionario Tempo Parcial [id = " + getId() + ", nome = " + getNome() + ", salario = " + getSalario()
				+ ", horaEntrada = " + horaEntrada + ", horaSaida = " + horaSaida + "]";
	}
	
}
