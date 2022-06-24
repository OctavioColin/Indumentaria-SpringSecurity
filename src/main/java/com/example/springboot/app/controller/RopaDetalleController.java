package com.example.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.app.exception.Mensaje;
import com.example.springboot.app.model.RopaDetalle;
import com.example.springboot.app.service.RopaDetalleService;

@RestController
@RequestMapping("/indumentaria")
public class RopaDetalleController {

	@Autowired
	private RopaDetalleService ropaDetalleServce;
	
	@GetMapping("/getId")
	public ResponseEntity<?> getId(){
		List<Integer> lista = ropaDetalleServce.getId();
		if(lista.isEmpty()) {
			return new ResponseEntity<>(new Mensaje("Sin ropa_detalles en la Base de Datos"), HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok().body(ropaDetalleServce.getId());
	}
}
