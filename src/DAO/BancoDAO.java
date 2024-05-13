/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import model.Investidor;
/**
 *
 * @author beatr
 */
public class BancoDAO {
    private Connection conn;

    public BancoDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Investidor investidor) throws SQLException{
        String sql = "insert into aluno (nome, usuario, senha) values('" +
                aluno.getNome() + "', '" + aluno.getUsuario() + "', '" +
                aluno.getSenha() + "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
        
    }
    
    
    
}
