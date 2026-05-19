class Human {
    private String name;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

public class Demo19_05 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Dang Khoa");

        System.out.println(obj.getName() + " " + obj.getAge());
    }  
}











































// public class Demo19_05 {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello");
//         sb.append(" World");
//         sb.insert(6, "Java ");
//         sb.setLength(30);

//         System.out.println(sb);
//         } 
// }
