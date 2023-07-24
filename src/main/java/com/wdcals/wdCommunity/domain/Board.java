package com.wdcals.wdCommunity.domain;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@Entity _ 2023-07-24
public class Board {

    private Long id;

    private String title;

    private String content;
}
