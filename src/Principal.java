import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BDSimulado bd = new BDSimulado();
		System.out.println(bd.getInfoONG("Coma Bem"));
		
		System.out.println(bd.getNumONGPorEstado("DF"));
		
		ArrayList<PostosDeAtendimento> postosPorCapacidade = bd.getPostosPorCapacidade(19898);
		
		for (int i = 0; i < postosPorCapacidade.size(); i++) {
			System.out.println(postosPorCapacidade.get(i).getCodigo());
		}
		
		System.out.println(bd.getPostosVegetarianos());
		System.out.println(bd.getONGQueAtende(32));
			
		
	}		
}
