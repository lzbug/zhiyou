package com.zhiyou100.gym.config;

import java.util.HashMap;
import java.util.Map;


import com.zhiyou100.gym.realm.UserRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
@Configuration
public class ShiroConfig {

	@Autowired
	private UserRealm userRealm;
	//thymeleaf和shiro结合
	@Bean
    public ShiroDialect shiroDialect() {
        return new ShiroDialect();
    }
	@Bean
	public SecurityManager securityManager(){
		DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
		manager.setRealm(userRealm);
		return manager;
	}
	@Bean
	public ShiroFilterFactoryBean shiroFilter() {
		ShiroFilterFactoryBean  factoryBean = new ShiroFilterFactoryBean();
		factoryBean.setSecurityManager(securityManager());
		factoryBean.setLoginUrl("/login.html");
		Map<String, String> map = new HashMap<String, String>();
		map.put("/css/**", "anon");
		map.put("/img/**", "anon");
		map.put("/js/**", "anon");
		map.put("/lib/**", "anon");
		map.put("/login.html", "anon");
		map.put("/user/login.do", "anon");
		map.put("/**", "authc");
		factoryBean.setFilterChainDefinitionMap(map);
		return factoryBean;
	}
	@Bean
	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
		
		DefaultAdvisorAutoProxyCreator  creator = new DefaultAdvisorAutoProxyCreator ();
		creator.setProxyTargetClass(true);
		return creator;
	}
	
	@Bean
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor() {
		
		return new AuthorizationAttributeSourceAdvisor();
	}
	
}
