class Student {
    int rollno;
    String name;
    int mark;    
}

public class Demo18_05 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Dang Khoa";
        s1.mark = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Dep trai";
        s2.mark = 99;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Nhat The Gioi";
        s3.mark = 95;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;      
        students[2] = s3;

        for (Student s : students) {
            System.out.println(s.rollno + " " + s.name + " " + s.mark);
        }

        // int nums[] = new int[6];
        // nums[0] = 10;
        // nums[1] = 20;   
        // nums[2] = 30;
        // nums[3] = 40;
        // nums[4] = 50;
        // nums[5] = 60;

        // for (int i = 0; i < nums.length; i++) {
        //     System.out.print(nums[i] + " ");
        // }
        
    }
}
