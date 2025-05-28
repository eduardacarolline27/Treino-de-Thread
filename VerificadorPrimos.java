public class VerificadorPrimos implements Runnable {
    private int inicio;
    private int fim;

    public VerificadorPrimos(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    // Começar os processos paralelos 
    public void run() {
        System.out.println("Thread iniciada para intervalo: " + inicio + " até " + fim);
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.println("Primo encontrado: " + i);
            }
        }
        System.out.println("Thread finalizada para intervalo: " + inicio + " até " + fim);
    }

    private boolean ehPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
