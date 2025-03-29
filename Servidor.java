import java.util.Scanner;

public class Servidor extends Computador {
    private int numeroProcessadores;
    private int capacidadeMemoriaRAM;
    private int capacidadeArmazenamento;
    private String tipoArmazenamento;
    private boolean possuiRaid;
    private String sistemaOperacional;
    private int numeroFontes;
    private int potenciaTotalFonte;

    // Construtores
    public Servidor() {}

    public Servidor(String marca, double preco, int quantidade, int numeroProcessadores,
                    int capacidadeMemoriaRAM, int capacidadeArmazenamento, String tipoArmazenamento,
                    boolean possuiRaid, String sistemaOperacional, int numeroFontes, int potenciaTotalFonte) {
        super(marca, preco, quantidade);
        this.numeroProcessadores = numeroProcessadores;
        this.capacidadeMemoriaRAM = capacidadeMemoriaRAM;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.tipoArmazenamento = tipoArmazenamento;
        this.possuiRaid = possuiRaid;
        this.sistemaOperacional = sistemaOperacional;
        this.numeroFontes = numeroFontes;
        this.potenciaTotalFonte = potenciaTotalFonte;
    }

    // Métodos de acesso (Getters e Setters)
    public int getNumeroProcessadores() { return numeroProcessadores; }
    public void setNumeroProcessadores(int numeroProcessadores) { this.numeroProcessadores = numeroProcessadores; }

    public int getCapacidadeMemoriaRAM() { return capacidadeMemoriaRAM; }
    public void setCapacidadeMemoriaRAM(int capacidadeMemoriaRAM) { this.capacidadeMemoriaRAM = capacidadeMemoriaRAM; }

    public int getCapacidadeArmazenamento() { return capacidadeArmazenamento; }
    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) { this.capacidadeArmazenamento = capacidadeArmazenamento; }

    public String getTipoArmazenamento() { return tipoArmazenamento; }
    public void setTipoArmazenamento(String tipoArmazenamento) { this.tipoArmazenamento = tipoArmazenamento; }

    public boolean isPossuiRaid() { return possuiRaid; }
    public void setPossuiRaid(boolean possuiRaid) { this.possuiRaid = possuiRaid; }

    public String getSistemaOperacional() { return sistemaOperacional; }
    public void setSistemaOperacional(String sistemaOperacional) { this.sistemaOperacional = sistemaOperacional; }

    public int getNumeroFontes() { return numeroFontes; }
    public void setNumeroFontes(int numeroFontes) { this.numeroFontes = numeroFontes; }

    public int getPotenciaTotalFonte() { return potenciaTotalFonte; }
    public void setPotenciaTotalFonte(int potenciaTotalFonte) { this.potenciaTotalFonte = potenciaTotalFonte; }

    // Método de entrada de dados
    public void entrada(Scanner scanner) {
        super.entrada(scanner); // Chama o método de entrada da superclasse
        System.out.print("Número de Processadores: ");
        this.numeroProcessadores = scanner.nextInt();
        scanner.nextLine(); // Consome a linha em branco após nextInt()
        System.out.print("Capacidade de Memória RAM: ");
        this.capacidadeMemoriaRAM = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Capacidade de Armazenamento (em GB): ");
        this.capacidadeArmazenamento = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tipo de Armazenamento (SSD, HDD, etc.): ");
        this.tipoArmazenamento = scanner.nextLine();
        System.out.print("Possui RAID (true/false): ");
        this.possuiRaid = scanner.nextBoolean();
        scanner.nextLine(); // Consome a linha em branco
        System.out.print("Sistema Operacional: ");
        this.sistemaOperacional = scanner.nextLine();
        System.out.print("Número de Fontes: ");
        this.numeroFontes = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Potência Total da Fonte (em Watts): ");
        this.potenciaTotalFonte = scanner.nextInt();
        scanner.nextLine();
    }

    // Método para imprimir os dados
    public void imprimir() {
        super.imprimir(); // Chama o método imprimir da superclasse
        System.out.println("Número de Processadores: " + numeroProcessadores);
        System.out.println("Capacidade de Memória RAM: " + capacidadeMemoriaRAM + " GB");
        System.out.println("Capacidade de Armazenamento: " + capacidadeArmazenamento + " GB");
        System.out.println("Tipo de Armazenamento: " + tipoArmazenamento);
        System.out.println("Possui RAID: " + (possuiRaid ? "Sim" : "Não"));
        System.out.println("Sistema Operacional: " + sistemaOperacional);
        System.out.println("Número de Fontes: " + numeroFontes);
        System.out.println("Potência Total da Fonte: " + potenciaTotalFonte + " W");
    }
}
