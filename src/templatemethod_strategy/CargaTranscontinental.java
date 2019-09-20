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
public class CargaTranscontinental extends Carga{

    @Override
    public String tipoFrete() {
        return "Marítimo";
    }
    
}
