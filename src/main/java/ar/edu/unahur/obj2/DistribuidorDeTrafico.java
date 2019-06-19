package ar.edu.unahur.obj2;

import java.util.List;
import java.util.Random;

public class DistribuidorDeTrafico {
    private Random random = new Random();
    private List<Adaptador> proveedores;

    public DistribuidorDeTrafico(List<Adaptador> proveedores) {
        this.proveedores = proveedores;
    }

    public Adaptador proveedor() {
        return proveedores.get(random.nextInt(proveedores.size()));
    }
}
