package com.wdcals.wdcommunity.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @OneToMany(mappedBy = "member")
    private List<Board> boards;

    @Builder
    public Member(Long id, String username, List<Board> boards) {
        this.id = id;
        this.username = username;
        this.boards = boards;
    }
}
