<body>
    <h1>🧮 Projeto: Verificador de Números Primos com Threads</h1>
        <p>Este projeto em Java demonstra o uso de <strong>threads paralelas</strong> para verificar números primos em diferentes intervalos, comparando com a execução <em>sequencial</em> (em uma única thread).</p>
    <h2>📁 Estrutura do Projeto</h2>
        <ul>
            <li><code>VerificadorPrimos.java</code>: Classe que implementa <code>Runnable</code> para verificar primos em um intervalo.</li>
            <li><code>Principal.java</code>: Contém o método <code>main</code> que executa as threads paralelas e a verificação sequencial.</li>
            <li><code>README.html</code>: Este arquivo de documentação.</li>
        </ul>
    <h2>⚙️ Como Executar</h2>
        <p>Compile os arquivos Java e execute a classe principal:</p>
            <pre><code>javac VerificadorPrimos.java Principal.java
    java Principal</code></pre>
    <h2>🚀 Funcionalidade</h2>
        <p>O programa cria:</p>
        <ul>
            <li>Três threads paralelas, cada uma analisando um intervalo de números.</li>
            <li>Uma execução sequencial (sem threads) analisando o mesmo intervalo total.</li>
        </ul>
    <h2>🧪 Exemplo de Saída</h2>
    <pre>
🧵 INÍCIO THREADS PARALELAS
Thread iniciada para intervalo: 10000 até 20000
...
🧵 FIM THREADS PARALELAS: 525 ms

🧮 INÍCIO EXECUÇÃO SEQUENCIAL
Primo encontrado: 10007
...
🧮 FIM EXECUÇÃO SEQUENCIAL: 974 ms
    </pre>
 <h2>📌 Observações</h2>
    <ul>
        <li>Quanto maior o intervalo, maior o impacto das threads.</li>
        <li>O desempenho pode variar conforme a máquina (núcleos, CPU).</li>
        <li>O código usa <code>System.currentTimeMillis()</code> para medir o tempo de execução.</li>
    </ul>

<p>🛠️ Feito para fins educacionais, demonstrando paralelismo com Java.</p>
</body>
