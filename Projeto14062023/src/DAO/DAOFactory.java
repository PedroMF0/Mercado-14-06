/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author 182210051
 */
public class DAOFactory {
    private static ProdutoDAO produtoDAO = new ProdutoDAO();
    
    public static ProdutoDAO getProdutoDAO(){
        return produtoDAO;
    }
 
    private static FuncionarioDAO funcionarioDAO = new FuncionarioDAO(); 
    
     public static FuncionarioDAO getFuncionarioDAO(){
        return funcionarioDAO;
     }
    
}
