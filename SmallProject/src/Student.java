public class Student {
    String name;
    int[] marks = new int[3];
    int roll;
    char grade;
    double percentage;
    int total;

    Student(String name,int[] marks,int roll){
        this.name = name;
        this.marks = marks;
        this.roll = roll;
        calcuateMarks();
    }
    private void calcuateMarks(){
         total = 0;
        for(int maks: marks){
        total+=maks;
        }
        percentage = total/3.0;

        if(percentage>90) grade = ('A');
        else if(percentage>80) grade = ('B');
        else if(percentage>70) grade = ('C');
        else if(percentage>60) grade = ('D');
        else grade = ('F');
    }
    public  void result(){
        System.out.println(name+"! Your result is....");
        System.out.println("Name        : "+name);
        System.out.println("Roll        : "+roll);
        System.out.println("Total Marks : "+total);
        System.out.println("Marks       : "+marks[0]+", "+marks[1]+", "+marks[2]);
        System.out.println("Percentage  : "+String.format("%.2f", percentage) + "%");
        System.out.println("Grade       : "+grade);
    }
}
