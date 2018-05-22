package edu.zut.cs.software.hero.push.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.software.hero.Foot.domain.Foot;
import edu.zut.cs.software.hero.base.domain.BaseEntity;
import edu.zut.cs.software.hero.user.domain.User;

@Table(name="T_PUSH")
@Entity
public class Push extends BaseEntity{

	private static final long serialVersionUID = -4376674977047164142L;
	
//以下为推送类实体	
	
	@Column(name = "MESSAGE")
	private String message;//推送内容，促销活动，节日活动，优惠活动，抽奖活动
	
	@Column(name="FOOD")
	private Foot food;//推送菜品，根据当天订单中最热门的菜品进行推送，访问food 数据库
	
	@Column(name="LUCKY")
	private User lucky;//推送幸运用户，从一周订餐的用户中随机挑选幸运用户，访问dingdan 数据库
	
	
	
	
	public String getMessage() {//获取推荐消息函数
		return message;
	}
	
	public void showLucky() {//幸运用户展示
		System.out.println("恭喜"+lucky.getUsername()+"成为本期幸运用户");
	}
	
	public void showFood() {//展示推荐菜品函数
		//System.out.println("今日推荐菜品：");
		food.getProduct_introduce();
	}

	public void setMessage(String message) {//设置推送消息函数
		//this.message ="今日XXX活动，本店开展XXX活动，菜品一律XX折，并赠送XXX！！";
		this.message=message;
	}
	
	public void showMessage() {//展示推送消息函数
		System.out.println(message);
	}
	
	
	public void setFood(String f) {//设置推荐菜品
		//food.setProduct_name(f);
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
            String sql = "select PRODUCT_NAME from t_foot";//要执行的SQL语句
            
            ResultSet rs = statement.executeQuery(sql);//3.ResultSet类，用来存放获取的结果集！！
            System.out.println("-----------------");
            System.out.println("执行结果如下所示:");  
            System.out.println("-----------------");  
            System.out.println("PRODUCT_NAME");  
            System.out.println("-----------------");  
           
            
            //Random  n = new Random();//随机数生成
            String food = null;
            @SuppressWarnings("unused")
			int i=0;

            //System.out.println(j);
            while(rs.next()){ 
                	food = rs.getString("PRODUCT_NAME");  //获取PRODUCT_NAME这列数据
                	i++;
                }
             
            System.out.println(food); //输出结果
            rs.close();
            con.close();
        } catch(ClassNotFoundException e) { //数据库驱动类异常处理
           
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

	public void setLucky() {//设置幸运用户
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
           
            
            Random  n = new Random();//随机数生成
            String id = null;
            int i=0;
            int j=Math.abs(n.nextInt()%10000);
            System.out.println(j);
            while(rs.next()&&i<=100){ 
                id = rs.getString("ORDERID");  //获取orderid这列数据
                i++;
                }
             
            System.out.println(id); //输出结果
            rs.close();
            con.close();
        } catch(ClassNotFoundException e) {//数据库驱动类异常处理
           
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
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
