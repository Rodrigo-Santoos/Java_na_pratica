package Program;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        /*instanciando a data receber a data que o usuario digitar*/
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        String departmentName;
        String workerName;
        String workerLevel;
        double salary = 0;

        System.out.print("Enter department´s name: ");
        departmentName = entrada.nextLine();

        System.out.println("Enter worker data:");

        System.out.print("Name: ");
        workerName = entrada.nextLine();

        System.out.print("Level: ");
        workerLevel = entrada.nextLine();

        System.out.print("Base salary: ");
        salary = entrada.nextDouble();

        /*instaciando com os dados digitados pelo usuario */
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),salary, new Department(departmentName));

/*------------------------------------------------------------------------------------------------------------------------*/

        System.out.print("How many contracts to this worker? ");
        int contractWorker = entrada.nextInt();

        for (int i = 1 ; i <= contractWorker ; i++){

            System.out.println("Enter contract #" + i);
            /*recebendo a data digitada*/
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(entrada.next());

            System.out.print("Value por hours: ");
            double valueHours = entrada.nextDouble();

            System.out.print("Duration:");
            int duration = entrada.nextInt();

            HourContract hourContract = new HourContract(contractDate,valueHours,duration);

            /*associando a classe hourContract na classe Worker*/
            worker.addContract(hourContract);

        }

/*------------------------------------------------------------------------------------------------------------------------*/

        System.out.println();
        System.out.print("Enter mouth and year to calculate income (MM/YYYY): ");
        String mouthAndYear = entrada.next();
        /*recortando a string para pegar o mes e o ano e convertendo para inteiro*/
        int mouth = Integer.parseInt(mouthAndYear.substring(0,2));
        int year = Integer.parseInt(mouthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for: " + mouthAndYear + ": " + worker.income(year,mouth));


        entrada.close();
    }
}
