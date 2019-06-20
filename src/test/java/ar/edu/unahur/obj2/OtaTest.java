package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.proveedores.Amadeus;
import ar.edu.unahur.obj2.proveedores.Sabre;
import ar.edu.unahur.obj2.proveedores.Worldspan;
import org.joda.time.DateTime;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class OtaTest {
    private Amadeus amadeus;
    private Sabre sabre;
    private Worldspan worldspan;
    private Ota ota;
    private AmadeusAdapter amadeusAdapter;
    private SabreAdapter sabreAdapter;
    private WorldspanAdapter worldspanAdapter;
    private List<Adaptador> adaptadores;
    private DistribuidorDeTrafico distribuidorDeTrafico;


    @BeforeTest
    private void setup(){
        amadeus = new Amadeus();
        sabre = new Sabre();
        worldspan = new Worldspan();
        amadeusAdapter = new AmadeusAdapter(amadeus);
        sabreAdapter = new SabreAdapter(sabre);
        worldspanAdapter = new WorldspanAdapter(worldspan);
        adaptadores = Stream.of(sabreAdapter,worldspanAdapter, amadeusAdapter).collect(Collectors.toList());
        distribuidorDeTrafico = new DistribuidorDeTrafico(adaptadores);
        ota = new Ota(distribuidorDeTrafico);
    }

    @org.testng.annotations.Test
    public void testBuscarVuelos() {
        DistribuidorDeTrafico distribuidorDeTrafico = new DistribuidorDeTrafico(Stream.of(amadeusAdapter,sabreAdapter,worldspanAdapter).collect(Collectors.toList()));
        Ota ota = new Ota(distribuidorDeTrafico);
        DateTime fecha = new DateTime("2019-12-13");

        List<Vuelo> vuelos = ota.buscarVuelos(fecha, "BUE", "MIA");
        Assert.assertEquals(ota.buscarVuelos(fecha , "BUE","MIA"), vuelos);
    }

    @org.testng.annotations.Test
    public void testReservar() {
        DistribuidorDeTrafico distribuidorDeTrafico = new DistribuidorDeTrafico(Stream.of(amadeusAdapter,sabreAdapter,worldspanAdapter).collect(Collectors.toList()));
        Ota ota = new Ota(distribuidorDeTrafico);

        DateTime fecha = new DateTime("2019-12-13");


        List<Vuelo> vuelos = ota.buscarVuelos(fecha, "BUE", "MIA");

        Vuelo elegido =  vuelos.get(0);
        Set<Pasajero> pasajeros = Stream.of(new Pasajero("Juan", "Pérez", 40)).collect(Collectors.toSet());

        Boleto boleto = ota.reservar(elegido, pasajeros );

        assertEquals(boleto.getVuelo(), elegido);


    }
}