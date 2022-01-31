import java.util.Date;

public class Mensaje {
	private String emisor;
	private String destinatario;
	private String cuerpo;
	private Date fechaHoraCreacion;
	private Date fechaHoraModificacion;
	
	public Mensaje() {
		this.emisor="Emisor Desconocido";
		this.destinatario="Destinatario Desconocido";
		this.cuerpo="Texto Desconocido";
		this.fechaHoraCreacion= new Date();
		this.fechaHoraModificacion= new Date();
	}
	public Mensaje(String emisor,String destinatario, String texto) {
		super();
		this.emisor = emisor;
		this.destinatario=destinatario;
		this.cuerpo = texto;
		this.fechaHoraCreacion=new Date();
		this.fechaHoraModificacion= new Date();
	}
	public String getEmisor() {
		return emisor;
	}
	public void setEmisor(String emisor) {
		this.emisor = emisor;
		actualizarFechaModificacion();
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String texto) {
		this.cuerpo = texto;
		actualizarFechaModificacion();
	}
	private void actualizarFechaModificacion() {
		this.fechaHoraModificacion= new Date();
		System.out.println("¡¡Hora actualizada!!");
	}
	@Override
	public String toString() {
		return "Mensaje de " + emisor + ": \t" + cuerpo + "\t"+ fechaHoraCreacion +
				"\t"+fechaHoraModificacion;
	}
	
}
