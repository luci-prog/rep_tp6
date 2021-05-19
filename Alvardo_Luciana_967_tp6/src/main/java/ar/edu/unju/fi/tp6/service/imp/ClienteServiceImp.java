package ar.edu.unju.fi.tp6.service.imp;

import java.time.LocalDate;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp6.model.Cliente;
import ar.edu.unju.fi.tp6.service.IClienteService;
//import ar.edu.unju.fi.tp6.util.TablaCliente;

@Service
public class ClienteServiceImp implements IClienteService {
	private static final Log LOGGER = LogFactory.getLog(ClienteServiceImp.class);
	
	private List<Cliente> clientes;
	
 
	@Override
	public void generarTablaClientes() {
		clientes = TablaCliente.listaClientes;
		clientes.add(new Cliente("DNI",12345678,"PEPITO PEREZ","pepitoOK@hotmail.com","pepe123",LocalDate.of(1999, 3, 8),36,388,154399509,LocalDate.of(2020, 4, 4)));
	   
		LOGGER.info("METHOD: generarTablaCliente -----Se agrego el primer objeto Cliente a la lista ---> " + clientes.get(clientes.size()-1));
	}
	
	@Override
	public void guardarCliente(Cliente cliente) {
		if (clientes==null) {
			generarTablaClientes();
		}
		clientes.add(cliente);
		LOGGER.info("METHOD: guardarCliente -----Se agrego un objeto Cliente a la lista en la posicion ---> " +clientes.get(clientes.size()-1));

	}
	

	@Override
	public List<Cliente> obtenerClientes() {
		LOGGER.info("METHOD: obtenerClientes -----Se visualizó la vista de la lista de Clientes --- cantidad de objetos Cliente almacenados----> "+ clientes.size());
		return clientes;
		
	}

}
