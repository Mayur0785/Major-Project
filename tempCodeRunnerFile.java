import java.util.Scanner;

class StudentInfo {

    private int rollNumber;
    private String studentName;
    private String branch;
    private double totalMarks;

    public void getDetails(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Branch: ");
        branch = sc.nextLine();

        System.out.print("Enter Marks: ");
        totalMarks = sc.nextDouble();
    }

    public void showDetails() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + studentName);
        System.out.println("Branch      : " + branch);
        System.out.println("Marks       : " + totalMarks);
        System.out.println("============================");
    }
}

public class Assignment2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentInfo[] list = new StudentInfo[5];

        for (int i = 0; i < list.length; i++) {
            list[i] = new StudentInfo();
            System.out.println("\nEnter Student " + (i + 1) + " Details");
            list[i].getDetails(sc);
        }

        System.out.println("\n***** Student Records *****");

        for (StudentInfo s : list) {
            s.showDetails();
        }

        sc.close();
    }
}