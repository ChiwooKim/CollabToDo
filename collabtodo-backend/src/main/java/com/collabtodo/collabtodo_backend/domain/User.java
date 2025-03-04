package com.collabtodo.collabtodo_backend.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 로그인 ID 및 이메일(중복 x)
    @Column(nullable = false, unique = true)
    private String email;

    // 사용자명(닉네임)
    @Column(nullable = false, unique = true)
    private String username;

    // 암호화된 비밀번호
    @Column(nullable = false)
    private String password;

    // 사용자가 작성한 할 일
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Todo> todos = new ArrayList<>();
}
