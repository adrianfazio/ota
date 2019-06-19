package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.proveedores.Worldspan;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public class WorldspanAdapter implements Adaptador {
    private Worldspan worldspan;

    public WorldspanAdapter(Worldspan worldspan) {
        this.worldspan = worldspan;
    }

    @Override
    public List<Vuelo> buscarVuelos(DateTime fecha, String origen, String destino) {
        return null;
    }

    @Override
    public Boleto reservar(Vuelo vuelo, Set<Pasajero> pasajeros) {
        return null;
    }
}
