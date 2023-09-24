public class Procedure {
    private String nameOfProcedure;
    private String dateOfProcedure;
    private String nameOfPractitioner ;
    private double chargesForProcedure;

    public Procedure() {
        this.dateOfProcedure = "";
        this.chargesForProcedure = 0.0;
        this.nameOfPractitioner  = "";
        this.nameOfProcedure = "";
    }

    public Procedure(String name, String date) {
        this.nameOfProcedure = name;
        this.dateOfProcedure = date;
    }

    public Procedure(String nameOfProcedure, String dateOfProcedure, String nameOfPractitioner, double chargesForProcedure) {
        this.nameOfProcedure = nameOfProcedure;
        this.dateOfProcedure = dateOfProcedure;
        this.nameOfPractitioner = nameOfPractitioner;
        this.chargesForProcedure = chargesForProcedure;
    }

    public String getNameOfProcedure() {
        return nameOfProcedure;
    }

    public void setNameOfProcedure(String procedureName) {
        nameOfProcedure = procedureName;
    }

    public String getDateOfProcedure() {
        return dateOfProcedure;
    }

    public void setDateOfProcedure(String date) {
        dateOfProcedure = date;
    }

    public String getNameOfPractitioner () {
        return nameOfPractitioner ;
    }

    public void setNameOfPracticor(String doctorName) {
        nameOfPractitioner = doctorName;
    }

    public double getChargesForProcedure() {
        return chargesForProcedure;
    }

    public void setChargesForProcedure(double Charges) {
        chargesForProcedure = Charges;
    }

    public String toString() {
        return "\t\t"+buildNameOfProcedure() + System.lineSeparator() +
                "\t\t"+buildDateOfProcedure() + System.lineSeparator() +
                "\t\t"+buildNameOfPractitioner() + System.lineSeparator() +
                "\t\t"+buildChargesForProcedure();
    }

    public String buildChargesForProcedure() {
        return "Charge=" + getChargesForProcedure();
    }
    public String buildNameOfPractitioner () {
        return "Name of Practitioner: " + getNameOfPractitioner();
    }
    public String buildDateOfProcedure() {
        return "Date of procedure: " + getDateOfProcedure();
    }

    public String buildNameOfProcedure() {
        return "Name of procedure: " + getNameOfProcedure();
    }

}
