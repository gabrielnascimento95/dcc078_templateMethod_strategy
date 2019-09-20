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
public class CargaConvencional extends Carga{

    public CargaConvencional() {
        this.meioTransporte = new Caminhao();
    }

    
    @Override
    public String tipoFrete() {
        return "Rodoviario";
    }
    
}
