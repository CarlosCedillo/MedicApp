/* 
doctorUserName varchar(30)
password varchar(150)
recoberyKey varchar(150)
doctorName varchar(50)
doctorLastName1 varchar(50)
doctorLastName2 varchar(50)
doctorSex varchar(1)
*/

package dao.tables;

/**
 * @author Cageceal
 */
public class Doctors {
    
    String doctorUserName;
    String password;
    String doctorName;
    String doctorLastName1;
    String doctorLastName2;
    String doctorSex;
    String recoberyKey;

    public String getDoctorUserName() {
        return doctorUserName;
    }

    public void setDoctorUserName(String doctorUserName) {
        this.doctorUserName = doctorUserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorLastName1() {
        return doctorLastName1;
    }

    public void setDoctorLastName1(String doctorLastName1) {
        this.doctorLastName1 = doctorLastName1;
    }

    public String getDoctorLastName2() {
        return doctorLastName2;
    }

    public void setDoctorLastName2(String doctorLastName2) {
        this.doctorLastName2 = doctorLastName2;
    }

    public String getDoctorSex() {
        return doctorSex;
    }

    public void setDoctorSex(String doctorSex) {
        this.doctorSex = doctorSex;
    }

    public String getRecoberyKey() {
        return recoberyKey;
    }

    public void setRecoberyKey(String recoberyKey) {
        this.recoberyKey = recoberyKey;
    }
    
}
