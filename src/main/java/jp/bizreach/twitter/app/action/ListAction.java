package jp.bizreach.twitter.app.action;

import java.util.ArrayList;
import java.util.List;

import jp.bizreach.twitter.dbflute.cbean.MemberCB;
import jp.bizreach.twitter.dbflute.exbhv.MemberBhv;
import jp.bizreach.twitter.dbflute.exbhv.TweetBhv;
import jp.bizreach.twitter.dbflute.exentity.Member;
import jp.bizreach.twitter.dbflute.exentity.MemberSecurity;
import jp.bizreach.twitter.domainfw.PagingNavi;
import net.arnx.jsonic.JSON;

import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.util.ResponseUtil;

public class ListAction {

    public Integer num;
    public TweetBhv tweetBhv;
    public MemberBhv memberBhv;
    public List<MemberWebBean> beanList;
    public PagingNavi pagingNavi = new PagingNavi();

    //    @Execute(validator = false, urlPattern = "{num}")
    //    public String index() {
    //        if (num == null) {
    //            num = 0;
    //        }
    //        MemberCB cb = new MemberCB();
    //        cb.paging(5, num);
    //
    //        PagingResultBean<Member> page = memberBhv.selectPage(cb);
    //        pagingNavi.prepare(page, "list");
    //        memberList = page.getSelectedList();
    //
    //        return "/memberlist.jsp";
    //    }
    @Execute(validator = false)
    public String index() {
        return "/memberlist.jsp";
    }

    @Execute(validator = false, urlPattern = "json/{num}")
    public String json() {
        int pagingnum;

        pagingnum = num;
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberSecurityAsOne();
        cb.paging(5, pagingnum);

        PagingResultBean<Member> page = memberBhv.selectPage(cb);
        beanList = new ArrayList<MemberWebBean>();
        pagingNavi.prepare(page, "list");
        List<Member> selectedList = page.getSelectedList();

        for (Member member : selectedList) {
            MemberWebBean bean = new MemberWebBean();
            bean.memberId = member.getMemberId();
            bean.memberName = member.getMemberName();
            bean.memberAccount = member.getMemberAccount();
            MemberSecurity memberSecurityAsOne = member.getMemberSecurityAsOne();
            bean.password = memberSecurityAsOne.getPassword();
            beanList.add(bean);
        }

        if (num == null) {
            return "/memberlist.jsp";
        } else {
            String jsonText = JSON.encode(beanList);
            ResponseUtil.write(jsonText, "application/json");
            return null;
        }
    }
}