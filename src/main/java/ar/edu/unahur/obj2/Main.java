package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.proveedores.Amadeus;
import ar.edu.unahur.obj2.proveedores.Sabre;
import ar.edu.unahur.obj2.proveedores.Worldspan;
import org.joda.time.DateTime;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Amadeus amadeus = new Amadeus();
        Sabre sabre = new Sabre();
        Worldspan worldspan = new Worldspan();
        AmadeusAdapter amadeusAdapter = new AmadeusAdapter(amadeus);
        SabreAdapter sabreAdapter = new SabreAdapter(sabre);
        WorldspanAdapter worldspanAdapter = new WorldspanAdapter(worldspan);
        /*   Adaptador adaptadores = Stream.of(sabreAdapter,worldspanAdapter, amadeusAdapter).collect(Collectors.toList());
        DistribuidorDeTrafico distribuidorDeTrafico = new DistribuidorDeTrafico(Stream.of(amadeusAdapter,sabreAdapter,worldspanAdapter).collect(Collectors.toList());
        Ota ota = new Ota(distribuidorDeTrafico);

        DistribuidorDeTrafico distribuidorDeTrafico = new DistribuidorDeTrafico();
        Ota ota = new Ota(distribuidorDeTrafico);
        DateTime fecha = new DateTime("2019-12-13");
*/


    }

}
