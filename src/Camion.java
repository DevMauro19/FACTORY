public class Camion implements TRANSPORTE{

    private String placa;

    public Camion(String placa){
        this.placa=placa;
    }

    @Override
    public void entregar(String destino) {
        System.out.println("EL camion entrega en el destino:"+destino+" con placa: "+placa);
    }

}
