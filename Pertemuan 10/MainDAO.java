package person;

/**
 *
 * Ester Imelda Br Sihotang - 24060123140127
 */
public class MainDAO {
    public static void main(String args[]){
        Person person = new Person("Unsza");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDao());
        try {
            m.getPersonDAO().savePerson(person);
        } catch(Exception e) {
            e.printStackTrace();
        }       
    }
}