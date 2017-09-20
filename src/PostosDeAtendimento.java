
public class PostosDeAtendimento {
	
	public int codigo;
	public double capacidade;
	public boolean vegetariano;
	public boolean semGluten;
	public boolean semLactose;
	public ONGs ong;
			
	
	public PostosDeAtendimento(int codigo, double capacidade, boolean vegetariano, boolean semGluten,
			boolean semLactose, ONGs ong) {
		super();
		this.codigo = codigo;
		this.capacidade = capacidade;
		this.vegetariano = vegetariano;
		this.semGluten = semGluten;
		this.semLactose = semLactose;
		this.ong = ong;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	public boolean isVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}

	public boolean isSemGluten() {
		return semGluten;
	}

	public void setSemGluten(boolean semGluten) {
		this.semGluten = semGluten;
	}

	public boolean isSemLactose() {
		return semLactose;
	}

	public void setSemLactose(boolean semLactose) {
		this.semLactose = semLactose;
	}

	public ONGs getOng() {
		return ong;
	}

	public void setOng(ONGs ong) {
		this.ong = ong;
	}
		
}
