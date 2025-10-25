public class Vendedor {
    
    private String cnpj;
    private String chavePix;

    Vendedor(String cnpj)  {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

}
