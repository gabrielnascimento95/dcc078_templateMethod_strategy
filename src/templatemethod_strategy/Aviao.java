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
public class Aviao implements MeioTransporte{

    @Override
    public Carga obterCarga() {
        return new CargaExpressa();
    }

    @Override
    public String obterPrazo() {
        return "1 -> 5 Dias.";
    }
    
}