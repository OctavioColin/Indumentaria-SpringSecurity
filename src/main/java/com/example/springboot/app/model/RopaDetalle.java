package com.example.springboot.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "articulos_ropa_detalles")
public class RopaDetalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(name="idarticulo")
	private int idarticulo;
	
	@Column
	private String tipo;
	
	@Column
	private String usabilidad;
	
	@Column
	private String talle;
	
	@Column
	private String temporada;
	
	@Column
	private String color;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdArticulo() {
		return idarticulo;
	}
	public void setIdArticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUsabilidad() {
		return usabilidad;
	}
	public void setUsabilidad(String usabilidad) {
		this.usabilidad = usabilidad;
	}
	public String getTalle() {
		return talle;
	}
	public void setTalle(String talle) {
		this.talle = talle;
	}
	public String getTemporada() {
		return temporada;
	}
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
