package ar.edu.unju.fi.tp6.model;

import java.time.LocalDate;
//import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Entity
@Table(name="clientes")
@Component
public class Cliente {
	
	@Column(name="tipoDocumento")
	private String tipoDocumento;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="clie_dni")
	private int nroDocumento;
	
	@Column(name="nombreApellido")
	private String nombreApellido;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	
	@Column(name="fechaNacimiento")
	@DateTimeFormat(pattern= "yyyy-MM-dd")
	private LocalDate fechaNacimiento;
	
	@Column(name="edad")
	private int edad;
	@Column(name="codigoAreaTelefono")
	private int codigoAreaTelefono;
	@Column(name="nroTelefono")
	private int nroTelefono;
	
	@Column(name="fechaUltimaCompra")
	@DateTimeFormat(pattern= "yyyy-MM-dd")
	private LocalDate fechaUltimaCompra;
	
		
	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public Cliente(String tipoDocumento, int nroDocumento, String nombreApellido, String email, String password,
			LocalDate fechaNacimiento, int edad, int codigoAreaTelefono, int nroTelefono, LocalDate fechaUltimaCompra) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
		this.nombreApellido = nombreApellido;
		this.email = email;
		this.password = password;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.codigoAreaTelefono = codigoAreaTelefono;
		this.nroTelefono = nroTelefono;
		this.fechaUltimaCompra = fechaUltimaCompra;
	}


	public String getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public int getNroDocumento() {
		return nroDocumento;
	}


	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}


	public String getNombreApellido() {
		return nombreApellido;
	}


	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getCodigoAreaTelefono() {
		return codigoAreaTelefono;
	}


	public void setCodigoAreaTelefono(int codigoAreaTelefono) {
		this.codigoAreaTelefono = codigoAreaTelefono;
	}


	public int getNroTelefono() {
		return nroTelefono;
	}


	public void setNroTelefono(int nroTelefono) {
		this.nroTelefono = nroTelefono;
	}


	public LocalDate getFechaUltimaCompra() {
		return fechaUltimaCompra;
	}


	public void setFechaUltimaCompra(LocalDate fechaUltimaCompra) {
		this.fechaUltimaCompra = fechaUltimaCompra;
	}


	@Override
	public String toString() {
		return "Cliente [tipoDocumento=" + tipoDocumento + ", nroDocumento=" + nroDocumento + ", nombreApellido="
				+ nombreApellido + ", email=" + email + ", password=" + password + ", fechaNacimiento="
				+ fechaNacimiento + ", edad=" + edad + ", codigoAreaTelefono=" + codigoAreaTelefono + ", nroTelefono="
				+ nroTelefono + ", fechaUltimaCompra=" + fechaUltimaCompra + "]";
	}
	
	
	 
	
	//calcula el tiempo a partir de la fecha de ultima Compra hasta la fecha actual
	//public String tiempoUltimaCompra(){
		//String texto = "";
		//LocalDate compra = this.fechaUltimaCompra;
		//LocalDate hoy = LocalDate.now();
		//Period tiempo = Period.between(compra,hoy);
	    
		//texto = texto + "años" + tiempo.getYears() + "meses: "+ tiempo.getMonths() + " dias: " + tiempo.getDays();
		//return texto;
		
		//return "no me sale :c ";
	
	//}
	
	
	
	//calcula la cantidad de dias a partir de la fecha de nacimiento (no sé cual es el error)
	
	/*public int diasDesdeNacimiento() {
		 LocalDate hoy = LocalDate.now();
		 Period periodo = Period.between(this.fechaNacimiento, hoy);
		 int anios = periodo.getYears();
		 int meses = periodo.getMonths();
		 int dias = periodo.getDays();
		return anios * 365 + meses * 30 + dias;
	}
	*/
	
	
	
}
