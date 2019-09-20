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
public class Caminhao implements MeioTransporte{

    @Override
    public Carga obterCarga() {
        return new CargaConvencional();
    }

    @Override
    public String obterPrazo() {
        return "15 -> 30 Dias.";
    }
    
}
