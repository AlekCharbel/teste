package prin;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import uti.utili;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Quantos Funcionarios Irao se registrar");
		n=sc.nextInt();
		
		List<utili> oloco=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Digite o ID");
			int id=sc.nextInt();
			System.out.println("Digite o Nome");
			
			String nome=sc.next();
			System.out.println("Digite o Salario");
			double salario=sc.nextDouble();
			
			oloco.add(new utili(id,nome,salario));
			
			
		}
		
		System.out.println("Entre com o Funcionario que tera reajuste no salario");
		int result=sc.nextInt();
		
		utili idd =oloco.stream().filter(x-> x.getId()==result).findFirst().orElse(null);
		
		if(idd==null) {
			
			System.out.println("Numero nao existe");
			
		}
		
		System.out.println("Digite a porcentagem");
		int porcentagem=sc.nextInt();
		
		idd.Aumento(porcentagem);
		
		
	 System.out.println("Lista de Funcionarios");
	 for(utili x : oloco) {
		 System.out.println(x.toString());
		 
		 
	 }
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
