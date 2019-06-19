package ar.edu.unahur.obj2;

import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public interface Adaptador {

    List<Vuelo> buscarVuelos(DateTime fecha, String origen, String destino);
    Boleto reservar(Vuelo vuelo, Set<Pasajero> pasajeros);
}
