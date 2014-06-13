package jp.bizreach.twitter.common;

import java.io.IOException;
import java.lang.annotation.Annotation;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.bizreach.twitter.app.dto.MemberDto;

import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.seasar.framework.beans.BeanDesc;
import org.seasar.framework.beans.factory.BeanDescFactory;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.struts.action.S2RequestProcessor;
import org.seasar.struts.config.S2ExecuteConfig;
import org.seasar.struts.util.S2ExecuteConfigUtil;
import org.seasar.struts.util.URLEncoderUtil;

public class AuthRequestProcessor extends S2RequestProcessor {

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            super.process(request, response);
        } catch (AuthException e) {
            String requestedURL = (String) request.getAttribute("javax.servlet.forward.servlet_path");
            if (request.getAttribute("javax.servlet.forward.query_string") != null) {
                requestedURL += "?" + (String) request.getAttribute("javax.servlet.forward.query_string");
            }

            String redirectURL = "login" + "?" + "from" + "=" + URLEncoderUtil.encode(requestedURL);

            // ログインページにリダイレクトさせる
            ActionForward forward = new ActionForward(redirectURL, true);
            processForwardConfig(request, response, forward);
            return;
        }
    }

    @Override
    protected boolean processRoles(HttpServletRequest request, HttpServletResponse response, ActionMapping mapping)
            throws IOException, ServletException {
        S2ExecuteConfig executeConfig = S2ExecuteConfigUtil.getExecuteConfig();

        Annotation[] annotations = executeConfig.getMethod().getAnnotations();

        for (Annotation annotation : annotations) {
            if (annotation.annotationType().getName().equals("jp.bizreach.twitter.common.Auth")) {
                Object obj = SingletonS2Container.getComponent(MemberDto.class);

                BeanDesc beanDesc = BeanDescFactory.getBeanDesc(obj.getClass());
                Boolean isLogin = (Boolean) beanDesc.invoke(obj, "isLogin", null);

                if (!isLogin) {
                    throw new AuthException();
                }
            }
        }

        return super.processRoles(request, response, mapping);
    }
}