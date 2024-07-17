import java.util.Arrays;

public class StudyContact {
    StudyBack[] contact={};
    public void insert(StudyBack infos)
    {
        contact= Arrays.copyOf(contact,contact.length+1);
        contact[contact.length-1]=infos;
    }
}
