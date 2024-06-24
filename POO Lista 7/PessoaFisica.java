import java.util.Date;

public class PessoaFisica extends Cliente {

    private String cpf;

   

    private int idade;

    private char genero;

    public PessoaFisica(String nome, String endereco, Date data, String cpf, int idade, char genero) {
        super(nome, endereco, data);
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
      
    }

    public boolean equals(String cpf)
    {
        return this.cpf == cpf;
    }

    @Override
    public String toString()
    {    
         String clienteString = "Nome : " + getNome() + "\n" + "Endereco : " + getEndereco() + "\n" + "Data : " + getData() + "\n" + "Cpf: " + this.cpf + "\n" + "Idade: " + this.idade + "\n" + "Genero: " + this.genero;
    
         
     
         return  clienteString;
    }
    
    public String getCpf() {
            return cpf;
        }

        public boolean autenticacao(String autentificador)
        {   
            if(this.cpf == autentificador)
            {
                return true;
            }
            else
            {
                System.out.println("Cpf invalido , tente novamente ...");
                return false;
            }
            
        }
      
}
