import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    private String cpf;
    private String nome;
    private String telefone;
    private String sexo;
    private String naturalidade;
    private Date nascimento;

    private List<Endereco> listaendereco = new ArrayList<Endereco>();

    private void listarEndereco(){

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public List<Endereco> getListaendereco() {
        return listaendereco;
    }

    public void setListaendereco(List<Endereco> listaendereco) {
        this.listaendereco = listaendereco;
    }
}
