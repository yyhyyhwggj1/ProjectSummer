package Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Test {
    public static void main(String[] args) {
            // TODO Auto-generated method stub
            //2.通过DriveManager这个类获取一个connection对象
            Connection connection = null;
            //3.通过这个connection对象来获取preparedStatement对象
            PreparedStatement pStatement = null;
            //4.通过这个preparedStatement对象来执行查询语句（SQL语句），获得一个结果集ResultSet
            ResultSet rSet = null;
            try {
                //1.加载驱动
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankSystemDb?characterEncoding=utf8&useSSL=true", "root", "123456");
//			String sql = "insert into master (name,id,age) values (?, ?, ?)";
                pStatement = connection.prepareStatement("insert into master (name,id,age) values (?, ?, ?)");
//			pStatement = connection.prepareStatement("select * from master");
                Master master = new Master("孙六", 1004, 37);
                pStatement.setString(1, master.getNameString());
                pStatement.setInt(2, master.getId());
                pStatement.setInt(3, master.getAge());
//			System.out.println(sql);
//			rSet = pStatement.executeQuery();
                int n = pStatement.executeUpdate();
                if (n>0) {
                    System.out.println("插入成功！");
                }
                //5.处理这个结果集resultSet
//			while (rSet.next()) {
//				String nameString = rSet.getString(1);
//				int id = rSet.getInt(2);
//				int age = rSet.getInt(3);
//				Master master = new Master(nameString, id, age);
//				System.out.println(master);
//
//			}
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }finally{
                //6.关闭链接，释放资源
//			if (rSet != null) {
//				try {
//					rSet.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
                if (pStatement != null) {
                    try {
                        pStatement.close();
                    } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }


        }
    }

