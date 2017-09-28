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
		
		PostosDeAtendimento p1 = new PostosDeAtendimento(165, 150000.0, false, false, false, o1);
		PostosDeAtendimento p2 = new PostosDeAtendimento(254, 57000.0, true, false, true, o2);
		PostosDeAtendimento p3 = new PostosDeAtendimento(387, 28000.0, false, true, true, o3);
		PostosDeAtendimento p4 = new PostosDeAtendimento(422, 76000.0, true, true, true, o4);
		PostosDeAtendimento p5 = new PostosDeAtendimento(576, 23000.0, true, true, false, o5);
		
		this.postosDeAtendimento.add(p1);
		this.postosDeAtendimento.add(p2);
		this.postosDeAtendimento.add(p3);
		this.postosDeAtendimento.add(p4);
		this.postosDeAtendimento.add(p5);		
		

		

			}
	public ArrayList<ONGs> getONGs() {
		return ONGs;
	
		}

		
	
	public String getInfoONG(String nomeONG){
		String resultado = "";
		
		//Percorrer a lista de ONGs buscando pelo nome
		for (int i = 0; i < this.ONGs.size(); i++) {
			if (this.ONGs.get(i).getNome().equals(nomeONG)) {
				resultado = "Nome: " + this.ONGs.get(i).getNome()
						+ "\n" +
						"Responsável: " + this.ONGs.get(i).getResponsavel()
						+ "\n" +
					    "Estado: " + this.ONGs.get(i).getEstado();
			}
		}
		
		return resultado;
	}
	
	//Metodo que retorna o num de ongs por estado
	public int getNumONGPorEstado(String estado){
		int resultado = 0;
		
		//Percorrer a lista de ONGs
		for (int i = 0; i < this.ONGs.size(); i++) {
			if (this.ONGs.get(i).getEstado().equals(estado)) {
				resultado++;
			}
		}
		
		return resultado;
	}
	
	//Metodo que retorna lista de postos por capacidade
	public ArrayList<PostosDeAtendimento> getPostosPorCapacidade(int x){
		ArrayList<PostosDeAtendimento> resultado = new ArrayList<PostosDeAtendimento>();
		
		//Percorrer a lista de Postos
		for (int i = 0; i < this.postosDeAtendimento.size(); i++) {
			if (this.postosDeAtendimento.get(i).getCapacidade() > x) {
				resultado.add(this.postosDeAtendimento.get(i));
			}
		}
		
		return resultado;
	}
	
	//Metodo que retorna o codigo dos postos vegetarianos
	public ArrayList<Integer> getPostosVegetarianos(){
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		
		//Percorrer a lista de Postos
		for (int i = 0; i < this.postosDeAtendimento.size(); i++) {
			if (this.postosDeAtendimento.get(i).isVegetariano()) {
				resultado.add(this.postosDeAtendimento.get(i).getCodigo());
			}
		}
		
		return resultado;
	}
	
	//Metodo que retorna o nome da ONG que vai atender a caravana por numero de pessoas
	public String getONGQueAtende(int qtdePessoas){
		String resultado = "";
		
		double qtdeComida = qtdePessoas * 0.5;
		
		//Percorrer a lista de postos
		for (int i = 0; i < this.postosDeAtendimento.size(); i++) {
			if (this.postosDeAtendimento.get(i).getCapacidade() >= qtdeComida) {
				resultado = this.postosDeAtendimento.get(i).getOng().getNome();
			}
		}
		
		return resultado;
	}
}
	
	