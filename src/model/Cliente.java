package model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@Column(length = 70, nullable = false)
	private String nome;
	
	@Column(length = 14, nullable = false)
	private String cpf;
	
	@OneToMany
	@JoinColumn(name = "fkclienteEndereco")
	private Collection<Endereco> enderecos;
	
	@OneToMany
	@JoinColumn(name = "fkclienteTelefone")
	private Collection<Telefone> telefones;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Collection<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Collection<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Collection<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(Collection<Telefone> telefones) {
		this.telefones = telefones;
	}
	
}
