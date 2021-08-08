package controller;

import model.ModelProduto;
import DAO.DAOProduto;
import java.util.ArrayList;

/**
*
* @author SONHO DE MENINA
*/
public class ControllerProduto {

    private DAOProduto daoProduto = new DAOProduto();

    /**
    * grava Produto
    * @param pModelProduto
    * @return int
    */
    public int salvarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.salvarProdutoDAO(pModelProduto);
    }

    /**
    * recupera Produto
    * @param pIdProduto
    * @return ModelProduto
    */
    public ModelProduto getProdutoController(int pIdProduto){
        return this.daoProduto.getProdutoDAO(pIdProduto);
    }
      /**
    * recupera Produto
    * @param pNomeProduto
    * @return ModelProduto
    */
    public ModelProduto getProdutoController(String pNomeProduto){
        return this.daoProduto.getProdutoDAO(pNomeProduto);
    }


    /**
    * recupera uma lista deProduto
    * @param pIdProduto
    * @return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoController(){
        return this.daoProduto.getListaProdutoDAO();
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * @return boolean
    */
    public boolean atualizarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.atualizarProdutoDAO(pModelProduto);
    }

    /**
    * exclui Produto
    * @param pIdProduto
    * @return boolean
    */
    public boolean excluirProdutoController(int pIdProduto){
        return this.daoProduto.excluirProdutoDAO(pIdProduto);
    }
}