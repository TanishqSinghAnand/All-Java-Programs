public class Twenty {
    void main(String name, int math, int eng, int geo, int comp, int his) {

        int average = (math + eng + geo + comp + his) / 5;
        int total = math + eng + geo + comp + his;
        System.out.println("Name of the student = " + name);
        System.out.println("Marks of " + name + " in Mathematics = " + math);
        System.out.println("Marks of " + name + " in English = " + eng);
        System.out.println("Marks of " + name + " in Geography = " + geo);
        System.out.println("Marks of " + name + " in Computer Science = " + comp);
        System.out.println("Marks of " + name + " in History = " + his);
        System.out.println("Total marks of " + name + " : " + total);
        System.out.println("Average marks of " + name + " : " + average);
    }
}
