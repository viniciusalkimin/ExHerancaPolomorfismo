package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> lista = new ArrayList<Product>();
		
		System.out.print("Digite a quantidade de produto:");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			System.out.println("Dados do produto #" + i + ":");
			 System.out.print("Comum, usado ou importado (c/u/i)? ");
			 char op = sc.next().charAt(0);
			 System.out.print("Nome:");
			 sc.nextLine();
			 String nome = sc.nextLine();
			 System.out.print("Preço:");
			 Double preco = sc.nextDouble();
			 
			 if(op=='c') {				
				 lista.add(new Product(nome,preco));
			 }
			 else if(op=='u') {				
				System.out.print("Digite a data de fabricação (DD/MM/AAAA) :");
				Date data = sdf.parse(sc.next());
				lista.add(new UsedProduct(nome,preco,data));
			 }
			 else if(op=='i') {				
				System.out.print("Digite o custo do envio :");
				Double custoEnvio = sc.nextDouble();
				lista.add(new ImportedProduct(nome,preco,custoEnvio));
			 }
			else {
				System.out.println("Opção inválida");
			}	
		}		
		System.out.println();
		System.out.println("Preço dos produtos: ");
		for(Product produto : lista) {
			System.out.println(produto.priceTag());
		}		
		sc.close();	
	}
}