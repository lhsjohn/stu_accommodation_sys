package cn.edu.hqu.stu_accommodation_sys.pojo;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author 
 */
public class Student implements Serializable {
    private String stuId;
    
    @Size(min=3,max=12,message="用户名信息在3-12位之间")
    private String stuUsername;
    
    @Size(min=5,max=15,message="密码长度在5-15位之间")
    private String stuPassword;

	@NotEmpty(message="邮箱不能为空")
	@Email(message="请输入正确的邮箱格式")
    private String stuEmail;
  
	@Size(min=11,max=11,message="请输入十一位手机号码")
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