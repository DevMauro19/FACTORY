public class Main {

    public static void main(String[]args){
        Logistica zona_transporte=new LogisticaTerrestre();

        zona_transporte.planEntrega("Polombia","ABC123");

        Logistica zona_transporteDos=new LogisticaMaritima();
        zona_transporteDos.planEntrega("Japon","KPT999");

    }
}
