package java_class;

public class SeparateCollection {
	//String neighborhood;
	private String type;
	private String day;     //무슨요일인지 입력하면
	
	//String collectDate; 
	
	
	
	public void setDay(String day) {
		this.day = day;
	}
	public String getDay() {
		return day;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	
	
	
	
	
	//오늘이 분리수거날인지 아닌지 알려준다.
	public boolean isCollectDay() {
		if(day == "월요일" || day == "수요일" || day == "금요일" ) {
			System.out.printf("오늘 %s(은)는 분리수거하는날입니다! %n", day);
			System.out.printf("'일반쓰레기', '음식물쓰레기'는 '14'시 이후, '재활용쓰레기'는 '18'시 이후에 수거합니다.%n");
			System.out.println("감사합니다");
			System.out.println("========");
			boolean result = true;
			return result;
		} else {
			System.out.printf("오늘 %s(은)는 분리수거하는날이 아닙니다!%n", day);
			System.out.printf("매주 월,수,금에 생활쓰레기를 배출해주세요!%n");
			System.out.println("감사합니다");
			System.out.println("========");
			boolean result = false;
			return result;
		}
		
	}
	//생활쓰레기 배출방법!
	//생활쓰레기의 구분에 따라 종류, 처리방법등을 알려주는 프로그램을 만든다.
	//예):type = 달걀; 달갈 은(는) 일반쓰레기 입니다. 종량제봉투로 버려주세요! 라고 출력되게 만들고 싶다.
//	public XXX throwAway(String type) {
//		if (type == "일반쓰레기" ) {
//			
//		}
		
	}
	
	
	
		
	
	
	

