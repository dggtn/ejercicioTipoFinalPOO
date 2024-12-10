public class ParqueEolico extends CentralesProductoras {
    private int cantGeneradores;
    private String tipoEnergia = "viento";
    private int nivelEmision = 0;



    public ParqueEolico(Propietario p,int capMaxima, int cantGeneradores) {
        super(capMaxima,p);
        this.tipoEnergia = "aire";
        this.cantGeneradores = cantGeneradores;

    }


    @Override
    public int calcularEnergiaProducida() {
        return cantGeneradores * 13;
    }

    @Override
    public int nivelEmision() {
        return 0;
    }

    public boolean esEficiente(){
        boolean es=false;
        if (nivelEmision <=82) {
            es = true;
        }
        return es;
    }

   public void incrementarGeneradores(){
        cantGeneradores++;
   }

    public void decrementarGeneradores(){
        cantGeneradores--;
        if(cantGeneradores<=0){
            cantGeneradores=1;
        }
    }
}




