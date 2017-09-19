import java.util.ArrayList;

public class BDSimulado {
	
	private ArrayList<ONGs> ONGs;
	private ArrayList<PostosDeAtendimento> postosDeAtendimento;
	
	public BDSimulado(){
		this.ONGs = new ArrayList<ONGs>();	

		ONGs o1 = new ONGs("Médicos sem Fronteiras", "José Antônio", "RJ");
		ONGs o2 = new ONGs("SPDM", "Ricardo Peixoto", "SP");
		ONGs o3 = new ONGs("ISJB", "Pedro Moraes", "MG");
		ONGs o4 = new ONGs("Fundação Bradesco", "Mario Fagundes", "SP");
		ONGs o5 = new ONGs("Viva Rio", "Tânia Teixeira", "RJ");
		
		this.ONGs.add(o1);
		this.ONGs.add(o2);
		this.ONGs.add(o3);
		this.ONGs.add(o4);
		this.ONGs.add(o5);
		
		this.postosDeAtendimento = new ArrayList<PostosDeAtendimento>();
		
		PostosDeAtendimento p1 = new PostosDeAtendimento(1, 150000.0, false, false, false);
		PostosDeAtendimento p2 = new PostosDeAtendimento(2, 57000.0, false, false, true);
		PostosDeAtendimento p3 = new PostosDeAtendimento(3, 28000.0, false, true, true);
		PostosDeAtendimento p4 = new PostosDeAtendimento(4, 76000.0, true, true, true);
		PostosDeAtendimento p5 = new PostosDeAtendimento(5, 23000.0, true, true, false);
		
		this.postosDeAtendimento.add(p1);
		this.postosDeAtendimento.add(p2);
		this.postosDeAtendimento.add(p3);
		this.postosDeAtendimento.add(p4);
		this.postosDeAtendimento.add(p5);		
		
			}
	public ArrayList<ONGs> getONGs() {
		return ONGs;
	
		}

	
		
	
	public ArrayList<ONGs> getInfoONG(String nome){
		
		ArrayList<ONGs> resultado = new ArrayList<ONGs>();
		
		
		for (int i = 0; i < this.ONGs.size(); i++) {
			
			if (this.ONGs.get(i).getNome().equals(nome)) {
				resultado.add(this.ONGs.get(i));
			}
		}

		return resultado;
	}
	public ArrayList<ONGs> getNumONGPorEstado(String estado){
		
		ArrayList<ONGs> resultado = new ArrayList<ONGs>();
		
		
		for (int i = 0; i < this.ONGs.size(); i++) {
			
			if (this.ONGs.get(i).getEstado().equals(estado)) {
				resultado.add(this.ONGs.get(i));
			}
		}

		return resultado;
	}
	public ArrayList<PostosDeAtendimento> getPostosPorCapacidade(int capacidade){
		
		ArrayList<PostosDeAtendimento> resultado = new ArrayList<PostosDeAtendimento>();
		
for (int i = 0; i < this.postosDeAtendimento.size(); i++) {
			
			if (this.postosDeAtendimento.get(i).getCapacidade() == capacidade) {
				resultado.add(this.postosDeAtendimento.get(i));
			}
		}
		return resultado;
	}
	public ArrayList<PostosDeAtendimento> getPostosDeAtendimento() {
		
		return postosDeAtendimento;
	}

	
}
