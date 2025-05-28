// Main do codigo:

public class Principal {

    //; Executar a função de verificar primos em 3 threads diferentes.
    public static void main(String[] args) {
        // Criação de Threads apra processão paralela
        Thread t1 = new Thread(new VerificadorPrimos(10000, 20000));
        Thread t2 = new Thread(new VerificadorPrimos(20001, 30000));
        Thread t3 = new Thread(new VerificadorPrimos(30001, 40000));

        // Execução das threads
        t1.start();
        t2.start();
        t3.start();

        // Espera todas as threads terminarem antes de finalizar o programa
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todas as threads terminaram.");

        // Executar a função de verificar primos em sequencial

        System.out.println("\n🧮 INÍCIO EXECUÇÃO SEQUENCIAL");
        long inicioSequencial = System.currentTimeMillis();

        Runnable sequencial = new VerificadorPrimos(10000, 40000);
        sequencial.run(); // Aqui chamamos diretamente o método run()

        long fimSequencial = System.currentTimeMillis();
        System.out.println("🧮 FIM EXECUÇÃO SEQUENCIAL: " + (fimSequencial - inicioSequencial) + " ms");
    }
}
