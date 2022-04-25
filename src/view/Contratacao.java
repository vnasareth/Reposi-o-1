package view;

import controller.FuncionarioControllerEstagiario;
import controller.FuncionarioControllerTempoIntegral;
import controller.FuncionarioControllerTempoParcial;
import controller.FuncionarioControllerTemporario;
import model.Funcionario;

public class Contratacao {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		System.out.println("---- Iniciando contratacao Funcionario Tempo Integral ----");
		FuncionarioControllerTempoIntegral fContInteg = new FuncionarioControllerTempoIntegral();
		funcionario = fContInteg.inicializaFuncionario();
		System.out.println(funcionario.toString() + "\n");
		
		System.out.println("---- Iniciando contratacao Funcionario Tempo Parcial ----");
		FuncionarioControllerTempoParcial fContParc = new FuncionarioControllerTempoParcial();
		funcionario = fContParc.inicializaFuncionario();
		System.out.println(funcionario.toString() + "\n");
		
		System.out.println("---- Iniciando contratacao Funcionario Temporario ----");
		FuncionarioControllerTemporario fContTemp = new FuncionarioControllerTemporario();
		funcionario = fContTemp.inicializaFuncionario();
		System.out.println(funcionario.toString() + "\n");
		
		System.out.println("---- Iniciando contratacao Funcionario Estagiario ----");
		FuncionarioControllerEstagiario fContEstag = new FuncionarioControllerEstagiario();
		funcionario = fContEstag.inicializaFuncionario();
		System.out.println(funcionario.toString() + "\n");
		
	}
	
}
