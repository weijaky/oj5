package huawei;

public class Level {
	public int CompetencyQualification;//��������  1~10
	public int JobPosition;//�˸ڼ���
	public int ManagerPosition = -1;//������ 5~1



	public Level(int competencyQualification, int jobPosition, int managerPosition) {
		CompetencyQualification = competencyQualification;
		JobPosition = jobPosition;
		ManagerPosition = managerPosition;
	}
}
