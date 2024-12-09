import java.util.List;

public class Ciudad {
    private String nombre;
    private List<CentralesProductoras> listaDeCentrales;
    private List<Consumidor> listaDeConsumidores;
    private CentralesProductoras c;


    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCentral(CentralesProductoras c) {
        listaDeCentrales.add(c);

    }

    public void agregarConsumidor(Consumidor c) {
        listaDeConsumidores.add(c);

    }

    public int consumoTotalCiudad() {
        int sumatoriaConsumoTotal = 0;
        for (Consumidor c : listaDeConsumidores) {

            sumatoriaConsumoTotal += c.getCantConsumEnergia();
        }
        return sumatoriaConsumoTotal;

    }

    public boolean esEficiente() {
        boolean es = false;
        for (CentralesProductoras c : listaDeCentrales) {
            if (!c.esEficiente()) {
                es = false;
            } else {
                es = true;
            }

        }
        return es;
    }

    public boolean esSustentable() {
        boolean es = false;
        int sumatoriaProduccionTotal = 0;
        int sumatoriaConsumoTotal = 0;
        for (CentralesProductoras c : listaDeCentrales) {
            sumatoriaProduccionTotal += c.cantEnergiaAaportar;
        }

        for (Consumidor c : listaDeConsumidores) {
            sumatoriaConsumoTotal += c.getCantConsumEnergia();
        }

        if (sumatoriaProduccionTotal > sumatoriaConsumoTotal) {
            es = true;

        }


        return es;
    }

    public void esPeligrosa() {
        boolean exigida = false;
        for (CentralesProductoras c : listaDeCentrales) {
            exigida = true;
        }
    }
}
