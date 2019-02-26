package br.com.asas.sciuridae.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Carrinho {

    private Long codigo;
    private List<ItemCarrinho> itens;
    private Integer totalItens;
    private Pessoa responsavel;
    private BigDecimal valorTotal;
    private List<Pessoa> compartilhado;
    private LocalDateTime dataCriacao;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public void setItens(List<ItemCarrinho> itens) {
        this.itens = itens;
    }

    public Integer getTotalItens() {
        return totalItens;
    }

    public void setTotalItens(Integer totalItens) {
        this.totalItens = totalItens;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Pessoa> getCompartilhado() {
        return compartilhado;
    }

    public void setCompartilhado(List<Pessoa> compartilhado) {
        this.compartilhado = compartilhado;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
