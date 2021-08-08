package model;
/**
*
* @author SONHO DE MENINA
*/
public class ModelProduto {

    private int IdProduto;
    private String proNome;
    private double proValor;
    private int proEstoque;

    /**
    * Construtor
    */
    public ModelProduto(){}

    /**
    * seta o valor de IdProduto
    * @param pIdProduto
    */
    public void setIdProduto(int pIdProduto){
        this.IdProduto = pIdProduto;
    }
    /**
    * @return pk_IdProduto
    */
    public int getIdProduto(){
        return this.IdProduto;
    }

    /**
    * seta o valor de proNome
    * @param pProNome
    */
    public void setProNome(String pProNome){
        this.proNome = pProNome;
    }
    /**
    * @return proNome
    */
    public String getProNome(){
        return this.proNome;
    }

    /**
    * seta o valor de proValor
    * @param pProValor
    */
    public void setProValor(double pProValor){
        this.proValor = pProValor;
    }
    /**
    * @return proValor
    */
    public double getProValor(){
        return this.proValor;
    }

    /**
    * seta o valor de proEstoque
    * @param pProEstoque
    */
    public void setProEstoque(int pProEstoque){
        this.proEstoque = pProEstoque;
    }
    /**
    * @return proEstoque
    */
    public int getProEstoque(){
        return this.proEstoque;
    }

    @Override
    public String toString(){
        return "ModelProduto {" + "::IdProduto = " + this.IdProduto + "::proNome = " + this.proNome + "::proValor = " + this.proValor + "::proEstoque = " + this.proEstoque +  "}";
    }
}