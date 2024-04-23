package src;

public class Voo {
    private int numero;
    private String origem;
    private String destino;
    private int quantidadeAcentos;
    private int acentosOcupados;

    public String getOrigem() {
        return origem;
    }

    public Voo () {

    }

    public Voo(int numero,
               String origem,
               String destino,
               int quantidadeAcentos) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.quantidadeAcentos = quantidadeAcentos;
        this.acentosOcupados = 0;
    }

    public boolean validarNumeroVoo(int numeroVoo) {
        if ( numeroVoo == this.numero)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Voo{" +
                "numero=" + numero +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", quantidadeAcentos=" + quantidadeAcentos +
                ", acentosOcupados=" + acentosOcupados +
                '}';
    }
}
