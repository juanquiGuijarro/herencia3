
public class Productos {

	String fechaCaduccidad;
	int numLotes;
	
	//construtores
	
	public Productos() {
		super();
		this.fechaCaduccidad="";
		this.numLotes=0;
	}

	public Productos(String fechaCaduccidad, int numLotes) {
		super();
		this.fechaCaduccidad = fechaCaduccidad;
		this.numLotes = numLotes;
	}
	
	//metodos

	public String getFechaCaduccidad() {
		return fechaCaduccidad;
	}

	public void setFechaCaduccidad(String fechaCaduccidad) {
		this.fechaCaduccidad = fechaCaduccidad;
	}

	public int getNumLotes() {
		return numLotes;
	}

	public void setNumLotes(int numLotes) {
		this.numLotes = numLotes;
	}

	@Override
	public String toString() {
		return "Productos [fechaCaduccidad=" + fechaCaduccidad + ", numLotes=" + numLotes + "]";
	}
	
		
}
