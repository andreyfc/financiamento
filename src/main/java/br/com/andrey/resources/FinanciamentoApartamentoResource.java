package br.com.andrey.resources;

import br.com.andrey.dtos.ImovelDTO;
import br.com.andrey.dtos.ParcelaImovelDTO;
import br.com.andrey.financiamento.impl.FinanciementoServiceImpl;
import com.google.gson.Gson;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;

@Path("/financiamento")
public class FinanciamentoApartamentoResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response parcelasImovel(String json) {
        ImovelDTO imovelDTO = new Gson().fromJson(json, ImovelDTO.class);
        FinanciementoServiceImpl financiementoService = new FinanciementoServiceImpl();
        Collection<ParcelaImovelDTO> parcelas = financiementoService.calcular(imovelDTO);
        String parcelasString = new Gson().toJson(parcelas);
        return Response.ok().entity(parcelasString).build();
    }

}
