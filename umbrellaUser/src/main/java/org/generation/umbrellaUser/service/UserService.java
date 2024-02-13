package org.generation.umbrellaUser.service;

import java.util.List;

import org.generation.umbrellaUser.exception.UserNotFoundException;
import org.generation.umbrellaUser.model.User;
import org.generation.umbrellaUser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	
	@Service
public class UserService {	
// eliminamos todo lo relacionado al ArrayList que creamos para instancias objetos.
		
//Ahora vamos a traer a JPA para que me brinde los métodos para recuperar los datos.
	
	private final UserRepository repository;
	
	// constructor permite la inyección de dependencias
	 @Autowired
	public UserService(UserRepository repository) {
		this.repository = repository;
	
	}
	
	
	// Crear método de tipo Get para traer a todos los usuarios
	
	public List <User> allUsers(){
		return repository.findAll(); // método especifico para encontrar todos los usuarios 
	}
	
	//Crear método de tipo get para traer un usuario por id, si no encuentra al usuario arroja una exception (default o personalizada)
		public User getOne(Long id) {
			return repository.findById(id)
					.orElseThrow(() -> new UserNotFoundException(id)); //Estoy creando una exception personalizada que vivirá en otra clase con el mismo nombre de la exception
		}
		
	/*CREAR MÉTODO PARA ELIMINAR UN USUARIO POR ID.
	*Primero debemos comprobar que el usuario con el id realmente existe, en caso de existir se elimina, sino, se lanza una Exception por default (IllegalStateExcpetion)
	*/
	
		public void deleteUser(Long id) {
			if (repository.existsById(id)) {
				repository.deleteById(id);
			}else {
				//throw new IllegalStateException("El cliente con el id " +id + " no existe");  Esta tambien la podemos aplicar.
				throw new UserNotFoundException(id);
			}
		}
		
		
		/*Post, crear un nuevo usuario. 
		 * Primero tengo que consultar la DB para saber si el usuario existe. Por ello, debo definir de qué manera buscaré a mi usuario. En este caso será mediante email.
		 * Si el usuario con un email asociado existe, no puede crear un nuevo usuario con el mismo email.
		 * Si no hay un usuario con el email asociado, se crea un nuevo usuario.
		 * Tenemos que definir la búsqueda específica por email `findByEmail` utilizando una consulta de tipo JPQL, la cual se realiza dentro la interface UserRepository ya que ahí se implementan todas los métodos de JPA
		 */
		
		
		
		public User addUser (User user) {
			// Crear una avriable de tipo User para buscar el email  de usuario. Traemos el valro de la base de datos y después realizo la sentencia condicional (if-else) o solo (if) o una geacion del if (!if) si es true se cuemple, en caso contrario, arrojar excepción
			User existingUser = repository.findByEmail(user.getEmail());
			if (existingUser != null) {
				throw new IllegalStateException("El email registrado ya esta asociado a una cuenta existente");
			}
			return repository.save(user);
		}
	
		
	/*
	 * Crear método put para actualizar la información de un usuario.
	 * Debemos iterar cada jey/value del objeto para observar las modificaciones y aplicarlas en el atributo específico. Para ello nos valemos de un método .map
	 * */	
		
		
		public User replaceUser(User user, Long id) {
			return repository.findById(id)
					.map(userMap -> { //Función lambda
						userMap.setNombre(user.getNombre());
						userMap.setApellido(user.getApellido());
						userMap.setEmail(user.getEmail());
						userMap.setPassword(user.getPassword());
						return repository.save(userMap);
					})
					.orElseGet(() -> {
						user.setId(id);
						return repository.save(user);
					});
		}
		
		
		/*Podemos buscar un usuario por medio de su correo para recuperar información.
		 * Para ello dependemos de JPQL  en el repository y ResponseEntity que se ejecutara en el controller.
		 * Vamos a crear un método para bsucar a un usuario por email `getUserByEmail`
		
	 */
		
		public User getUserByEmail(String email) {
			return repository.findByEmail(email);
					
		}
		
		
		
		
}// class