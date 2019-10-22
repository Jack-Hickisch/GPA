public class Student
{
    // data - properties
    private String name;
    private int gradeLevel = 9; // a default

    private double mathScore;
    private double englishScore;
    private double csScore;

    // construtor
    public Student(String name, int gradeLevel)
    {
        this.name = name;
        setGradeLevel(gradeLevel);

        this.mathScore = 0.5; // this is optional since there is only one mathScore
        this.englishScore = 0.5; // same ^
        this.csScore = 0.5; // same ^^

    }

    //functions - abilities

    // getters and setters
    public String getName()
    {
        return this.name;
    }

    public int getGradeLevel()
    {
        return this.gradeLevel;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setGradeLevel(int gradeLevel)
    {
        if (gradeLevel >= 9 && gradeLevel <= 12)
        {
            this.gradeLevel = gradeLevel;
        }
    }
    
    // calculate gpa
    public double calculateGPA()
    {
        System.out.println("Calculating GPA...");
        return (this.mathScore + this.englishScore + this.csScore) / 3; // they are strings oops
    }
}