public class Barco implements TRANSPORTE {
    private String placa;

    public Barco(String placa){
        this.placa=placa;
    }

    @Override
    public void entregar(String destino) {
        System.out.println("EL barco entrega en el destino:"+destino+ " con placa: "+placa);

    }

}
