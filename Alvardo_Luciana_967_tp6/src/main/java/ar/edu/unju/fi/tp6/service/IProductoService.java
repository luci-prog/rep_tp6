package ar.edu.unju.fi.tp6.service;


import ar.edu.unju.fi.tp6.model.Producto;

public interface IProductoService {
	public void guardarProducto(Producto producto);
	public Producto ultimoProducto();
	
}
