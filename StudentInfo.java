class StudentInfo{
    String firstName;
    String lastName;
    int rollNo;
    long contactNo;
    String fullName;


    StudentInfo(String firstName,String lastName, int rollNo ,long contactNo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNo = rollNo;
        this.contactNo = contactNo;

        this.fullName = firstName + " " + lastName;
    }
}