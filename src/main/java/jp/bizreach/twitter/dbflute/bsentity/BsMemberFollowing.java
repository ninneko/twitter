package jp.bizreach.twitter.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import jp.bizreach.twitter.dbflute.allcommon.DBMetaInstanceHandler;
import jp.bizreach.twitter.dbflute.exentity.*;

/**
 * The entity of MEMBER_FOLLOWING as TABLE. <br />
 * 会員フォローイング
 * <pre>
 * [primary-key]
 *     MEMBER_FOLLOWING_ID
 * 
 * [column]
 *     MEMBER_FOLLOWING_ID, MY_MEMBER_ID, YOUR_MEMBER_ID, FOLLOW_DATETIME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMBER_FOLLOWING_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     member
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     memberByMyMemberId, memberByYourMemberId
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long memberFollowingId = entity.getMemberFollowingId();
 * Integer myMemberId = entity.getMyMemberId();
 * Integer yourMemberId = entity.getYourMemberId();
 * java.sql.Timestamp followDatetime = entity.getFollowDatetime();
 * entity.setMemberFollowingId(memberFollowingId);
 * entity.setMyMemberId(myMemberId);
 * entity.setYourMemberId(yourMemberId);
 * entity.setFollowDatetime(followDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberFollowing implements Entity, Serializable, Cloneable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _memberFollowingId;

    /** MY_MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member} */
    protected Integer _myMemberId;

    /** YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INT(10), FK to member} */
    protected Integer _yourMemberId;

    /** FOLLOW_DATETIME: {NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _followDatetime;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "member_following";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "memberFollowing";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getMemberFollowingId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param myMemberId : UQ+, IX+, NotNull, INT(10), FK to member. (NotNull)
     * @param yourMemberId : +UQ, IX+, NotNull, INT(10), FK to member. (NotNull)
     */
    public void uniqueBy(Integer myMemberId, Integer yourMemberId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("myMemberId");
        __uniqueDrivenProperties.addPropertyName("yourMemberId");
        setMyMemberId(myMemberId);setYourMemberId(yourMemberId);
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> myuniqueDrivenProperties() {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected EntityUniqueDrivenProperties newUniqueDrivenProperties() {
        return new EntityUniqueDrivenProperties();
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** member by my MY_MEMBER_ID, named 'memberByMyMemberId'. */
    protected Member _memberByMyMemberId;

    /**
     * member by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @return The entity of foreign property 'memberByMyMemberId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Member getMemberByMyMemberId() {
        return _memberByMyMemberId;
    }

    /**
     * member by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @param memberByMyMemberId The entity of foreign property 'memberByMyMemberId'. (NullAllowed)
     */
    public void setMemberByMyMemberId(Member memberByMyMemberId) {
        _memberByMyMemberId = memberByMyMemberId;
    }

    /** member by my YOUR_MEMBER_ID, named 'memberByYourMemberId'. */
    protected Member _memberByYourMemberId;

    /**
     * member by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @return The entity of foreign property 'memberByYourMemberId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Member getMemberByYourMemberId() {
        return _memberByYourMemberId;
    }

    /**
     * member by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @param memberByYourMemberId The entity of foreign property 'memberByYourMemberId'. (NullAllowed)
     */
    public void setMemberByYourMemberId(Member memberByYourMemberId) {
        _memberByYourMemberId = memberByYourMemberId;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsMemberFollowing)) { return false; }
        BsMemberFollowing other = (BsMemberFollowing)obj;
        if (!xSV(getMemberFollowingId(), other.getMemberFollowingId())) { return false; }
        return true;
    }
    protected boolean xSV(Object v1, Object v2) {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int hs = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getMemberFollowingId());
        return hs;
    }
    protected int xCH(int hs, Object vl) {
        return FunCustodial.calculateHashcode(hs, vl);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(FunCustodial.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String li = "\n  ";
        if (_memberByMyMemberId != null)
        { sb.append(li).append(xbRDS(_memberByMyMemberId, "memberByMyMemberId")); }
        if (_memberByYourMemberId != null)
        { sb.append(li).append(xbRDS(_memberByYourMemberId, "memberByYourMemberId")); }
        return sb.toString();
    }
    protected String xbRDS(Entity et, String name) { // buildRelationDisplayString()
        return et.buildDisplayString(name, true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String dm = ", ";
        sb.append(dm).append(getMemberFollowingId());
        sb.append(dm).append(getMyMemberId());
        sb.append(dm).append(getYourMemberId());
        sb.append(dm).append(getFollowDatetime());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_memberByMyMemberId != null) { sb.append(cm).append("memberByMyMemberId"); }
        if (_memberByYourMemberId != null) { sb.append(cm).append("memberByYourMemberId"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public MemberFollowing clone() {
        try {
            return (MemberFollowing)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * 会員フォローイングID
     * @return The value of the column 'MEMBER_FOLLOWING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMemberFollowingId() {
        return _memberFollowingId;
    }

    /**
     * [set] MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * 会員フォローイングID
     * @param memberFollowingId The value of the column 'MEMBER_FOLLOWING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberFollowingId(Long memberFollowingId) {
        __modifiedProperties.addPropertyName("memberFollowingId");
        this._memberFollowingId = memberFollowingId;
    }

    /**
     * [get] MY_MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member} <br />
     * 自分
     * @return The value of the column 'MY_MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMyMemberId() {
        return _myMemberId;
    }

    /**
     * [set] MY_MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member} <br />
     * 自分
     * @param myMemberId The value of the column 'MY_MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMyMemberId(Integer myMemberId) {
        __modifiedProperties.addPropertyName("myMemberId");
        this._myMemberId = myMemberId;
    }

    /**
     * [get] YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INT(10), FK to member} <br />
     * 相手
     * @return The value of the column 'YOUR_MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getYourMemberId() {
        return _yourMemberId;
    }

    /**
     * [set] YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INT(10), FK to member} <br />
     * 相手
     * @param yourMemberId The value of the column 'YOUR_MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setYourMemberId(Integer yourMemberId) {
        __modifiedProperties.addPropertyName("yourMemberId");
        this._yourMemberId = yourMemberId;
    }

    /**
     * [get] FOLLOW_DATETIME: {NotNull, DATETIME(19)} <br />
     * FOLLOW_DATETIME
     * @return The value of the column 'FOLLOW_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getFollowDatetime() {
        return _followDatetime;
    }

    /**
     * [set] FOLLOW_DATETIME: {NotNull, DATETIME(19)} <br />
     * FOLLOW_DATETIME
     * @param followDatetime The value of the column 'FOLLOW_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setFollowDatetime(java.sql.Timestamp followDatetime) {
        __modifiedProperties.addPropertyName("followDatetime");
        this._followDatetime = followDatetime;
    }
}
