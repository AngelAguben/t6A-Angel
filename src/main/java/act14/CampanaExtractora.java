/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act14;

/**
 *
 * @author Ángel
 */
public class CampanaExtractora extends Electrodomestico {

    private int decibelios;

    public CampanaExtractora(int decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        this.decibelios = decibelios;
    }

    public CampanaExtractora(double consumo, String modelo) {
        super(consumo, modelo);
    }

    public int getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(int decibelios) {
        this.decibelios = decibelios;
    }

    @Override
    public String toString() {
        return super.toString() + "CampanaExtractora{" + "decibelios=" + decibelios + '}';
    }

}
