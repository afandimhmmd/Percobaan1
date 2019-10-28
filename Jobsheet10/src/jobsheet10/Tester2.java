package jobsheet10;

/**
 *
 * @author Windows
 */
public class Tester2 {
    public static void main(String[] args) {    
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        Employee e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfo());
        System.out.println("--------------------");
        System.out.println(""+pEmp.getEmployeeInfo());
        System.out.println("Haloo");
    }
}