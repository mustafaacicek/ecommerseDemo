package com.etiya.ecommerceDemo.business.dtos.requests.users;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddUserRequest {
    @NotNull(message = "Name alanı boş bırakılamaz")
    @NotBlank(message = "Name alanı boş bırakılamaz")
    @Size(min = 2, message = "Name alanı 2 karakterden kısa olamaz")
    private String first_name;

    @NotNull(message = "Last_name alanı boş bırakılamaz")
    @NotBlank(message = "Last_name alanı boş bırakılamaz")
    @Size(min = 2, message = "Last_name alanı 2 karakterden kısa olamaz")
    private String last_name;

    @NotNull(message = "email alanı boş bırakılamaz")
    @NotBlank(message = "email alanı boş bırakılamaz")
    private String email;

    @NotNull(message = "şifre alanı boş bırakılamaz")
    @NotBlank(message = "şifre alanı boş bırakılamaz")
    @Size(min = 8, message = "şifre alanı 8 karakterden kısa olamaz")
    private String password;
}
