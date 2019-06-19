package ar.edu.unahur.obj2;

import org.joda.time.DateTime;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Ota {

    private DistribuidorDeTrafico distribuidorDeTrafico;

    public Ota(DistribuidorDeTrafico distribuidorDeTrafico) {
        this.distribuidorDeTrafico = distribuidorDeTrafico;
    }

    public List<Vuelo> buscarVuelos(DateTime fecha, String origen, String destino) {
        Adaptador codigoProveedor = distribuidorDeTrafico.proveedor();

        distribuidorDeTrafico.proveedor().buscarVuelos(fecha, origen, destino);

        // TODO Implementar
        return Collections.emptyList();
    }

    public Boleto reservar(Vuelo vuelo, Set<Pasajero> pasajeros) {
        Adaptador codigoProveedor = distribuidorDeTrafico.proveedor();
        distribuidorDeTrafico.proveedor().reservar(vuelo, pasajeros);
        // TODO Implementar
        return null;
    }


}
