/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod_strategy;

/**
 *
 * @author ice
 */
public abstract class Carga {
    protected MeioTransporte meioTransporte;
    private String descricao;
    private String origem;
    private String destino;
    
    public abstract String tipoFrete();
    
    public String descricao(){
         return "Carga: " + getDescricao()+ "\nOrigem: " + getOrigem() + "\nDestino: " + getDestino();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public MeioTransporte getMeioTransporte() {
        return meioTransporte;
    }

    public void setMeioTransporte(MeioTransporte meioTransporte) {
        this.meioTransporte = meioTransporte;
    }
    
    
}
