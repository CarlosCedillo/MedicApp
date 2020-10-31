
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

package dao.interfaces;

//public List<Doctors> read() throws Exception;

import dao.entities.Doctors;

/**
 * @author Cageceal
 */
public interface DoctorDao {
    
    public boolean create( Doctors doctor );
    
    public boolean updateEmail( String doctorUserName, String doctorEmail );
    
    public boolean login( String doctorUserName, String password );
    
    public boolean existUsername( String doctorUserName );
    
    public boolean existEmail(String doctorEmail);
    
    public boolean getconfirmedEmail(String userName);
    
    public boolean setconfirmedEmail(String userName);
    
    public String getEmail(String userName);
    
}