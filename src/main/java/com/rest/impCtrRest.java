package com.rest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.http.MediaType;

import com.model.Impiegato;
import com.service.ImpiegatoService;

@CrossOrigin(origins= "http://localhost:4200")
@RestController
@RequestMapping("impCtrRest")
public class impCtrRest {
	
	@Autowired
	private ImpiegatoService impiegatoService;
	
	
	@RequestMapping(value="test", produces="application/json",method=RequestMethod.GET)//restituisce la lista completa
	//@CrossOrigin(origins= "http://localhost:4200")
	public Impiegato test() {
		Impiegato imp=new Impiegato();
		imp.setMatricola(30);
		imp.setCodicefiscale("codFisc");
		imp.setNome("testNome");
		imp.setCognome("testCognome");
		System.out.println("*********************************"+imp);
		String test="testRest";
		
		return imp;
	}
	//@CrossOrigin(origins= "http://localhost:4200")
	@GetMapping(value="getImpiegato/{id}", produces="application/json")
	public Impiegato getImpiegato(@PathVariable Integer id) {
		Impiegato imp = impiegatoService.getImpiegato(id);
		System.out.println("*************getImpiegato********************"+imp);
		return imp;
	}
}
