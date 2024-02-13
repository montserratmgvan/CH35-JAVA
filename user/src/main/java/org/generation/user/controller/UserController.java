package org.generation.user.controller;

import java.util.List;

import org.generation.user.model.User;
import org.generation.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Controla las peticiones de tipo HTTP (Get, Post, Put, Delete, Patch)
 * Para definir una clase como Controller, se utiliza la anotación @RestController 
 * Aquí definimos el endpoint de nuestra URI, así como los endpoints de cada petición.
 * 		- Para definir la ruta (endpoint) de nuestra API, utilizamos la anotación @RequestMapping
 * 		- Para definir la ruta (endpoint) de cada petición, utilizamos path o paréntesis
 * Aquí se lleva a cabo la inyección de dependencias en el constructor, utilizando anotación @Autowired
 * Definimos el método correspondiente a la petición HTTP con las anotaciones @GetMapping @PostMapping @PutMapping @DeleteMapping
 */


@RestController // indica que esta clase en una API de tipo REST (trabaja con métodos HTTP)
@RequestMapping ("admin/users")// construimos la ruta de nuestra API, definiendo endpoints(localhost:8080/admin/users)

public class UserController {

//Instanciar desde UserService mediante un nuevo objeto de tipo UserService userService
	
	private UserService userService;
	
	//Generar el constructor y asignar anotación @Autowired que indica que aqui se lleva a cabo la intección de dependencias	
	
	@Autowired 
	public UserController (UserService userService) {
		this.userService = userService;
	}
	
	//Necesitamos decirle a controller que debe traer la información de UserService usando el método definido. Para traer la información (READ) necesitamos indicar el tipo de petición (Get) mediante la notación @GetMapping .
	
	
	@GetMapping
	public List <User> getUsers(){
		return userService.allUsers();
	}
	
	
	
	
	
	
	
	
	
	
	
}//class
