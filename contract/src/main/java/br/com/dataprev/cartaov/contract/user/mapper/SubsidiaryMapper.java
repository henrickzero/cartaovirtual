package br.com.dataprev.cartaov.contract.user.mapper;

import br.com.dataprev.cartaov.contract.user.model.response.SubsidiaryResponse;
import br.com.dataprev.cartaov.impl.user.model.SubsidiaryResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubsidiaryMapper {
    SubsidiaryMapper INSTANCE = Mappers.getMapper(SubsidiaryMapper.class);

    List<SubsidiaryResponse> mapToSubsidiaryResponseModelList(List<SubsidiaryResponseModel> subsidiaryResponseModel);

}
