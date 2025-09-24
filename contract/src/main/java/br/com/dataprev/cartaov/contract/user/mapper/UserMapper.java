package br.com.dataprev.cartaov.contract.user.mapper;

import br.com.dataprev.cartaov.contract.user.model.request.CompanyCreateRequest;
import br.com.dataprev.cartaov.contract.user.model.request.UserCreateRequest;
import br.com.dataprev.cartaov.contract.user.model.request.UserLoginRequest;
import br.com.dataprev.cartaov.contract.user.model.response.UserAuthResponse;
import br.com.dataprev.cartaov.impl.user.model.UserAuthModel;
import br.com.dataprev.cartaov.impl.user.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserModel mapToModel(UserCreateRequest userCreateRequest);

    UserModel mapToModel(UserLoginRequest userLoginRequest);

    UserAuthResponse mapToResponse(UserAuthModel userAuthModel);

    UserModel mapToModelCompany(CompanyCreateRequest companyCreateRequest);

}
