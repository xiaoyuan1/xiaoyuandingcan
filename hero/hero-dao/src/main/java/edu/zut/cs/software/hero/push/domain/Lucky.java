package edu.zut.cs.software.hero.push.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
	 
	 
public class Lucky {
	 

    public static void main(String[] args) {
      
        Connection con; //声明Connection对象
        
         String driver = "com.mysql.jdbc.Driver";//驱动程序名
       
         String url = "jdbc:mysql://202.196.37.91:3306/hero"; //URL指向要访问的数据库名hero
        
        String user = "zutnlp"; //MySQL配置时的用户名
       
        String password = "zutnlp"; //MySQL配置时的密码
        
         try { //遍历查询结果集
             
             Class.forName(driver);//加载驱动程序
            
             con = DriverManager.getConnection(url,user,password); //1.getConnection()方法，连接MySQL数据库！！
             if(!con.isClosed())
                 System.out.println("Succeeded connecting to the Database!");
             
             Statement statement = con.createStatement();//2.创建statement类对象，用来执行SQL语句！！
             
             String sql = "select ORDERID from t_dingdan";//要执行的SQL语句
            
            ResultSet rs = statement.executeQuery(sql);//3.ResultSet类，用来存放获取的结果集！！
            System.out.println("-----------------");
             System.out.println("执行结果如下所示:");  
             System.out.println("-----------------");  
            System.out.println("ORDERID");  
            System.out.println("-----------------");  
             
            String id = null;
            int i=0;
             while(rs.next()&&i<=50){ 
              
                id = rs.getString("ORDERID");  //获取orderid这列数据
                i++;
                }
             
             System.out.println(id); //输出结果
            rs.close();
             con.close();
        } catch(ClassNotFoundException e) {     //数据库驱动类异常处理
           
            System.out.println("Sorry,can`t find the Driver!");   
            e.printStackTrace();   
             } catch(SQLException e) {//数据库连接失败异常处理
            
            e.printStackTrace();  
             }catch (Exception e) {
           // TODO: handle exception
            e.printStackTrace();
      }finally{
            System.out.println("数据库数据成功获取！！");
         }
    }

}
