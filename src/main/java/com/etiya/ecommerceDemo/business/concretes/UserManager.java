package com.etiya.ecommerceDemo.business.concretes;

import com.etiya.ecommerceDemo.business.abstracts.UserService;
import com.etiya.ecommerceDemo.business.dtos.requests.users.AddUserRequest;
import com.etiya.ecommerceDemo.business.dtos.responses.users.AddUserResponse;
import com.etiya.ecommerceDemo.business.dtos.responses.users.ListUserResponse;
import com.etiya.ecommerceDemo.entities.concretes.User;
import com.etiya.ecommerceDemo.repositories.abstracts.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserManager implements UserService {
    private UserDao userDao;

    @Override
    public List<ListUserResponse> getAll() {
        return userDao.getAll();
    }

    @Override
    public ListUserResponse getById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public AddUserResponse addUser(AddUserRequest addUserRequest) throws Exception {
        if (userDao.findByEmail(addUserRequest.getEmail()) != null) {
            throw new Exception("Girdiğiniz email zaten mevcut");
        }

        User user = new User();
        user.setFirst_name(addUserRequest.getFirst_name());
        user.setLast_name(addUserRequest.getLast_name());
        user.setEmail(addUserRequest.getEmail());
        user.setPassword(addUserRequest.getPassword());

        userDao.save(user);
        AddUserResponse addUserResponse = new AddUserResponse(user.getId(), user.getFirst_name(), user.getLast_name(), user.getEmail(), user.getPassword());
        return addUserResponse;
    }
}
