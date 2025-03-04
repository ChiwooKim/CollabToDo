package com.collabtodo.collabtodo_backend.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "todos")
@Getter
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 할 일 제목
    @Column(nullable = false)
    private String title;

    // 완료 여부
    @Column(nullable = false)
    private boolean completed = false;

    // 할 일을 작성한 사용자
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
