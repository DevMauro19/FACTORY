public class LogisticaTerrestre extends Logistica{
    @Override
    public TRANSPORTE crearTransporte(String placa){
        return new Camion(placa);
    }
}
