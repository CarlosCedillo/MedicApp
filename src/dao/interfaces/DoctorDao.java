/* 
doctorUserName varchar(30)
password varchar(150)
doctorEmail varchar(150)
doctorName varchar(50)
doctorLastName1 varchar(50)
doctorLastName2 varchar(50)
doctorSex varchar(1)
*/

package dao.interfaces;

//public List<Doctors> read() throws Exception;

/**
 * @author Cageceal
 */
public interface DoctorDao {
    
    public boolean create( String doctorUserName, String password, String doctorEmail, 
            String doctorName, String doctorLastName1, String doctorLastName2, String doctorSex );
    
    public boolean login( String doctorUserName, String password );
    
    public boolean existUsername( String doctorUserName );
    
    public boolean existEmail(String doctorEmail);
    
}