package WestTwo.Round3;

/**
 * @Date: 2023/1/7
 * @Author: RuiLin
 * @Description: 学籍管理系统（需要先在数据库导入另一个SQL文件）
 */

import java.sql.*;
import java.util.Scanner;

public class StudentManagement {
    static String url = "jdbc:mysql://localhost:3306/students_management";//修改具体数据库后缀
    static String user = "root";
    static String password = "..."; //修改数据库密码

    public static void main(String[] args) throws Exception {
        System.out.println("*** 输入数字跳转相应功能 ***");
        mainMenu();
    }

    public static void mainMenu() throws SQLException {
        System.out.println("---- 学籍管理系统主页 ----");
        System.out.println("1.查看学生信息\n2.修改学生信息\n3.删除学生信息\n4.增加学生信息");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                studentInfo();
                break;
            case 2:
                updateStudent();
                break;
            case 3:
                deleteStudent();
                break;
            case 4:
                insertStudent();
                break;
        }
    }

    public static void studentInfo() throws SQLException {
        System.out.println("--------------------");
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();

        String sql = "SELECT * FROM student JOIN class USING(cid)";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println("学号：" + rs.getString("sid"));
            System.out.println("姓名：" + rs.getString("name"));
            System.out.println("性别："+rs.getString("gender"));
            System.out.println("班级：" + rs.getString("major"));
            System.out.println();
        }

        System.out.println("*** 全部加载完毕 ***");
        System.out.println("1.返回主页面\n2.关闭管理系统");

        Scanner sc = new Scanner(System.in);
        int back = sc.nextInt();
        switch (back) {
            case 1:
                mainMenu();
                break;
            case 2:
                rs.close();
                stmt.close();
                conn.close();
                System.out.println("---- 感谢使用 -----");
                break;
        }

    }

    public static void updateStudent() {
    }

    public static void deleteStudent() throws SQLException {
        System.out.println("--------------------");
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.print("输入需要删除的学生学号：");
        Scanner sc = new Scanner(System.in);
        int sid = sc.nextInt();
        PreparedStatement stmt = conn.prepareStatement("DELETE FROM student WHERE sid = ?");
        stmt.setInt(1, sid);
        stmt.executeUpdate();
        System.out.println("*** 删除成功 ***");

        System.out.println("1.返回主页面\n2.关闭管理系统");
        int back = sc.nextInt();
        switch (back) {
            case 1:
                mainMenu();
            case 2:
                stmt.close();
                conn.close();
                System.out.println("---- 感谢使用 -----");
        }

    }

    public static void insertStudent() throws SQLException {
        System.out.println("--------------------");
        Connection conn = DriverManager.getConnection(url, user, password);
        PreparedStatement stmt = conn.prepareStatement("INSERT student(sname,sgender,cid,sid) VALUES (?,?,?,?)");
        Scanner sc = new Scanner(System.in);

        System.out.print("输入学生姓名：");
        String name = sc.nextLine();
        stmt.setString(1, name);

        System.out.print("输入学生性别：");
        String gender = sc.nextLine();
        stmt.setString(2, gender);

        System.out.print("输入学生班级：");
        int cid = sc.nextInt();
        stmt.setInt(3, cid);

        System.out.print("输入学生学号：");
        int sid = sc.nextInt();
        stmt.setInt(4, sid);

        stmt.executeUpdate();
        System.out.println("*** 更新成功 ***");
        System.out.println("1.返回主页面\n2.关闭管理系统");

        int back = sc.nextInt();
        switch (back) {
            case 1:
                mainMenu();
            case 2:
                conn.close();
                stmt.close();
                System.out.println("---- 感谢使用 -----");
        }

    }

}
