package jp.bizreach.twitter.app.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class MemberDto implements Serializable {

    private static final long serialVersionUID = 1L;
    public Integer memberId = null;

    public boolean isLogin() {
        if (memberId == null) {
            return false;
        } else {
            return true;
        }
    }
}
