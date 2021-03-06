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
 * The base condition-query of member_status.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberStatusCQ extends AbstractBsMemberStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from member_status) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberStatusCIQ xcreateCIQ() {
        MemberStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberStatusCIQ xnewCIQ() {
        return new MemberStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join member_status on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #DD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberStatusCode;
    public ConditionValue getMemberStatusCode() {
        if (_memberStatusCode == null) { _memberStatusCode = nCV(); }
        return _memberStatusCode;
    }
    protected ConditionValue getCValueMemberStatusCode() { return getMemberStatusCode(); }

    protected Map<String, MemberCQ> _memberStatusCode_ExistsReferrer_MemberListMap;
    public Map<String, MemberCQ> getMemberStatusCode_ExistsReferrer_MemberList() { return _memberStatusCode_ExistsReferrer_MemberListMap; }
    public String keepMemberStatusCode_ExistsReferrer_MemberList(MemberCQ sq) {
        if (_memberStatusCode_ExistsReferrer_MemberListMap == null) { _memberStatusCode_ExistsReferrer_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_ExistsReferrer_MemberListMap.size() + 1);
        _memberStatusCode_ExistsReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_ExistsReferrer_MemberList." + ky;
    }

    protected Map<String, MemberCQ> _memberStatusCode_NotExistsReferrer_MemberListMap;
    public Map<String, MemberCQ> getMemberStatusCode_NotExistsReferrer_MemberList() { return _memberStatusCode_NotExistsReferrer_MemberListMap; }
    public String keepMemberStatusCode_NotExistsReferrer_MemberList(MemberCQ sq) {
        if (_memberStatusCode_NotExistsReferrer_MemberListMap == null) { _memberStatusCode_NotExistsReferrer_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotExistsReferrer_MemberListMap.size() + 1);
        _memberStatusCode_NotExistsReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_NotExistsReferrer_MemberList." + ky;
    }

    protected Map<String, MemberCQ> _memberStatusCode_InScopeRelation_MemberListMap;
    public Map<String, MemberCQ> getMemberStatusCode_InScopeRelation_MemberList() { return _memberStatusCode_InScopeRelation_MemberListMap; }
    public String keepMemberStatusCode_InScopeRelation_MemberList(MemberCQ sq) {
        if (_memberStatusCode_InScopeRelation_MemberListMap == null) { _memberStatusCode_InScopeRelation_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_InScopeRelation_MemberListMap.size() + 1);
        _memberStatusCode_InScopeRelation_MemberListMap.put(ky, sq); return "memberStatusCode_InScopeRelation_MemberList." + ky;
    }

    protected Map<String, MemberCQ> _memberStatusCode_NotInScopeRelation_MemberListMap;
    public Map<String, MemberCQ> getMemberStatusCode_NotInScopeRelation_MemberList() { return _memberStatusCode_NotInScopeRelation_MemberListMap; }
    public String keepMemberStatusCode_NotInScopeRelation_MemberList(MemberCQ sq) {
        if (_memberStatusCode_NotInScopeRelation_MemberListMap == null) { _memberStatusCode_NotInScopeRelation_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_NotInScopeRelation_MemberListMap.size() + 1);
        _memberStatusCode_NotInScopeRelation_MemberListMap.put(ky, sq); return "memberStatusCode_NotInScopeRelation_MemberList." + ky;
    }

    protected Map<String, MemberCQ> _memberStatusCode_SpecifyDerivedReferrer_MemberListMap;
    public Map<String, MemberCQ> getMemberStatusCode_SpecifyDerivedReferrer_MemberList() { return _memberStatusCode_SpecifyDerivedReferrer_MemberListMap; }
    public String keepMemberStatusCode_SpecifyDerivedReferrer_MemberList(MemberCQ sq) {
        if (_memberStatusCode_SpecifyDerivedReferrer_MemberListMap == null) { _memberStatusCode_SpecifyDerivedReferrer_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_SpecifyDerivedReferrer_MemberListMap.size() + 1);
        _memberStatusCode_SpecifyDerivedReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_SpecifyDerivedReferrer_MemberList." + ky;
    }

    protected Map<String, MemberCQ> _memberStatusCode_QueryDerivedReferrer_MemberListMap;
    public Map<String, MemberCQ> getMemberStatusCode_QueryDerivedReferrer_MemberList() { return _memberStatusCode_QueryDerivedReferrer_MemberListMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberList(MemberCQ sq) {
        if (_memberStatusCode_QueryDerivedReferrer_MemberListMap == null) { _memberStatusCode_QueryDerivedReferrer_MemberListMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_memberStatusCode_QueryDerivedReferrer_MemberListMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_MemberListMap.put(ky, sq); return "memberStatusCode_QueryDerivedReferrer_MemberList." + ky;
    }
    protected Map<String, Object> _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap;
    public Map<String, Object> getMemberStatusCode_QueryDerivedReferrer_MemberListParameter() { return _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap; }
    public String keepMemberStatusCode_QueryDerivedReferrer_MemberListParameter(Object vl) {
        if (_memberStatusCode_QueryDerivedReferrer_MemberListParameterMap == null) { _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap = newLinkedHashMapSized(4); }
        String ky = "subQueryParameterKey" + (_memberStatusCode_QueryDerivedReferrer_MemberListParameterMap.size() + 1);
        _memberStatusCode_QueryDerivedReferrer_MemberListParameterMap.put(ky, vl); return "memberStatusCode_QueryDerivedReferrer_MemberListParameter." + ky;
    }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusCode_Asc() { regOBA("MEMBER_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusCode_Desc() { regOBD("MEMBER_STATUS_CODE"); return this; }

    protected ConditionValue _memberStatusName;
    public ConditionValue getMemberStatusName() {
        if (_memberStatusName == null) { _memberStatusName = nCV(); }
        return _memberStatusName;
    }
    protected ConditionValue getCValueMemberStatusName() { return getMemberStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * MEMBER_STATUS_NAME: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusName_Asc() { regOBA("MEMBER_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * MEMBER_STATUS_NAME: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_MemberStatusName_Desc() { regOBD("MEMBER_STATUS_NAME"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue getDisplayOrder() {
        if (_displayOrder == null) { _displayOrder = nCV(); }
        return _displayOrder;
    }
    protected ConditionValue getCValueDisplayOrder() { return getDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsMemberStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public BsMemberStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsMemberStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, MemberStatusCQ> _scalarConditionMap;
    public Map<String, MemberStatusCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MemberStatusCQ sq) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(ky, sq); return "scalarCondition." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MemberStatusCQ> _specifyMyselfDerivedMap;
    public Map<String, MemberStatusCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MemberStatusCQ sq) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(ky, sq); return "specifyMyselfDerived." + ky;
    }

    protected Map<String, MemberStatusCQ> _queryMyselfDerivedMap;
    public Map<String, MemberStatusCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MemberStatusCQ sq) {
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
    protected Map<String, MemberStatusCQ> _myselfExistsMap;
    public Map<String, MemberStatusCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MemberStatusCQ sq) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(ky, sq); return "myselfExists." + ky;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MemberStatusCQ> _myselfInScopeMap;
    public Map<String, MemberStatusCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MemberStatusCQ sq) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMapSized(4); }
        String ky = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(ky, sq); return "myselfInScope." + ky;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberStatusCB.class.getName(); }
    protected String xCQ() { return MemberStatusCQ.class.getName(); }
    protected String xCHp() { return HpCalculator.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
