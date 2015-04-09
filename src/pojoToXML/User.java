package pojoToXML;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "user")
// define the order of the nodes
@XmlType(propOrder = { "name", "age", "sex", "interestedIn" })
public class User {

	public User() {

	}

	public User(String name, int age, String interestedIn, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.interestedIn = interestedIn;
		this.sex = sex;
	}

	private String name;
	private int age;
	private String interestedIn;
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getInterestedIn() {
		return interestedIn;
	}

	public void setInterestedIn(String interestedIn) {
		this.interestedIn = interestedIn;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
