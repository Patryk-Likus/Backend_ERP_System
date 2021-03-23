package com.Backend_ERP_System.dto;

import com.Backend_ERP_System.entity.Operator;
import lombok.Data;

@Data
public class OperatorAuthenticationResultDto {

    private Long idOperator;
    private String firstName;
    private String lastName;
    private boolean authenticated;

    public static OperatorAuthenticationResultDto createUnauthenticated(){
        OperatorAuthenticationResultDto dto = new OperatorAuthenticationResultDto();
        dto.setAuthenticated(false);
        return  dto;
    }
    public static OperatorAuthenticationResultDto of(Operator operator){
        OperatorAuthenticationResultDto dto = new OperatorAuthenticationResultDto();
        dto.setAuthenticated(true);
        dto.setFirstName(operator.getEmployee().getFirstName());
        dto.setLastName(operator.getEmployee().getLastName());
        dto.setIdOperator(operator.getIdOperator());
        return dto;
    }
}
