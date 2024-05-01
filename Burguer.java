package teste.atv;

public class Burguer implements Produto{
	
	private int gramas;
	private double preco;
	private String descricao;
	
	public int gramas(int gramas) {
		this.gramas = gramas;
		return gramas;
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
		System.out.println("Hamburguer: " + descricao);
		System.out.println(gramas + "g");
		System.out.println("R$ " + preco);
	}
}
