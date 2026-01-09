package com.backend.general.Models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseModel {
    private String username;
    private String email;
    private String password;
    private State state;
    private List<Role> roles = new ArrayList<>();
}
