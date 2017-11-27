package cn.itcast.app23;

/**
 * 员工
 * 
 * @author AdminTC
 */
public class Emp {
	private String username;// 姓名
	private Double salary;// 薪水

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String username, Double salary) {
		super();
		this.username = username;
		this.salary = salary;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}
