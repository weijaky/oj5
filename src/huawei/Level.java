package huawei;

public class Level {
	public int CompetencyQualification;//技术级别  1~10
	public int JobPosition;//人岗级别
	public int ManagerPosition = -1;//管理级别 5~1



	public Level(int competencyQualification, int jobPosition, int managerPosition) {
		CompetencyQualification = competencyQualification;
		JobPosition = jobPosition;
		ManagerPosition = managerPosition;
	}
}
