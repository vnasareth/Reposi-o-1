package controller;

import java.util.Scanner;
import model.Funcionario;
import model.FuncionarioEstagiario;

public class FuncionarioControllerEstagiario extends FuncionarioController {

	Scanner scan = new Scanner(System.in);
	
	@Override
	public Funcionario inicializaFuncionario() {
		FuncionarioEstagiario fEstag = new FuncionarioEstagiario();
		
		int id = (int) ((Math.random() * 100001) + 100000);
		fEstag.setId(id);
		
		System.out.println("Digite o nome do novo Estagiario: ");
		String nome = scan.nextLine();
		fEstag.setNome(nome);
		
		System.out.println("Digite o salario do novo Estagiario: ");
		double salario = Double.parseDouble(scan.nextLine());
		fEstag.setSalario(salario);
		
		System.out.println("Digite o nome da instituicao parceira do novo Estagiario: ");
		String instituicao = scan.nextLine();
		fEstag.setInstituicaoParceira(instituicao);
		
		return fEstag;
	}

}