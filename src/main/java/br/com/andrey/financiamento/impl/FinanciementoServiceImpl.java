package br.com.andrey.financiamento.impl;

import br.com.andrey.dtos.ImovelDTO;
import br.com.andrey.dtos.ParcelaImovelDTO;
import br.com.andrey.financiamento.FinancimentoService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FinanciementoServiceImpl implements FinancimentoService{



    public Collection<ParcelaImovelDTO> calcular(ImovelDTO imovelDTO) {
        double valorImovel = imovelDTO.getValorImovel();
        double taxaJuros = imovelDTO.getTaxaJuro();
        double percentualEntrada = imovelDTO.getPercentualEntrada();
        Integer qtdParcelas = imovelDTO.getQuantidadeParcelas();
        double amortizacao = valorImovel / qtdParcelas;
        double totalValorParcela = 0;
        double totalDivida = 0;
        List<ParcelaImovelDTO> parcelas = new ArrayList<ParcelaImovelDTO>();

        for (int x = 0; imovelDTO.getQuantidadeParcelas() > x; x++) {
            System.out.println("amortizacao: " + amortizacao);
            double juros = (valorImovel*taxaJuros)/100;
            System.out.println("juros " + juros);
            valorImovel = valorImovel - amortizacao;
            System.out.println("restou: "+valorImovel);
            totalValorParcela = amortizacao+juros;
            System.out.println("total a pagar desta parcela: " + totalValorParcela);
            totalDivida += totalValorParcela;
            System.out.println();
            ParcelaImovelDTO parcela = new ParcelaImovelDTO();
            parcela.setValor(totalValorParcela);
            parcelas.add(parcela);
        }
        System.out.println();
        System.out.println("Total da divida: "+totalDivida);
        return parcelas;
    }

}
