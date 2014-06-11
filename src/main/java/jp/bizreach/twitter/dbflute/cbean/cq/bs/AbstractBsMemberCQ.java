package jp.bizreach.twitter.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import jp.bizreach.twitter.dbflute.allcommon.*;
import jp.bizreach.twitter.dbflute.cbean.*;
import jp.bizreach.twitter.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of member.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "member";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMNER_ID: {PK, ID, NotNull, INT(10)}
     * @param memnerId The value of memnerId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemnerId_Equal(Integer memnerId) {
        doSetMemnerId_Equal(memnerId);
    }

    protected void doSetMemnerId_Equal(Integer memnerId) {
        regMemnerId(CK_EQ, memnerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMNER_ID: {PK, ID, NotNull, INT(10)}
     * @param memnerId The value of memnerId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMemnerId_NotEqual(Integer memnerId) {
        doSetMemnerId_NotEqual(memnerId);
    }

    protected void doSetMemnerId_NotEqual(Integer memnerId) {
        regMemnerId(CK_NES, memnerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMNER_ID: {PK, ID, NotNull, INT(10)}
     * @param memnerId The value of memnerId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemnerId_GreaterThan(Integer memnerId) {
        regMemnerId(CK_GT, memnerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMNER_ID: {PK, ID, NotNull, INT(10)}
     * @param memnerId The value of memnerId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemnerId_LessThan(Integer memnerId) {
        regMemnerId(CK_LT, memnerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMNER_ID: {PK, ID, NotNull, INT(10)}
     * @param memnerId The value of memnerId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemnerId_GreaterEqual(Integer memnerId) {
        regMemnerId(CK_GE, memnerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * MEMNER_ID: {PK, ID, NotNull, INT(10)}
     * @param memnerId The value of memnerId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemnerId_LessEqual(Integer memnerId) {
        regMemnerId(CK_LE, memnerId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * MEMNER_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of memnerId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memnerId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemnerId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemnerId(), "MEMNER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMNER_ID: {PK, ID, NotNull, INT(10)}
     * @param memnerIdList The collection of memnerId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemnerId_InScope(Collection<Integer> memnerIdList) {
        doSetMemnerId_InScope(memnerIdList);
    }

    protected void doSetMemnerId_InScope(Collection<Integer> memnerIdList) {
        regINS(CK_INS, cTL(memnerIdList), getCValueMemnerId(), "MEMNER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * MEMNER_ID: {PK, ID, NotNull, INT(10)}
     * @param memnerIdList The collection of memnerId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemnerId_NotInScope(Collection<Integer> memnerIdList) {
        doSetMemnerId_NotInScope(memnerIdList);
    }

    protected void doSetMemnerId_NotInScope(Collection<Integer> memnerIdList) {
        regINS(CK_NINS, cTL(memnerIdList), getCValueMemnerId(), "MEMNER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select MY_MEMBER_ID from member_following where ...)} <br />
     * member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsMemberFollowingByMyMemberIdList</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberFollowingByMyMemberIdList for 'exists'. (NotNull)
     */
    public void existsMemberFollowingByMyMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_ExistsReferrer_MemberFollowingByMyMemberIdList(cb.query());
        registerExistsReferrer(cb.query(), "MEMNER_ID", "MY_MEMBER_ID", pp, "memberFollowingByMyMemberIdList");
    }
    public abstract String keepMemnerId_ExistsReferrer_MemberFollowingByMyMemberIdList(MemberFollowingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select YOUR_MEMBER_ID from member_following where ...)} <br />
     * member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsMemberFollowingByYourMemberIdList</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberFollowingByYourMemberIdList for 'exists'. (NotNull)
     */
    public void existsMemberFollowingByYourMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_ExistsReferrer_MemberFollowingByYourMemberIdList(cb.query());
        registerExistsReferrer(cb.query(), "MEMNER_ID", "YOUR_MEMBER_ID", pp, "memberFollowingByYourMemberIdList");
    }
    public abstract String keepMemnerId_ExistsReferrer_MemberFollowingByYourMemberIdList(MemberFollowingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br />
     * {exists (select MEMNER_ID from tweet where ...)} <br />
     * tweet by MEMNER_ID, named 'tweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">existsTweetList</span>(new SubQuery&lt;TweetCB&gt;() {
     *     public void query(TweetCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of TweetList for 'exists'. (NotNull)
     */
    public void existsTweetList(SubQuery<TweetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        TweetCB cb = new TweetCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_ExistsReferrer_TweetList(cb.query());
        registerExistsReferrer(cb.query(), "MEMNER_ID", "MEMNER_ID", pp, "tweetList");
    }
    public abstract String keepMemnerId_ExistsReferrer_TweetList(TweetCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select MY_MEMBER_ID from member_following where ...)} <br />
     * member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsMemberFollowingByMyMemberIdList</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemnerId_NotExistsReferrer_MemberFollowingByMyMemberIdList for 'not exists'. (NotNull)
     */
    public void notExistsMemberFollowingByMyMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_NotExistsReferrer_MemberFollowingByMyMemberIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMNER_ID", "MY_MEMBER_ID", pp, "memberFollowingByMyMemberIdList");
    }
    public abstract String keepMemnerId_NotExistsReferrer_MemberFollowingByMyMemberIdList(MemberFollowingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select YOUR_MEMBER_ID from member_following where ...)} <br />
     * member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsMemberFollowingByYourMemberIdList</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemnerId_NotExistsReferrer_MemberFollowingByYourMemberIdList for 'not exists'. (NotNull)
     */
    public void notExistsMemberFollowingByYourMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_NotExistsReferrer_MemberFollowingByYourMemberIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMNER_ID", "YOUR_MEMBER_ID", pp, "memberFollowingByYourMemberIdList");
    }
    public abstract String keepMemnerId_NotExistsReferrer_MemberFollowingByYourMemberIdList(MemberFollowingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br />
     * {not exists (select MEMNER_ID from tweet where ...)} <br />
     * tweet by MEMNER_ID, named 'tweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">notExistsTweetList</span>(new SubQuery&lt;TweetCB&gt;() {
     *     public void query(TweetCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemnerId_NotExistsReferrer_TweetList for 'not exists'. (NotNull)
     */
    public void notExistsTweetList(SubQuery<TweetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        TweetCB cb = new TweetCB(); cb.xsetupForExistsReferrer(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_NotExistsReferrer_TweetList(cb.query());
        registerNotExistsReferrer(cb.query(), "MEMNER_ID", "MEMNER_ID", pp, "tweetList");
    }
    public abstract String keepMemnerId_NotExistsReferrer_TweetList(TweetCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MY_MEMBER_ID from member_following where ...)} <br />
     * member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * @param subQuery The sub-query of MemberFollowingByMyMemberIdList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberFollowingByMyMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_InScopeRelation_MemberFollowingByMyMemberIdList(cb.query());
        registerInScopeRelation(cb.query(), "MEMNER_ID", "MY_MEMBER_ID", pp, "memberFollowingByMyMemberIdList");
    }
    public abstract String keepMemnerId_InScopeRelation_MemberFollowingByMyMemberIdList(MemberFollowingCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select YOUR_MEMBER_ID from member_following where ...)} <br />
     * member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * @param subQuery The sub-query of MemberFollowingByYourMemberIdList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberFollowingByYourMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_InScopeRelation_MemberFollowingByYourMemberIdList(cb.query());
        registerInScopeRelation(cb.query(), "MEMNER_ID", "YOUR_MEMBER_ID", pp, "memberFollowingByYourMemberIdList");
    }
    public abstract String keepMemnerId_InScopeRelation_MemberFollowingByYourMemberIdList(MemberFollowingCQ sq);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMNER_ID from tweet where ...)} <br />
     * tweet by MEMNER_ID, named 'tweetAsOne'.
     * @param subQuery The sub-query of TweetList for 'in-scope'. (NotNull)
     */
    public void inScopeTweetList(SubQuery<TweetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        TweetCB cb = new TweetCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_InScopeRelation_TweetList(cb.query());
        registerInScopeRelation(cb.query(), "MEMNER_ID", "MEMNER_ID", pp, "tweetList");
    }
    public abstract String keepMemnerId_InScopeRelation_TweetList(TweetCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MY_MEMBER_ID from member_following where ...)} <br />
     * member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * @param subQuery The sub-query of MemberFollowingByMyMemberIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberFollowingByMyMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_NotInScopeRelation_MemberFollowingByMyMemberIdList(cb.query());
        registerNotInScopeRelation(cb.query(), "MEMNER_ID", "MY_MEMBER_ID", pp, "memberFollowingByMyMemberIdList");
    }
    public abstract String keepMemnerId_NotInScopeRelation_MemberFollowingByMyMemberIdList(MemberFollowingCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select YOUR_MEMBER_ID from member_following where ...)} <br />
     * member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * @param subQuery The sub-query of MemberFollowingByYourMemberIdList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberFollowingByYourMemberIdList(SubQuery<MemberFollowingCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_NotInScopeRelation_MemberFollowingByYourMemberIdList(cb.query());
        registerNotInScopeRelation(cb.query(), "MEMNER_ID", "YOUR_MEMBER_ID", pp, "memberFollowingByYourMemberIdList");
    }
    public abstract String keepMemnerId_NotInScopeRelation_MemberFollowingByYourMemberIdList(MemberFollowingCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMNER_ID from tweet where ...)} <br />
     * tweet by MEMNER_ID, named 'tweetAsOne'.
     * @param subQuery The sub-query of TweetList for 'not in-scope'. (NotNull)
     */
    public void notInScopeTweetList(SubQuery<TweetCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        TweetCB cb = new TweetCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_NotInScopeRelation_TweetList(cb.query());
        registerNotInScopeRelation(cb.query(), "MEMNER_ID", "MEMNER_ID", pp, "tweetList");
    }
    public abstract String keepMemnerId_NotInScopeRelation_TweetList(TweetCQ sq);

    public void xsderiveMemberFollowingByMyMemberIdList(String fn, SubQuery<MemberFollowingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMNER_ID", "MY_MEMBER_ID", pp, "memberFollowingByMyMemberIdList", al, op);
    }
    public abstract String keepMemnerId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList(MemberFollowingCQ sq);

    public void xsderiveMemberFollowingByYourMemberIdList(String fn, SubQuery<MemberFollowingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMNER_ID", "YOUR_MEMBER_ID", pp, "memberFollowingByYourMemberIdList", al, op);
    }
    public abstract String keepMemnerId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList(MemberFollowingCQ sq);

    public void xsderiveTweetList(String fn, SubQuery<TweetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TweetCB cb = new TweetCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepMemnerId_SpecifyDerivedReferrer_TweetList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "MEMNER_ID", "MEMNER_ID", pp, "tweetList", al, op);
    }
    public abstract String keepMemnerId_SpecifyDerivedReferrer_TweetList(TweetCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from member_following where ...)} <br />
     * member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedMemberFollowingByMyMemberIdList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberFollowingCB> derivedMemberFollowingByMyMemberIdList() {
        return xcreateQDRFunctionMemberFollowingByMyMemberIdList();
    }
    protected HpQDRFunction<MemberFollowingCB> xcreateQDRFunctionMemberFollowingByMyMemberIdList() {
        return new HpQDRFunction<MemberFollowingCB>(new HpQDRSetupper<MemberFollowingCB>() {
            public void setup(String fn, SubQuery<MemberFollowingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMemberFollowingByMyMemberIdList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMemberFollowingByMyMemberIdList(String fn, SubQuery<MemberFollowingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepMemnerId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList(cb.query()); String prpp = keepMemnerId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMNER_ID", "MY_MEMBER_ID", sqpp, "memberFollowingByMyMemberIdList", rd, vl, prpp, op);
    }
    public abstract String keepMemnerId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList(MemberFollowingCQ sq);
    public abstract String keepMemnerId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from member_following where ...)} <br />
     * member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedMemberFollowingByYourMemberIdList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;MemberFollowingCB&gt;() {
     *     public void query(MemberFollowingCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MemberFollowingCB> derivedMemberFollowingByYourMemberIdList() {
        return xcreateQDRFunctionMemberFollowingByYourMemberIdList();
    }
    protected HpQDRFunction<MemberFollowingCB> xcreateQDRFunctionMemberFollowingByYourMemberIdList() {
        return new HpQDRFunction<MemberFollowingCB>(new HpQDRSetupper<MemberFollowingCB>() {
            public void setup(String fn, SubQuery<MemberFollowingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveMemberFollowingByYourMemberIdList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveMemberFollowingByYourMemberIdList(String fn, SubQuery<MemberFollowingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberFollowingCB cb = new MemberFollowingCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepMemnerId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList(cb.query()); String prpp = keepMemnerId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMNER_ID", "YOUR_MEMBER_ID", sqpp, "memberFollowingByYourMemberIdList", rd, vl, prpp, op);
    }
    public abstract String keepMemnerId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList(MemberFollowingCQ sq);
    public abstract String keepMemnerId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br />
     * {FOO &lt;= (select max(BAR) from tweet where ...)} <br />
     * tweet by MEMNER_ID, named 'tweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #DD4747">derivedTweetList()</span>.<span style="color: #DD4747">max</span>(new SubQuery&lt;TweetCB&gt;() {
     *     public void query(TweetCB subCB) {
     *         subCB.specify().<span style="color: #DD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #DD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TweetCB> derivedTweetList() {
        return xcreateQDRFunctionTweetList();
    }
    protected HpQDRFunction<TweetCB> xcreateQDRFunctionTweetList() {
        return new HpQDRFunction<TweetCB>(new HpQDRSetupper<TweetCB>() {
            public void setup(String fn, SubQuery<TweetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
                xqderiveTweetList(fn, sq, rd, vl, op);
            }
        });
    }
    public void xqderiveTweetList(String fn, SubQuery<TweetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TweetCB cb = new TweetCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String sqpp = keepMemnerId_QueryDerivedReferrer_TweetList(cb.query()); String prpp = keepMemnerId_QueryDerivedReferrer_TweetListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "MEMNER_ID", "MEMNER_ID", sqpp, "tweetList", rd, vl, prpp, op);
    }
    public abstract String keepMemnerId_QueryDerivedReferrer_TweetList(TweetCQ sq);
    public abstract String keepMemnerId_QueryDerivedReferrer_TweetListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * MEMNER_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setMemnerId_IsNull() { regMemnerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * MEMNER_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setMemnerId_IsNotNull() { regMemnerId(CK_ISNN, DOBJ); }

    protected void regMemnerId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemnerId(), "MEMNER_ID"); }
    protected abstract ConditionValue getCValueMemnerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(50)}
     * @param memberName The value of memberName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_Equal(String memberName) {
        doSetMemberName_Equal(fRES(memberName));
    }

    protected void doSetMemberName_Equal(String memberName) {
        regMemberName(CK_EQ, memberName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(50)}
     * @param memberName The value of memberName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_NotEqual(String memberName) {
        doSetMemberName_NotEqual(fRES(memberName));
    }

    protected void doSetMemberName_NotEqual(String memberName) {
        regMemberName(CK_NES, memberName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(50)}
     * @param memberName The value of memberName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_GreaterThan(String memberName) {
        regMemberName(CK_GT, fRES(memberName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(50)}
     * @param memberName The value of memberName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_LessThan(String memberName) {
        regMemberName(CK_LT, fRES(memberName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(50)}
     * @param memberName The value of memberName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_GreaterEqual(String memberName) {
        regMemberName(CK_GE, fRES(memberName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(50)}
     * @param memberName The value of memberName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_LessEqual(String memberName) {
        regMemberName(CK_LE, fRES(memberName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(50)}
     * @param memberNameList The collection of memberName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_InScope(Collection<String> memberNameList) {
        doSetMemberName_InScope(memberNameList);
    }

    public void doSetMemberName_InScope(Collection<String> memberNameList) {
        regINS(CK_INS, cTL(memberNameList), getCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(50)}
     * @param memberNameList The collection of memberName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_NotInScope(Collection<String> memberNameList) {
        doSetMemberName_NotInScope(memberNameList);
    }

    public void doSetMemberName_NotInScope(Collection<String> memberNameList) {
        regINS(CK_NINS, cTL(memberNameList), getCValueMemberName(), "MEMBER_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(50)}
     * @param memberName The value of memberName as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberName_PrefixSearch(String memberName) {
        setMemberName_LikeSearch(memberName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setMemberName_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberName The value of memberName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberName_LikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberName), getCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(50)}
     * @param memberName The value of memberName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberName_NotLikeSearch(String memberName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberName), getCValueMemberName(), "MEMBER_NAME", likeSearchOption);
    }

    protected void regMemberName(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberName(), "MEMBER_NAME"); }
    protected abstract ConditionValue getCValueMemberName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)}
     * @param memberAccount The value of memberAccount as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_Equal(String memberAccount) {
        doSetMemberAccount_Equal(fRES(memberAccount));
    }

    protected void doSetMemberAccount_Equal(String memberAccount) {
        regMemberAccount(CK_EQ, memberAccount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)}
     * @param memberAccount The value of memberAccount as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_NotEqual(String memberAccount) {
        doSetMemberAccount_NotEqual(fRES(memberAccount));
    }

    protected void doSetMemberAccount_NotEqual(String memberAccount) {
        regMemberAccount(CK_NES, memberAccount);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)}
     * @param memberAccount The value of memberAccount as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_GreaterThan(String memberAccount) {
        regMemberAccount(CK_GT, fRES(memberAccount));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)}
     * @param memberAccount The value of memberAccount as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_LessThan(String memberAccount) {
        regMemberAccount(CK_LT, fRES(memberAccount));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)}
     * @param memberAccount The value of memberAccount as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_GreaterEqual(String memberAccount) {
        regMemberAccount(CK_GE, fRES(memberAccount));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)}
     * @param memberAccount The value of memberAccount as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_LessEqual(String memberAccount) {
        regMemberAccount(CK_LE, fRES(memberAccount));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)}
     * @param memberAccountList The collection of memberAccount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_InScope(Collection<String> memberAccountList) {
        doSetMemberAccount_InScope(memberAccountList);
    }

    public void doSetMemberAccount_InScope(Collection<String> memberAccountList) {
        regINS(CK_INS, cTL(memberAccountList), getCValueMemberAccount(), "MEMBER_ACCOUNT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)}
     * @param memberAccountList The collection of memberAccount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_NotInScope(Collection<String> memberAccountList) {
        doSetMemberAccount_NotInScope(memberAccountList);
    }

    public void doSetMemberAccount_NotInScope(Collection<String> memberAccountList) {
        regINS(CK_NINS, cTL(memberAccountList), getCValueMemberAccount(), "MEMBER_ACCOUNT");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)}
     * @param memberAccount The value of memberAccount as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberAccount_PrefixSearch(String memberAccount) {
        setMemberAccount_LikeSearch(memberAccount, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)} <br />
     * <pre>e.g. setMemberAccount_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberAccount The value of memberAccount as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberAccount_LikeSearch(String memberAccount, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberAccount), getCValueMemberAccount(), "MEMBER_ACCOUNT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)}
     * @param memberAccount The value of memberAccount as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberAccount_NotLikeSearch(String memberAccount, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberAccount), getCValueMemberAccount(), "MEMBER_ACCOUNT", likeSearchOption);
    }

    protected void regMemberAccount(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberAccount(), "MEMBER_ACCOUNT"); }
    protected abstract ConditionValue getCValueMemberAccount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_Equal(String memberStatusCode) {
        doSetMemberStatusCode_Equal(fRES(memberStatusCode));
    }

    protected void doSetMemberStatusCode_Equal(String memberStatusCode) {
        regMemberStatusCode(CK_EQ, memberStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotEqual(String memberStatusCode) {
        doSetMemberStatusCode_NotEqual(fRES(memberStatusCode));
    }

    protected void doSetMemberStatusCode_NotEqual(String memberStatusCode) {
        regMemberStatusCode(CK_NES, memberStatusCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_GreaterThan(String memberStatusCode) {
        regMemberStatusCode(CK_GT, fRES(memberStatusCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_LessThan(String memberStatusCode) {
        regMemberStatusCode(CK_LT, fRES(memberStatusCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_GreaterEqual(String memberStatusCode) {
        regMemberStatusCode(CK_GE, fRES(memberStatusCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_LessEqual(String memberStatusCode) {
        regMemberStatusCode(CK_LE, fRES(memberStatusCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, CHAR(3)}
     * @param memberStatusCodeList The collection of memberStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_InScope(memberStatusCodeList);
    }

    public void doSetMemberStatusCode_InScope(Collection<String> memberStatusCodeList) {
        regINS(CK_INS, cTL(memberStatusCodeList), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, CHAR(3)}
     * @param memberStatusCodeList The collection of memberStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        doSetMemberStatusCode_NotInScope(memberStatusCodeList);
    }

    public void doSetMemberStatusCode_NotInScope(Collection<String> memberStatusCodeList) {
        regINS(CK_NINS, cTL(memberStatusCodeList), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberStatusCode_PrefixSearch(String memberStatusCode) {
        setMemberStatusCode_LikeSearch(memberStatusCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, CHAR(3)} <br />
     * <pre>e.g. setMemberStatusCode_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberStatusCode The value of memberStatusCode as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberStatusCode_LikeSearch(String memberStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberStatusCode), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_STATUS_CODE: {NotNull, CHAR(3)}
     * @param memberStatusCode The value of memberStatusCode as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberStatusCode_NotLikeSearch(String memberStatusCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberStatusCode), getCValueMemberStatusCode(), "MEMBER_STATUS_CODE", likeSearchOption);
    }

    protected void regMemberStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberStatusCode(), "MEMBER_STATUS_CODE"); }
    protected abstract ConditionValue getCValueMemberStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_PASSWORD: {NotNull, VARCHAR(50)}
     * @param memberPassword The value of memberPassword as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberPassword_Equal(String memberPassword) {
        doSetMemberPassword_Equal(fRES(memberPassword));
    }

    protected void doSetMemberPassword_Equal(String memberPassword) {
        regMemberPassword(CK_EQ, memberPassword);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_PASSWORD: {NotNull, VARCHAR(50)}
     * @param memberPassword The value of memberPassword as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberPassword_NotEqual(String memberPassword) {
        doSetMemberPassword_NotEqual(fRES(memberPassword));
    }

    protected void doSetMemberPassword_NotEqual(String memberPassword) {
        regMemberPassword(CK_NES, memberPassword);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_PASSWORD: {NotNull, VARCHAR(50)}
     * @param memberPassword The value of memberPassword as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberPassword_GreaterThan(String memberPassword) {
        regMemberPassword(CK_GT, fRES(memberPassword));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_PASSWORD: {NotNull, VARCHAR(50)}
     * @param memberPassword The value of memberPassword as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberPassword_LessThan(String memberPassword) {
        regMemberPassword(CK_LT, fRES(memberPassword));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_PASSWORD: {NotNull, VARCHAR(50)}
     * @param memberPassword The value of memberPassword as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberPassword_GreaterEqual(String memberPassword) {
        regMemberPassword(CK_GE, fRES(memberPassword));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * MEMBER_PASSWORD: {NotNull, VARCHAR(50)}
     * @param memberPassword The value of memberPassword as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberPassword_LessEqual(String memberPassword) {
        regMemberPassword(CK_LE, fRES(memberPassword));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_PASSWORD: {NotNull, VARCHAR(50)}
     * @param memberPasswordList The collection of memberPassword as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberPassword_InScope(Collection<String> memberPasswordList) {
        doSetMemberPassword_InScope(memberPasswordList);
    }

    public void doSetMemberPassword_InScope(Collection<String> memberPasswordList) {
        regINS(CK_INS, cTL(memberPasswordList), getCValueMemberPassword(), "MEMBER_PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * MEMBER_PASSWORD: {NotNull, VARCHAR(50)}
     * @param memberPasswordList The collection of memberPassword as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberPassword_NotInScope(Collection<String> memberPasswordList) {
        doSetMemberPassword_NotInScope(memberPasswordList);
    }

    public void doSetMemberPassword_NotInScope(Collection<String> memberPasswordList) {
        regINS(CK_NINS, cTL(memberPasswordList), getCValueMemberPassword(), "MEMBER_PASSWORD");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_PASSWORD: {NotNull, VARCHAR(50)}
     * @param memberPassword The value of memberPassword as prefixSearch. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberPassword_PrefixSearch(String memberPassword) {
        setMemberPassword_LikeSearch(memberPassword, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * <pre>e.g. setMemberPassword_LikeSearch("xxx", new <span style="color: #DD4747">LikeSearchOption</span>().likeContain());</pre>
     * @param memberPassword The value of memberPassword as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMemberPassword_LikeSearch(String memberPassword, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(memberPassword), getCValueMemberPassword(), "MEMBER_PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * MEMBER_PASSWORD: {NotNull, VARCHAR(50)}
     * @param memberPassword The value of memberPassword as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMemberPassword_NotLikeSearch(String memberPassword, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(memberPassword), getCValueMemberPassword(), "MEMBER_PASSWORD", likeSearchOption);
    }

    protected void regMemberPassword(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberPassword(), "MEMBER_PASSWORD"); }
    protected abstract ConditionValue getCValueMemberPassword();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), MemberCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), MemberCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), MemberCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), MemberCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), MemberCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), MemberCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        MemberCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(MemberCQ sq);

    protected MemberCB xcreateScalarConditionCB() {
        MemberCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberCB xcreateScalarConditionPartitionByCB() {
        MemberCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberCB cb = new MemberCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "MEMNER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberCB cb = new MemberCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMNER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(MemberCQ sq);

    // ===================================================================================
    //                                                                          Compatible
    //                                                                          ==========
    /**
     * Order along the list of manual values. #beforejava8 <br />
     * This function with Union is unsupported! <br />
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderBean manualOrderBean = new ManualOrderBean();
        manualOrderBean.acceptOrderValueList(orderValueList);
        withManualOrder(manualOrderBean);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected MemberCB newMyCB() {
        return new MemberCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return MemberCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
