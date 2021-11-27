package com.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyecto.entity.Categoria;
import com.proyecto.service.CategoriaService;

@Controller
public class CategoriaController {

	@Autowired
	private CategoriaService service;
	
	@GetMapping("/categoria")
	public String listar(Model map) {
		map.addAttribute("listarCategoria",service.listar());
		return "categoria/listar";
	}
	
	@GetMapping("/categoria/nuevo")
	public String nuevo(Model map){
		map.addAttribute("categoria", new Categoria());
		return "categoria/nuevo";
	}
	
	@PostMapping("/categoria/crear")
	public String crear(@ModelAttribute("categoria") Categoria categoria){
		service.registrar(categoria);
		return "redirect:/categoria";
	}
	
	@GetMapping("/categoria/editar/{idcategoria}")
	public String editar(@ModelAttribute("idcategoria") Long idcategoria,Model map){
		map.addAttribute("categoria", service.obtenerPorId(idcategoria));
		return "categoria/editar";
	}
	
	@PostMapping("/categoria/actualizar")
	public String actualizar(@ModelAttribute("categoria") Categoria categoria){
		service.actualizar(categoria);
		return "redirect:/categoria";
	}
	
	@GetMapping("/categoria/eliminar/{idcategoria}")
	public String eliminar(@ModelAttribute("idcategoria") Long idcategoria){
		service.eliminar(idcategoria);
		return "redirect:/categoria";
	}
}