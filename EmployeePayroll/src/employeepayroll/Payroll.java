/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package employeepayroll;

/**
 *
 * @author Prabhu
 */
public class Payroll implements Observer{
    private float salary;
    private String empName;
    private Employee employee;
    public Payroll(Employee employee) {
        this.employee = employee;
        employee.addObserver(this);
    }

    public void update() {
        this.salary     =   employee.getSalary();
        this.empName    =   employee.getEmployeeName();
        display();
    }
    public void display(){
        System.out.println("From Today "+empName+"'s " +
                "salary will be "+salary);
    }

}
