package ar.edu.unju.fi.tp6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp6.model.Compra;
import ar.edu.unju.fi.tp6.service.ICompraService;

@Controller
public class CompraController {
	@Autowired
	private Compra compra;
	@Autowired
	@Qualifier("compraUtilService")
	private ICompraService compraService;
	
	 @GetMapping("/comprar")
	public String getFormCompraPage(Model model) {
		 model.addAttribute("compra",compra);
		return("compra");
	}
	 
	 @PostMapping("/comprar/guardar")
	 public ModelAndView guardarCompraPage(@ModelAttribute("compra") Compra compra) {
		 ModelAndView model = new ModelAndView("listacompras");
		 compraService.agregarCompra(compra);
		 model.addObject("compras",compraService.obtenerCompra());
	 return model;
	 }

	 
	 @GetMapping("/comprar/listado")
	 public ModelAndView getListaComprasPage() {
		 ModelAndView model = new ModelAndView("listacompras");//se pone la pagina html q se va a ver
		 if(compraService.obtenerCompra()==null) {
			 compraService.generarTablaCompras();
		 }
		 model.addObject("compras", compraService.obtenerCompra()); //se obtiene el resultado
		 
		 return model;
	 }

}
