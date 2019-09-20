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
public class Navio implements MeioTransporte{

    @Override
    public Carga obterCarga() {
        return new CargaTranscontinental();
    }

    @Override
    public String obterPrazo() {
        return "150 -> 360 Dias.";
    }
}