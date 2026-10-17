public class AlmacenamientoNube extends  AlmacenamientoServidor{
    private double costoGbMensual;
    private String regionDatacenter;

public AlmacenamientoNube (double capacidadGb, double TasaTransferenciaMbs, String proveedor, double costoGbMensual, String regionDatacenter){
    super(capacidadGb, TasaTransferenciaMbs, proveedor);
    this.costoGbMensual = costoGbMensual;
    this.regionDatacenter = regionDatacenter;
}

    public void mostrarDetalles() {
        System.out.println("--- INFRAESTRUCTURA: ALMACENAMIENTO NUBE ---");
        super.mostrarInformacion();
        System.out.println("Costo por GB/Mes: $" + costoGbMensual + " | Región: " + regionDatacenter);
        System.out.println("----------------------------------------");
    }
}
