package Aula_6_produto;

public class produto {

	public String name;
	public double preco;
	public int qtde;

	public double totalValor() {
		return preco * qtde;
	}

	public void adicionarProdutos(int qtde) {
		this.qtde += qtde;
	}

	public void removerProdutos(int qtde) {
		this.qtde -= qtde;
	}

	public String toString() {
       return name
       + ", $"
       +String.format("%.2f",preco)
       +", "
       + qtde
       +"unidades, Total : $"
       +totalValor();
       
       
	}

}
