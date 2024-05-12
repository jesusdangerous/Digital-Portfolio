package com.digitalportfolio.SAFportfolio.service;

import com.digitalportfolio.SAFportfolio.dto.UserDto;
import com.digitalportfolio.SAFportfolio.model.User;

public interface UserService {
    User findByUsername(String username);
    User save (UserDto userDto);
}
