package jp.bizreach.twitter.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import jp.bizreach.twitter.dbflute.allcommon.*;
import jp.bizreach.twitter.dbflute.exentity.*;

/**
 * The DB meta of member_following. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberFollowingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberFollowingDbm _instance = new MemberFollowingDbm();
    private MemberFollowingDbm() {}
    public static MemberFollowingDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMemberFollowingId(), "memberFollowingId");
        setupEpg(_epgMap, new EpgMyMemberId(), "myMemberId");
        setupEpg(_epgMap, new EpgYourMemberId(), "yourMemberId");
        setupEpg(_epgMap, new EpgFollowDatetime(), "followDatetime");
    }
    public static class EpgMemberFollowingId implements PropertyGateway {
        public Object read(Entity et) { return ((MemberFollowing)et).getMemberFollowingId(); }
        public void write(Entity et, Object vl) { ((MemberFollowing)et).setMemberFollowingId(ctl(vl)); }
    }
    public static class EpgMyMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((MemberFollowing)et).getMyMemberId(); }
        public void write(Entity et, Object vl) { ((MemberFollowing)et).setMyMemberId(cti(vl)); }
    }
    public static class EpgYourMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((MemberFollowing)et).getYourMemberId(); }
        public void write(Entity et, Object vl) { ((MemberFollowing)et).setYourMemberId(cti(vl)); }
    }
    public static class EpgFollowDatetime implements PropertyGateway {
        public Object read(Entity et) { return ((MemberFollowing)et).getFollowDatetime(); }
        public void write(Entity et, Object vl) { ((MemberFollowing)et).setFollowDatetime((java.sql.Timestamp)vl); }
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    {
        setupEfpg(_efpgMap, new EfpgMemberByMyMemberId(), "memberByMyMemberId");
        setupEfpg(_efpgMap, new EfpgMemberByYourMemberId(), "memberByYourMemberId");
    }
    public class EfpgMemberByMyMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((MemberFollowing)et).getMemberByMyMemberId(); }
        public void write(Entity et, Object vl) { ((MemberFollowing)et).setMemberByMyMemberId((Member)vl); }
    }
    public class EfpgMemberByYourMemberId implements PropertyGateway {
        public Object read(Entity et) { return ((MemberFollowing)et).getMemberByYourMemberId(); }
        public void write(Entity et, Object vl) { ((MemberFollowing)et).setMemberByYourMemberId((Member)vl); }
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "member_following";
    protected final String _tablePropertyName = "memberFollowing";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_FOLLOWING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberFollowingId = cci("MEMBER_FOLLOWING_ID", "MEMBER_FOLLOWING_ID", null, null, Long.class, "memberFollowingId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMyMemberId = cci("MY_MEMBER_ID", "MY_MEMBER_ID", null, null, Integer.class, "myMemberId", null, false, false, true, "INT", 10, 0, null, false, null, null, "memberByMyMemberId", null, null);
    protected final ColumnInfo _columnYourMemberId = cci("YOUR_MEMBER_ID", "YOUR_MEMBER_ID", null, null, Integer.class, "yourMemberId", null, false, false, true, "INT", 10, 0, null, false, null, null, "memberByYourMemberId", null, null);
    protected final ColumnInfo _columnFollowDatetime = cci("FOLLOW_DATETIME", "FOLLOW_DATETIME", null, null, java.sql.Timestamp.class, "followDatetime", null, false, false, true, "DATETIME", 19, 0, null, false, null, null, null, null, null);

    /**
     * MEMBER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberFollowingId() { return _columnMemberFollowingId; }
    /**
     * MY_MEMBER_ID: {UQ+, IX+, NotNull, INT(10), FK to member}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMyMemberId() { return _columnMyMemberId; }
    /**
     * YOUR_MEMBER_ID: {+UQ, IX+, NotNull, INT(10), FK to member}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYourMemberId() { return _columnYourMemberId; }
    /**
     * FOLLOW_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFollowDatetime() { return _columnFollowDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberFollowingId());
        ls.add(columnMyMemberId());
        ls.add(columnYourMemberId());
        ls.add(columnFollowDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMemberFollowingId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * member by my MY_MEMBER_ID, named 'memberByMyMemberId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberByMyMemberId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMyMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("member_following_ibfk_1", "memberByMyMemberId", this, MemberDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "memberFollowingByMyMemberIdList");
    }
    /**
     * member by my YOUR_MEMBER_ID, named 'memberByYourMemberId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMemberByYourMemberId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnYourMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("member_following_ibfk_2", "memberByYourMemberId", this, MemberDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "memberFollowingByYourMemberIdList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "jp.bizreach.twitter.dbflute.exentity.MemberFollowing"; }
    public String getConditionBeanTypeName() { return "jp.bizreach.twitter.dbflute.cbean.MemberFollowingCB"; }
    public String getBehaviorTypeName() { return "jp.bizreach.twitter.dbflute.exbhv.MemberFollowingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberFollowing> getEntityType() { return MemberFollowing.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public MemberFollowing newMyEntity() { return new MemberFollowing(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberFollowing)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberFollowing)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
