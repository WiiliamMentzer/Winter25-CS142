public class Name {
    private String firstName;
    private String lastName;
    private String middleInitial;
    
    public Name(String initialFirstName, String initialMiddleName, String initialLastName){
        firstName = initialFirstName;
        middleInitial = initialMiddleName;
        lastName = initialLastName;
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

    public String currentFirstName(){
        return firstName;
    }
    
    public String currentLastName(){
        return lastName;
    }
    public String currentMiddleInitial(){
        return middleInitial;
    }

    public void newFirstName(String newFN){
        firstName = newFN;
    }

    public void newMiddleInitial(String newMI){
        firstName = newMI;
    }

    public void newLastName(String newLN){
        firstName = newLN;
    }
}
