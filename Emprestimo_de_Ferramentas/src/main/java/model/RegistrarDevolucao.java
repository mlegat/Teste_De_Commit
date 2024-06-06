package model;

/**
 *
 * @author mariahaeming
 */
public class RegistrarDevolucao extends visao.FrmRegistrarDevolucao {
    private int DataD;

    public RegistrarDevolucao() {
        this(0);
    }

    public RegistrarDevolucao(int DataD) {
        this.DataD = DataD;
    }

    public int getDataD() {
        return DataD;
    }

    public void setDataD(int DataD) {
        this.DataD = DataD;
    }
    
}
