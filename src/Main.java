import java.util.List;
import java.util.PropertyPermission;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        main.probarConsumoTotal();
        main.sinCentralesContaminantes();
        main.crearCentralContaminante();
        main.crearSiEsoNoEsEficiente();
    }
    private void crearSiEsoNoEsEficiente(){
        Propietario propietario = new Propietario(1, "Pepito", 0);
        Ciudad buenosAires = new Ciudad("Buenos Aires");
        CentralNuclear central = new CentralNuclear(100,propietario);
        ReactorNuclear x = new ReactorNuclear(1);

        buenosAires.agregarCentral(central);
        CentralNuclear c = new CentralNuclear(145,propietario);
        ReactorNuclear re = new ReactorNuclear(150);
        c.agregarReactor(new ReactorNuclear(85));
        c.agregarReactor(re);
        buenosAires.agregarCentral(c);
        central.agregarReactor(x);
        System.out.println("Es buenos aires eficiente: "+buenosAires.esEficiente());

    }
    private void crearCentralContaminante(){
        Propietario propietario = new Propietario(1, "Pepito", 0);
        CentralNuclear central = new CentralNuclear(100,propietario);
        ReactorNuclear r = new ReactorNuclear(10);
        ReactorNuclear x = new ReactorNuclear(1);
        ReactorNuclear y = new ReactorNuclear(10);
        ReactorNuclear z = new ReactorNuclear(1);

        central.agregarReactor(r);
        central.agregarReactor(x);
        central.agregarReactor(y);
        central.agregarReactor(z);

        System.out.println(central.esContaminante());

        Ciudad buenosAires = new Ciudad("Buenos Aires");
        buenosAires.agregarCentral(central);
        List<CentralesProductoras> centralesContaminantes = buenosAires.obtnenerCentralesContaminantes();
        System.out.println((centralesContaminantes.size()));
    }

    private void sinCentralesContaminantes() {
        Propietario propietario = new Propietario(1, "Pepito", 0);
        CentralesProductoras parqueEolico = new ParqueEolico(propietario, 100, 1);
        Ciudad buenosAires = new Ciudad("Buenos Aires");
        buenosAires.agregarCentral(parqueEolico);
        List<CentralesProductoras> centralesContaminantes = buenosAires.obtnenerCentralesContaminantes();
        System.out.println((centralesContaminantes.size()));
    }

    //PUNTO A
    private void probarConsumoTotal() {
        Consumidor uade = new Consumidor("UADE");
        uade.modificarCantConsumEnergia(200);

        Consumidor casa = new Consumidor("Casa");
        casa.modificarCantConsumEnergia(100);

        Ciudad buenosAires = new Ciudad("Buenos Aires");
        buenosAires.agregarConsumidor(uade);
        buenosAires.agregarConsumidor(casa);


        System.out.println(buenosAires.consumoTotal());
    }

};
