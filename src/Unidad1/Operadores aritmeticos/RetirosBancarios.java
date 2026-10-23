public class RetirosBancarios {
    public static void main(String[] args) {
        
        double dineroInicial = 1000.0;
        double retiroSemanal = 200.0;
        int semanasPorMes = 4;

        
        double totalRetirado = retiroSemanal * semanasPorMes;

       
        double dineroRestante = dineroInicial - totalRetirado;

        
        System.out.println("--- Resumen de la cuenta ---");
        System.out.println("Dinero inicial: $" + dineroInicial);
        System.out.println("Retiro semanal: $" + retiroSemanal);
        System.out.println("Semanas en el mes: " + semanasPorMes);
        System.out.println("Total retirado: $" + totalRetirado);
        System.out.println("Dinero restante al final del mes: $" + dineroRestante);
    }
}