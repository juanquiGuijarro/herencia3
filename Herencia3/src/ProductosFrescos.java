import java.sql.Date;

public class ProductosFrescos extends Productos{
	long fechaEnvasado;
	String paisOrigen;
	long fechaSystema;
	java.util.Date fecha = new Date(fechaSystema);
	
	//construtores
	public ProductosFrescos() {
		super();
		this.fechaEnvasado=fechaEnvasado;
		this.paisOrigen=paisOrigen;
	}

	public ProductosFrescos(String fechaCaduccidad, int numLotes) {
		super(fechaCaduccidad, numLotes);
		this.fechaEnvasado=0;
		this.paisOrigen="";
	}


	public ProductosFrescos(long fechaEnvasado, String paisOrigen) {
		super();
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	//metodos
	
	public void envasar(){
		System.out.println(fechaSystema);
		this.fechaEnvasado=fechaSystema;
	}
	public long getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(long fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public long getFechaSystema() {
		return fechaSystema;
	}
	public void setFechaSystema(long fechaSystema) {
		this.fechaSystema = fechaSystema;
	}
	@Override
	public String toString() {
		return "ProductosFrescos [fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen  + ", fecha=" + fecha + "]";
	}
	
	
}
