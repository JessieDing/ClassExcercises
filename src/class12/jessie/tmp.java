package class12.jessie;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.*;


/**
 * Created by Administrator on 2017/3/17.
 */
public class tmp {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2013);
        c.set(Calendar.MONTH, 11);
        c.set(Calendar.DATE, 30);
        System.out.println(c.getTime().toString());

        Date now2 = new Date();
        c.setTime(now2);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));

//        getMonthDays(); //获取某年每个月的天数
        addCalendar();

    }


    //年月日加减运算
    public static void addCalendar() {
        Calendar c = Calendar.getInstance();
        Date now = new Date();
        c.setTime(now);//设置当前日期
        c.add(Calendar.MONTH, 2);//当前日期加2个月
        System.out.println(c.getTime().toString());
    }

    public static void getMonthDays() {
        //获取某年每个月的天数
        int year = 2017;
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.DATE, 1);
        for (int i = Calendar.JANUARY; i <= Calendar.DECEMBER; i++) {
            c.set(Calendar.MONTH, i);//设置月份
            int maxDay = c.getActualMaximum(Calendar.DATE);//取得一个月中最大天数
            System.out.println("第" + (i + 1) + "月：" + maxDay);
        }

//        Date now = new Date();
//        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        String strDate = df.format(now);
//
//        System.out.println(strDate);
//
//        long tomorrow = now.getTime()+(60*60*24*1000);
//        now.setTime(tomorrow);
//        System.out.println(df.format(now));
//
//        try {
//            Date dt = df.parse("2017/03/23 14:23:21");
//            System.out.println(df.toString());
//        }catch(Exception e){
//            e.printStackTrace();
//        }


//        String str1 = "a,bc,,123,,,XXX";
//        String str2 = "XXXabc123";
//        String str3 = "12345678X";
//        System.out.println(str2.matches("^/w*X{3}$"));
//
//
//        String[] arr = str1.split(",{1,3}");
//        for (String s : arr) {
//            System.out.println(s);
//        }

//        Employee employee1 = new Employee("0001", "张三");
//        Employee employee2 = new Employee("0001", "张三");
//        Employee employee3 = new Employee("0002", "李四");
//        System.out.println(employee1.equals(employee2));
//        System.out.println(employee3.toString());

//        String str4 = "3.1415926";
//        double d = Double.parseDouble(str4);
//        String str5 = "3141592";
//        long l = Long.parseLong(str5);
//        double dd = d;
//        long ll = l;


    }

}

class Employee {
    private String employeeId;
    private String employeeName;

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }


    public boolean equals(Employee e) {
        if (e.getEmployeeId().equals(this.employeeId)) {
            return true;
        } else {
            return false;
        }

    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "员工【" +
                "员工编号：" + employeeId +
                "; 员工姓名：" + employeeName +
                '】';
    }
}
