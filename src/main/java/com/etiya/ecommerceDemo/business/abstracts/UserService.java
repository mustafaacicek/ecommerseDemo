package com.etiya.ecommerceDemo.business.abstracts;

import com.etiya.ecommerceDemo.business.dtos.requests.users.AddUserRequest;
import com.etiya.ecommerceDemo.business.dtos.responses.users.AddUserResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.users.ListUserResponse;

import java.util.List;

public interface UserService {
    List<ListUserResponse> getAll();

    ListUserResponse getById(Long id);

    AddUserResponse addUser(AddUserRequest addUserRequest) throws Exception;
}
