package com.wewk.vo;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter @Setter
public class MemberJoinVo {


    @NotNull(message = "아이디를 입력해주세요.")
    private String mberId;

    @NotNull(message = "이름을 입력해주세요.")
    private String mberNm;

    @NotNull(message = "비밀번호를 입력해주세요.")
    private String mberPw;

    @NotNull(message = "비밀번호를 확인해주세요.")
    private String mberPwConfirm;

    @NotNull(message = "이메일을 입력해주세요.")
    @Pattern(regexp = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+$", message = "이메일 형식이 올바르지 않습니다.")
    private String mberEmail;

}
