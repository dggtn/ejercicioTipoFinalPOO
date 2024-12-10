import java.util.ArrayList;
import java.util.List;

public class CentralNuclear extends CentralesProductoras {
    private List<ReactorNuclear> listaReactoresNucleares;

    public CentralNuclear(int capMaxima, Propietario propietario) {
        super(capMaxima, propietario);
        this.listaReactoresNucleares =new ArrayList<>();
    }


    public void agregarReactor(ReactorNuclear r) {
        if (listaReactoresNucleares.size() <= 5) {
            listaReactoresNucleares.add(r);
        } else {
            System.out.println("Debe ser hasta maximo 5 y minimo 1");
        }


    }

    @Override
    public int calcularEnergiaProducida() {
        int sumatoria = 0;
        for (ReactorNuclear r : listaReactoresNucleares) {
            sumatoria += r.getAporte();
        }
        return sumatoria - 5;
    }

    @Override
    public int nivelEmision() {
        return 41 * listaReactoresNucleares.size();
    }

}
