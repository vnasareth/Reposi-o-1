package controller;

import java.util.Scanner;

import model.Funcionario;
import model.FuncionarioTempoIntegral;

public class FuncionarioControllerTempoIntegral extends FuncionarioController {

	Scanner scan = new Scanner(System.in);
	
	@Override
	public Funcionario inicializaFuncionario() {
		FuncionarioTempoIntegral fInteg = new FuncionarioTempoIntegral();
		
		int id = (int) ((Math.random() * 100001) + 100000);
		fInteg.setId(id);
		
		System.out.println("Digite o nome do novo Funcionario Tempo Integral: ");
		String nome = scan.nextLine();
		fInteg.setNome(nome);
		
		System.out.println("Digite o salario do novo Funcionario Tempo Integral: ");
		double salario = Double.parseDouble(scan.nextLine());
		fInteg.setSalario(salario);
		
		fInteg.setBancoHoras(0d);
		
		return fInteg;
	}

	
	
}