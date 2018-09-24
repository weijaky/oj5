package huawei;

public class EmployeeInterface {


	public void clear() //清除所有的人员信息
	{
		EmployeeSystem.getInstance().clear();
	}
	public int getEmployeeNumber(String departmentName)//Employee人数
	{
		return EmployeeSystem.getInstance().getEmployeeNumber(departmentName);
	}
	public int getManagerNumber(String departmentName)//Manager人数
	{
		return EmployeeSystem.getInstance().getManagerNumber(departmentName);
	}
	public int getJobNoMatchingNumber(String departmentName) //人岗不匹配人数
	{
		return EmployeeSystem.getInstance().getJobNoMatchingNumber(departmentName);
	}
	public int getRetireNumber(String date,String departmentName)  //指定年月日定年月日和部门，获取必须退休人数
	{
		return EmployeeSystem.getInstance().getRetireNumber(date, departmentName);
	}
	public int getEarlyRetireNumber(String date,String departmentName)  //指定年月日和部门，获取可以提前退休人数
	{
		return EmployeeSystem.getInstance().getRetireNumber(date, departmentName);
	}

	//增加Employee，如果数据异常，返回-1，否则返回0
	//注意：人岗不匹配者，应该返回0。
	public int addEmployee(Employee employee) 
	{
		return EmployeeSystem.getInstance().addEmployee(employee);
	}
	 //增加Manager，如果数据异常，返回-1，否则返回0
	 //注意：人岗不匹配者，应该返回0。
	public int addEmployee(Manager manager) 
	{
		return EmployeeSystem.getInstance().addManager(manager);
	}

	  
}


