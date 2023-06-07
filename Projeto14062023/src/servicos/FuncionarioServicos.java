/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import DAO.DAOFactory;
import DAO.FuncionarioDAO;
import DAO.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.FuncionarioVO;
import modelo.ProdutoVO;

/**
 *
 * @author 182210051
 */
public class FuncionarioServicos {
    
       public void cadastrarFuncionario(FuncionarioVO fVO) throws SQLException{
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        fDAO.cadastrarFuncionario(fVO);        
    }
    
        public ArrayList<FuncionarioVO> buscarFuncionario() throws SQLException{
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        
        return fDAO.buscarFuncionario();
    }//fecha o método buscarProduto
        
        public void deletarFuncionario(int idfuncionario) throws SQLException{
        FuncionarioDAO  fDAO= DAOFactory.getFuncionarioDAO();
        fDAO.deletarFuncionario(idfuncionario);
    }//fecha o método deletarProduto
        
        public ArrayList<FuncionarioVO> filtrarFuncionario(String query) throws SQLException{
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        return fDAO.filtrarFuncionario(query);
    }//fecha o método
        
        public void alterarFuncionario(FuncionarioVO fVO) throws SQLException{
        FuncionarioDAO fDAO = DAOFactory.getFuncionarioDAO();
        fDAO.alterarFuncionario(fVO);
    }//fecha o método alterarProduto
}
