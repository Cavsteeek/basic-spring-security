package com.cavsteek.basic.spring.security.entities;



@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
}
