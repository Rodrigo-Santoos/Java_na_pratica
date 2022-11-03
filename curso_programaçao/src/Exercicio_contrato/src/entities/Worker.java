package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    /*Associaçao*/
    private List<HourContract> contracts = new ArrayList<>();
    private Department department;

    /*-------------------------------------------------------------------------------------------------------*/
    /*construct*/

    public Worker() {

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    /*-------------------------------------------------------------------------------------------------------*/
    /*getters e setters*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    /*public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }*/

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    /*-------------------------------------------------------------------------------------------------------*/
    /*Metodos*/

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    /*calcular os contratos que tem a mesma data*/
    public Double income(int year, int month) {
        double sum = baseSalary;

        /*instanciando o Calendar*/
        Calendar cal = Calendar.getInstance();

        /*percorrendo a lista para pegar o ano e o mes*/
        for (HourContract c : contracts) {
            /*pegando a data e setando no calendario*/
            cal.setTime(c.getDate());

            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);

            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }

        }

        return sum;
    }
}
