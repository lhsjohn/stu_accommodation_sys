package cn.edu.hqu.stu_accommodation_sys.pojo;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 
 */
@AllArgsConstructor
@NoArgsConstructor
public class Landlord implements Serializable {
	
	@Getter
	@Setter
    private String landlordId;

	@Getter
	@Setter
	@Size(min=3,max=12,message="用户名信息在3-12位之间")
    private String landlordUsername;

	@Getter
	@Setter
	@Size(min=5,max=15,message="密码长度在5-15位之间")
    private String landlordPassword;

	@Getter
	@Setter
	@Size(min=18,max=18,message="请输入十八位身份证号码")
    private String landlordIdcard;

	@Getter
	@Setter
	@Size(min=2,max=15,message="请输入真实姓名")
    private String landlordName;

	@Getter
	@Setter
	@NotEmpty(message="邮箱不能为空")
	@Email(message="请输入正确的邮箱格式")
    private String landlordEmail;

	@Getter
	@Setter
	@Size(min=11,max=11,message="请输入十一位手机号码")
    private String landlordPhone;
    @Getter
    @Setter
    @NotEmpty(message="性别不能为空")
    private String landlordGender;

    @Getter
    @Setter
    private String landlordInfo;

    @Getter
    @Setter
    private Integer landlordAge;

    @Getter
    @Setter
    private Double landlordAccount;

    
    private static final long serialVersionUID = 1L;


	@Override
	public String toString() {
		return "Landlord [landlordId=" + landlordId + ", landlordUsername=" + landlordUsername + ", landlordPassword="
				+ landlordPassword + ", landlordIdcard=" + landlordIdcard + ", landlordName=" + landlordName
				+ ", landlordEmail=" + landlordEmail + ", landlordPhone=" + landlordPhone + ", landlordGender="
				+ landlordGender + ", landlordInfo=" + landlordInfo + ", landlordAge=" + landlordAge
				+ ", landlordAccount=" + landlordAccount + "]";
	}

    
}