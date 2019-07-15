
import com.ssm.dao.admindao;
import com.ssm.pojo.admin;
import com.ssm.service.adminService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;

public class TestClass {
    /**
     * 测试spring是否配置成功
     */
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ap =new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        adminService ad = (adminService) ap.getBean("admins");
        //调用方法
        ad.findAll();
    }

    /**
     * 测试数据库查询方法
     * @throws IOException
     */
    @Test
    public void run2() throws IOException {
        //获取配置文件
        InputStream in = Resources.getResourceAsStream("Mybatisconfig.xml");
        //创建工厂
        SqlSessionFactory aa = new SqlSessionFactoryBuilder().build(in);
        //创建sqlsession
        SqlSession sqlSession = aa.openSession();
        //获取代理对象
        admindao dao = sqlSession.getMapper(admindao.class);
        //执行内容
        List<admin> lists =  dao.findAll();
        for (admin list:lists){
            System.out.println(list);
        }
        //关闭
        sqlSession.close();
        in.close();

    }

    @Test
    public void run3() throws IOException {
        admin admins = new admin();
        admins.setId(1);
        admins.setUsers("likj");
        admins.setPwd("152689");
        admins.setUsername("张三");
        //获取配置文件
        InputStream in = Resources.getResourceAsStream("Mybatisconfig.xml");
        //创建工厂
        SqlSessionFactory aa = new SqlSessionFactoryBuilder().build(in);
        //创建sqlsession
        SqlSession sqlSession = aa.openSession();
        //获取代理对象
        admindao dao = sqlSession.getMapper(admindao.class);
        //执行内容
        dao.insertAll(admins);
        //提交到数据库
        sqlSession.commit();
        //关闭
        sqlSession.close();
        in.close();
    }

}
