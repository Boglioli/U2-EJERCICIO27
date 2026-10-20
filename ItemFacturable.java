public abstract class ItemFacturable {
    protected String nombre;
    protected double precioBase;

    public ItemFacturable(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract double calcularImpuesto();

    public double calcularPrecioFinal() {
        return precioBase + calcularImpuesto();
    }

    public void mostrarDetalle() {
        System.out.println("nombre: " + nombre);
        System.out.println("precio base: $ " + precioBase);
        System.out.println("impuesto: $ " + calcularImpuesto());
        System.out.println("precio final: $ " + calcularPrecioFinal());
    }
}
