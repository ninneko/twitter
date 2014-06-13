package jp.bizreach.twitter.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import jp.bizreach.twitter.dbflute.cbean.cq.ciq.*;
import jp.bizreach.twitter.dbflute.cbean.*;
import jp.bizreach.twitter.dbflute.cbean.cq.*;

/**
 * The base condition-query of member.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberCQ extends AbstractBsMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from member) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberCIQ xcreateCIQ() {
        MemberCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberCIQ xnewCIQ() {
        return new MemberCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join member on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberId;
    public ConditionValue getMemberId() {
        if (_memberId == null) { _memberId = nCV(); }
        return _memberId;
    }
    protected ConditionValue getCValueMemberId() { return getMemberId(); }

    protected Map<String, MemberFollowingCQ> _memberId_ExistsReferrer_MemberFollowingByMyMemberIdListMap;
    public Map<String, MemberFollowingCQ> getMemberId_ExistsReferrer_MemberFollowingByMyMemberIdList() { return _memberId_ExistsReferrer_MemberFollowingByMyMemberIdListMap; }
    public String keepMemberId_ExistsReferrer_MemberFollowingByMyMemberIdList(MemberFollowingCQ sq) {
        if (_memberId_ExistsReferrer_MemberFollowingByMyMemberIdListMap == null) { _memberId_ExistsReferrer_MemberFollowingByMyMemberIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_ExistsReferrer_MemberFollowingByMyMemberIdListMap.size() + 1);
        _memberId_ExistsReferrer_MemberFollowingByMyMemberIdListMap.put(ky, sq); return "memberId_ExistsReferrer_MemberFollowingByMyMemberIdList." + ky;
    }

    protected Map<String, MemberFollowingCQ> _memberId_ExistsReferrer_MemberFollowingByYourMemberIdListMap;
    public Map<String, MemberFollowingCQ> getMemberId_ExistsReferrer_MemberFollowingByYourMemberIdList() { return _memberId_ExistsReferrer_MemberFollowingByYourMemberIdListMap; }
    public String keepMemberId_ExistsReferrer_MemberFollowingByYourMemberIdList(MemberFollowingCQ sq) {
        if (_memberId_ExistsReferrer_MemberFollowingByYourMemberIdListMap == null) { _memberId_ExistsReferrer_MemberFollowingByYourMemberIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_ExistsReferrer_MemberFollowingByYourMemberIdListMap.size() + 1);
        _memberId_ExistsReferrer_MemberFollowingByYourMemberIdListMap.put(ky, sq); return "memberId_ExistsReferrer_MemberFollowingByYourMemberIdList." + ky;
    }

    protected Map<String, MemberSecurityCQ> _memberId_ExistsReferrer_MemberSecurityAsOneMap;
    public Map<String, MemberSecurityCQ> getMemberId_ExistsReferrer_MemberSecurityAsOne() { return _memberId_ExistsReferrer_MemberSecurityAsOneMap; }
    public String keepMemberId_ExistsReferrer_MemberSecurityAsOne(MemberSecurityCQ sq) {
        if (_memberId_ExistsReferrer_MemberSecurityAsOneMap == null) { _memberId_ExistsReferrer_MemberSecurityAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_ExistsReferrer_MemberSecurityAsOneMap.size() + 1);
        _memberId_ExistsReferrer_MemberSecurityAsOneMap.put(ky, sq); return "memberId_ExistsReferrer_MemberSecurityAsOne." + ky;
    }

    protected Map<String, TweetCQ> _memberId_ExistsReferrer_TweetListMap;
    public Map<String, TweetCQ> getMemberId_ExistsReferrer_TweetList() { return _memberId_ExistsReferrer_TweetListMap; }
    public String keepMemberId_ExistsReferrer_TweetList(TweetCQ sq) {
        if (_memberId_ExistsReferrer_TweetListMap == null) { _memberId_ExistsReferrer_TweetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_ExistsReferrer_TweetListMap.size() + 1);
        _memberId_ExistsReferrer_TweetListMap.put(ky, sq); return "memberId_ExistsReferrer_TweetList." + ky;
    }

    protected Map<String, MemberFollowingCQ> _memberId_NotExistsReferrer_MemberFollowingByMyMemberIdListMap;
    public Map<String, MemberFollowingCQ> getMemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList() { return _memberId_NotExistsReferrer_MemberFollowingByMyMemberIdListMap; }
    public String keepMemberId_NotExistsReferrer_MemberFollowingByMyMemberIdList(MemberFollowingCQ sq) {
        if (_memberId_NotExistsReferrer_MemberFollowingByMyMemberIdListMap == null) { _memberId_NotExistsReferrer_MemberFollowingByMyMemberIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotExistsReferrer_MemberFollowingByMyMemberIdListMap.size() + 1);
        _memberId_NotExistsReferrer_MemberFollowingByMyMemberIdListMap.put(ky, sq); return "memberId_NotExistsReferrer_MemberFollowingByMyMemberIdList." + ky;
    }

    protected Map<String, MemberFollowingCQ> _memberId_NotExistsReferrer_MemberFollowingByYourMemberIdListMap;
    public Map<String, MemberFollowingCQ> getMemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList() { return _memberId_NotExistsReferrer_MemberFollowingByYourMemberIdListMap; }
    public String keepMemberId_NotExistsReferrer_MemberFollowingByYourMemberIdList(MemberFollowingCQ sq) {
        if (_memberId_NotExistsReferrer_MemberFollowingByYourMemberIdListMap == null) { _memberId_NotExistsReferrer_MemberFollowingByYourMemberIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotExistsReferrer_MemberFollowingByYourMemberIdListMap.size() + 1);
        _memberId_NotExistsReferrer_MemberFollowingByYourMemberIdListMap.put(ky, sq); return "memberId_NotExistsReferrer_MemberFollowingByYourMemberIdList." + ky;
    }

    protected Map<String, MemberSecurityCQ> _memberId_NotExistsReferrer_MemberSecurityAsOneMap;
    public Map<String, MemberSecurityCQ> getMemberId_NotExistsReferrer_MemberSecurityAsOne() { return _memberId_NotExistsReferrer_MemberSecurityAsOneMap; }
    public String keepMemberId_NotExistsReferrer_MemberSecurityAsOne(MemberSecurityCQ sq) {
        if (_memberId_NotExistsReferrer_MemberSecurityAsOneMap == null) { _memberId_NotExistsReferrer_MemberSecurityAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotExistsReferrer_MemberSecurityAsOneMap.size() + 1);
        _memberId_NotExistsReferrer_MemberSecurityAsOneMap.put(ky, sq); return "memberId_NotExistsReferrer_MemberSecurityAsOne." + ky;
    }

    protected Map<String, TweetCQ> _memberId_NotExistsReferrer_TweetListMap;
    public Map<String, TweetCQ> getMemberId_NotExistsReferrer_TweetList() { return _memberId_NotExistsReferrer_TweetListMap; }
    public String keepMemberId_NotExistsReferrer_TweetList(TweetCQ sq) {
        if (_memberId_NotExistsReferrer_TweetListMap == null) { _memberId_NotExistsReferrer_TweetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotExistsReferrer_TweetListMap.size() + 1);
        _memberId_NotExistsReferrer_TweetListMap.put(ky, sq); return "memberId_NotExistsReferrer_TweetList." + ky;
    }

    protected Map<String, MemberFollowingCQ> _memberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdListMap;
    public Map<String, MemberFollowingCQ> getMemberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList() { return _memberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdListMap; }
    public String keepMemberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList(MemberFollowingCQ sq) {
        if (_memberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdListMap == null) { _memberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdListMap.size() + 1);
        _memberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdListMap.put(ky, sq); return "memberId_SpecifyDerivedReferrer_MemberFollowingByMyMemberIdList." + ky;
    }

    protected Map<String, MemberFollowingCQ> _memberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdListMap;
    public Map<String, MemberFollowingCQ> getMemberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList() { return _memberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdListMap; }
    public String keepMemberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList(MemberFollowingCQ sq) {
        if (_memberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdListMap == null) { _memberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdListMap.size() + 1);
        _memberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdListMap.put(ky, sq); return "memberId_SpecifyDerivedReferrer_MemberFollowingByYourMemberIdList." + ky;
    }

    protected Map<String, TweetCQ> _memberId_SpecifyDerivedReferrer_TweetListMap;
    public Map<String, TweetCQ> getMemberId_SpecifyDerivedReferrer_TweetList() { return _memberId_SpecifyDerivedReferrer_TweetListMap; }
    public String keepMemberId_SpecifyDerivedReferrer_TweetList(TweetCQ sq) {
        if (_memberId_SpecifyDerivedReferrer_TweetListMap == null) { _memberId_SpecifyDerivedReferrer_TweetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_SpecifyDerivedReferrer_TweetListMap.size() + 1);
        _memberId_SpecifyDerivedReferrer_TweetListMap.put(ky, sq); return "memberId_SpecifyDerivedReferrer_TweetList." + ky;
    }

    protected Map<String, MemberFollowingCQ> _memberId_InScopeRelation_MemberFollowingByMyMemberIdListMap;
    public Map<String, MemberFollowingCQ> getMemberId_InScopeRelation_MemberFollowingByMyMemberIdList() { return _memberId_InScopeRelation_MemberFollowingByMyMemberIdListMap; }
    public String keepMemberId_InScopeRelation_MemberFollowingByMyMemberIdList(MemberFollowingCQ sq) {
        if (_memberId_InScopeRelation_MemberFollowingByMyMemberIdListMap == null) { _memberId_InScopeRelation_MemberFollowingByMyMemberIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_MemberFollowingByMyMemberIdListMap.size() + 1);
        _memberId_InScopeRelation_MemberFollowingByMyMemberIdListMap.put(ky, sq); return "memberId_InScopeRelation_MemberFollowingByMyMemberIdList." + ky;
    }

    protected Map<String, MemberFollowingCQ> _memberId_InScopeRelation_MemberFollowingByYourMemberIdListMap;
    public Map<String, MemberFollowingCQ> getMemberId_InScopeRelation_MemberFollowingByYourMemberIdList() { return _memberId_InScopeRelation_MemberFollowingByYourMemberIdListMap; }
    public String keepMemberId_InScopeRelation_MemberFollowingByYourMemberIdList(MemberFollowingCQ sq) {
        if (_memberId_InScopeRelation_MemberFollowingByYourMemberIdListMap == null) { _memberId_InScopeRelation_MemberFollowingByYourMemberIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_MemberFollowingByYourMemberIdListMap.size() + 1);
        _memberId_InScopeRelation_MemberFollowingByYourMemberIdListMap.put(ky, sq); return "memberId_InScopeRelation_MemberFollowingByYourMemberIdList." + ky;
    }

    protected Map<String, MemberSecurityCQ> _memberId_InScopeRelation_MemberSecurityAsOneMap;
    public Map<String, MemberSecurityCQ> getMemberId_InScopeRelation_MemberSecurityAsOne() { return _memberId_InScopeRelation_MemberSecurityAsOneMap; }
    public String keepMemberId_InScopeRelation_MemberSecurityAsOne(MemberSecurityCQ sq) {
        if (_memberId_InScopeRelation_MemberSecurityAsOneMap == null) { _memberId_InScopeRelation_MemberSecurityAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_MemberSecurityAsOneMap.size() + 1);
        _memberId_InScopeRelation_MemberSecurityAsOneMap.put(ky, sq); return "memberId_InScopeRelation_MemberSecurityAsOne." + ky;
    }

    protected Map<String, TweetCQ> _memberId_InScopeRelation_TweetListMap;
    public Map<String, TweetCQ> getMemberId_InScopeRelation_TweetList() { return _memberId_InScopeRelation_TweetListMap; }
    public String keepMemberId_InScopeRelation_TweetList(TweetCQ sq) {
        if (_memberId_InScopeRelation_TweetListMap == null) { _memberId_InScopeRelation_TweetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_InScopeRelation_TweetListMap.size() + 1);
        _memberId_InScopeRelation_TweetListMap.put(ky, sq); return "memberId_InScopeRelation_TweetList." + ky;
    }

    protected Map<String, MemberFollowingCQ> _memberId_NotInScopeRelation_MemberFollowingByMyMemberIdListMap;
    public Map<String, MemberFollowingCQ> getMemberId_NotInScopeRelation_MemberFollowingByMyMemberIdList() { return _memberId_NotInScopeRelation_MemberFollowingByMyMemberIdListMap; }
    public String keepMemberId_NotInScopeRelation_MemberFollowingByMyMemberIdList(MemberFollowingCQ sq) {
        if (_memberId_NotInScopeRelation_MemberFollowingByMyMemberIdListMap == null) { _memberId_NotInScopeRelation_MemberFollowingByMyMemberIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberFollowingByMyMemberIdListMap.size() + 1);
        _memberId_NotInScopeRelation_MemberFollowingByMyMemberIdListMap.put(ky, sq); return "memberId_NotInScopeRelation_MemberFollowingByMyMemberIdList." + ky;
    }

    protected Map<String, MemberFollowingCQ> _memberId_NotInScopeRelation_MemberFollowingByYourMemberIdListMap;
    public Map<String, MemberFollowingCQ> getMemberId_NotInScopeRelation_MemberFollowingByYourMemberIdList() { return _memberId_NotInScopeRelation_MemberFollowingByYourMemberIdListMap; }
    public String keepMemberId_NotInScopeRelation_MemberFollowingByYourMemberIdList(MemberFollowingCQ sq) {
        if (_memberId_NotInScopeRelation_MemberFollowingByYourMemberIdListMap == null) { _memberId_NotInScopeRelation_MemberFollowingByYourMemberIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberFollowingByYourMemberIdListMap.size() + 1);
        _memberId_NotInScopeRelation_MemberFollowingByYourMemberIdListMap.put(ky, sq); return "memberId_NotInScopeRelation_MemberFollowingByYourMemberIdList." + ky;
    }

    protected Map<String, MemberSecurityCQ> _memberId_NotInScopeRelation_MemberSecurityAsOneMap;
    public Map<String, MemberSecurityCQ> getMemberId_NotInScopeRelation_MemberSecurityAsOne() { return _memberId_NotInScopeRelation_MemberSecurityAsOneMap; }
    public String keepMemberId_NotInScopeRelation_MemberSecurityAsOne(MemberSecurityCQ sq) {
        if (_memberId_NotInScopeRelation_MemberSecurityAsOneMap == null) { _memberId_NotInScopeRelation_MemberSecurityAsOneMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_MemberSecurityAsOneMap.size() + 1);
        _memberId_NotInScopeRelation_MemberSecurityAsOneMap.put(ky, sq); return "memberId_NotInScopeRelation_MemberSecurityAsOne." + ky;
    }

    protected Map<String, TweetCQ> _memberId_NotInScopeRelation_TweetListMap;
    public Map<String, TweetCQ> getMemberId_NotInScopeRelation_TweetList() { return _memberId_NotInScopeRelation_TweetListMap; }
    public String keepMemberId_NotInScopeRelation_TweetList(TweetCQ sq) {
        if (_memberId_NotInScopeRelation_TweetListMap == null) { _memberId_NotInScopeRelation_TweetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_NotInScopeRelation_TweetListMap.size() + 1);
        _memberId_NotInScopeRelation_TweetListMap.put(ky, sq); return "memberId_NotInScopeRelation_TweetList." + ky;
    }

    protected Map<String, MemberFollowingCQ> _memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListMap;
    public Map<String, MemberFollowingCQ> getMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList() { return _memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListMap; }
    public String keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList(MemberFollowingCQ sq) {
        if (_memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListMap == null) { _memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListMap.size() + 1);
        _memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListMap.put(ky, sq); return "memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdList." + ky;
    }
    protected Map<String, Object> _memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameterMap;
    public Map<String, Object> getMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter() { return _memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameterMap; }
    public String keepMemberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter(Object vl) {
        if (_memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameterMap == null) { _memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameterMap.size() + 1);
        _memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameterMap.put(ky, vl); return "memberId_QueryDerivedReferrer_MemberFollowingByMyMemberIdListParameter." + ky;
    }

    protected Map<String, MemberFollowingCQ> _memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListMap;
    public Map<String, MemberFollowingCQ> getMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList() { return _memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListMap; }
    public String keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList(MemberFollowingCQ sq) {
        if (_memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListMap == null) { _memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListMap.size() + 1);
        _memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListMap.put(ky, sq); return "memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdList." + ky;
    }
    protected Map<String, Object> _memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameterMap;
    public Map<String, Object> getMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter() { return _memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameterMap; }
    public String keepMemberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter(Object vl) {
        if (_memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameterMap == null) { _memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameterMap.size() + 1);
        _memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameterMap.put(ky, vl); return "memberId_QueryDerivedReferrer_MemberFollowingByYourMemberIdListParameter." + ky;
    }

    protected Map<String, TweetCQ> _memberId_QueryDerivedReferrer_TweetListMap;
    public Map<String, TweetCQ> getMemberId_QueryDerivedReferrer_TweetList() { return _memberId_QueryDerivedReferrer_TweetListMap; }
    public String keepMemberId_QueryDerivedReferrer_TweetList(TweetCQ sq) {
        if (_memberId_QueryDerivedReferrer_TweetListMap == null) { _memberId_QueryDerivedReferrer_TweetListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberId_QueryDerivedReferrer_TweetListMap.size() + 1);
        _memberId_QueryDerivedReferrer_TweetListMap.put(ky, sq); return "memberId_QueryDerivedReferrer_TweetList." + ky;
    }
    protected Map<String, Object> _memberId_QueryDerivedReferrer_TweetListParameterMap;
    public Map<String, Object> getMemberId_QueryDerivedReferrer_TweetListParameter() { return _memberId_QueryDerivedReferrer_TweetListParameterMap; }
    public String keepMemberId_QueryDerivedReferrer_TweetListParameter(Object vl) {
        if (_memberId_QueryDerivedReferrer_TweetListParameterMap == null) { _memberId_QueryDerivedReferrer_TweetListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberId_QueryDerivedReferrer_TweetListParameterMap.size() + 1);
        _memberId_QueryDerivedReferrer_TweetListParameterMap.put(ky, vl); return "memberId_QueryDerivedReferrer_TweetListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberId_Asc() { regOBA("MEMBER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberId_Desc() { regOBD("MEMBER_ID"); return this; }

    protected ConditionValue _memberName;
    public ConditionValue getMemberName() {
        if (_memberName == null) { _memberName = nCV(); }
        return _memberName;
    }
    protected ConditionValue getCValueMemberName() { return getMemberName(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberName_Asc() { regOBA("MEMBER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_NAME: {IX, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberName_Desc() { regOBD("MEMBER_NAME"); return this; }

    protected ConditionValue _memberAccount;
    public ConditionValue getMemberAccount() {
        if (_memberAccount == null) { _memberAccount = nCV(); }
        return _memberAccount;
    }
    protected ConditionValue getCValueMemberAccount() { return getMemberAccount(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberAccount_Asc() { regOBA("MEMBER_ACCOUNT"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberAccount_Desc() { regOBD("MEMBER_ACCOUNT"); return this; }

    protected ConditionValue _memberStatusCode;
    public ConditionValue getMemberStatusCode() {
        if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
        return _memberStatusCode;
    }
    protected ConditionValue getCValueMemberStatusCode() { return getMemberStatusCode(); }

    protected Map<String, MemberStatusCQ> _memberStatusCode_InScopeRelation_MemberStatusMap;
    public Map<String, MemberStatusCQ> getMemberStatusCode_InScopeRelation_MemberStatus() { return _memberStatusCode_InScopeRelation_MemberStatusMap; }
    public String keepMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ sq) {
        if (_memberStatusCode_InScopeRelation_MemberStatusMap == null) { _memberStatusCode_InScopeRelation_MemberStatusMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_InScopeRelation_MemberStatusMap.size() + 1);
        _memberStatusCode_InScopeRelation_MemberStatusMap.put(ky, sq); return "memberStatusCode_InScopeRelation_MemberStatus." + ky;
    }

    protected Map<String, MemberStatusCQ> _memberStatusCode_NotInScopeRelation_MemberStatusMap;
    public Map<String, MemberStatusCQ> getMemberStatusCode_NotInScopeRelation_MemberStatus() { return _memberStatusCode_NotInScopeRelation_MemberStatusMap; }
    public String keepMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ sq) {
        if (_memberStatusCode_NotInScopeRelation_MemberStatusMap == null) { _memberStatusCode_NotInScopeRelation_MemberStatusMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotInScopeRelation_MemberStatusMap.size() + 1);
        _memberStatusCode_NotInScopeRelation_MemberStatusMap.put(ky, sq); return "memberStatusCode_NotInScopeRelation_MemberStatus." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to member_status}
     * @return this. (NotNull)
     */
    public BsMemberCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMemberCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #DD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #DD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #DD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMemberCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MemberCQ bq = (MemberCQ)bqs;
        MemberCQ uq = (MemberCQ)uqs;
        if (bq.hasConditionQueryMemberStatus()) {
            uq.queryMemberStatus().reflectRelationOnUnionQuery(bq.queryMemberStatus(), uq.queryMemberStatus());
        }
        if (bq.hasConditionQueryMemberSecurityAsOne()) {
            uq.queryMemberSecurityAsOne().reflectRelationOnUnionQuery(bq.queryMemberSecurityAsOne(), uq.queryMemberSecurityAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * member_status by my MEMBER_STATUS_CODE, named 'memberStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberStatusCQ queryMemberStatus() {
        return getConditionQueryMemberStatus();
    }
    protected MemberStatusCQ _conditionQueryMemberStatus;
    public MemberStatusCQ getConditionQueryMemberStatus() {
        if (_conditionQueryMemberStatus == null) {
            _conditionQueryMemberStatus = xcreateQueryMemberStatus();
            xsetupOuterJoinMemberStatus();
        }
        return _conditionQueryMemberStatus;
    }
    protected MemberStatusCQ xcreateQueryMemberStatus() {
        String nrp = resolveNextRelationPath("member", "memberStatus");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberStatusCQ cq = new MemberStatusCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberStatus");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberStatus() {
        MemberStatusCQ cq = getConditionQueryMemberStatus();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE");
        registerOuterJoin(cq, joinOnMap, "memberStatus");
    }
    public boolean hasConditionQueryMemberStatus() {
        return _conditionQueryMemberStatus != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * member_security by MEMBER_ID, named 'memberSecurityAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberSecurityCQ queryMemberSecurityAsOne() {
        return getConditionQueryMemberSecurityAsOne();
    }
    protected MemberSecurityCQ _conditionQueryMemberSecurityAsOne;
    public MemberSecurityCQ getConditionQueryMemberSecurityAsOne() {
        if (_conditionQueryMemberSecurityAsOne == null) {
            _conditionQueryMemberSecurityAsOne = xcreateQueryMemberSecurityAsOne();
            xsetupOuterJoinMemberSecurityAsOne();
        }
        return _conditionQueryMemberSecurityAsOne;
    }
    protected MemberSecurityCQ xcreateQueryMemberSecurityAsOne() {
        String nrp = resolveNextRelationPath("member", "memberSecurityAsOne");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MemberSecurityCQ cq = new MemberSecurityCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("memberSecurityAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMemberSecurityAsOne() {
        MemberSecurityCQ cq = getConditionQueryMemberSecurityAsOne();
        Map<String, String> joinOnMap = newLinkedHashMapSized(4);
        joinOnMap.put("MEMBER_ID", "MEMBER_ID");
        registerOuterJoin(cq, joinOnMap, "memberSecurityAsOne");
    }
    public boolean hasConditionQueryMemberSecurityAsOne() {
        return _conditionQueryMemberSecurityAsOne != null;
    }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, MemberCQ> _scalarConditionMap;
    public Map<String, MemberCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MemberCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MemberCQ> _specifyMyselfDerivedMap;
    public Map<String, MemberCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MemberCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, MemberCQ> _queryMyselfDerivedMap;
    public Map<String, MemberCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MemberCQ sq) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(ky, sq); return "queryMyselfDerived." + ky;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object vl) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(ky, vl); return "queryMyselfDerivedParameter." + ky;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberCQ> _myselfExistsMap;
    public Map<String, MemberCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MemberCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MemberCQ> _myselfInScopeMap;
    public Map<String, MemberCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MemberCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberCB.class.getName(); }
    protected String xCQ() { return MemberCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
