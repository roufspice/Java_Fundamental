package java_20200604;
//Emp 테이블의 칼럼을 멤버변수로 설정! 
public class EmpDto {
	//테이블과 관련있는 칼럼의 이름들은 지우거나 변경해준다!
	private int no;
	private String name;
	private String job;
	private int mgr;
	private String hireDate;
	private int sal;
	private int comm;
	private int deptNo;
	
	
	public EmpDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmpDto(int no, String name, String job, int mgr, String hireDate, int sal, int comm, int deptNo) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public int getMgr() {
		return mgr;
	}


	public void setMgr(int mgr) {
		this.mgr = mgr;
	}


	public String getHireDate() {
		return hireDate;
	}


	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public int getComm() {
		return comm;
	}


	public void setComm(int comm) {
		this.comm = comm;
	}


	public int getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	

}
