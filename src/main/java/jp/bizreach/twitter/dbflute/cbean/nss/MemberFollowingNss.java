package jp.bizreach.twitter.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import jp.bizreach.twitter.dbflute.cbean.cq.MemberFollowingCQ;

/**
 * The nest select set-upper of member_following.
 * @author DBFlute(AutoGenerator)
 */
public class MemberFollowingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberFollowingCQ _query;
    public MemberFollowingNss(MemberFollowingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * member by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     */
    public void withMemberByMyMemberId() {
        _query.doNss(new MemberFollowingCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberByMyMemberId(); }});
    }
    /**
     * With nested relation columns to select clause. <br />
     * member by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     */
    public void withMemberByYourMemberId() {
        _query.doNss(new MemberFollowingCQ.NssCall() { public ConditionQuery qf() { return _query.queryMemberByYourMemberId(); }});
    }
}
