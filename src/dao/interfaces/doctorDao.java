/* 
doctorUserName varchar(30)
password varchar(150)
recoberyKey varchar(150)
doctorName varchar(50)
doctorLastName1 varchar(50)
doctorLastName2 varchar(50)
doctorSex varchar(1)
*/

package dao.interfaces;

import dao.tables.Doctors;
import java.util.List;

/**
 * @author Cageceal
 */
public interface doctorDao {
    
    public boolean create(String doctorUserName, String password, String doctorName,
    String doctorLastName1, String doctorLastName2, String doctorSex, String recoberyKey);
    
    public List<Doctors> read() throws Exception;
    
}