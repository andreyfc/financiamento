package br.com.andrey.dtos;

public class ImovelDTO {

    private double valorImovel;
    private double taxaJuro;
    private double percentualEntrada;
    private Integer quantidadeParcelas;

    public double getValorImovel() {
        return valorImovel;
    }

    public ImovelDTO setValorImovel(double valorImovel) {
        this.valorImovel = valorImovel;
        return this;
    }

    public double getTaxaJuro() {
        return taxaJuro;
    }

    public ImovelDTO setTaxaJuro(double taxaJuro) {
        this.taxaJuro = taxaJuro;
        return this;
    }

    public double getPercentualEntrada() {
        return percentualEntrada;
    }

    public ImovelDTO setPercentualEntrada(double percentualEntrada) {
        this.percentualEntrada = percentualEntrada;
        return this;
    }

    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public ImovelDTO setQuantidadeParcelas(Integer quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
        return this;
    }
}
