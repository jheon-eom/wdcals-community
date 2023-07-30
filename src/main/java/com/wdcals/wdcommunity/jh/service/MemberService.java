package com.wdcals.wdcommunity.jh.service;

import com.wdcals.wdcommunity.entity.Member;
import com.wdcals.wdcommunity.jh.dto.SignUpRequestDto;
import com.wdcals.wdcommunity.jh.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public Long signUp(SignUpRequestDto signUpRequestDto) {
        Assert.isTrue(!memberRepository.findByUsername(signUpRequestDto.username()).isPresent(),
                "이미 존재하는 이름입니다.");

        var signUpUser = memberRepository.save(Member.builder()
                .username(signUpRequestDto.username())
                .build());

        return signUpUser.getId();
    }
}
