package jp.bizreach.twitter.app.action;

import javax.annotation.Resource;

import jp.bizreach.twitter.app.dto.MemberDto;
import jp.bizreach.twitter.app.form.LoginForm;
import jp.bizreach.twitter.dbflute.cbean.MemberCB;
import jp.bizreach.twitter.dbflute.exbhv.MemberBhv;
import jp.bizreach.twitter.dbflute.exentity.Member;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class LoginAction {

    @Resource
    @ActionForm
    protected LoginForm loginForm;

    @Resource
    protected MemberDto memberDto;

    @Resource
    MemberBhv memberBhv;

    @Execute(validator = false)
    public String index() {
        return "loginForm.jsp";
    }

    @Execute(validator = true, input = "logionForm.jsp")
    public String login() {
        MemberCB cb = new MemberCB();
        cb.query().setMemberAccount_Equal(loginForm.account);
        cb.query().queryMemberSecurityAsOne().setPassword_Equal(loginForm.password);
        cb.fetchFirst(1);

        Member member = memberBhv.selectEntity(cb);

        if (member != null) {
            memberDto.memberId = member.getMemberId();
            return "/mypage/?redirect=true";
        } else {
            return "/login/?redirect=true";
        }
    }
}
