import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ItemFacturable> items = new ArrayList<>();
        items.add(new ProductoImportado("celular" , 100000));
        items.add(new ServicioProfesional("consultoria" , 50000));
        items.add(new AlimentoBasico("leche" , 2000));
        for(ItemFacturable item : items) {
            System.out.println("nombre:" + item.nombre);
            System.out.println("precio base $ " + item.precioBase);
            System.out.println("impuesto: $ " + item.calcularImpuesto());
            System.out.println("precio final: $ " + item.calcularPrecioFinal());
        }
    }
}
