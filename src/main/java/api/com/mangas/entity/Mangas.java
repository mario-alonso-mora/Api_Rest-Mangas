package api.com.mangas.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="api_mangas")


public class Mangas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String nombre;
	private String genero;
	private String creador;
	private Integer numeroDeTomos;
	private String editorial;
	private LocalDate fechaDeEstreno;
	private String finalizado;
	private Double precioPorTomos;
	
	
	
	public Mangas() {
	
	}



	public Mangas(Integer id, String nombre, String genero, String creador, Integer numeroDeTomos, String editorial,
			LocalDate fechaDeEstreno, String finalizado, Double precioPorTomos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.creador = creador;
		this.numeroDeTomos = numeroDeTomos;
		this.editorial = editorial;
		this.fechaDeEstreno = fechaDeEstreno;
		this.finalizado = finalizado;
		this.precioPorTomos = precioPorTomos;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public String getCreador() {
		return creador;
	}



	public void setCreador(String creador) {
		this.creador = creador;
	}



	public Integer getNumeroDeTomos() {
		return numeroDeTomos;
	}



	public void setNumeroDeTomos(Integer numeroDeTomos) {
		this.numeroDeTomos = numeroDeTomos;
	}



	public String getEditorial() {
		return editorial;
	}



	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}



	public LocalDate getFechaDeEstreno() {
		return fechaDeEstreno;
	}



	public void setFechaDeEstreno(LocalDate fechaDeEstreno) {
		this.fechaDeEstreno = fechaDeEstreno;
	}



	public String getFinalizado() {
		return finalizado;
	}



	public void setFinalizado(String finalizado) {
		this.finalizado = finalizado;
	}



	public Double getPrecioPorTomos() {
		return precioPorTomos;
	}



	public void setPrecioPorTomos(Double precioPorTomos) {
		this.precioPorTomos = precioPorTomos;
	}
	
	
	
	
	
	

	
	
	
	
	
	
}
