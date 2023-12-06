package models.member;

import commons.exceptions.BadRequestException;
import commons.validators.RequiredValidator;
import commons.validators.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class JoinValidator implements Validator<Member>, RequiredValidator {

    // 전략패턴
    // 상속은 확장에 유리하지 않은 형태이므로
    // 내부 구성 요소로서 추가하는 것이 확장에 가장 유리한 구조이다.
    @Autowired
    @Qualifier("memberDao")
    private MemberDao memberDao;

    public JoinValidator() {}

    // 내부구성요소로 추가하는 것 보다 외부 요소를 주입받는 것이 더 좋다.
    public JoinValidator(MemberDao memberDao) {
        this.memberDao = memberDao;

    }

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

        // 캡슐화
        // 필수 항목 - null 또는 빈 공백 문자
        // RuntimeException e = new BadRequestException
        checkRequired(userId, new BadRequestException("아이디를 입력하세요👻"));
        checkRequired(userPw, new BadRequestException("비밀번호를 입력하세요👻"));
        checkRequired(confirmPw, new BadRequestException("비밀번호를 확인하세요👻"));
        checkRequired(userNm, new BadRequestException("회원명을 입력하세요👻"));

        // 아이디가 이미 등록되어 있는지 체크
        checkFalse(memberDao.exists(userId), new BadRequestException("이미 등록된 아이디 입니다👻") );


        // 비밀번호, 비밀번호 확인 시 일치 여부
        checkTrue(userPw.equals(confirmPw), new BadRequestException("비밀번호가 일치하지 않습니다👻"));

    }
}
