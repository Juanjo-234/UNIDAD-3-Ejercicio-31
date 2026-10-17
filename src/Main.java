//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    UnidadNas nas = new UnidadNas(16000.0, 1000.0, "Synology", 4, "RAID 5");
    ArregloSan san = new ArregloSan(128000.0, 12800.0, "Dell EMC", "Fibre Channel", 2);
    AlmacenamientoNube nube = new AlmacenamientoNube(50000.0, 2500.0, "AWS S3", 0.023, "us-east-1");

    System.out.println("=== REPORTE DE SISTEMAS DE ALMACENAMIENTO ===\n");
    nas.mostrarDetalles();
    san.mostrarDetalles();
    nube.mostrarDetalles();
}
