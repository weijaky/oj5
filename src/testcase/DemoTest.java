package testcase;


import huawei.EmployeeInterface;
import huawei.BaseInfo;
import huawei.Level;
import huawei.Gender;
import huawei.DepartmentInfo;
import huawei.Employee;
import huawei.Manager;


import junit.framework.TestCase;

public class DemoTest extends TestCase {
	EmployeeInterface oj= new EmployeeInterface();
	// ��������ʵ��ʾ��
	// SetUp: ��ÿ������ǰִ��һ��
	protected void  setUp()
	{
	}

	// tearDown: ��ÿ��������ִ��һ��
	protected void tearDown()
	{

	}
	public void testCase01()
	{
		oj.clear();
		
		BaseInfo zhangsanBaseInfo = new BaseInfo("zhangsan", 1,Gender.Male,"19700210", "20070101");
		DepartmentInfo departmentInfo = new DepartmentInfo(100,"2012ʵ����");
		Level level= new Level(2,1,0);
	 	Employee zhangsan = new Employee(zhangsanBaseInfo, departmentInfo, level);
	 	
	 	BaseInfo lisiBaseInfo = new BaseInfo("lisi", 2, Gender.Male, "19550101",  "19980101");
	  	Employee lisi = new Employee(lisiBaseInfo, departmentInfo,level);
	 	
		oj.addEmployee(zhangsan);
		oj.addEmployee(lisi);

		assertEquals(oj.getEmployeeNumber("2012ʵ����"),2);
		assertEquals(oj.getManagerNumber("2012ʵ����"),0);

		assertEquals(oj.getJobNoMatchingNumber("2012ʵ����"),0);
		assertEquals(oj.getRetireNumber("20150101","2012ʵ����"),1);

	}


	
	    
	   
	

	


}
