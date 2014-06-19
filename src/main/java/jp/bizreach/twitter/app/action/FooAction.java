package jp.bizreach.twitter.app.action;

import org.seasar.struts.annotation.Execute;

public class FooAction {
    public Integer id;

    //    @Execute(validator = false)
    //    public String index() {
    //        if (id == null) {
    //            id = 9999;
    //        }
    //        return "/index.jsp";
    //    }

    @Execute(validator = false, urlPattern = "{id}")
    public String bar() {
        if (id == null) {
            id = 9999;
        }
        return "/index.jsp";
    }
}
