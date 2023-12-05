package models.member;

import commons.exceptions.BadRequestException;
import commons.validators.RequiredValidator;
import commons.validators.Validator;

public class JoinValidator implements Validator<Member>, RequiredValidator {
    public void validate(Member member) {
        /* 필수 항목 검증(아이디, 비밀번호, 비밀번호 확인, 회원명) */

        String userId = member.getUserId();
        String userPw = member.getUserPw();
        String confirmPw = member.getConfirmPw();
        String userNm = member.getUserNm();

        // 필수 항목 - null 또는 빈 공백 문자 체크
        // 반복되는 작업은 공통 모듈을 생성해서 처리(interface)
        /*if (userId == null || userId.isBlank()) {
            throw new BadRequestException("아이디를 입력하세요👻");
        }

        if (userPw == null || userPw.isBlank()) {
            throw new BadRequestException("비밀번호를 입력하세요👻");
        }*/

        checkRequired(userId, new BadRequestException("아이디를 입력하세요👻"));
        checkRequired(userPw, new BadRequestException("비밀번호를 입력하세요👻"));
        checkRequired(confirmPw, new BadRequestException("비밀번호를 확인하세요👻"));
        checkRequired(userNm, new BadRequestException("회원명을 입력하세요👻"));
    }
}
