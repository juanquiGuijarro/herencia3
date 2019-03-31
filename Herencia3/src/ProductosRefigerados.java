
public class ProductosRefigerados extends Productos {

	int codOrganismo;

	//construtores
	public ProductosRefigerados() {
		super();
		this.codOrganismo=codOrganismo;
	}

	public ProductosRefigerados(String fechaCaduccidad, int numLotes) {
		super(fechaCaduccidad, numLotes);
		this.codOrganismo=0;
	}
	
	public ProductosRefigerados(int codOrganismo) {
		super();
		this.codOrganismo = codOrganismo;
	}

	//metodos

	public int getCodOrganismo() {
		return codOrganismo;
	}

	public void setCodOrganismo(int codOrganismo) {
		this.codOrganismo = codOrganismo;
	}

	@Override
	public String toString() {
		return "ProductosRefigerados [codOrganismo=" + codOrganismo + "]";
	}
	
	
}
