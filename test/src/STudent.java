import java.io.Serializable;

public class STudent implements Serializable {
    String name;
    int roll;
    String subject;

    public STudent(String name,int roll,String subject){
        this.name = name;
        this.roll = roll;
        this.subject = subject;

    }
}
