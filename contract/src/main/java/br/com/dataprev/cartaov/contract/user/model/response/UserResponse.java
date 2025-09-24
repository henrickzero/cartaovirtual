package br.com.dataprev.cartaov.contract.user.model.response;

import br.com.dataprev.cartaov.impl.user.enums.UserTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    @Schema(description = "Usuário")
    private String name;
    @Schema(description = "Email")
    private String email;
    @Schema(description = "Tipo do Usuário")
    private UserTypeEnum userType;
    @Schema(description = "Data de Criação")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime createDate;
}