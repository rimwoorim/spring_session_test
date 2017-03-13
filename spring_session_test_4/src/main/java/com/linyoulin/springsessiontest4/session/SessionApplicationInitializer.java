package com.linyoulin.springsessiontest4.session;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * Created by linyo_000 on 2017/3/13.
 */
public class SessionApplicationInitializer extends AbstractHttpSessionApplicationInitializer{
    public SessionApplicationInitializer() {
        super(SessionConfig.class);
    }
}
