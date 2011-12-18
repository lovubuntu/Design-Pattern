package employeepayroll;

/**
 *
 * @author Prabhu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee specles           = new Employee();
        Payroll payroll             = new Payroll(specles);
        TreatShare  treatShare      = new TreatShare(specles);
        TaxDepartment taxDepartment = new TaxDepartment(specles);
        specles.setEmployeeValues("Specles", 70000);
        treatShare.noMoreTreat();
        specles.setEmployeeValues("Specles", 90000);
    }

}
