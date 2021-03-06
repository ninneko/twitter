package jp.bizreach.twitter.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.OptionalEntity;
import org.seasar.dbflute.outsidesql.executor.*;
import jp.bizreach.twitter.dbflute.exbhv.*;
import jp.bizreach.twitter.dbflute.exentity.*;
import jp.bizreach.twitter.dbflute.bsentity.dbmeta.*;
import jp.bizreach.twitter.dbflute.cbean.*;

/**
 * The behavior of MEMBER as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     member_status, member_security(AsOne)
 *
 * [referrer table]
 *     member_following, tweet, member_security
 *
 * [foreign property]
 *     memberStatus, memberSecurityAsOne
 *
 * [referrer property]
 *     memberFollowingByMyMemberIdList, memberFollowingByYourMemberIdList, tweetList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "member"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return MemberDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MemberDbm getMyDBMeta() { return MemberDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public Member newMyEntity() { return new Member(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MemberCB newMyConditionBean() { return new MemberCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * int count = memberBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of Member. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MemberCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(MemberCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(MemberCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * Member member = memberBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (member != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = member.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of Member. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Member selectEntity(MemberCB cb) {
        return doSelectEntity(cb, Member.class);
    }

    protected <ENTITY extends Member> ENTITY doSelectEntity(MemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, MemberCB>() {
            public List<ENTITY> callbackSelectList(MemberCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends Member> OptionalEntity<ENTITY> doSelectOptionalEntity(MemberCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * Member member = memberBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = member.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of Member. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Member selectEntityWithDeletedCheck(MemberCB cb) {
        return doSelectEntityWithDeletedCheck(cb, Member.class);
    }

    protected <ENTITY extends Member> ENTITY doSelectEntityWithDeletedCheck(MemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, MemberCB>() {
            public List<ENTITY> callbackSelectList(MemberCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId : PK, ID, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Member selectByPKValue(Integer memberId) {
        return doSelectByPK(memberId, Member.class);
    }

    protected <ENTITY extends Member> ENTITY doSelectByPK(Integer memberId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(memberId), entityType);
    }

    protected <ENTITY extends Member> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer memberId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(memberId, entityType), memberId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param memberId : PK, ID, NotNull, INT(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Member selectByPKValueWithDeletedCheck(Integer memberId) {
        return doSelectByPKWithDeletedCheck(memberId, Member.class);
    }

    protected <ENTITY extends Member> ENTITY doSelectByPKWithDeletedCheck(Integer memberId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(memberId), entityType);
    }

    protected MemberCB xprepareCBAsPK(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        MemberCB cb = newMyConditionBean(); cb.acceptPrimaryKey(memberId);
        return cb;
    }

    /**
     * Select the entity by the unique-key value.
     * @param memberAccount : UQ, NotNull, VARCHAR(20). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<Member> selectByUniqueOf(String memberAccount) {
        return doSelectByUniqueOf(memberAccount, Member.class);
    }

    protected <ENTITY extends Member> OptionalEntity<ENTITY> doSelectByUniqueOf(String memberAccount, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(memberAccount), entityType), memberAccount);
    }

    protected MemberCB xprepareCBAsUniqueOf(String memberAccount) {
        assertObjectNotNull("memberAccount", memberAccount);
        MemberCB cb = newMyConditionBean(); cb.acceptUniqueOf(memberAccount);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;Member&gt; memberList = memberBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (Member member : memberList) {
     *     ... = member.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Member. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Member> selectList(MemberCB cb) {
        return doSelectList(cb, Member.class);
    }

    protected <ENTITY extends Member> ListResultBean<ENTITY> doSelectList(MemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, MemberCB>() {
            public List<ENTITY> callbackSelectList(MemberCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;Member&gt; page = memberBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (Member member : page) {
     *     ... = member.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Member. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Member> selectPage(MemberCB cb) {
        return doSelectPage(cb, Member.class);
    }

    protected <ENTITY extends Member> PagingResultBean<ENTITY> doSelectPage(MemberCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, MemberCB>() {
            public int callbackSelectCount(MemberCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(MemberCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * memberBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;Member&gt;() {
     *     public void handle(Member entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of Member. (NotNull)
     * @param entityRowHandler The handler of entity row of Member. (NotNull)
     */
    public void selectCursor(MemberCB cb, EntityRowHandler<Member> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, Member.class);
    }

    protected <ENTITY extends Member> void doSelectCursor(MemberCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, MemberCB>() {
            public void callbackSelectCursor(MemberCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(MemberCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * memberBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<MemberCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends MemberCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends MemberCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
        return new SLFunction<CB, RESULT>(cb, tp);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) {
        return doScalarSelect(tp, newMyConditionBean());
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of memberFollowingByMyMemberIdList by the set-upper of referrer. <br />
     * member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
     * <pre>
     * memberBhv.<span style="color: #DD4747">loadMemberFollowingByMyMemberIdList</span>(memberList, new ConditionBeanSetupper&lt;MemberFollowingCB&gt;() {
     *     public void setup(MemberFollowingCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (Member member : memberList) {
     *     ... = member.<span style="color: #DD4747">getMemberFollowingByMyMemberIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMyMemberId_InScope(pkList);
     * cb.query().addOrderBy_MyMemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<MemberFollowing> loadMemberFollowingByMyMemberIdList(List<Member> memberList, ConditionBeanSetupper<MemberFollowingCB> setupper) {
        xassLRArg(memberList, setupper);
        return doLoadMemberFollowingByMyMemberIdList(memberList, new LoadReferrerOption<MemberFollowingCB, MemberFollowing>().xinit(setupper));
    }

    /**
     * Load referrer of memberFollowingByMyMemberIdList by the set-upper of referrer. <br />
     * member_following by MY_MEMBER_ID, named 'memberFollowingByMyMemberIdList'.
     * <pre>
     * memberBhv.<span style="color: #DD4747">loadMemberFollowingByMyMemberIdList</span>(memberList, new ConditionBeanSetupper&lt;MemberFollowingCB&gt;() {
     *     public void setup(MemberFollowingCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = member.<span style="color: #DD4747">getMemberFollowingByMyMemberIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMyMemberId_InScope(pkList);
     * cb.query().addOrderBy_MyMemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<MemberFollowing> loadMemberFollowingByMyMemberIdList(Member member, ConditionBeanSetupper<MemberFollowingCB> setupper) {
        xassLRArg(member, setupper);
        return doLoadMemberFollowingByMyMemberIdList(xnewLRLs(member), new LoadReferrerOption<MemberFollowingCB, MemberFollowing>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param member The entity of member. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<MemberFollowing> loadMemberFollowingByMyMemberIdList(Member member, LoadReferrerOption<MemberFollowingCB, MemberFollowing> loadReferrerOption) {
        xassLRArg(member, loadReferrerOption);
        return loadMemberFollowingByMyMemberIdList(xnewLRLs(member), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param memberList The entity list of member. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<MemberFollowing> loadMemberFollowingByMyMemberIdList(List<Member> memberList, LoadReferrerOption<MemberFollowingCB, MemberFollowing> loadReferrerOption) {
        xassLRArg(memberList, loadReferrerOption);
        if (memberList.isEmpty()) { return (NestedReferrerLoader<MemberFollowing>)EMPTY_LOADER; }
        return doLoadMemberFollowingByMyMemberIdList(memberList, loadReferrerOption);
    }

    protected NestedReferrerLoader<MemberFollowing> doLoadMemberFollowingByMyMemberIdList(List<Member> memberList, LoadReferrerOption<MemberFollowingCB, MemberFollowing> option) {
        final MemberFollowingBhv referrerBhv = xgetBSFLR().select(MemberFollowingBhv.class);
        return helpLoadReferrerInternally(memberList, option, new InternalLoadReferrerCallback<Member, Integer, MemberFollowingCB, MemberFollowing>() {
            public Integer getPKVal(Member et)
            { return et.getMemberId(); }
            public void setRfLs(Member et, List<MemberFollowing> ls)
            { et.setMemberFollowingByMyMemberIdList(ls); }
            public MemberFollowingCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(MemberFollowingCB cb, List<Integer> ls)
            { cb.query().setMyMemberId_InScope(ls); }
            public void qyOdFKAsc(MemberFollowingCB cb) { cb.query().addOrderBy_MyMemberId_Asc(); }
            public void spFKCol(MemberFollowingCB cb) { cb.specify().columnMyMemberId(); }
            public List<MemberFollowing> selRfLs(MemberFollowingCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(MemberFollowing re) { return re.getMyMemberId(); }
            public void setlcEt(MemberFollowing re, Member le)
            { re.setMemberByMyMemberId(le); }
            public String getRfPrNm() { return "memberFollowingByMyMemberIdList"; }
        });
    }

    /**
     * Load referrer of memberFollowingByYourMemberIdList by the set-upper of referrer. <br />
     * member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
     * <pre>
     * memberBhv.<span style="color: #DD4747">loadMemberFollowingByYourMemberIdList</span>(memberList, new ConditionBeanSetupper&lt;MemberFollowingCB&gt;() {
     *     public void setup(MemberFollowingCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (Member member : memberList) {
     *     ... = member.<span style="color: #DD4747">getMemberFollowingByYourMemberIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setYourMemberId_InScope(pkList);
     * cb.query().addOrderBy_YourMemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<MemberFollowing> loadMemberFollowingByYourMemberIdList(List<Member> memberList, ConditionBeanSetupper<MemberFollowingCB> setupper) {
        xassLRArg(memberList, setupper);
        return doLoadMemberFollowingByYourMemberIdList(memberList, new LoadReferrerOption<MemberFollowingCB, MemberFollowing>().xinit(setupper));
    }

    /**
     * Load referrer of memberFollowingByYourMemberIdList by the set-upper of referrer. <br />
     * member_following by YOUR_MEMBER_ID, named 'memberFollowingByYourMemberIdList'.
     * <pre>
     * memberBhv.<span style="color: #DD4747">loadMemberFollowingByYourMemberIdList</span>(memberList, new ConditionBeanSetupper&lt;MemberFollowingCB&gt;() {
     *     public void setup(MemberFollowingCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = member.<span style="color: #DD4747">getMemberFollowingByYourMemberIdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setYourMemberId_InScope(pkList);
     * cb.query().addOrderBy_YourMemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<MemberFollowing> loadMemberFollowingByYourMemberIdList(Member member, ConditionBeanSetupper<MemberFollowingCB> setupper) {
        xassLRArg(member, setupper);
        return doLoadMemberFollowingByYourMemberIdList(xnewLRLs(member), new LoadReferrerOption<MemberFollowingCB, MemberFollowing>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param member The entity of member. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<MemberFollowing> loadMemberFollowingByYourMemberIdList(Member member, LoadReferrerOption<MemberFollowingCB, MemberFollowing> loadReferrerOption) {
        xassLRArg(member, loadReferrerOption);
        return loadMemberFollowingByYourMemberIdList(xnewLRLs(member), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param memberList The entity list of member. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<MemberFollowing> loadMemberFollowingByYourMemberIdList(List<Member> memberList, LoadReferrerOption<MemberFollowingCB, MemberFollowing> loadReferrerOption) {
        xassLRArg(memberList, loadReferrerOption);
        if (memberList.isEmpty()) { return (NestedReferrerLoader<MemberFollowing>)EMPTY_LOADER; }
        return doLoadMemberFollowingByYourMemberIdList(memberList, loadReferrerOption);
    }

    protected NestedReferrerLoader<MemberFollowing> doLoadMemberFollowingByYourMemberIdList(List<Member> memberList, LoadReferrerOption<MemberFollowingCB, MemberFollowing> option) {
        final MemberFollowingBhv referrerBhv = xgetBSFLR().select(MemberFollowingBhv.class);
        return helpLoadReferrerInternally(memberList, option, new InternalLoadReferrerCallback<Member, Integer, MemberFollowingCB, MemberFollowing>() {
            public Integer getPKVal(Member et)
            { return et.getMemberId(); }
            public void setRfLs(Member et, List<MemberFollowing> ls)
            { et.setMemberFollowingByYourMemberIdList(ls); }
            public MemberFollowingCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(MemberFollowingCB cb, List<Integer> ls)
            { cb.query().setYourMemberId_InScope(ls); }
            public void qyOdFKAsc(MemberFollowingCB cb) { cb.query().addOrderBy_YourMemberId_Asc(); }
            public void spFKCol(MemberFollowingCB cb) { cb.specify().columnYourMemberId(); }
            public List<MemberFollowing> selRfLs(MemberFollowingCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(MemberFollowing re) { return re.getYourMemberId(); }
            public void setlcEt(MemberFollowing re, Member le)
            { re.setMemberByYourMemberId(le); }
            public String getRfPrNm() { return "memberFollowingByYourMemberIdList"; }
        });
    }

    /**
     * Load referrer of tweetList by the set-upper of referrer. <br />
     * tweet by MEMBER_ID, named 'tweetList'.
     * <pre>
     * memberBhv.<span style="color: #DD4747">loadTweetList</span>(memberList, new ConditionBeanSetupper&lt;TweetCB&gt;() {
     *     public void setup(TweetCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (Member member : memberList) {
     *     ... = member.<span style="color: #DD4747">getTweetList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param memberList The entity list of member. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<Tweet> loadTweetList(List<Member> memberList, ConditionBeanSetupper<TweetCB> setupper) {
        xassLRArg(memberList, setupper);
        return doLoadTweetList(memberList, new LoadReferrerOption<TweetCB, Tweet>().xinit(setupper));
    }

    /**
     * Load referrer of tweetList by the set-upper of referrer. <br />
     * tweet by MEMBER_ID, named 'tweetList'.
     * <pre>
     * memberBhv.<span style="color: #DD4747">loadTweetList</span>(memberList, new ConditionBeanSetupper&lt;TweetCB&gt;() {
     *     public void setup(TweetCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = member.<span style="color: #DD4747">getTweetList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberId_InScope(pkList);
     * cb.query().addOrderBy_MemberId_Asc();
     * </pre>
     * @param member The entity of member. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<Tweet> loadTweetList(Member member, ConditionBeanSetupper<TweetCB> setupper) {
        xassLRArg(member, setupper);
        return doLoadTweetList(xnewLRLs(member), new LoadReferrerOption<TweetCB, Tweet>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param member The entity of member. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<Tweet> loadTweetList(Member member, LoadReferrerOption<TweetCB, Tweet> loadReferrerOption) {
        xassLRArg(member, loadReferrerOption);
        return loadTweetList(xnewLRLs(member), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param memberList The entity list of member. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<Tweet> loadTweetList(List<Member> memberList, LoadReferrerOption<TweetCB, Tweet> loadReferrerOption) {
        xassLRArg(memberList, loadReferrerOption);
        if (memberList.isEmpty()) { return (NestedReferrerLoader<Tweet>)EMPTY_LOADER; }
        return doLoadTweetList(memberList, loadReferrerOption);
    }

    protected NestedReferrerLoader<Tweet> doLoadTweetList(List<Member> memberList, LoadReferrerOption<TweetCB, Tweet> option) {
        final TweetBhv referrerBhv = xgetBSFLR().select(TweetBhv.class);
        return helpLoadReferrerInternally(memberList, option, new InternalLoadReferrerCallback<Member, Integer, TweetCB, Tweet>() {
            public Integer getPKVal(Member et)
            { return et.getMemberId(); }
            public void setRfLs(Member et, List<Tweet> ls)
            { et.setTweetList(ls); }
            public TweetCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(TweetCB cb, List<Integer> ls)
            { cb.query().setMemberId_InScope(ls); }
            public void qyOdFKAsc(TweetCB cb) { cb.query().addOrderBy_MemberId_Asc(); }
            public void spFKCol(TweetCB cb) { cb.specify().columnMemberId(); }
            public List<Tweet> selRfLs(TweetCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(Tweet re) { return re.getMemberId(); }
            public void setlcEt(Tweet re, Member le)
            { re.setMember(le); }
            public String getRfPrNm() { return "tweetList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MemberStatus'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberStatus> pulloutMemberStatus(List<Member> memberList) {
        return helpPulloutInternally(memberList, new InternalPulloutCallback<Member, MemberStatus>() {
            public MemberStatus getFr(Member et)
            { return et.getMemberStatus(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MemberStatus et, List<Member> ls)
            { et.setMemberList(ls); }
        });
    }
    /**
     * Pull out the list of referrer-as-one table 'MemberSecurity'.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MemberSecurity> pulloutMemberSecurityAsOne(List<Member> memberList) {
        return helpPulloutInternally(memberList, new InternalPulloutCallback<Member, MemberSecurity>() {
            public MemberSecurity getFr(Member et)
            { return et.getMemberSecurityAsOne(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MemberSecurity et, List<Member> ls)
            { if (!ls.isEmpty()) { et.setMember(ls.get(0)); } }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key memberId.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractMemberIdList(List<Member> memberList) {
        return helpExtractListInternally(memberList, new InternalExtractCallback<Member, Integer>() {
            public Integer getCV(Member et) { return et.getMemberId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key memberAccount.
     * @param memberList The list of member. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractMemberAccountList(List<Member> memberList) {
        return helpExtractListInternally(memberList, new InternalExtractCallback<Member, String>() {
            public String getCV(Member et) { return et.getMemberAccount(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * Member member = new Member();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * member.setFoo...(value);
     * member.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * memberBhv.<span style="color: #DD4747">insert</span>(member);
     * ... = member.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param member The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(Member member) {
        doInsert(member, null);
    }

    protected void doInsert(Member member, InsertOption<MemberCB> op) {
        assertObjectNotNull("member", member);
        prepareInsertOption(op);
        delegateInsert(member, op);
    }

    protected void prepareInsertOption(InsertOption<MemberCB> op) {
        if (op == null) { return; }
        assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) {
            op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) {
        if (op == null) { insert(downcast(et)); }
        else { varyingInsert(downcast(et), downcast(op)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * Member member = new Member();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * member.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * member.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberBhv.<span style="color: #DD4747">update</span>(member);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param member The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final Member member) {
        doUpdate(member, null);
    }

    protected void doUpdate(Member member, final UpdateOption<MemberCB> op) {
        assertObjectNotNull("member", member);
        prepareUpdateOption(op);
        helpUpdateInternally(member, new InternalUpdateCallback<Member>() {
            public int callbackDelegateUpdate(Member et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<MemberCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected MemberCB createCBForVaryingUpdate() {
        MemberCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected MemberCB createCBForSpecifiedUpdate() {
        MemberCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        doModify(et, op);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param member The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(Member member) {
        doInesrtOrUpdate(member, null, null);
    }

    protected void doInesrtOrUpdate(Member member, final InsertOption<MemberCB> iop, final UpdateOption<MemberCB> uop) {
        helpInsertOrUpdateInternally(member, new InternalInsertOrUpdateCallback<Member, MemberCB>() {
            public void callbackInsert(Member et) { doInsert(et, iop); }
            public void callbackUpdate(Member et) { doUpdate(et, uop); }
            public MemberCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(MemberCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<MemberCB>();
            uop = uop != null ? uop : new UpdateOption<MemberCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * Member member = new Member();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * member.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     memberBhv.<span style="color: #DD4747">delete</span>(member);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param member The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Member member) {
        doDelete(member, null);
    }

    protected void doDelete(Member member, final DeleteOption<MemberCB> op) {
        assertObjectNotNull("member", member);
        prepareDeleteOption(op);
        helpDeleteInternally(member, new InternalDeleteCallback<Member>() {
            public int callbackDelegateDelete(Member et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<MemberCB> op) {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op) {
        doRemove(et, op);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     Member member = new Member();
     *     member.setFooName("foo");
     *     if (...) {
     *         member.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     memberList.add(member);
     * }
     * memberBhv.<span style="color: #DD4747">batchInsert</span>(memberList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<Member> memberList) {
        InsertOption<MemberCB> op = createInsertUpdateOption();
        return doBatchInsert(memberList, op);
    }

    protected int[] doBatchInsert(List<Member> memberList, InsertOption<MemberCB> op) {
        assertObjectNotNull("memberList", memberList);
        prepareBatchInsertOption(memberList, op);
        return delegateBatchInsert(memberList, op);
    }

    protected void prepareBatchInsertOption(List<Member> memberList, InsertOption<MemberCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(memberList);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        if (op == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     Member member = new Member();
     *     member.setFooName("foo");
     *     if (...) {
     *         member.setFooPrice(123);
     *     } else {
     *         member.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//member.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     memberList.add(member);
     * }
     * memberBhv.<span style="color: #DD4747">batchUpdate</span>(memberList);
     * </pre>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<Member> memberList) {
        UpdateOption<MemberCB> op = createPlainUpdateOption();
        return doBatchUpdate(memberList, op);
    }

    protected int[] doBatchUpdate(List<Member> memberList, UpdateOption<MemberCB> op) {
        assertObjectNotNull("memberList", memberList);
        prepareBatchUpdateOption(memberList, op);
        return delegateBatchUpdate(memberList, op);
    }

    protected void prepareBatchUpdateOption(List<Member> memberList, UpdateOption<MemberCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(memberList);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * memberBhv.<span style="color: #DD4747">batchUpdate</span>(memberList, new SpecifyQuery<MemberCB>() {
     *     public void specify(MemberCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * memberBhv.<span style="color: #DD4747">batchUpdate</span>(memberList, new SpecifyQuery<MemberCB>() {
     *     public void specify(MemberCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<Member> memberList, SpecifyQuery<MemberCB> updateColumnSpec) {
        return doBatchUpdate(memberList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<Member> memberList) {
        return doBatchDelete(memberList, null);
    }

    protected int[] doBatchDelete(List<Member> memberList, DeleteOption<MemberCB> op) {
        assertObjectNotNull("memberList", memberList);
        prepareDeleteOption(op);
        return delegateBatchDelete(memberList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        return doLumpRemove(ls, op);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * memberBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;Member, MemberCB&gt;() {
     *     public ConditionBean setup(member entity, MemberCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<Member, MemberCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<Member, MemberCB> sp, InsertOption<MemberCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        Member e = new Member();
        MemberCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected MemberCB createCBForQueryInsert() {
        MemberCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * Member member = new Member();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//member.setPK...(value);</span>
     * member.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//member.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//member.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * memberBhv.<span style="color: #DD4747">queryUpdate</span>(member, cb);
     * </pre>
     * @param member The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of Member. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Member member, MemberCB cb) {
        return doQueryUpdate(member, cb, null);
    }

    protected int doQueryUpdate(Member member, MemberCB cb, UpdateOption<MemberCB> op) {
        assertObjectNotNull("member", member); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(member, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (MemberCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (MemberCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * memberBhv.<span style="color: #DD4747">queryDelete</span>(member, cb);
     * </pre>
     * @param cb The condition-bean of Member. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MemberCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(MemberCB cb, DeleteOption<MemberCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((MemberCB)cb); }
        else { return varyingQueryDelete((MemberCB)cb, downcast(op)); }
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * Member member = new Member();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * member.setFoo...(value);
     * member.setBar...(value);
     * InsertOption<MemberCB> option = new InsertOption<MemberCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * memberBhv.<span style="color: #DD4747">varyingInsert</span>(member, option);
     * ... = member.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param member The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(Member member, InsertOption<MemberCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(member, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * Member member = new Member();
     * member.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * member.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * member.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MemberCB&gt; option = new UpdateOption&lt;MemberCB&gt;();
     *     option.self(new SpecifyQuery&lt;MemberCB&gt;() {
     *         public void specify(MemberCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     memberBhv.<span style="color: #DD4747">varyingUpdate</span>(member, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param member The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(Member member, UpdateOption<MemberCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(member, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param member The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(Member member, InsertOption<MemberCB> insertOption, UpdateOption<MemberCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(member, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param member The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Member member, DeleteOption<MemberCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(member, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<Member> memberList, InsertOption<MemberCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(memberList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<Member> memberList, UpdateOption<MemberCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(memberList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param memberList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<Member> memberList, DeleteOption<MemberCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(memberList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<Member, MemberCB> setupper, InsertOption<MemberCB> option) {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * Member member = new Member();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//member.setPK...(value);</span>
     * member.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//member.setVersionNo(value);</span>
     * MemberCB cb = new MemberCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MemberCB&gt; option = new UpdateOption&lt;MemberCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberCB&gt;() {
     *     public void specify(MemberCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(member, cb, option);
     * </pre>
     * @param member The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of Member. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Member member, MemberCB cb, UpdateOption<MemberCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(member, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of Member. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MemberCB cb, DeleteOption<MemberCB> option) {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
     * {Basic}
     *   o selectList()
     *   o execute()
     *   o call()
     *
     * {Entity}
     *   o entityHandling().selectEntity()
     *   o entityHandling().selectEntityWithDeletedCheck()
     *
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     *
     * {Cursor}
     *   o cursorHandling().selectCursor()
     *
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MemberBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(MemberCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(MemberCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends Member> void delegateSelectCursor(MemberCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends Member> List<ENTITY> delegateSelectList(MemberCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(Member et, InsertOption<MemberCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(Member et, UpdateOption<MemberCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(Member et, UpdateOption<MemberCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(Member et, DeleteOption<MemberCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(Member et, DeleteOption<MemberCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<Member> ls, InsertOption<MemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<Member> ls, UpdateOption<MemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<Member> ls, UpdateOption<MemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<Member> ls, DeleteOption<MemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<Member> ls, DeleteOption<MemberCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(Member et, MemberCB inCB, ConditionBean resCB, InsertOption<MemberCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(Member et, MemberCB cb, UpdateOption<MemberCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(MemberCB cb, DeleteOption<MemberCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity et) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity et) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected Member downcast(Entity et) {
        return helpEntityDowncastInternally(et, Member.class);
    }

    protected MemberCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, MemberCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<Member> downcast(List<? extends Entity> ls) {
        return (List<Member>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<MemberCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<MemberCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<MemberCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<MemberCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<MemberCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<MemberCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<Member, MemberCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<Member, MemberCB>)sp;
    }
}
