package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(length = 70, nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private double preco;
	
	@Column(nullable = false)
	private Long saldoEstoque;
	
	@ManyToOne
	@JoinColumn(name = "fkProdutoMarca")
	private Marca marca;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Long getSaldoEstoque() {
		return saldoEstoque;
	}

	public void setSaldoEstoque(Long saldoEstoque) {
		this.saldoEstoque = saldoEstoque;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	
}
