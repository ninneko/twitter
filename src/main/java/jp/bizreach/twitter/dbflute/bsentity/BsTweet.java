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
 * The entity of TWEET as TABLE. <br />
 * ツイート
 * <pre>
 * [primary-key]
 *     TWEET_ID
 * 
 * [column]
 *     TWEET_ID, MEMBER_ID, TWEET_MESSAGE, TWEET_DATETIE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     TWEET_ID
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
 *     member
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long tweetId = entity.getTweetId();
 * Integer memberId = entity.getMemberId();
 * String tweetMessage = entity.getTweetMessage();
 * java.sql.Timestamp tweetDatetie = entity.getTweetDatetie();
 * entity.setTweetId(tweetId);
 * entity.setMemberId(memberId);
 * entity.setTweetMessage(tweetMessage);
 * entity.setTweetDatetie(tweetDatetie);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTweet implements Entity, Serializable, Cloneable {

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
    /** TWEET_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _tweetId;

    /** MEMBER_ID: {IX, NotNull, INT(10), FK to member} */
    protected Integer _memberId;

    /** TWEET_MESSAGE: {NotNull, VARCHAR(140)} */
    protected String _tweetMessage;

    /** TWEET_DATETIE: {IX, NotNull, DATETIME(19)} */
    protected java.sql.Timestamp _tweetDatetie;

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
        return "tweet";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "tweet";
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
        if (getTweetId() == null) { return false; }
        return true;
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
    /** member by my MEMBER_ID, named 'member'. */
    protected Member _member;

    /**
     * member by my MEMBER_ID, named 'member'.
     * @return The entity of foreign property 'member'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public Member getMember() {
        return _member;
    }

    /**
     * member by my MEMBER_ID, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(Member member) {
        _member = member;
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
        if (obj == null || !(obj instanceof BsTweet)) { return false; }
        BsTweet other = (BsTweet)obj;
        if (!xSV(getTweetId(), other.getTweetId())) { return false; }
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
        hs = xCH(hs, getTweetId());
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
        if (_member != null)
        { sb.append(li).append(xbRDS(_member, "member")); }
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
        sb.append(dm).append(getTweetId());
        sb.append(dm).append(getMemberId());
        sb.append(dm).append(getTweetMessage());
        sb.append(dm).append(getTweetDatetie());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String cm = ",";
        if (_member != null) { sb.append(cm).append("member"); }
        if (sb.length() > cm.length()) {
            sb.delete(0, cm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public Tweet clone() {
        try {
            return (Tweet)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TWEET_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * ツイートID
     * @return The value of the column 'TWEET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTweetId() {
        return _tweetId;
    }

    /**
     * [set] TWEET_ID: {PK, ID, NotNull, BIGINT(19)} <br />
     * ツイートID
     * @param tweetId The value of the column 'TWEET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTweetId(Long tweetId) {
        __modifiedProperties.addPropertyName("tweetId");
        this._tweetId = tweetId;
    }

    /**
     * [get] MEMBER_ID: {IX, NotNull, INT(10), FK to member} <br />
     * 会員ID
     * @return The value of the column 'MEMBER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {IX, NotNull, INT(10), FK to member} <br />
     * 会員ID
     * @param memberId The value of the column 'MEMBER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] TWEET_MESSAGE: {NotNull, VARCHAR(140)} <br />
     * ツイート内容
     * @return The value of the column 'TWEET_MESSAGE'. (basically NotNull if selected: for the constraint)
     */
    public String getTweetMessage() {
        return convertEmptyToNull(_tweetMessage);
    }

    /**
     * [set] TWEET_MESSAGE: {NotNull, VARCHAR(140)} <br />
     * ツイート内容
     * @param tweetMessage The value of the column 'TWEET_MESSAGE'. (basically NotNull if update: for the constraint)
     */
    public void setTweetMessage(String tweetMessage) {
        __modifiedProperties.addPropertyName("tweetMessage");
        this._tweetMessage = tweetMessage;
    }

    /**
     * [get] TWEET_DATETIE: {IX, NotNull, DATETIME(19)} <br />
     * ツイート日時
     * @return The value of the column 'TWEET_DATETIE'. (basically NotNull if selected: for the constraint)
     */
    public java.sql.Timestamp getTweetDatetie() {
        return _tweetDatetie;
    }

    /**
     * [set] TWEET_DATETIE: {IX, NotNull, DATETIME(19)} <br />
     * ツイート日時
     * @param tweetDatetie The value of the column 'TWEET_DATETIE'. (basically NotNull if update: for the constraint)
     */
    public void setTweetDatetie(java.sql.Timestamp tweetDatetie) {
        __modifiedProperties.addPropertyName("tweetDatetie");
        this._tweetDatetie = tweetDatetie;
    }

    protected String convertEmptyToNull(String value) {
        return FunCustodial.convertEmptyToNull(value);
    }
}
