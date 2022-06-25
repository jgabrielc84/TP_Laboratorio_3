package ar.edu.cuvl.model;

import ar.edu.cuvl.interfaces.TipoReparacion;
import ar.edu.cuvl.model.type.Reparacion;

public class AbstractFactoryTipoReparacion {

    private FactoryTipoReparacionElectricidad factoryTipoReparacionElectricidad = new FactoryTipoReparacionElectricidad();
    private FactoryTipoReparacionGas factoryTipoReparacionGas = new FactoryTipoReparacionGas();

    public void crearTipoReparacion(Reparacion reparacion, int complejidad){

        switch (reparacion){
            case GAS:
                if(complejidad > 0 && complejidad < 3){
                    factoryTipoReparacionGas.crearSimple();
                }
                else if(complejidad >= 3 && complejidad <=6){
                    factoryTipoReparacionGas.crearMedia();
                }
                else if(complejidad > 6 && complejidad < 9){
                    factoryTipoReparacionGas.crearCompleja();
                }
                break;
            case ELECTRICIDAD:
                if(complejidad > 0 && complejidad < 3){
                    factoryTipoReparacionElectricidad.crearSimple();
                }
                else if(complejidad >= 3 && complejidad <=6){
                    factoryTipoReparacionElectricidad.crearMedia();
                }
                else if(complejidad > 6 && complejidad < 9){
                    factoryTipoReparacionElectricidad.crearCompleja();
                }
                break;
            default:
//                TODO throws Exception;
        }

    }
}
