package com.market.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.market.Produto;

public class ProdutoDAOImpl implements ProdutoDAO {

	private Connection con;
	
	@Override
	public void adicionar(Produto p) {
		con = ConnectionBuilder.getInstance().getConnection();
		try {
			String sql = "INSERT INTO produto (preco, peso, nome)"
					+ "VALUES (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setFloat(1, p.getPreco());
			stmt.setFloat(2, p.getPeso());
			stmt.setString(3, p.getNome());
			stmt.executeQuery();
			con.close();
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void atualizar(long id, Produto p) {
		con = ConnectionBuilder.getInstance().getConnection();
		try {
			String sql = "UPDATE produto SET preco=?, peso=?, "
				+ "nome=? WHERE id = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setFloat(1, p.getPreco());
			stmt.setFloat(2, p.getPeso());
			stmt.setString(3, p.getNome());
			stmt.setLong(4, id);
			stmt.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void remover(long id) {
		con = ConnectionBuilder.getInstance().getConnection();
		try {
			String sql = "DELETE FROM produto WHERE id = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setLong(1, id);
			stmt.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
