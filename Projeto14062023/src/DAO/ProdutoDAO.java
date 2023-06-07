/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
            sql = "insert into produto(idproduto, nomepro, quantidade, valorcusto, datavalidade, tipoproduto)"
                    + "values(null, ' "+ pVO.getNomepro() +"', "
                    + pVO.getQuantidade()+ ", "
                    + pVO.getValorcusto() + ", '"
                    + pVO.getDatavalidade()+ "', '"
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

    
  public ArrayList<ProdutoVO> buscarProduto() throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "select * from produto";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ProdutoVO> pro = new ArrayList<>();
            while(rs.next()){
                ProdutoVO pVO = new ProdutoVO();
                pVO.setIdproduto(rs.getInt("idproduto"));
                pVO.setNomepro(rs.getString("nomepro"));
                pVO.setQuantidade(rs.getInt("quantidade"));
                pVO.setValorcusto(rs.getDouble("valorcusto"));
                pVO.setDatavalidade(rs.getString("datavalidade"));
                pVO.setTipoproduto(rs.getString("tipoproduto"));
                pro.add(pVO);
            }//fecha o while
            return pro;
        }catch(SQLException e){
            throw new SQLException("Erro ao buscar produto! " + e.getMessage() );
        }finally{
            con.close();
            stat.close();
        }//fim finally
        
    }//fecha o método buscarProduto
  
  
 public void deletarProduto(int idproduto) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql ="delete from produto where idproduto = " + idproduto;
            stat.execute(sql);
            
        }catch(SQLException se){
            throw new SQLException("Erro ao deletar produto! " + se.getMessage());
        }finally{
            con.close();
            stat.close();
        }//fim finally
        
    }//fecha o método deletarProduto
   
    public ArrayList<ProdutoVO> filtrarProduto(String query) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "select * from produto " + query;
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ProdutoVO> pro = new ArrayList<>();
            while(rs.next() ){
                ProdutoVO pVO = new ProdutoVO();
                pVO.setIdproduto(rs.getInt("idProduto"));
                pVO.setNomepro(rs.getString("nomePro"));
                pVO.setQuantidade(rs.getInt("quantidade"));
                pVO.setValorcusto(rs.getDouble("valorCusto"));
                pVO.setDatavalidade(rs.getString("datavalidade"));
               
                pVO.setTipoproduto(rs.getString("tipoproduto"));
                
                pro.add(pVO);
            }//fecha o laço while
            
            return pro;
        }catch(SQLException se){
            throw new SQLException("Erro ao filtrar produto! " + se.getMessage() );
        }finally{
            con.close();
            stat.close();
        }
   }
    
   
   
 public void alterarProduto(ProdutoVO pVO)throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "update produto set "
                    + "nomepro = ' " + pVO.getNomepro() + " ', "
                    + "quantidade = " + pVO.getQuantidade() + " , "
                    + "valorcusto = " + pVO.getValorcusto() + " , "
                    + "datavalidade = '"+ pVO.getDatavalidade()+"',"
                    + "tipoproduto = '"+ pVO.getTipoproduto()+"' "
                    + "where idproduto = " + pVO.getIdproduto() + " ";
            stat.executeUpdate(sql);
        }catch(SQLException se){
            throw new SQLException("Erro ao alterar produto! " + se.getMessage() );
        }finally{
            con.close();
            stat.close();
        }//fim do finally
        
    }//fecha o método alterarProduto
}
