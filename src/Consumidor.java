public class Consumidor {
    private String nombre;
    private int CantConsumEnergia;
    private Ciudad ciudad ;

    public Consumidor(String nombre, Ciudad ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public void modificarCantConsumEnergia(int cantConsumEnergia) {
        CantConsumEnergia = cantConsumEnergia;
    }

    public int getCantConsumEnergia() {
        return CantConsumEnergia;
    }
}
