package org.example;

public class FilialService {
    private IDao<Filial> filialIDao;

    public FilialService (IDao<Filial> filialIDao) {
        this.filialIDao = filialIDao;
    }
    public Filial salvar(Filial filial) {
        return filialIDao.salvar(filial);
    }
}
