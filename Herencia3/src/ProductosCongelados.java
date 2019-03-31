
public class ProductosCongelados extends Productos{

	int temperaturaReco;

	
	//construtores

	public ProductosCongelados() {
		super();
		this.temperaturaReco=temperaturaReco;
	}

	public ProductosCongelados(String fechaCaduccidad, int numLotes) {
		super(fechaCaduccidad, numLotes);
		this.temperaturaReco=0;
	}

	public ProductosCongelados(int temperaturaReco) {
		super();
		this.temperaturaReco = temperaturaReco;
	}

	//metodos
	
	public int getTemperaturaReco() {
		return temperaturaReco;
	}

	public void setTemperaturaReco(int temperaturaReco) {
		this.temperaturaReco = temperaturaReco;
	}

	@Override
	public String toString() {
		return "ProductosCongelados [temperaturaReco=" + temperaturaReco + "]";
	}
	
	
	
}
