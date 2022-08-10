public class Roupa {
    private String tamanho;
    private String tipo;
    private Boolean eNovo;
    private Boolean eImportada;



    public Roupa(String tamanho, String tipo, Boolean eNovo, Boolean eImportada) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.eNovo = eNovo;
        this.eImportada = eImportada;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean geteNovo() {
        return eNovo;
    }

    public void seteNovo(Boolean eNovo) {
        this.eNovo = eNovo;
    }

    public Boolean geteImportada() {
        return eImportada;
    }

    public void seteImportada(Boolean eImportada) {
        this.eImportada = eImportada;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "tamanho='" + tamanho + '\'' +
                ", tipo='" + tipo + '\'' +
                ", eNovo=" + eNovo +
                ", eImportada=" + eImportada +
                '}';
    }
}
