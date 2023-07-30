package com.wdcals.wdcommunity.jh.service;

import com.wdcals.wdcommunity.entity.Member;
import com.wdcals.wdcommunity.jh.dto.SignUpRequestDto;
import com.wdcals.wdcommunity.jh.exception.DuplicateUsernameException;
import com.wdcals.wdcommunity.jh.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;


    public Long signUp(SignUpRequestDto signUpRequestDto) {
        memberRepository.findByUsername(signUpRequestDto.username())
                .ifPresent(m -> new DuplicateUsernameException("이미 존재하는 이름입니다."));

        var signUpUser = memberRepository.save(Member.builder()
                .username(signUpRequestDto.username())
                .build());

        return signUpUser.getId();
    }
}
