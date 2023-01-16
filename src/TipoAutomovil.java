public enum TipoAutomovil {

    SEDAN("Sedan", 4, "Auto Normal"),
    STATION_WAGON("Sation Wagon", 5, "Auto Grande"),
    HATCHBACK("Hatchback", 4, "Auto Compacto"),
    PICKUP("Pickup", 4, "Camioneta"),
    COUPE("Coupé", 2, "Auto Pequeño"),
    CONVERTIBLE("Convertible", 2, "Auto Deportivo"),
    FURGON("Furgón", 3, "Auto Utilitario");



    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion; //al ser final es tan solo de lectura, ergo no hace falta usar Setters


    TipoAutomovil(String nombre, int numeroPuertas, String descripcion) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
