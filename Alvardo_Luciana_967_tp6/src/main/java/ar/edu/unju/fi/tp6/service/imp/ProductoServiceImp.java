package ar.edu.unju.fi.tp6.service.imp;


import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp6.model.Producto;
import ar.edu.unju.fi.tp6.service.IProductoService;

@Service
public class ProductoServiceImp implements IProductoService {

	private static final Log LOGGER = LogFactory.getLog(ProductoServiceImp.class);
	
	private List<Producto> productList = new ArrayList<Producto>();
	
	@Override
	public void guardarProducto(Producto producto){
		
		// Agrega un producto a la lista de producto
		productList.add(producto);
		LOGGER.info("METHOD: guardarProducto -- Se agrego un objeto producto a la lista ---> "+productList.get(productList.size()-1));
	}

	@Override
	public Producto ultimoProducto() {
		return productList.get(productList.size()-1);
	}
	

}
