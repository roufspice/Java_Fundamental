package java_20200604;

import java.util.ArrayList;

public class EmpDemo {
	public static void main(String[] args) {
		EmpDao dao = EmpDao.getInstance();
		
		
		
		
		int no = 9000;
		String name = "제이에스티나";
		String job = "ANALYIST";
		int mgr = 7788;
		int sal = 2200;
		int comm = 0;
		int deptNo = 30;
		
		
		// 1	#CURDATE()함수로 
		int resultCount = dao.insert(new EmpDto(no, name, job, mgr, null, sal, comm, deptNo));
		if (resultCount == 1) {
			System.out.println("사원이 정상적으로 추가되었습니다.");
		} else {
			System.err.println("오류...");
		}
		

		// 2 : update
		no = 9000;
		name = "LEE1";
		job = "SALESMAN";
		mgr = 7844;
		sal = 2222;
		comm = 10;
		deptNo = 10;
		
		
		
		resultCount = dao.update(new EmpDto(no, name, job, mgr, null, sal, comm, deptNo));
		if (resultCount == 1) {
			System.out.println("사원이 정상적으로 업데이트되었습니다.");
		} else {
			System.err.println("오류...");
		}

		// 3.: delete
		
		resultCount = dao.delete(no);
		if (resultCount == 1) {
			System.out.println("사원이 정상적으로 삭제 되었습니다.");
		} else {
			System.err.println("오류...");
		}
		
		System.out.println("=======================================");
		
		//4. select(0,10);
		int start = 0;
		int len = 10;
		ArrayList<EmpDto> list= dao.select(start, len);
		for(EmpDto e : list) {
			System.out.printf("%d, %s, %s, %d, %s, %d, %d, %d%n", e.getNo(), e.getName(), e.getJob(), e.getMgr(), e.getHireDate(), e.getSal(), e.getComm(), e.getDeptNo());
			
		}
		
		System.out.println("=========================================");
		no = 7839;
		EmpDto dto = dao.select(no);
		if(dto != null) {
			System.out.printf("%d, %s, %s, %d, %s, %d, %d, %d%n", dto.getNo(), dto.getName(), dto.getJob(), dto.getMgr(), dto.getHireDate(), dto.getSal(), dto.getComm(), dto.getDeptNo());
		} else{
			System.out.println("회원정보가 없습니다.");
		}
		
		
		
	}
	

}
