public class Student {
    //-	Student Name, Class, Math, Physical, Chemistry, Average, Type.
    private String name;
    private String className;
    private float mathScore;
    private float physicalScore;
    private float chemistryScore;
    private double averageScore;
    private char typeScore;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public float getMathScore() {
        return mathScore;
    }
    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }
    public float getPhysicalScore() {
        return physicalScore;
    }
    public void setPhysicalScore(float physicalScore) {
        this.physicalScore = physicalScore;
    }

    public float getChemistryScore() {
        return chemistryScore;
    }
    public void setChemistryScore(float chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public double getAverageScore() {
        return averageScore;
    }
    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
    public char getTypeScore() {
        return typeScore;
    }
    public void setTypeScore(char typeScore) {
        this.typeScore = typeScore;
    }
    public Student(String name, String className, float mathScore, float physicalScore, float chemistryScore) {
        this.name = name;
        this.className = className;
        this.mathScore = mathScore;
        this.physicalScore = physicalScore;
        this.chemistryScore = chemistryScore;
        this.averageScore = (double) (chemistryScore + mathScore + physicalScore)/3.0;
    }
    


    

}
