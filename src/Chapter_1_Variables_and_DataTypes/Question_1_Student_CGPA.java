package Chapter_1_Variables_and_DataTypes;

public class Question_1_Student_CGPA {
    public static void main(String[] args) {
        float Hindi=45;
        float English=78;
        float Math=67;

        float cgpa=((Hindi+English+Math)/3)/10f;
        System.out.println("CGPA of the student "+cgpa);

    }
}
