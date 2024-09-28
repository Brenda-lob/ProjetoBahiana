package br.brenda.sistema.service;

import java.util.ArrayList;
import java.util.List;

import br.brenda.sistema.model.Produto;

public class CompraService {

    private List<Produto> produtos = new ArrayList<>();

    public CompraService() {
        
    }

    public List<Produto> getListaDeProdutos() {
		return produtos;
	}
    
	public void adicionarListaDeProdutos(List<Produto> produtos) {

		if(!produtos.isEmpty()) {
			produtos.addAll(produtos);
		}else {
			this.produtos = produtos;
		}
	}

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
    }

    public double calcularValorTotalDaCompra() {
        double valorTotal = 0;
        
        for (Produto produto : produtos) {
            valorTotal += produto.getPrecoUnitario() * produto.getQuantidade();
        }
        return valorTotal;
    }
   
}
