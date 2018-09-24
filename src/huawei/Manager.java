package huawei;

public class Manager extends Employee {

	public Manager(BaseInfo baseinfo, DepartmentInfo department, Level level) {
		super(baseinfo, department, level);
	}

	@Override
	public boolean isMatchJob() {
		if(level.ManagerPosition == 5){
			return level.JobPosition <= 4;
		}else if(level.ManagerPosition == 4){
			return level.JobPosition >= 3 && level.JobPosition < 6;
		}else if(level.ManagerPosition == 3){
			return level.JobPosition >= 5 && level.JobPosition < 8;
		}else if(level.ManagerPosition == 2){
			return level.JobPosition >= 7 && level.JobPosition < 10;
		}else if(level.ManagerPosition == 1){
			return level.JobPosition >= 9;
		}else{
			return false;
		}
	}

	@Override
	public int getRetireYear(){
		if(baseinfo.gender.equals(Gender.Male)){
			return 60;
		}
		return 55;
	}
}
