import java.util.Date;

abstract class Cliente {

    private String tipo;
    
    private String nome;

    private String endereco;

    private Date data;

    public Cliente(String nome, String endereco, Date data) {
        this.nome = nome;
        this.endereco = endereco;
        this.data = data;
    }
   public String toString()
   {    
        String clienteString = "Nome : " + this.nome + "\n" + "Endereco : " + this.endereco + "\n" + "Data : " + this.data ;
        
    
        return  clienteString;
   }
   public boolean equals(String dado)
   {
    
      return false;
   }
   
    public boolean autenticacao(String parametro)
    {
        return false;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    public String getTipo() {
        return tipo;
    }
}
