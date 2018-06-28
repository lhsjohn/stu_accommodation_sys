package cn.edu.hqu.stu_accommodation_sys.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Student implements Serializable {
    private String stuId;

    private String stuUsername;

    private String stuPassword;

    private String stuEmail;

    private String stuPhone;

    private String stuGender;

    private static final long serialVersionUID = 1L;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuUsername() {
        return stuUsername;
    }

    public void setStuUsername(String stuUsername) {
        this.stuUsername = stuUsername;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuUsername=" + stuUsername + ", stuPassword=" + stuPassword
				+ ", stuEmail=" + stuEmail + ", stuPhone=" + stuPhone + ", stuGender=" + stuGender + "]";
	}
    
}