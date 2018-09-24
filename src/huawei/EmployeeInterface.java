package huawei;

public class EmployeeInterface {


	public void clear() //������е���Ա��Ϣ
	{
		EmployeeSystem.getInstance().clear();
	}
	public int getEmployeeNumber(String departmentName)//Employee����
	{
		return EmployeeSystem.getInstance().getEmployeeNumber(departmentName);
	}
	public int getManagerNumber(String departmentName)//Manager����
	{
		return EmployeeSystem.getInstance().getManagerNumber(departmentName);
	}
	public int getJobNoMatchingNumber(String departmentName) //�˸ڲ�ƥ������
	{
		return EmployeeSystem.getInstance().getJobNoMatchingNumber(departmentName);
	}
	public int getRetireNumber(String date,String departmentName)  //ָ�������ն������պͲ��ţ���ȡ������������
	{
		return EmployeeSystem.getInstance().getRetireNumber(date, departmentName);
	}
	public int getEarlyRetireNumber(String date,String departmentName)  //ָ�������պͲ��ţ���ȡ������ǰ��������
	{
		return EmployeeSystem.getInstance().getRetireNumber(date, departmentName);
	}

	//����Employee����������쳣������-1�����򷵻�0
	//ע�⣺�˸ڲ�ƥ���ߣ�Ӧ�÷���0��
	public int addEmployee(Employee employee) 
	{
		return EmployeeSystem.getInstance().addEmployee(employee);
	}
	 //����Manager����������쳣������-1�����򷵻�0
	 //ע�⣺�˸ڲ�ƥ���ߣ�Ӧ�÷���0��
	public int addEmployee(Manager manager) 
	{
		return EmployeeSystem.getInstance().addManager(manager);
	}

	  
}


