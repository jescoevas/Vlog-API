package com.jescoevas.vlog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jescoevas.vlog.domain.User;
import com.jescoevas.vlog.services.UserService;

@RestController
@RequestMapping("/api/vlog/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> getAll(){
		List<User> users = this.userService.getAll();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getById(@PathVariable Integer id){
		User user = this.userService.getById(id);
		if(user != null) {
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}else {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<User> create(@RequestBody User user){
		User newUser = userService.create(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}
	
//	@PutMapping("/{id}")
//    public ResponseEntity<User> actualizarComentario(@PathVariable Long id, @RequestBody Comentario comentario) {
//		User comentarioExistente = userService.obtenerPorId(id);
//        if (comentarioExistente != null) {
//            comentarioExistente.setContenido(comentario.getContenido());
//            comentarioExistente.setAutor(comentario.getAutor());
//            comentarioService.actualizar(comentarioExistente);
//            return new ResponseEntity<>(comentarioExistente, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> eliminarComentario(@PathVariable Long id) {
//        Comentario comentarioExistente = comentarioService.obtenerPorId(id);
//        if (comentarioExistente != null) {
//            comentarioService.eliminar(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
	
}
