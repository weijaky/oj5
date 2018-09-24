package huawei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Employee {

    public BaseInfo baseinfo;
    public DepartmentInfo department;
    public Level level;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    public Employee() {
    }

    //基础消息、部门、级别


    public Employee(BaseInfo baseinfo, DepartmentInfo department, Level level) {
        this.baseinfo = baseinfo;
        this.department = department;
        this.level = level;
    }

    public boolean isMatchJob() {
        return level.CompetencyQualification >= level.JobPosition;
    }

    public boolean canRetire() {
        Date hireDate = string2Date(baseinfo.HiredDate);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(hireDate);
        rightNow.add(Calendar.YEAR, 30);
        Date retireDate = rightNow.getTime();
        return getCurrDate().after(retireDate);
    }

    public boolean needRetire() {
        Date birth = string2Date(baseinfo.DateofBirth);

        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(birth);
        rightNow.add(Calendar.YEAR, getRetireYear());
        Date retireDate = rightNow.getTime();

        return getCurrDate().after(retireDate);
    }

    public int getRetireYear() {
        if (baseinfo.gender.equals(Gender.Male)) {
            return 60;
        }
        return 50;
    }

    public Date string2Date(String str) {
        try {
            return sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Date getCurrDate() {
        return new Date();
    }
}
