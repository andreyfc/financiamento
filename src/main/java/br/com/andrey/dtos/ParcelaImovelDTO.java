package br.com.andrey.dtos;

import com.google.common.base.Objects;

import java.math.BigDecimal;
import java.util.Calendar;

public class ParcelaImovelDTO {

    private Calendar DataVencimento;
    private double valor;
    private Calendar dataVencimentoSAC;

    public Calendar getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(Calendar dataVencimento) {
        DataVencimento = dataVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Calendar getDataVencimentoSAC() {
        return dataVencimentoSAC;
    }

    public void setDataVencimentoSAC(Calendar dataVencimentoSAC) {
        this.dataVencimentoSAC = dataVencimentoSAC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParcelaImovelDTO that = (ParcelaImovelDTO) o;
        return Objects.equal(DataVencimento, that.DataVencimento) &&
                Objects.equal(valor, that.valor) &&
                Objects.equal(dataVencimentoSAC, that.dataVencimentoSAC);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(DataVencimento, valor, dataVencimentoSAC);
    }
}
