package br.com.andrey.financiamento;

import br.com.andrey.dtos.ImovelDTO;
import br.com.andrey.dtos.ParcelaImovelDTO;

import java.util.Collection;

public interface FinancimentoService {

    Collection<ParcelaImovelDTO> calcular(ImovelDTO imovelDTO);

}
