package com.wdcals.wdCommunity.domain;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Board {

    private Long id;

    private String title;

    private String content;
}
