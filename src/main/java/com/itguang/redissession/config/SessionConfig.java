package com.itguang.redissession.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author itguang
 * @create 2017-12-07 10:28
 **/
@Configuration
@EnableRedisHttpSession(redisNamespace = "mysession",maxInactiveIntervalInSeconds = 60*60*24)
public class SessionConfig {
}
