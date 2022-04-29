package org.pbaengflvs.demoSpring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis")
public class Controller {

	@GetMapping("/copyFile")
	public String copyFile() {
		return "Archivo copiado!";
	}
	
	@GetMapping("/miPrimeraPagina")
	public String miPagina()
	{
		String cadena = "";
		cadena = cadena + "<!DOCTYPE html>";
		cadena = cadena + "<html>";
		cadena = cadena + "<header>";
		cadena = cadena + "    <title>El sitio de Mario</title>";
		cadena = cadena + "    <link rel=\"stylesheet\" href=\"/css/style.css\">";
		cadena = cadena + "</header>";

		cadena = cadena + "<body>";
		cadena = cadena + "    <h1 class=\"title\">Hola team</h1>";
		cadena = cadena + "    <h2 class=\"title\">Esta pagina fue desarrollada con Java y Spring boot</h2>";
		cadena = cadena + "</body>";
		cadena = cadena + "</html>";
		
		System.out.println(cadena);
		return cadena;
	}
	
	@GetMapping("/pagina2/{userName}")
	public String miPagina2(@PathVariable String userName)
	{
		String cadena = "";
		cadena = cadena + "<!DOCTYPE html>";
		cadena = cadena + "<html>";
		cadena = cadena + "<header>";
		cadena = cadena + "    <title>El sitio de " + userName + "</title>";
		cadena = cadena + "    <link rel=\"stylesheet\" href=\"/css/style.css\">";
		cadena = cadena + "</header>";

		cadena = cadena + "<body>";
		cadena = cadena + "    <h1 class=\"title\">Hola team</h1>";
		cadena = cadena + "    <h2 class=\"title\">Esta pagina fue desarrollada con Java y Spring boot</h2>";
		cadena = cadena + "</body>";
		cadena = cadena + "</html>";
		
		System.out.println(cadena);
		return cadena;
	}
	
	@GetMapping("/pagina2/{userName}/{sMsg}")
	public String miPagina2(@PathVariable String userName, @PathVariable String sMsg)
	{
		String cadena = "";
		cadena = cadena + "<!DOCTYPE html>";
		cadena = cadena + "<html>";
		cadena = cadena + "<header>";
		cadena = cadena + "    <title>El sitio de " + userName + "</title>";
		cadena = cadena + "    <link rel=\"stylesheet\" href=\"/css/style.css\">";
		cadena = cadena + "</header>";

		cadena = cadena + "<body>";
		cadena = cadena + "    <h1 class=\"title\">" + sMsg + "</h1>";
		cadena = cadena + "    <h2 class=\"title\">Esta pagina fue desarrollada con Java y Spring boot</h2>";
		cadena = cadena + "</body>";
		cadena = cadena + "</html>";
		
		System.out.println(cadena);
		return cadena;
	}
	
	@GetMapping("/pagina3")
	public String miPagina3(@RequestParam String userName, @RequestParam String sMsg)
	{
		String cadena = "";
		cadena = cadena + "<!DOCTYPE html>";
		cadena = cadena + "<html>";
		cadena = cadena + "<header>";
		cadena = cadena + "    <title>El sitio de " + userName + "</title>";
		cadena = cadena + "    <link rel=\"stylesheet\" href=\"/css/style.css\">";
		cadena = cadena + "</header>";

		cadena = cadena + "<body>";
		cadena = cadena + "    <h1 class=\"title\">" + sMsg + "</h1>";
		cadena = cadena + "    <h2 class=\"title\">Esta pagina fue desarrollada con Java y Spring boot</h2>";
		cadena = cadena + "</body>";
		cadena = cadena + "</html>";
		
		System.out.println(cadena);
		return cadena;
	}
	
}
