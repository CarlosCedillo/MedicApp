
/* 
TABLE doctors
    doctorUserName varchar(50)
    password varchar(50)
    doctorEmail varchar(80)
    confirmedEmail boolean
    doctorName varchar(50)
    doctorLastName1 varchar(50)
    doctorLastName2 varchar(50)
    doctorSex varchar(1)
*/

package dao.entities;

/**
 * @author Cageceal
 */
public class Doctors {
    
    private String userName;
    private String password;
    private String name;
    private String lastName1;
    private String lastName2;
    private String sex;
    private String email;
    private boolean confirmedEmail;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isConfirmedEmail() {
        return confirmedEmail;
    }

    public void setConfirmedEmail(boolean confirmedEmail) {
        this.confirmedEmail = confirmedEmail;
    }
    
}
