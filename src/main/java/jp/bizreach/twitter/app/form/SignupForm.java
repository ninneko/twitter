package jp.bizreach.twitter.app.form;

import org.seasar.struts.annotation.Required;

public class SignupForm {

    @Required
    public String account;

    @Required
    public String name;

    @Required
    public String password;

}
