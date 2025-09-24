package br.com.dataprev.cartaov.impl.user.model;

import br.com.dataprev.cartaov.impl.user.entity.CompanyEntity;
import br.com.dataprev.cartaov.impl.user.entity.SubsidiaryEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CreateCompanyModel {
    private CompanyEntity company;
    private SubsidiaryEntity subsidiary;
    private UserModel user;
}
