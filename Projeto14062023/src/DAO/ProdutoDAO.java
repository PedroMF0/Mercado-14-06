/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.ProdutoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author 182210051
 */
public class ProdutoDAO {
    
       public void cadastrarProduto(ProdutoVO pVO)throws SQLException{
        //Buscar a conexão como banco de dados
        Connection con = ConexaoBanco.getConexao();
        
        //criar objeto capaz de executar as instruções sql no banco de dados
        Statement stat = con.createStatement();
        
        try{
            //String que recebe a instrução SQL
            String sql;
            
            //Montar a instrução INSERT
            sql = "insert into produto(idproduto, nomepro, quantidade, valorcusto, tipoproduto)"
                    + "values(null, ' "+ pVO.getNomepro() +"', "
                    + pVO.getQuantidade()+ ", "
                    + pVO.getValorcusto() + ", '"
                    + pVO.getTipoproduto() +  "')";
            //Executar o SQL
            stat.execute(sql);
            
        }catch (SQLException e){
            throw new SQLException("Erro ao cadastrar produto!");
        }finally{
            con.close();
            stat.close();
        }
        
       }
}
