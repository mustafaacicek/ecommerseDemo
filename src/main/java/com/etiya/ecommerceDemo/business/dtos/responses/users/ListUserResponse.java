package com.etiya.ecommerceDemo.business.dtos.responses.users;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ListUserResponse {
    private Long id;
    private String first_name;

    private String last_name;

    private String email;

    private String password;
}
