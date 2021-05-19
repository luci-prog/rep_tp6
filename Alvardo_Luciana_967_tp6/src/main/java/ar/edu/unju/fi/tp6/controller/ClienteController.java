package ar.edu.unju.fi.tp6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp6.model.Cliente;
import ar.edu.unju.fi.tp6.service.IClienteService;

@Controller
public class ClienteController {
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private Cliente cliente;
	
	
	@GetMapping("/cliente/nuevo")
	public String getClientePage(Model model){
		model.addAttribute(cliente);
		return "nuevocliente";
	}
	
	
	
	@PostMapping("/cliente/guardar")
	public ModelAndView guardarCliente(@ModelAttribute("cliente") Cliente cliente) {
		ModelAndView model = new ModelAndView("clientes");
		clienteService.guardarCliente(cliente);
		model.addObject("clientes", clienteService.obtenerClientes());
		
		return model;
		
	}

	
	
	@GetMapping("/cliente/listado")
	public ModelAndView getListaClientesPage() {
		ModelAndView model = new ModelAndView("clientes");
		if (clienteService.obtenerClientes()== null){
			clienteService.generarTablaClientes();
		}
		model.addObject("clientes", clienteService.obtenerClientes());
		
		return model;
		
	}
	
	
	

	@PostMapping("/cliente/listado")
	public ModelAndView getListaClientesPagePos() {
		ModelAndView model = new ModelAndView("clientes");
		if (clienteService.obtenerClientes()== null){
			clienteService.generarTablaClientes();
		}
		model.addObject("clientes", clienteService.obtenerClientes());
		
		return model;
		
	}
	
	
}
