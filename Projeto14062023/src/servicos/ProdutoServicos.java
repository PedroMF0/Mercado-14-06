/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import DAO.DAOFactory;
import DAO.ProdutoDAO;
import java.sql.SQLException;
import modelo.ProdutoVO;

/**
 *
 * @author 182210051
 */
public class ProdutoServicos {
    public void cadastrarProduto(ProdutoVO pVO) throws SQLException{
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.cadastrarProduto(pVO);        
    }
    
}
