public class UnidadNas extends AlmacenamientoServidor{
    private int numeroBahiasDiscos;
    private String tipoRaid;

    public UnidadNas(double capacidadGb, double TasaTransferenciaMbs, String proveedor, int numeroBahiasDiscos, String tipoRaid){
        super(capacidadGb, TasaTransferenciaMbs, proveedor);
        this.numeroBahiasDiscos = numeroBahiasDiscos;
        this.tipoRaid = tipoRaid;
    }

    public void mostrarDetalles() {
        System.out.println("--- INFRAESTRUCTURA: UNIDAD NAS ---");
        super.mostrarInformacion();
        System.out.println("Bahías de discos: " + numeroBahiasDiscos + " | Nivel RAID: " + tipoRaid);
        System.out.println("----------------------------------------");
    }
}
