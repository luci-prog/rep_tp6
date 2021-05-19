package ar.edu.unju.fi.tp6.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name="productos")
@Component
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pro_codigo")
	private int codigo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="precio")
	private double precio;
	@Column(name="marca")
	private String marca;
	@Column(name="stock")
	private int stock;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	public Producto(int codigo, String nombre, double precio, String marca, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
		this.stock = stock;
	}






	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", marca=" + marca
				+ ", stock=" + stock + "]";
	}
	
		
	
}
