public class LogisticaMaritima extends  Logistica {

    @Override
    public TRANSPORTE crearTransporte(String placa){
        return new Barco(placa);
    }
}
