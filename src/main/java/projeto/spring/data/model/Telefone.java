package projeto.spring.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String numero;
	private String tipo;
	
	@ManyToOne(optional = false)
	private UsuarioSpringData usuarioSpringData;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public UsuarioSpringData getUsuarioSpringData() {
		return usuarioSpringData;
	}
	public void setUsuarioSpringData(UsuarioSpringData usuarioSpringData) {
		this.usuarioSpringData = usuarioSpringData;
	}
	
	
}
