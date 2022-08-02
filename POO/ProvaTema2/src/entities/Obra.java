package entities;

import java.util.Date;

public abstract class Obra {
    private String endereco;
    private Date dataInicio;
    private Date dataTerminoPrevista;
    private Date dataTerminoReal;
    private StatusObra statusObra;

    public Obra(String endereco, Date dataInicio, Date dataTerminoPrevista) {
        this.endereco = endereco;
        this.dataInicio = dataInicio;
        this.dataTerminoPrevista = dataTerminoPrevista;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTerminoPrevista() {
        return dataTerminoPrevista;
    }

    public void setDataTerminoPrevista(Date dataTerminoPrevista) {
        this.dataTerminoPrevista = dataTerminoPrevista;
    }

    public Date getDataTerminoReal() {
        return dataTerminoReal;
    }

    public void setDataTerminoReal(Date dataTerminoReal) {
        this.dataTerminoReal = dataTerminoReal;
    }

    public StatusObra getStatusObra() {
        return statusObra;
    }

    public void setStatusObra(StatusObra statusObra) {
        this.statusObra = statusObra;
    }

    public abstract String obterConclusaoObra();
}
