
public class TV {
	private String tv_name;//TV����ȸ��
	private int year;//������
	private int inch;//TVũ��
	
	public TV(String tv_name, int year, int inch) {
		//super();
		this.tv_name = tv_name;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.print(this.tv_name + "���� ���� " + this.year + "���� " + this.inch + "��ġ TV");
		
	}
	
	
	
	
	
}
