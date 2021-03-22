package model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numPedido;
	
	@Column(nullable = false)
	private Date data;
	
	@ManyToOne
	@JoinColumn(name = "fkcliente")
	private Cliente cliente;
	
	@OneToMany
	@JoinColumn(name = "fkPedidoProduto")
	private Collection<PedidoProduto> produtos;

	public long getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(long numPedido) {
		this.numPedido = numPedido;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Collection<PedidoProduto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Collection<PedidoProduto> produtos) {
		this.produtos = produtos;
	}
	
}
