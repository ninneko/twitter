package jp.bizreach.twitter.app.action;

import java.util.List;

import javax.annotation.Resource;

import jp.bizreach.twitter.app.form.MemberForm;
import jp.bizreach.twitter.common.Auth;
import jp.bizreach.twitter.dbflute.exbhv.MemberBhv;
import jp.bizreach.twitter.dbflute.exentity.Member;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class MemberAction {

    public MemberBhv memberBhv;

    public List<Member> memberList;

    @ActionForm
    @Resource
    MemberForm memberForm;

    @Auth
    @Execute(validator = false)
    public String index() {
        return "index.jsp";
    }

    @Execute(validator = false)
    public String signUp() {
        return "signUp.jsp";
    }

    @Execute(input = "signUp.jsp")
    public String add() {
        Member member = new Member();
        member.setMemberAccount(memberForm.account);
        member.setMemberName(memberForm.name);
        member.setMemberStatusCode("FML");

        memberBhv.insert(member);

        return "index.jsp";
    }

}
