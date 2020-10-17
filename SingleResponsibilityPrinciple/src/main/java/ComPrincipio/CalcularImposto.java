/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComPrincipio;

/**
 *
 * @author eduar
 */
public class CalcularImposto {
    private double taxa;
    private Produto produto;

    public CalcularImposto(double taxa, Produto produto) {
        this.taxa = taxa;
        this.produto = produto;
    }
    
    //Methods
    public double calcularICMS(){
       double icms; 
       icms = (this.produto.getValor()*this.getTaxa());
       return icms;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
