package ofiGen;

public class TestarAutomovel {

	public static void main(String[] args) {
		
		//instanciar um objeto da classe Automovel
		
		Automovel gabiMovel = new Automovel("Gabi","capto 50","PEY0456", 2022);
		
		gabiMovel.imprimirInfo();
		System.out.println("\n Transferencia de Proprietario");
		gabiMovel.setNomeProprietario("Julio Barros");
		gabiMovel.setModelo("capto 50");
		gabiMovel.setPlaca("PEY0451");
		System.out.println("\n******************************************");
		gabiMovel.imprimirInfo();
	}

}
