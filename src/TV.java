
public class TV {
	private String tv_name;//TV제조회사
	private int year;//제조년
	private int inch;//TV크기
	
	public TV(String tv_name, int year, int inch) {
		//super();
		this.tv_name = tv_name;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.print(this.tv_name + "에서 만든 " + this.year + "년형 " + this.inch + "인치 TV");
		
	}
	
	
	
	
	
}
