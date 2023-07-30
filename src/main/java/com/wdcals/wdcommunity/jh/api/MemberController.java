package com.wdcals.wdcommunity.jh.api;

import com.wdcals.wdcommunity.jh.dto.SignUpRequestDto;
import com.wdcals.wdcommunity.jh.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/jh/api/members")
@RestController
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/sign-up")
    public ResponseEntity<Long> signUp(@RequestBody SignUpRequestDto signUpRequestDto) {

        return ResponseEntity.ok(memberService.signUp(signUpRequestDto));
    }
}
