package cn.itcast.app19;

import java.util.Date;

/**
 * 用户
 * 
 * @author AdminTC
 */
public class User {

	private Integer id = 1;
	private String username;
	private Double salary;
	private Date hiredate;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String username, Double salary, Date hiredate) {
		super();
		this.id = id;
		this.username = username;
		this.salary = salary;
		this.hiredate = hiredate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

}
