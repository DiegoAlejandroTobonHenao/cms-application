package com.cms.domain.vo;

import com.cms.domain.model.Role;
import lombok.Data;

@Data
public class UserRequest {

    String identity;

    String name;

    Role role;

}
