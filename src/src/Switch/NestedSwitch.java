package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empId = input.nextInt();

        String department = input.next();

        switch (empId) {
            case 1:
                System.out.println("Vishal Chaurasiya");
                break;
            case 2:
                System.out.println("Ankit kumar");
                break;
            case 3:
                System.out.println("Emp Number 2");
                switch (department) {
                    case "IT":
                    System.out.println("IT department");
                    break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department");
                }
            default:
                System.out.println("Enter correct EmpID");
        }

    }
}
