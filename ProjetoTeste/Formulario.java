package maven.connectSqlEclipse;

public class Formulario {
    private int idCliente;
    private String nome;
    private String email;
    private String endereco;
    private String telefone;

    public Cliente() {
        this.idCliente = -1;
        this.nome = "";
        this.email = "";
        this.endereco = "";
        this.telefone = "";
    }

    public Cliente(int idCliente, String nome, String email, String endereco, String telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco + ", telefone=" + telefone + "]";
    }
}
