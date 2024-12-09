import java.util.ArrayList;
import java.util.List;

public class CentralNuclear extends CentralesProductoras {
    private List<ReactorNuclear> listaReactoresNucleares;
    private ReactorNuclear reactorNuclear;
    private int cantReactoresNucleares = listaReactoresNucleares.size();
    private List<CentralNuclear> centralesContaminantes;




    public CentralNuclear(Propietario p,int capMax) {
        super(capMax,p);
        this.listaReactoresNucleares = new ArrayList<>();
        this.centralesContaminantes = new ArrayList<>();
    }

    public void agregarReactor(ReactorNuclear r) {
        if (listaReactoresNucleares.size() <= 5) {
            listaReactoresNucleares.add(r);
        } else {
            System.out.println("Debe ser hasta maximo 5 y minimo 1");
        }

    }

    public int cantEnergiaAaportar() {
        int sumatoria = 0;
        for (ReactorNuclear r : listaReactoresNucleares) {
            sumatoria += r.getAporte();
            int cantEnerigiaAaportar = sumatoria - 5;

        }
        return cantEnergiaAaportar;
    }

    @Override
    public int nivelEmision(int cantReactoresNucleares) {
        int cantEnergiaAportada = 41 * cantReactoresNucleares;
        return cantEnergiaAportada;
    }


    public boolean esContaminante() {
        boolean es=false;
        if (nivelEmision >= 70) {
            centralesContaminantes.add(this);
            es = true;
        }
        return es;
    }

@Override
    public boolean esEficiente(){
        boolean es=false;
        if (nivelEmision <=82) {
            es = true;
        }
        return es;
    }


}
