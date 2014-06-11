package jp.bizreach.twitter.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import jp.bizreach.twitter.dbflute.cbean.cq.TweetCQ;

/**
 * The nest select set-upper of tweet.
 * @author DBFlute(AutoGenerator)
 */
public class TweetNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TweetCQ _query;
    public TweetNss(TweetCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * member by my MEMNER_ID, named 'member'.
     */
    public void withMember() {
        _query.doNss(new TweetCQ.NssCall() { public ConditionQuery qf() { return _query.queryMember(); }});
    }
}
