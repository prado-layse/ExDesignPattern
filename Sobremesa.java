package teste.atv;

public class Sobremesa implements Produto{
	
	private String tamanho;
	private double preco;
	private String descricao;
	
	public String tamanho(String tamanho) {
		this.tamanho = tamanho;
		return tamanho;
	}
	
	public String descricao(String descricao) {
		this.descricao = descricao;
		return descricao;
	}
	
	public double preco(double preco) {
		this.preco = preco;
		return preco;
	}
	
	public void mostrar() {
		System.out.println("Sobremesa: " + descricao);
		System.out.println("Tamanho: " + tamanho);
		System.out.println("R$ " + preco);
	}

}
