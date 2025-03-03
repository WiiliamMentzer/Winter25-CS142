public class Name {
    public String firstName;
    public String lastName;
    public String middleInitial;
    
    public Name(){
        firstName = "";
        lastName = "";
        middleInitial = "";
    }

    public String getNormalOrder(){
        return this.firstName + " " + this.middleInitial + ". " + this.lastName;
    }

    public String getReverseOrder(){
        return this.lastName + " " + this.middleInitial + ". " + this.firstName;
    }
    
    public String megaStringReturn(){
        String newTempString = this.firstName + " " + this.middleInitial + ". " + this.lastName;
        return newTempString;
    }
}
