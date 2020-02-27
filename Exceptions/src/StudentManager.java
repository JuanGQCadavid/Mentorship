public class StudentManager {
    public String find(String studentID) throws StudenNotFoundException {

        if (studentID.equals("12344")) {
            return "YES";
        }else{
            throw new StudenNotFoundException(
                    "Dude, the student is no here with us... " + studentID
            );
        }
    }
}
