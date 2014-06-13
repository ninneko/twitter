package jp.bizreach.twitter.app.action;

import java.util.List;

import jp.bizreach.twitter.app.dto.MemberDto;
import jp.bizreach.twitter.common.Auth;
import jp.bizreach.twitter.dbflute.cbean.MemberFollowingCB;
import jp.bizreach.twitter.dbflute.cbean.TweetCB;
import jp.bizreach.twitter.dbflute.exbhv.TweetBhv;
import jp.bizreach.twitter.dbflute.exentity.Tweet;

import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.struts.annotation.Execute;

public class MypageAction {

    public MemberDto memberDto;
    public List<Tweet> tweetList;
    public TweetBhv tweetBhv;

    @Auth
    @Execute(validator = false)
    public String index() {
        TweetCB cb = new TweetCB();
        cb.setupSelect_Member();

        cb.query().queryMember().existsMemberFollowingByYourMemberIdList(new SubQuery<MemberFollowingCB>() {
            @Override
            public void query(MemberFollowingCB subCB) {
                subCB.query().setMyMemberId_Equal(memberDto.memberId);
            }
        });

        tweetList = tweetBhv.selectList(cb);

        return "index.jsp";
    }
}
