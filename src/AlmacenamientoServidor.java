public class AlmacenamientoServidor {
    protected double capacidadGb;
    protected double TasaTransefeciaMbs;
    protected String proveedor;


    public AlmacenamientoServidor(double capacidadGb, double TasaTransferenciaMbs, String proveedor) {
        this.capacidadGb = capacidadGb;
        this.TasaTransefeciaMbs = TasaTransferenciaMbs;
        this.proveedor = proveedor;
    }


    public void mostrarInformacion() {
        System.out.println("Capacidad en GB: " + capacidadGb + "| Tasa de transferencia : " + TasaTransefeciaMbs + " Mbs/S | Proveedor: " + proveedor);
    }
}
