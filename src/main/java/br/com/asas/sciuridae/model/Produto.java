package br.com.asas.sciuridae.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_produto")
    private Long codigo;

    @Column(name = "nome_produto", nullable = false)
    private String nome;

    @Column(name = "codigo_barras")
    private Long codigoBarras;

    @Column(name = "quantidade", nullable = false)
    private double quantidade;

    @ManyToOne
    @JoinColumn(name = "cod_unidade_medida")
    private UnidadeMedida unidadeMedida;

    @Column(name = "valor")
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "cod_fabricante")
    private Fabricante fabricante;

    @ManyToOne
    @JoinColumn(name = "cod_tipo_produto")
    private TipoProduto tipoProduto;// Ex: grãos, perfumaria, bebidas, matinais, frutas, legumes, xampu

    @ManyToOne
    @JoinColumn(name = "cod_departamento")
    private Departamento departamento;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(Long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
