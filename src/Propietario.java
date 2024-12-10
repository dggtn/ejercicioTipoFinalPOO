import java.util.Objects;

public class Propietario {
    private int cuit;
    private String nombre;
    private int cantCentrales;

    public Propietario(int cuit, String nombre, int cantCentrales) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.cantCentrales = cantCentrales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propietario that = (Propietario) o;
        return cuit == that.cuit;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cuit);
    }

    @Override
    public String toString() {
        return "Propietario[CUIT:" + this.cuit + "]";
    }
}
