package com.example.springboot.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springboot.app.model.RopaDetalle;

public interface RopaDetalleRepository extends JpaRepository<RopaDetalle, Integer>{
	
	@Query(value="SELECT r.id FROM ARTICULOS_ROPA_DETALLES r",
			nativeQuery = true)
	List<Integer> obtenerId();
}
