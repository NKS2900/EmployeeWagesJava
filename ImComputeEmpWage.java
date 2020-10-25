package UC_14;

public interface ImComputeEmpWage
{
	public void addCompanyEmpWage(String company , int empRatePerHour , int numOfWorkingDays , int mxHoursPerMonth);
	public void computeEmpWage();
	public int getTotalWage(String company);
}