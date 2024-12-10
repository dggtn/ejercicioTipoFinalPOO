import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ciudad {
    private String nombre;
    private List<CentralesProductoras> listaDeCentrales;
    private List<Consumidor> listaDeConsumidores;


    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.listaDeCentrales = new ArrayList<>();
        this.listaDeConsumidores = new ArrayList<>();
    }

    public boolean esEficiente() {
        boolean esEficiente = true;
        for(CentralesProductoras central: listaDeCentrales) {
            if (central.nivelEmision() >= 82) {
                esEficiente = false;
            }
        }
        return esEficiente;
    }

    public List<CentralesProductoras> obtnenerCentralesContaminantes() {
        List<CentralesProductoras> contaminantes = new ArrayList<>();
        for(CentralesProductoras central: listaDeCentrales) {
            if (central.nivelEmision() >= 70) {
                contaminantes.add(central);
            }
        }
        return contaminantes;
    }

    public int consumoTotal() {
        int consumoTotal = 0;
        for (Consumidor consumidor: listaDeConsumidores) {
            consumoTotal += consumidor.getCantConsumEnergia();
        }
        return consumoTotal;
    }

    public Set<Propietario> obtenerPropietarios() {
        Set<Propietario> propietarios = new HashSet<>();
        for (CentralesProductoras central: listaDeCentrales) {
            propietarios.add(central.propietario);
        }
        return propietarios;
    }

    public boolean esSustentable() {
        int consumoTotal = this.consumoTotal();
        int produccionTotal = this.produccionTotal();

        return consumoTotal < produccionTotal;
    }

    private int produccionTotal() {
        int produccionTotal = 0;
        for (CentralesProductoras central: listaDeCentrales) {
            produccionTotal += central.calcularEnergiaProducida();
        }
        return produccionTotal;
    }

    public boolean esPotencialmentePeligrosa() {
        boolean esPotencialmentePeligrosa = false;
        for(CentralesProductoras centrales: listaDeCentrales) {
            if (centrales.estaExigida()) {
                esPotencialmentePeligrosa = true;
            }
        }

        return esPotencialmentePeligrosa;
    }

    public void agregarConsumidor(Consumidor consumidor) {
        this.listaDeConsumidores.add(consumidor);
    }

    public void agregarCentral(CentralesProductoras central) {
        this.listaDeCentrales.add(central);
    }
}