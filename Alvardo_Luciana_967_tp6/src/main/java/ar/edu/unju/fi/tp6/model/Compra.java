/**
 * 
 */
package ar.edu.unju.fi.tp6.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name="compras")
@Component
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="com_id")
	private int id;
	@Autowired
	@ManyToOne
	@JoinColumn(name="pro_codigo")
	private Producto producto ;
	@Column(name="cantidad")
	private int cantidad;
	@Column(name="total")
	private double total;
	
	//CONTRUCTOR CON Y SIN PARAMETRO
	public Compra() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param producto
	 * @param cantidad
	 * @param total
	 */
	public Compra(int id, Producto producto, int cantidad, double total) {
		super();
		this.id = id;
		this.producto = producto;
		this.cantidad = cantidad;
		this.total = total;
	}

//DESARROLLO DE GETTER AND SETTER
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}


	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}


	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}


	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

//METODOS DE TOSRING()
	@Override
	public String toString() {
		return "Compra [id=" + id + ", producto=" + producto + ", cantidad=" + cantidad + ", total=" + total + "]";
	}

}
