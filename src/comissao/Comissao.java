package comissao;

import java.util.Scanner;

public class Comissao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		
		String nome;
		double Tempo, Vendas;
		double salario;
		
		System.out.print("Nome do Vendedor(a): ");
		nome = leitor.next();
		
		System.out.print("Tempo de Trabalho em anos: ");
		Tempo = leitor.nextInt();
		
		System.out.print("Valor Total de Vendas: ");
		Vendas = leitor.nextInt();
		
		leitor.close();
		System.out.println();
		
		if ( Vendas >= 10000 && Tempo >= 1) {
			salario = Vendas * 0.05 ;
			System.out.println("valor da comissão sobre as vendas de " + nome + ": " + salario);
		} else if ( Vendas >= 20000 && Tempo >=1) {
			salario = Vendas * 0.10;
			System.out.println("valor da comissão sobre as vendas de " + nome + ": " + salario);
		}else {
			salario = Vendas * 0.03;
			System.out.println("valor da comissão sobre as vendas de " + nome + ": " + salario);
		}
	}
}
