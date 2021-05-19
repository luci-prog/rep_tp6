package ar.edu.unju.fi.tp6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp6.model.Producto;
import ar.edu.unju.fi.tp6.service.IProductoService;

@Controller
public class ProductoController {
	@Autowired
	private IProductoService productoServi;
	
	@Autowired
	private Producto producto;
		
	@GetMapping("/producto")
	public String getProductoPage(Model model) {
		model.addAttribute(producto);
		return "nuevo";
	}
	
	
	@PostMapping("/producto/guardar")
	public String guardarProducto(@ModelAttribute("producto")Producto producto) {
		
		productoServi.guardarProducto(producto);
		return "resultado";
	}
	
	@GetMapping("/producto/ultimo")
	public ModelAndView getUltimoProd() {
		ModelAndView model = new ModelAndView("ultimoproducto");
		model.addObject("ultimo", productoServi.ultimoProducto());
		return model;
	}

	//////modifiacar
	@GetMapping("/producto/informacion")
	public String getInformacionProducto(Model model) {
		return "informacion";
	}
}
