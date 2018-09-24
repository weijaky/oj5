package huawei;

import java.util.HashMap;
import java.util.Set;

public class EmployeeSystem extends EmployeeInterface {
    public static EmployeeSystem system;
    public static HashMap<Integer, Employee> allEmployees;

    public static EmployeeSystem getInstance() {
        if (system == null) {
            system = new EmployeeSystem();
        }
        return system;
    }

    private EmployeeSystem() {
        allEmployees = new HashMap<>();
    }

    public enum SortParam {
        All,
        OnlyManager,
        JobNoMatching,
        NeedRetir,
        CanRetir
    }

    //������е���Ա��Ϣ
    public void clear() {
        allEmployees.clear();
    }

    //Employee����
    public int getEmployeeNumber(String departmentName) {
        return getDepartmentEmployees(departmentName, SortParam.All);
    }

    private int getDepartmentEmployees(String departmentName, SortParam param) {
        if (allEmployees == null) {
            return 0;
        }

        HashMap<Integer, Employee> departmentEmployees = new HashMap<>();

        Set<Integer> set = allEmployees.keySet();
        for (Integer id : set) {
            Employee employee = allEmployees.get(id);
            if (employee.department.departmentName.equals(departmentName)) {
                if (param.equals(SortParam.OnlyManager) && employee.level.ManagerPosition > 0) {
                    departmentEmployees.put(id, (Manager) employee);
                } else if (param.equals(SortParam.JobNoMatching) && !employee.isMatchJob()) {
                    departmentEmployees.put(id,  employee);
                } else if (param.equals(SortParam.NeedRetir) && employee.needRetire()) {
                    departmentEmployees.put(id, employee);
                } else if (param.equals(SortParam.CanRetir) && employee.canRetire()) {
                    departmentEmployees.put(id, employee);
                } else if (param.equals(SortParam.All)) {
                    departmentEmployees.put(id, employee);
                }
            }
        }

        return departmentEmployees == null ? 0 : departmentEmployees.size();
    }

    //Manager����
    public int getManagerNumber(String departmentName) {
        return getDepartmentEmployees(departmentName, SortParam.OnlyManager);
    }

    //�˸ڲ�ƥ������
    public int getJobNoMatchingNumber(String departmentName) {
        return getDepartmentEmployees(departmentName, SortParam.JobNoMatching);
    }

    //ָ�������ն������պͲ��ţ���ȡ������������
    public int getRetireNumber(String date, String departmentName) {
        return getDepartmentEmployees(departmentName, SortParam.NeedRetir);
    }

    //ָ�������պͲ��ţ���ȡ������ǰ��������
    public int getEarlyRetireNumber(String date, String departmentName) {
        return getDepartmentEmployees(departmentName, SortParam.NeedRetir);
    }

    //����Employee����������쳣������-1�����򷵻�0
    //ע�⣺�˸ڲ�ƥ���ߣ�Ӧ�÷���0��
    public int addEmployee(Employee employee) {
        if (employee == null || employee.baseinfo == null || employee.baseinfo.ID < 0) {
            return -1;
        }
        allEmployees.put(employee.baseinfo.ID, employee);
        return 0;
    }

    //����Manager����������쳣������-1�����򷵻�0
    //ע�⣺�˸ڲ�ƥ���ߣ�Ӧ�÷���0��
    public int addManager(Manager manager) {
        if (manager == null || manager.baseinfo == null
                || manager.baseinfo.ID < 0
                || manager.level != null
                || manager.level.ManagerPosition < 0
                || manager.level.ManagerPosition > 5) {
            return -1;
        }
        allEmployees.put(manager.baseinfo.ID, manager);
        return 0;
    }
}
