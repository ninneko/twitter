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
 * The entity of MEMBER as TABLE. <br />
 * 会員
 * <pre>
 * [primary-key]
 *     MEMNER_ID
 * 
 * [column]
 *     MEMNER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, MEMBER_PASSWORD
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MEMNER_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     member_following, tweet
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     memberFollowingByMyMemberIdList, memberFollowingByYourMemberIdList, tweetList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memnerId = entity.getMemnerId();
 * String memberName = entity.getMemberName();
 * String memberAccount = entity.getMemberAccount();
 * String memberStatusCode = entity.getMemberStatusCode();
 * String memberPassword = entity.getMemberPassword();
 * entity.setMemnerId(memnerId);
 * entity.setMemberName(memberName);
 * entity.setMemberAccount(memberAccount);
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setMemberPassword(memberPassword);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMember implements Entity, Serializable, Cloneable {

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
    /** MEMNER_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _memnerId;

    /** MEMBER_NAME: {IX, NotNull, VARCHAR(50)} */
    protected String _memberName;

    /** MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)} */
    protected String _memberAccount;

    /** MEMBER_STATUS_CODE: {NotNull, CHAR(3)} */
    protected String _memberStatusCode;

    /** MEMBER_PASSWORD: {NotNull, VARCHAR(50)} */
    protected String _memberPassword;

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
        return "member";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "member";
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
        if (getMemnerId() == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br />
     * You can update the entity by the key when entity update (NOT batch update).
     * @param memberAccount : UQ, NotNull, VARCHAR(20). (NotNull)
     */
    public void uniqueBy(String memberAccount) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("memberAccount");
        setMemberAccount(memberAccount);
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'. */
    protected List<MemberFollowing> _memberFollowingByMyMemberIdList;

    /**
     * member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
     * @return The entity list of referrer property 'memberFollowingByMyMemberIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberFollowing> getMemberFollowingByMyMemberIdList() {
        if (_memberFollowingByMyMemberIdList == null) { _memberFollowingByMyMemberIdList = newReferrerList(); }
        return _memberFollowingByMyMemberIdList;
    }

    /**
     * member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
     * @param memberFollowingByMyMemberIdList The entity list of referrer property 'memberFollowingByMyMemberIdList'. (NullAllowed)
     */
    public void setMemberFollowingByMyMemberIdList(List<MemberFollowing> memberFollowingByMyMemberIdList) {
        _memberFollowingByMyMemberIdList = memberFollowingByMyMemberIdList;
    }

    /** member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'. */
    protected List<MemberFollowing> _memberFollowingByYourMemberIdList;

    /**
     * member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
     * @return The entity list of referrer property 'memberFollowingByYourMemberIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberFollowing> getMemberFollowingByYourMemberIdList() {
        if (_memberFollowingByYourMemberIdList == null) { _memberFollowingByYourMemberIdList = newReferrerList(); }
        return _memberFollowingByYourMemberIdList;
    }

    /**
     * member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
     * @param memberFollowingByYourMemberIdList The entity list of referrer property 'memberFollowingByYourMemberIdList'. (NullAllowed)
     */
    public void setMemberFollowingByYourMemberIdList(List<MemberFollowing> memberFollowingByYourMemberIdList) {
        _memberFollowingByYourMemberIdList = memberFollowingByYourMemberIdList;
    }

    /** tweet by MEMNER_ID, named 'tweetList'. */
    protected List<Tweet> _tweetList;

    /**
     * tweet by MEMNER_ID, named 'tweetList'.
     * @return The entity list of referrer property 'tweetList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Tweet> getTweetList() {
        if (_tweetList == null) { _tweetList = newReferrerList(); }
        return _tweetList;
    }

    /**
     * tweet by MEMNER_ID, named 'tweetList'.
     * @param tweetList The entity list of referrer property 'tweetList'. (NullAllowed)
     */
    public void setTweetList(List<Tweet> tweetList) {
        _tweetList = tweetList;
    }

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
        if (obj == null || !(obj instanceof BsMember)) { return false; }
        BsMember other = (BsMember)obj;
        if (!xSV(getMemnerId(), other.getMemnerId())) { return false; }
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
        hs = xCH(hs, getMemnerId());
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
        if (_memberFollowingByMyMemberIdList != null) { for (Entity et : _memberFollowingByMyMemberIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberFollowingByMyMemberIdList")); } } }
        if (_memberFollowingByYourMemberIdList != null) { for (Entity et : _memberFollowingByYourMemberIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberFollowingByYourMemberIdList")); } } }
        if (_tweetList != null) { for (Entity et : _tweetList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tweetList")); } } }
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
        sb.append(dm).append(getMemnerId());
        sb.append(dm).append(getMemberName());
        sb.append(dm).append(getMemberAccount());
        sb.append(dm).append(getMemberStatusCode());
        sb.append(dm).append(getMemberPassword());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_memberFollowingByMyMemberIdList != null && !_memberFollowingByMyMemberIdList.isEmpty())
        { sb.append(cm).append("memberFollowingByMyMemberIdList"); }
        if (_memberFollowingByYourMemberIdList != null && !_memberFollowingByYourMemberIdList.isEmpty())
        { sb.append(cm).append("memberFollowingByYourMemberIdList"); }
        if (_tweetList != null && !_tweetList.isEmpty())
        { sb.append(cm).append("tweetList"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public Member clone() {
        try {
            return (Member)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMNER_ID: {PK, ID, NotNull, INT(10)} <br />
     * 会員ID
     * @return The value of the column 'MEMNER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemnerId() {
        return _memnerId;
    }

    /**
     * [set] MEMNER_ID: {PK, ID, NotNull, INT(10)} <br />
     * 会員ID
     * @param memnerId The value of the column 'MEMNER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemnerId(Integer memnerId) {
        __modifiedProperties.addPropertyName("memnerId");
        this._memnerId = memnerId;
    }

    /**
     * [get] MEMBER_NAME: {IX, NotNull, VARCHAR(50)} <br />
     * 会員名称
     * @return The value of the column 'MEMBER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberName() {
        return convertEmptyToNull(_memberName);
    }

    /**
     * [set] MEMBER_NAME: {IX, NotNull, VARCHAR(50)} <br />
     * 会員名称
     * @param memberName The value of the column 'MEMBER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.addPropertyName("memberName");
        this._memberName = memberName;
    }

    /**
     * [get] MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)} <br />
     * 会員アカウント
     * @return The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberAccount() {
        return convertEmptyToNull(_memberAccount);
    }

    /**
     * [set] MEMBER_ACCOUNT: {UQ, NotNull, VARCHAR(20)} <br />
     * 会員アカウント
     * @param memberAccount The value of the column 'MEMBER_ACCOUNT'. (basically NotNull if update: for the constraint)
     */
    public void setMemberAccount(String memberAccount) {
        __modifiedProperties.addPropertyName("memberAccount");
        this._memberAccount = memberAccount;
    }

    /**
     * [get] MEMBER_STATUS_CODE: {NotNull, CHAR(3)} <br />
     * 会員ステータスコード
     * @return The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberStatusCode() {
        return convertEmptyToNull(_memberStatusCode);
    }

    /**
     * [set] MEMBER_STATUS_CODE: {NotNull, CHAR(3)} <br />
     * 会員ステータスコード
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        __modifiedProperties.addPropertyName("memberStatusCode");
        this._memberStatusCode = memberStatusCode;
    }

    /**
     * [get] MEMBER_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * 会員パスワード
     * @return The value of the column 'MEMBER_PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getMemberPassword() {
        return convertEmptyToNull(_memberPassword);
    }

    /**
     * [set] MEMBER_PASSWORD: {NotNull, VARCHAR(50)} <br />
     * 会員パスワード
     * @param memberPassword The value of the column 'MEMBER_PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setMemberPassword(String memberPassword) {
        __modifiedProperties.addPropertyName("memberPassword");
        this._memberPassword = memberPassword;
    }

    protected String convertEmptyToNull(String value) {
        return FunCustodial.convertEmptyToNull(value);
    }
}
