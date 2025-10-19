public abstract class Logistica {

    public abstract TRANSPORTE crearTransporte(String placa);

    public void planEntrega(String destino, String placa){
        TRANSPORTE transporte=crearTransporte(placa);
        transporte.entregar(destino);
    }
}
