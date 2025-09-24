package br.com.dataprev.cartaov.impl.user.model;

import br.com.dataprev.cartaov.impl.user.entity.SubsidiaryDatabase;
import br.com.dataprev.cartaov.impl.user.enums.UserTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private String id;
    private String name;
    private String password;
    private String email;
    private String companyId;
    private List<SubsidiaryDatabase> subsidiaries;
    private UserTypeEnum userType;
    private LocalDateTime createDate;
}
