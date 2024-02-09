import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

public class salaryslip {
    Locale locale ;
    static String formattedsalary (double unformattedSalary)
    {
     NumberFormat nf;
     nf = new NumberFormat.getCurrentInstance();
     return  nf.format(unformattedSalary);
    };   
    // Members(Class/Instance)
    
    static String properCase(String name) 
    {
        String names[] = name.split(" ");
        String fullName = " ";
        for (int i = 0; i < names.length; i++) {
            String n = names[i];
            char firstChar = n.charAt(0);
            String firstLetterCap = String.valueOf(firstChar).toUpperCase();
            String remString = n.substring(1).toLowerCase();

            String n2 = firstLetterCap + remString;
            fullName = fullName + n2 + " ";

        }
        return fullName.trim();
    }

    static void input() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the id");
        int id = scanner.nextInt();
        System.out.println("Enter the name ");
        String name = scanner.nextLine();

        System.out.println("Enter the Basic Salary ");
        double basicSalary = scanner.nextDouble();
        compute(id, name, basicSalary);
        scanner.close();
    }

    static void compute(int id, String name, double basicSalary) 
    {
        double hra = basicSalary * 0.50;
        double ta = basicSalary * 0.40;
        double da = basicSalary * 0.20;
        double ma = basicSalary * 0.25;
        double pf = basicSalary * 0.05;
        print(id, name, basicSalary, hra, ta, da, ma, pf);
    }

    static void print(int id, String name, double basicSalary, double hra, double ta, double da, double ma, double pf) 
    {
        System.out.println("Id" + id);
        System.out.println("Name" + name);
        System.out.println("Basic Salary " + unformattedSalary(basicSalary));
        System.out.println("Earning Allowances Deduction");
        System.out.println("hra" + unformattedSalary(hra) + "\t\t\t" + "pf" + unformattedSalary(pf));
        System.out.println("da" + unformattedSalary(da));
        System.out.println("ta" + unformattedSalary(ta));
        System.out.println("ma" + unformattedSalary(ma));

    }

    public static void main(String[] args) 
    {
        // input
        input();

    }
}

// SOLID
// s=srp(single responsibility principle)