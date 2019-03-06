package br.com.asas.sciuridae.model;

import javax.persistence.*;

@Entity
@Table(name = "logradouro")
public class Logradouro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_logradouro")
    private Long codigo;

    @ManyToOne
    private TipoLogradouro tipoLogradouro;

    @Column(name = "nome_logradouro", nullable = false)
    private String nome;

    @Column(name = "numero_logradouro")
    private String numero;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cidade")
    private String cidade;

    @ManyToOne
    private Estado estado;

    @Column(name = "cep_prefixo")
    private int cepPrefixo;

    @Column(name = "cep_sufixo")
    private int cepSufixo;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getCepPrefixo() {
        return cepPrefixo;
    }

    public void setCepPrefixo(int cepPrefixo) {
        this.cepPrefixo = cepPrefixo;
    }

    public int getCepSufixo() {
        return cepSufixo;
    }

    public void setCepSufixo(int cepSufixo) {
        this.cepSufixo = cepSufixo;
    }
}
