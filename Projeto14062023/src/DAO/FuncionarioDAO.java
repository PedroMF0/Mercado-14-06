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
import modelo.FuncionarioVO;
import modelo.ProdutoVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author 182210051
 */
public class FuncionarioDAO {
    public void cadastrarFuncionario(FuncionarioVO fVO)throws SQLException{
        //Buscar a conexão como banco de dados
        Connection con = ConexaoBanco.getConexao();
        
        //criar objeto capaz de executar as instruções sql no banco de dados
        Statement stat = con.createStatement();
        
        try{
            //String que recebe a instrução SQL
            String sql;

            
            //Montar a instrução INSERT
               sql = "insert into funcionario(idfuncionario , nomefunc , datanasc , cpffunc , cidade , estado, funcao , salario)"
                    + "values (null, '" + fVO.getNomefunc() + "', '"
                                       + fVO.getDatanasc() + "' , '"
                                       + fVO.getCpffunc() + "' , '"
                                       + fVO.getCidade() + "' , '"
                                       + fVO.getEstado() + "' , '"
                                       + fVO.getFuncao() + "' , '"
                                       + fVO.getSalario() +"') ";
                   
            
          stat.execute(sql);
            
        }catch (SQLException e){
            throw new SQLException("Erro ao cadastrar Funcionario!");
        }finally{
            con.close();
            stat.close();
        }
      
       }
    
     public ArrayList<FuncionarioVO> buscarFuncionario() throws SQLException{
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "select * from funcionario";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<FuncionarioVO> func = new ArrayList<>();
            while(rs.next()){
                FuncionarioVO fVO = new FuncionarioVO();
                fVO.setIdfuncionario(rs.getInt("idfuncionario"));
                fVO.setNomefunc(rs.getString("nomefunc"));
                fVO.setDatanasc(rs.getString("datanasc"));
                fVO.setCpffunc(rs.getString("cpffunc"));
                fVO.setCidade(rs.getString("cidade"));
                fVO.setEstado(rs.getString("estado"));
                fVO.setFuncao(rs.getString("funcao"));
                fVO.setSalario(rs.getString("salario"));
                func.add(fVO);
            }//fecha o while
            return func;
        }catch(SQLException e){
            throw new SQLException("Erro ao buscar funcionário! " + e.getMessage() );
        }finally{
            con.close();
            stat.close();
        }//fim finally
        
    }//fecha o método buscarProduto
     
    public void deletarFuncionario(int idfuncionario) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql ="delete from funcionario where idfuncionario = " + idfuncionario;
            stat.execute(sql);
            
        }catch(SQLException se){
            throw new SQLException("Erro ao deletar funcionário! " + se.getMessage());
        }finally{
            con.close();
            stat.close();
        }//fim finally
    }
    
    public ArrayList<FuncionarioVO> filtrarFuncionario(String query) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "select * from funcionario " + query;
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<FuncionarioVO> func = new ArrayList<>();
            while(rs.next() ){
                FuncionarioVO fVO = new FuncionarioVO();
                fVO.setIdfuncionario(rs.getInt("idfuncionario"));
                fVO.setNomefunc(rs.getString("nomefunc"));
                fVO.setDatanasc(rs.getString("datanasc"));
                fVO.setCpffunc(rs.getString("cpffunc"));
                fVO.setCidade(rs.getString("cidade"));
                fVO.setEstado(rs.getString("estado"));
                fVO.setFuncao(rs.getString("funcao"));
                fVO.setSalario(rs.getString("salario"));
                
                func.add(fVO);
            }//fecha o laço while
            
            return func;
        }catch(SQLException se){
            throw new SQLException("Erro ao filtrar Funcionário! " + se.getMessage() );
        }finally{
            con.close();
            stat.close();
        }
   }
    
    
    public void alterarFuncionario(FuncionarioVO fVO)throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "update funcionario set "
                    + "nomefunc = ' " + fVO.getNomefunc() + " ', "
                    + "datanasc = '" + fVO.getDatanasc() + "' , "
                    + "cpffunc = '" + fVO.getCpffunc() + "' , "
                    + "cidade = '"+ fVO.getCidade()+"', "
                    + "estado = '"+ fVO.getEstado()+"', "
                    + "funcao = '"+ fVO.getFuncao()+"', "
                    + "salario = "+ fVO.getSalario()+" "
                    + "where idfuncionario = " + fVO.getIdfuncionario() + " ";
            stat.executeUpdate(sql);
        }catch(SQLException se){
            throw new SQLException("Erro ao alterar funcionario! " + se.getMessage() );
        }finally{
            con.close();
            stat.close();
        }//fim do finally
        
    }//fecha o método alterarProduto
    
    
}
