import java.util.HashMap;

public class FlyWeightFactory {
    public static final HashMap<String, Roupa> tamanhoXsMap = new HashMap<>();
    public static final HashMap<String, Roupa> tamanhoSMap = new HashMap<>();
    public static final HashMap<String, Roupa> tamanhoMMap = new HashMap<>();
    public static final HashMap<Boolean, Roupa> importadaMap = new HashMap<>();
    public static final HashMap<Boolean, Roupa> usadaMap = new HashMap<>();

    public static Roupa obterRoupa(String tamanho, String tipo, Boolean eNovo, Boolean eImportada) {
        Roupa novaRoupa = new Roupa(tamanho, tipo, eNovo, eImportada);

        if((tamanho == "Xs") && (eImportada) && (eNovo==false)) {
            Roupa roupa = tamanhoXsMap.get(tamanho);
            Roupa roupa2 = importadaMap.get(eImportada);
            Roupa roupa3 = usadaMap.get(eNovo);

            if (roupa == null && roupa2 == null && roupa3 == null) {

                tamanhoXsMap.put(tamanho, novaRoupa);
                importadaMap.put(eImportada, novaRoupa);
                usadaMap.put(eNovo, novaRoupa);
            }
        }
        else if((tamanho == "Xs") && (eImportada==false) && (eNovo==false)) {
            Roupa roupa = tamanhoXsMap.get(tamanho);
            Roupa roupa3 = usadaMap.get(eNovo);

            if (roupa == null && roupa3 == null) {
                tamanhoXsMap.put(tamanho, novaRoupa);
                usadaMap.put(eNovo, novaRoupa);
            }
        }
        else if((tamanho == "Xs") && (eImportada==false) && (eNovo==true)) {
            Roupa roupa = tamanhoXsMap.get(tamanho);

            if (roupa == null) {
                tamanhoXsMap.put(tamanho, novaRoupa);
               }
        }
        else if((tamanho == "Xs") && (eImportada) && (eNovo)) {
            Roupa roupa = tamanhoXsMap.get(tamanho);
            Roupa roupa2 = importadaMap.get(eImportada);

            if (roupa == null && roupa2 == null) {
                tamanhoXsMap.put(tamanho, novaRoupa);
                importadaMap.put(eImportada, novaRoupa);
            }
        }
        if((tamanho == "S") && (eImportada) && (eNovo==false)) {
            Roupa roupa = tamanhoSMap.get(tamanho);
            Roupa roupa2 = importadaMap.get(eImportada);
            Roupa roupa3 = usadaMap.get(eNovo);

            if (roupa == null && roupa2 == null && roupa3 == null) {

                tamanhoSMap.put(tamanho, novaRoupa);
                importadaMap.put(eImportada, novaRoupa);
                usadaMap.put(eNovo, novaRoupa);
            }
        }
        else if((tamanho == "S") && (eImportada==false) && (eNovo==false)) {
            Roupa roupa = tamanhoSMap.get(tamanho);
            Roupa roupa3 = usadaMap.get(eNovo);

            if (roupa == null && roupa3 == null) {
                tamanhoSMap.put(tamanho, novaRoupa);
                usadaMap.put(eNovo, novaRoupa);
            }
        }
        else if((tamanho == "S") && (eImportada==false) && (eNovo==true)) {
            Roupa roupa = tamanhoSMap.get(tamanho);

            if (roupa == null) {
                tamanhoSMap.put(tamanho, novaRoupa);
            }
        }
        else if((tamanho == "S") && (eImportada) && (eNovo)) {
            Roupa roupa = tamanhoSMap.get(tamanho);
            Roupa roupa2 = importadaMap.get(eImportada);

            if (roupa == null && roupa2 == null) {
                tamanhoSMap.put(tamanho, novaRoupa);
                importadaMap.put(eImportada, novaRoupa);
            }
        }

    }

}
