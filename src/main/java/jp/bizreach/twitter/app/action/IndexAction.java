/*
 * Copyright 2004-2014 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.bizreach.twitter.app.action;

import java.util.List;

import jp.bizreach.twitter.dbflute.cbean.TweetCB;
import jp.bizreach.twitter.dbflute.exbhv.MemberBhv;
import jp.bizreach.twitter.dbflute.exbhv.TweetBhv;
import jp.bizreach.twitter.dbflute.exentity.Member;
import jp.bizreach.twitter.dbflute.exentity.Tweet;
import jp.bizreach.twitter.domainfw.PagingNavi;

import org.seasar.struts.annotation.Execute;

/**
 * @author you?
 */
public class IndexAction {

    public String name;
    public TweetBhv tweetBhv;
    public MemberBhv memberBhv;
    public List<Tweet> tweetList;
    public List<Member> memberList;
    public PagingNavi pagingNavi;

    @Execute(validator = false, urlPattern = "{name}")
    public String index() {
        if (name == null) {
            name = "nullpo";
            return "index.jsp";
        }

        TweetCB cb = new TweetCB();
        cb.setupSelect_Member();
        cb.query().queryMember().setMemberAccount_Equal(name);
        tweetList = tweetBhv.selectList(cb);

        if (tweetList.size() > 0) {
            return "member.jsp";
        } else {
            name = "hazure";
            return "index.jsp";
        }
    }

}
