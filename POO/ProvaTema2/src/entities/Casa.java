package entities;

import java.util.Date;

public class Casa extends Obra{

    private double tamanhoTerreno;
    private int quantidadeBanheiro;
    private int quantidadeQuarto;

    public Casa(String endereco, Date dataInicio, Date dataTerminoPrevista, double tamanhoTerreno,
                int quantidadeBanheiro, int quantidadeQuarto) {
        super(endereco, dataInicio, dataTerminoPrevista);
        this.tamanhoTerreno = tamanhoTerreno;
        this.quantidadeBanheiro = quantidadeBanheiro;
        this.quantidadeQuarto = quantidadeQuarto;
    }

    public double getTamanhoTerreno() {
        return tamanhoTerreno;
    }
    public void setTamanhoTerreno(double tamanhoTerreno) {
        this.tamanhoTerreno = tamanhoTerreno;
    }
    public int getQuantidadeBanheiro() {
        return quantidadeBanheiro;
    }
    public void setQuantidadeBanheiro(int quantidadeBanheiro) {
        this.quantidadeBanheiro = quantidadeBanheiro;
    }
    public int getQuantidadeQuarto() {
        return quantidadeQuarto;
    }
    public void setQuantidadeQuarto(int quantidadeQuarto) {
        this.quantidadeQuarto = quantidadeQuarto;
    }

    @Override
    public String obterConclusaoObra() {
        if (getDataTerminoPrevista() == getDataTerminoReal() && getStatusObra().equals("ACABADO")) {
            return "Obra concluida no prazo determinado";
        }
        return "Obra atrasada";
    }
}
