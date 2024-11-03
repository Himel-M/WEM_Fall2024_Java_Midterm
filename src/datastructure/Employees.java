package datastructure;

public class Employees {
    /*Consider the following details of an emplyoee
    * Using this information create several records for an employess
    * Store that each employee information in Arraylist, LinkedList and HashSet
    * You may use existing Classes or create classes of your own for implementation*/


    int id;
    String first_name;
    String last_name;
    String emailAdress;
    int cellPhoneNo;

    public Employees(int id, String first_name, String last_name, String emailAdress, int cellPhoneNo) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.emailAdress = emailAdress;
        this.cellPhoneNo = cellPhoneNo;
    }
}
