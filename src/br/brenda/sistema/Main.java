package br.brenda.sistema;

import java.util.Scanner;

import br.brenda.sistema.model.Produto;
import br.brenda.sistema.service.CompraService;

public class Main {
	
	public static void main(String args[]) {

	     Scanner scanner = new Scanner(System.in);
	        CompraService compraService = new CompraService();

	        while (true) {
	            Produto produto = new Produto();

	            System.out.print("Digite o nome do produto (ou 'finalizar' para finalizar a compra): ");
	            String nome = scanner.nextLine();
	            if (nome.equalsIgnoreCase("finalizar")) {
	                break; 
	            }
	            produto.setNome(nome);

	            System.out.print("Digite a quantidade do produto: ");
	            int quantidade = scanner.nextInt();
	            produto.setQuantidade(quantidade);

	            System.out.print("Digite o preço unitário do produto: ");
	            double precoUnitario = scanner.nextDouble();
	            produto.setPrecoUnitario(precoUnitario);

	            scanner.nextLine();

	            compraService.adicionarProduto(produto);
	        }

	        double valorTotal = compraService.calcularValorTotalDaCompra();
	        System.out.printf("Valor total: " + valorTotal);

	        scanner.close();
	    }
	
	
}