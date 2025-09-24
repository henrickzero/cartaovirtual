package br.com.dataprev.cartaov.contract.user.mapper;

import br.com.dataprev.cartaov.contract.user.model.request.CompanyCreateRequest;
import br.com.dataprev.cartaov.impl.user.entity.CompanyEntity;
import br.com.dataprev.cartaov.impl.user.entity.SubsidiaryEntity;
import br.com.dataprev.cartaov.impl.user.model.CreateCompanyModel;
import br.com.dataprev.cartaov.impl.user.model.UserModel;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CompanyMapper {

    public static CreateCompanyModel mapToModel(CompanyCreateRequest companyCreateRequest) {
        return CreateCompanyModel.builder()
                .company(mapToCompanyEntity(companyCreateRequest))
                .subsidiary(mapToSubsidiaryEntity(companyCreateRequest))
                .user(mapToUserModel(companyCreateRequest))
                .build();
    }

    private static CompanyEntity mapToCompanyEntity(CompanyCreateRequest companyCreateRequest) {
        return CompanyEntity.builder()
                .companyName(companyCreateRequest.getCompanyName())
                .build();
    }

    private static SubsidiaryEntity mapToSubsidiaryEntity(CompanyCreateRequest companyCreateRequest) {
        return SubsidiaryEntity.builder()
                .subsidiaryName(companyCreateRequest.getCompanyName())
                .build();
    }

    private static UserModel mapToUserModel(CompanyCreateRequest companyCreateRequest) {
        return UserModel.builder()

                .email(companyCreateRequest.getEmail())
                .password(companyCreateRequest.getPassword())
                .build();
    }

}
