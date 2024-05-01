package teste.atv;

public class Combo {
	
	private Burguer burguer;
	private Bebida bebida;
	private Sobremesa sobremesa;
	private int tipo;
	
	
	
	public Combo() {
		burguer = new Burguer();
		bebida = new Bebida();
		sobremesa = new Sobremesa();
	}
	
	public void CriarCombo(int tipo) {
				
		if(tipo == 1) {
			
			System.out.println("\n[---Combo Master---]");
			
			burguer.descricao("X-Salada");
			burguer.gramas(100);
			burguer.preco(11.00);
			burguer.mostrar();
			
			System.out.println("--------------------");
			bebida.descricao("Suco de Laranja");
			bebida.ml(350);
			bebida.preco(7.50);
			bebida.mostrar();
			
			System.out.println("--------------------");
			sobremesa.descricao("Milkshake");
			sobremesa.tamanho("Pequeno");
			sobremesa.preco(5.75);
			sobremesa.mostrar();
			
				
		}else if (tipo == 2) {
			
			System.out.println("\n[--Combo Super--]");
			
			burguer.descricao("X-Bacon");
			burguer.gramas(200);
			burguer.preco(21.00);
			burguer.mostrar();
			
			System.out.println("-----------------");
			bebida.descricao("Coca-Cola");
			bebida.ml(500);
			bebida.preco(10.50);
			bebida.mostrar();
			
			System.out.println("\n-----------------");
			sobremesa.descricao("Milkshake");
			sobremesa.tamanho("Grande");
			sobremesa.preco(10.75);
			sobremesa.mostrar();
		}
		
	}

}
