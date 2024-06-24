import java.util.Date;

public class PessoaJuridica extends Cliente {

    private String cnpj;

    private int numFuncionarios;

    private String setor;

 

    public PessoaJuridica(String nome, String endereco, Date data, String cnpj, int numFuncionarios, String setor) {
        super(nome, endereco, data);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
        
    }

    public boolean equals(String cnpj)
    {
        return this.cnpj == cnpj;
    }
    
    @Override
    public String toString()
    {    
         String clienteString = "Nome : " + getNome() + "\n" + "Endereco : " + getEndereco() + "\n" + "Data : " + getData() + "\n" + "Cnpj: " + this.cnpj + "\n" + "Numero de Funcionarios: " + this.numFuncionarios + "\n" + "Setor: " + this.setor;
    
         
     
         return  clienteString;
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean autenticacao(String autentificador)
    {   
        if(this.cnpj == autentificador)
        {
            return true;
        }
        else
        {
            System.out.println("Cnpj invalido , tente novamente ...");
            return false;
        }
        
    }
  
}

