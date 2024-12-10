import java.util.HashSet;

public abstract class CentralesProductoras {
    protected int cantEnergiaAaportar;
    protected int capMaxima;
    protected Propietario propietario;
    protected HashSet<Propietario> listaDeTodosLosPropietarios;
    protected Ciudad ciudad ;
    protected int produccionTotal;

    public CentralesProductoras(int capMaxima, Propietario propietario) {
        this.capMaxima = capMaxima;
        this.propietario = propietario;
        this.listaDeTodosLosPropietarios = new HashSet<>();
    }

    public boolean esContaminante(){
       return nivelEmision() >= 70;

    }


    public boolean estaExigida(){
        return calcularEnergiaProducida() >= this.capMaxima;
    }

    public void mostrarPropietarios(){
        System.out.println(listaDeTodosLosPropietarios);

    }
    public abstract int nivelEmision();
    public abstract int calcularEnergiaProducida();


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
}
