public class Pontos {
    private Double latitude1;
    private Double latitude2;
    private Double longitude1;
    private Double longitude2;

    public Pontos(Double latitude1, Double latitude2, Double longitude1, Double longitude2) {
        this.latitude1 = latitude1;
        this.latitude2 = latitude2;
        this.longitude1 = longitude1;
        this.longitude2 = longitude2;
    }

    public Double getLatitude1() {
        return latitude1;
    }

    public void setLatitude1(Double latitude1) {
        this.latitude1 = latitude1;
    }

    public Double getLatitude2() {
        return latitude2;
    }

    public void setLatitude2(Double latitude2) {
        this.latitude2 = latitude2;
    }

    public Double getLongitude1() {
        return longitude1;
    }

    public void setLongitude1(Double longitude1) {
        this.longitude1 = longitude1;
    }

    public Double getLongitude2() {
        return longitude2;
    }

    public void setLongitude2(Double longitude2) {
        this.longitude2 = longitude2;
    }

    public Double calcularDistancia() {
        return java.lang.Math.abs(latitude1 - latitude2) + java.lang.Math.abs(longitude1 - longitude2);
    }
}
