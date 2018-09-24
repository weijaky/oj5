package huawei;

public class BaseInfo {
	//姓名、工号、性别、出生年月日、任职年月日
	public String name;
	public int ID;
	public Gender gender;
	public String DateofBirth;
	public String HiredDate;

	public BaseInfo(String name, int ID, Gender gender, String dateofBirth, String hiredDate) {
		this.name = name;
		this.ID = ID;
		this.gender = gender;
		this.DateofBirth = dateofBirth;
		this.HiredDate = hiredDate;
	}

}
