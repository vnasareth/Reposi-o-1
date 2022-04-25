package controller;

import java.util.Scanner;
import model.Funcionario;
import model.FuncionarioTemporario;

public class FuncionarioControllerTemporario extends FuncionarioController {

	Scanner scan = new Scanner(System.in);
	
	@Override
	public Funcionario inicializaFuncionario() {
		FuncionarioTemporario fTemp = new FuncionarioTemporario();
		
		int id = (int) ((Math.random() * 100001) + 100000);
		fTemp.setId(id);
		
		System.out.println("Digite o nome do novo Funcionario Temporario: ");
		String nome = scan.nextLine();
		fTemp.setNome(nome);
		
		System.out.println("Digite o salario do novo Funcionario Temporario: ");
		Double salario = Double.parseDouble(scan.nextLine());
		fTemp.setSalario(salario);
		
		System.out.println("Digite o dia do fim do contrato do novo Funcionario Temporario: ");
		int dia = Integer.parseInt(scan.nextLine());
		fTemp.setDia(dia);
		
		System.out.println("Digite o mes do fim do contrato do novo Funcionario Temporario: ");
		int mes = Integer.parseInt(scan.nextLine());
		fTemp.setMes(mes);
		
		System.out.println("Digite o ano do fim do contrato do novo Funcionario Temporario: ");
		int ano = Integer.parseInt(scan.nextLine());
		fTemp.setAno(ano);
		
		return fTemp;
	}
	
}