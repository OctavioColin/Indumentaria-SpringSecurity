package com.example.springboot.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.app.exception.ResourceNotFoundException;
import com.example.springboot.app.model.RopaDetalle;
import com.example.springboot.app.repository.RopaDetalleRepository;

@Service
@Transactional
public class RopaDetalleServiceImpl implements RopaDetalleService{
	
	@Autowired
	private RopaDetalleRepository ropaDetalleRepository;
	
	@Override
	public List<Integer> getId() {
		return this.ropaDetalleRepository.obtenerId();
	}
	
}
