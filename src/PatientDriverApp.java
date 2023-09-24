public class PatientDriverApp {
    public PatientDriverApp() {
        Patient p1 = new Patient("Steven", "M", "Stamkos", "1234 Virtual Street", "Markham", "Canada", "1111", "Brayden Point", "123-456-7890");
        Procedure pro1 = new Procedure();
        pro1.setNameOfProcedure("Cruciate ligament");
        pro1.setDateOfProcedure("08/08/2021");
        pro1.setNameOfPracticor("Wayne Gretzky");
        pro1.setChargesForProcedure(50.00); // He is in canada so charges are low
        Procedure pro2 = new Procedure("Circumcise", "13/13/2013");
        pro2.setChargesForProcedure(65.63);
        pro2.setNameOfPracticor("Sidney Crosby");
        Procedure pro3 = new Procedure("Appendectomy", "09/08/2020", "Connor McDavid", 55.26);

        displayPatient(p1);
        displayProcedure(pro1);
        displayProcedure(pro2);
        displayProcedure(pro3);
        System.out.println("Total Charges: "+"$"+calculateTotalCharges(pro1,pro2,pro3));
    }

    public void displayPatient(Patient patient) {
        System.out.println("Paitent info:");
        System.out.println(patient.toString());
    }

    public void displayProcedure(Procedure procedure){
        System.out.println(procedure.toString());
    }

    public double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
         return p1.getChargesForProcedure() + p2.getChargesForProcedure() + p3.getChargesForProcedure();

    }

}
