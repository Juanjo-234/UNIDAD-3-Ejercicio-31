public class ArregloSan extends AlmacenamientoServidor{
    private String protocoloRed;
    private int controladorasRedundantes;


public ArregloSan(double capacidadGb, double TasaTransferenciaMbs, String proveedor, String protocoloRed, int controladorasRedundantes){
    super(capacidadGb, TasaTransferenciaMbs, proveedor);
    this.protocoloRed = protocoloRed;
    this.controladorasRedundantes = controladorasRedundantes;
}



    public void mostrarDetalles() {
        System.out.println("--- INFRAESTRUCTURA: ARREGLO SAN ---");
        super.mostrarInformacion();
        System.out.println("Protocolo: " + protocoloRed + " | Controladoras Redundantes: " + controladorasRedundantes);
        System.out.println("----------------------------------------");
    }
}
