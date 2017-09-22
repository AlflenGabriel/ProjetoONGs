import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		BDSimulado bds = new BDSimulado();
		
		//	ArrayList<PostosDeAtendimento> postosDeAtendimento = bds.getPostosDeAtendimento();		
		
		//	ArrayList<ONGs> ONGs = bds.getONGs();
				
        ArrayList<ONGs> ONGPorNome = bds.getInfoONG("SPDM");
        
        for (int i = 0; i < ONGPorNome.size(); i++){
        	System.out.println(" ¥¥ " + ONGPorNome.get(i).getNome() + " ¥¥ " + "\n" +
        "Responsável - " + ONGPorNome.get(i).getResponsavel() + "\nEstado - " + ONGPorNome.get(i).getEstado());
              
        	}

        ArrayList<ONGs> getNumONGPorEstado = bds.getNumONGPorEstado("SP");
        
        System.out.println("\n ¥¥ ONGs presentes no Estado ¥¥ ");
        
        for (int i = 0; i < getNumONGPorEstado.size(); i++){       	
        	System.out.println(getNumONGPorEstado.get(i).getNome());
              
        	}

        	
        ArrayList<PostosDeAtendimento> getPostosPorCapacidade = bds.getPostosPorCapacidade(57000.0);
	
        System.out.println("\n ¥¥ Postos de Atendimento com capacidade superior ¥¥ ");
        
        for (int i = 0; i < getPostosPorCapacidade.size(); i++){       	
        	System.out.println(getPostosPorCapacidade.get(i).getCodigo());
       
        }

        ArrayList<PostosDeAtendimento> getPostosVegetarianos = bds.getPostosVegetarianos(true);
    	
        System.out.println("\n ¥¥ Postos de Atendimento vegetarianos ¥¥ ");
        
        for (int i = 0; i < getPostosVegetarianos.size(); i++){       	        	
        	System.out.println(getPostosVegetarianos.get(i).getCodigo());
       
        }
	

	}
		
}
