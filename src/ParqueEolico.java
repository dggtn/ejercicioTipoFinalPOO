public class ParqueEolico extends CentralesProductoras {
    private int cantGeneradores;
    private String tipoEnergia = "viento";
    private int nivelEmision = 0;


    public ParqueEolico(Propietario p,int capMaxima, int cantGeneradores) {
        super(capMaxima,p);
        this.tipoEnergia = "aire";
        this.cantGeneradores = cantGeneradores;

    }



    public int cantEnergiaAaportar(int cantGeneradores) {
        int cant;
        cant =cantGeneradores*13;   //Todos los generadores son iguales y producen 13 de energia
        return cant;
        }

    @Override
    public int nivelEmision(int cantGeneradores) {
        return 0;
    }


    public boolean esContaminante() {
        boolean es=false;
        if (nivelEmision >= 70) {
            es = true;
        }
        return es;
    }


    public boolean esEficiente(){
        boolean es=false;
        if (nivelEmision <=82) {
            es = true;
        }
        return es;
    }

    public void modificarCantGeneradores(int cantGeneradores) {
        this.cantGeneradores = cantGeneradores;
    }
}




