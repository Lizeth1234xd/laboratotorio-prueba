public class fibonacci {
    public static void main(String[] args) {
        int n = 10; // Número de términos
        int primero = 0, segundo = 1;

        System.out.println("Serie de Fibonacci hasta " + n + " términos:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(primero + " ");
            
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}
