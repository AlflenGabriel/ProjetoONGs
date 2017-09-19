import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
BDSimulado bds = new BDSimulado();
		
		ArrayList<PostosDeAtendimento> postosDeAtendimento = bds.getPostosDeAtendimento();
		
        for (int i = 0; i > postosDeAtendimento.size(); i++){ 
        	if (postosDeAtendimento.get(i).getCapacidade() == 57000.0) {
        		System.out.println("Postos com capacidade superior: " + postosDeAtendimento.get(i).getCodigo());	
			}          
        }
		
		ArrayList<ONGs> ONGs = bds.getONGs();
		
        ArrayList<ONGs> ONGPorNome = bds.getInfoONG("SPDM");
        
        for (int i = 0; i < ONGPorNome.size(); i++){
        	System.out.println(ONGPorNome.get(i).getNome() + ": " + "\n" + "Responsável - " + ONGPorNome.get(i).getResponsavel() + "\n" + "Estado - " + ONGPorNome.get(i).getEstado());
              
        	}

        ArrayList<ONGs> getNumONGPorEstado = bds.getNumONGPorEstado("SP");
        
        for (int i = 0; i < getNumONGPorEstado.size(); i++){       	
        	System.out.println(getNumONGPorEstado.get(i).getNome());
              
        	}
     //   ArrayList<PostosDeAtendimento> getPostosPorCapacidade = bds.getPostosPorCapacidade(30000);
        

	}

		
}
