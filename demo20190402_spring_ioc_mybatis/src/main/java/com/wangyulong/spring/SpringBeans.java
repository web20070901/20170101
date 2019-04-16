package com.wangyulong.spring;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;

@Configuration
public class SpringBeans {

    //如果此对象不需要注入到其他位置，就不需要交给spring管理
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();

    @Bean
    public SqlSessionFactory provideSessionFactory() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }

    @Bean
    public SqlSession provideSession(SqlSessionFactory sqlSessionFactory){
        SqlSession session = threadLocal.get();
        if (session == null){
            session = sqlSessionFactory.openSession();
            threadLocal.set(session);
        }
        return session;
    }

}
