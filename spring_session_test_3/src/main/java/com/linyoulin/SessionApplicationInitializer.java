package com.linyoulin;

import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;

/**
 * Created by linyo_000 on 2017/2/17.
 */
public class SessionApplicationInitializer extends AbstractHttpSessionApplicationInitializer {
    public SessionApplicationInitializer() {
        super(SessionConfig.class);
    }
}
