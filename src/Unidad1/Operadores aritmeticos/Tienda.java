public class Tienda {
    public static void main(String[] args) {
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;
        double descuento = 0.15;
        double descuentoAdicional = 0.05;

        double camisetaConDescuento = precioCamiseta * (1 - descuento);
        double pantalonConDescuento = precioPantalon * (1 - descuento);
        double totalParte1 = camisetaConDescuento + pantalonConDescuento;

        double segundaCamiseta = camisetaConDescuento * (1 - descuentoAdicional);
        double totalParte2 = totalParte1 + segundaCamiseta;

        System.out.printf("Camiseta con descuento: $%.2f%n", camisetaConDescuento);
        System.out.printf("Pantalón con descuento: $%.2f%n", pantalonConDescuento);
        System.out.printf("Total (camiseta + pantalón): $%.2f%n", totalParte1);
        System.out.printf("Segunda camiseta (5%% adicional): $%.2f%n", segundaCamiseta);
        System.out.printf("Total con segunda camiseta: $%.2f%n", totalParte2);
    }
}