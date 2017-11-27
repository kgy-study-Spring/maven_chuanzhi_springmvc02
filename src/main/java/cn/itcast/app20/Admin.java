package cn.itcast.app20;

/**
 * 管理员
 * @author AdminTC
 */
import java.util.Date;

public class Admin {

	private String username;
	private Double salary;
	private Date hiredate;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String username, Double salary, Date hiredate) {
		super();
		this.username = username;
		this.salary = salary;
		this.hiredate = hiredate;
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

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	@Override
	public String toString() {
		return this.username+":"+this.salary+":"+this.hiredate.toLocaleString();
	}

}
