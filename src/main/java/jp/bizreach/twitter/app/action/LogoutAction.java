package jp.bizreach.twitter.app.action;

import javax.annotation.Resource;

import jp.bizreach.twitter.app.dto.MemberDto;
import jp.bizreach.twitter.app.form.LoginForm;
import jp.bizreach.twitter.dbflute.exbhv.MemberBhv;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class LogoutAction {

    @Resource
    @ActionForm
    protected LoginForm loginForm;

    @Resource
    protected MemberDto memberDto;

    @Resource
    MemberBhv memberBhv;

    @Execute(validator = false)
    public String index() {
        memberDto.memberId = null;
        memberDto.memberAccount = null;
        memberDto.memberName = null;

        return "/?redirect=true";
    }
}
