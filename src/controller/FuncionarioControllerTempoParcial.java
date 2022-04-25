package controller;

import java.util.Scanner;
import model.Funcionario;
import model.FuncionarioTempoParcial;

public class FuncionarioControllerTempoParcial extends FuncionarioController {

	Scanner scan = new Scanner(System.in);
	
	@Override
	public Funcionario inicializaFuncionario() {
		FuncionarioTempoParcial fParc = new FuncionarioTempoParcial();
		
		int id = (int) ((Math.random() * 100001) + 100000);
		fParc.setId(id);
		
		System.out.println("Digite o nome do novo Funcionario Tempo Parcial: ");
		String nome = scan.nextLine();
		fParc.setNome(nome);
		
		System.out.println("Digite o salario do novo Funcionario Tempo Parcial: ");
		double salario = Double.parseDouble(scan.nextLine());
		fParc.setSalario(salario);
		
		System.out.println("Digite a hora de entrada do novo Funcionario Tempo Parcial: ");
		double hEntrada = Double.parseDouble(scan.nextLine());
		fParc.setHoraEntrada(hEntrada);
		
		System.out.println("Digite a hora da saida do novo Funcionario Tempo Parcial: ");
		double hSaida = Double.parseDouble(scan.nextLine());
		fParc.setHoraSaida(hSaida);
		
		return fParc;
	}
	
}
