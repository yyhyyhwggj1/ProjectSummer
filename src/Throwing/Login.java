package Throwing;

import java.util.Scanner;

public class Login {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("请输入账号：");
        String account=sc.next();
        System.out.println("请输入密码：");
        String passWord=sc.next();
        try {
            login(account,passWord);
        } catch (BadCredentialsException e) {
            throw new RuntimeException(e);
        } catch (UserNameNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void login(String account,String passWord)throws BadCredentialsException,UserNameNotFoundException
    {
        if("admin".equals(account))
        {
            if("123456".equals(passWord))
            {
                System.out.println("登陆成功！");
            }
            else {
                throw new BadCredentialsException("账户或密码错误！");
            }
        }
        else {
            throw new UserNameNotFoundException("用户不存在！");
        }
    }
}
