package com.maha.springsecurityjwt.entity;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table(name ="User")
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String password;
    private boolean active;
    private String roles;
}
