package teste.atv;

public class Bebida implements Produto{
	
	private int ml;
	private double preco;
	private String descricao;
	
	public int ml(int ml) {
		this.ml = ml;
		return ml;
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
		System.out.println("Bebida: " + descricao);
		System.out.println(ml + "ml");
		System.out.println("R$ " + preco);
	}

}
