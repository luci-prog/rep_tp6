package ar.edu.unju.fi.tp6.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp6.model.Compra;
import ar.edu.unju.fi.tp6.service.ICompraService;
//import ar.edu.unju.fi.tp6.util.TablaCompra;

@Service("compraUtilService")
public class CompraServiceImp implements ICompraService{
	
	private List<Compra> compras;
	@Override
	public void generarTablaCompras() {
		Producto producto;
		this.compras=TablaCompra.listaCompra;
		producto=new Producto(1,"guitarra",15000,"fender",5);
		compras.add(new Compra(1,producto,1,(double)56000));
		
	}

	@Override
	public void agregarCompra(Compra compra) {
		if(compras==null) {
			generarTablaCompras();
		}
		compras.add(compra);
		int indice=compras.size();
		compra.setId(indice);
	}

	@Override
	public List<Compra> obtenerCompra() {
		
		return this.compras;
	}

}
