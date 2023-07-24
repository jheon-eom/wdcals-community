package com.wdcals.wdCommunity.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Board extends BaseEntity {
    /**
     * 필드 (테이블 컬럼)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    /**
     * 생성자 & 팩토리 메소드
     */
    @Builder
    public Board(Long id, String title, String content, boolean isDeleted, Member member) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.isDeleted = isDeleted;
        this.member = member;
    }

    /**
     * 비즈니스 로직
     */
}
