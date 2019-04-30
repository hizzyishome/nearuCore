package com.nearu.core.config;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @Description:
 * @Author: ZhaoZhenHua1 Administrator
 * @Date: 2019/4/30 10:11
 */
@Configuration
@EnableAuthorizationServer
public class OAuth2AuthorizationServer extends AuthorizationServerConfigurerAdapter {

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //super.configure(clients);
        clients.inMemory()
                .withClient("clientApp")
                .secret("123123123")
                .redirectUris("http://zg.test.mi.com")
                .authorizedGrantTypes("authorization_code")
                .scopes("read_userInfo", "read_contacts");
    }
}
