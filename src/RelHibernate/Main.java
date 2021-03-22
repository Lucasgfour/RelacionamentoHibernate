package RelHibernate;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

import controller.ObjectDao;
import model.*;

public class Main {
	
	
	public static void main(String[] args) {		
		ObjectDao oDao = new ObjectDao();
		Long codigo = Long.parseLong("1");
		
		Cidade cidade = new Cidade();
		cidade.setNome("São Sebastião do Paraíso");
		cidade.setUf("Minas Gerais");
		oDao.inserir(cidade);
		cidade = (Cidade) oDao.consultar(codigo, new Cidade());

		Marca marca = new Marca();
		marca.setNome("Xiaomi");
		oDao.inserir(marca);
		marca = (Marca) oDao.consultar(codigo, new Marca());
		
		Produto produto = new Produto();
		produto.setDescricao("Poco X3");
		produto.setPreco(1850.5);
		produto.setSaldoEstoque(codigo);
		produto.setMarca(marca);
		oDao.inserir(produto);
		produto = (Produto) oDao.consultar(codigo, new Produto());
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua dos bobos");
		endereco.setNumero(0);
		endereco.setBairro("Centro");
		endereco.setCep("37950-000");
		endereco.setCidade(cidade);
		oDao.inserir(endereco);
		endereco = (Endereco) oDao.consultar(codigo, new Endereco());
		Collection<Endereco> clienteEndereco = new LinkedList<Endereco>();
		clienteEndereco.add(endereco);
		
		Telefone telefone = new Telefone();
		telefone.setTelefone("35 3555 9988");
		oDao.inserir(telefone);
		telefone = (Telefone) oDao.consultar(codigo, new Telefone());
		Collection<Telefone> clienteTelefone = new LinkedList<Telefone>();
		clienteTelefone.add(telefone);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Lucas Matheus Amaral Silva");
		cliente.setCpf("000.000.000-00");
		cliente.setTelefones(clienteTelefone);
		cliente.setEnderecos(clienteEndereco);
		oDao.inserir(cliente);
		cliente = (Cliente) oDao.consultar(codigo, new Cliente());
		
		PedidoProduto pedProduto = new PedidoProduto();
		pedProduto.setProduto(produto);
		pedProduto.setQuantidade(codigo);
		oDao.inserir(pedProduto);
		pedProduto = (PedidoProduto) oDao.consultar(codigo, pedProduto);
		Collection<PedidoProduto> produtos = new LinkedList<PedidoProduto>();
		produtos.add(pedProduto);
		
		Pedido pedido = new Pedido();
		pedido.setCliente(cliente);
		pedido.setData(new Date());
		pedido.setProdutos(produtos);
		oDao.inserir(pedido);
		pedido = (Pedido) oDao.consultar(codigo, new Pedido());
		
		
	}
}
