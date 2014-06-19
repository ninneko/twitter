package jp.bizreach.twitter.app.action;

import javax.annotation.Resource;

import jp.bizreach.twitter.app.dto.MemberDto;
import jp.bizreach.twitter.app.form.SignupForm;
import jp.bizreach.twitter.dbflute.exbhv.MemberBhv;
import jp.bizreach.twitter.dbflute.exentity.Member;
import jp.bizreach.twitter.dbflute.exentity.MemberSecurity;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class SignupAction {

    @ActionForm
    public SignupForm signupForm;
    public MemberBhv memberBhv;
    @Resource
    protected MemberDto memberDto;

    @Execute(validator = false)
    public String index() {

        return "signup.jsp";
    }

    @Execute(input = "signup.jsp")
    public String entry() {
        Member member = new Member();
        member.setMemberAccount(signupForm.account);
        member.setMemberName(signupForm.name);
        member.setMemberStatusCode("FML");
        System.out.println(signupForm);
        memberBhv.insert(member);

        MemberSecurity security = new MemberSecurity();
        security.setMemberId(member.getMemberId());
        security.setPassword(signupForm.password);

        memberDto.memberId = member.getMemberId();
        return "/mypage/?redirect=true";
    }
}