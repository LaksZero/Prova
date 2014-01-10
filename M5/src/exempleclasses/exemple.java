package exempleclasses;

public class exemple {
	private String color;
	private String matricula;
	private int anys;
	private int portes;
	private boolean funciona;
	public exemple(String color, String matricula, int anys, int portes,
			boolean funciona) {
		super();
		this.color = color;
		this.matricula = matricula;
		this.anys = anys;
		this.portes = portes;
		this.funciona = funciona;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getAnys() {
		return anys;
	}
	public void setAnys(int anys) {
		this.anys = anys;
	}
	public int getPortes() {
		return portes;
	}
	public void setPortes(int portes) {
		this.portes = portes;
	}
	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}

}
