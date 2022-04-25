package model;

public class FuncionarioTemporario extends Funcionario {

	private int dia;
	private int mes;
	private int ano;
	
	public FuncionarioTemporario() {
		
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return "Funcionario Temporario [id = " + getId() + ", nome = " + getNome() + ", salario = " + getSalario()
				+ ", fimContrato = " + dia + "/" + mes + "/" + ano + "]";
	}
	
}
