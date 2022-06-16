package validacao_csv;
import java.io.Serializable;

import javax.xml.crypto.Data;

public class estrutura implements Serializable {
    private static final long serialVersionUID = 1;
    private Double NUMERO_DA_VENDA;
    private String NOME_DO_CLIENTE;
    private Data DATA_DA_VENDA;
    private Double VALOR_DA_VENDA;

    public estrutura () {

    }
    
    public estrutura(Double NUMERO_DA_VENDA, String NOME_DO_CLIENTE, Data DATA_DA_VENDA, Double VALOR_DA_VENDA){
            super();
            this.NUMERO_DA_VENDA = NUMERO_DA_VENDA;
            this.NOME_DO_CLIENTE = NOME_DO_CLIENTE;
            this.DATA_DA_VENDA = DATA_DA_VENDA;
            this.VALOR_DA_VENDA = VALOR_DA_VENDA;
    }

    

    public estrutura(Double nUMERO_DA_VENDA2, String nOME_DO_CLIENTE2, String dATA_DA_VENDA2, Double vALOR_DA_VENDA2) {
    }

    /**
     * @return Double return the NUMERO_DA_VENDA
     */
    public Double getNUMERO_DA_VENDA() {
        return NUMERO_DA_VENDA;
    }

    /**
     * @param NUMERO_DA_VENDA the NUMERO_DA_VENDA to set
     */
    public void setNUMERO_DA_VENDA(Double NUMERO_DA_VENDA) {
        this.NUMERO_DA_VENDA = NUMERO_DA_VENDA;
    }

    /**
     * @return String return the NOME_DO_CLIENTE
     */
    public String getNOME_DO_CLIENTE() {
        return NOME_DO_CLIENTE;
    }

    /**
     * @param NOME_DO_CLIENTE the NOME_DO_CLIENTE to set
     */
    public void setNOME_DO_CLIENTE(String NOME_DO_CLIENTE) {
        this.NOME_DO_CLIENTE = NOME_DO_CLIENTE;
    }

    /**
     * @return Data return the DATA_DA_VENDA
     */
    public Data getDATA_DA_VENDA() {
        return DATA_DA_VENDA;
    }

    /**
     * @param DATA_DA_VENDA the DATA_DA_VENDA to set
     */
    public void setDATA_DA_VENDA(Data DATA_DA_VENDA) {
        this.DATA_DA_VENDA = DATA_DA_VENDA;
    }

    /**
     * @return Double return the VALOR_DA_VENDA
     */
    public Double getVALOR_DA_VENDA() {
        return VALOR_DA_VENDA;
    }

    /**
     * @param VALOR_DA_VENDA the VALOR_DA_VENDA to set
     */
    public void setVALOR_DA_VENDA(Double VALOR_DA_VENDA) {
        this.VALOR_DA_VENDA = VALOR_DA_VENDA;
    }

    @Override
    public String toString(){
        return "Estrutura [Numero da venda :" + NUMERO_DA_VENDA + "; Nome do cliente:" + NOME_DO_CLIENTE + "; Data da venda: " + DATA_DA_VENDA + "; Valor da venda" + VALOR_DA_VENDA + "]";
    }
}
