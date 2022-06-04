package cn.dy.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class DaoMapperFactory {
    private static SqlSession session;
    static {
        InputStream is;
        try{
            //1,创建核心配置文件
            is= Resources.getResourceAsStream("SqlMapConfig.xml");
            //2,创建sqlSessionFactory工厂
            SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
            SqlSessionFactory factory=builder.build(is);
            //3,创建session对象
            session=factory.openSession(true);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static Object getDao(Class<?> cls){
        return session.getMapper(cls);

    }


}
