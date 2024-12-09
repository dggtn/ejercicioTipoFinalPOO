import java.util.HashSet;

public abstract class CentralesProductoras {
    protected int cantEnergiaAaportar;
    protected int capMaxima;
    protected int nivelEmision;
    protected Propietario propietario;
    protected HashSet<Propietario> listaDeTodosLosPropietarios;
    protected Ciudad ciudad ;
    protected int produccionTotal;

    public CentralesProductoras(int capMaxima, Propietario propietario) {
        this.capMaxima = capMaxima;
        this.propietario = propietario;
        this.listaDeTodosLosPropietarios = new HashSet<>();
    }


    public int produccionTotal(Ciudad c){
        return cantEnergiaAaportar;
    }

    public boolean estaExigida(){
        boolean exigida=false;
        if(cantEnergiaAaportar>=capMaxima){
            exigida = true;
        }
        return exigida;
    }

    public void mostrarPropietarios(){
        System.out.println(listaDeTodosLosPropietarios);

    }
    public abstract int nivelEmision(int cantGeneradores);


    @Override
    public String toString() {
        return "CentralesProductoras{" +
                "propietario=" + propietario +
                '}';
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void asignarCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    public abstract boolean esEficiente();
}
