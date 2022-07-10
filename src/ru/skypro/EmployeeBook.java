package ru.skypro;

import java.util.Arrays;

public class EmployeeBook {
    public void arrStaff() {
        Employee[] arrStaff = new Employee[10];
        arrStaff[0] = new Employee("Щербаков Илья Андреевич", 98302, 1);
        arrStaff[1] = new Employee("Семенова Дарья Данииловна", 208801, 2);
        arrStaff[2] = new Employee("Литвинова Полина Вадимовна", 198093, 1);
        arrStaff[3] = new Employee("Моисеев Артём Иванович", 238141, 4);
        arrStaff[4] = new Employee("Кузьмина Алина Михайловна", 214952, 5);
        arrStaff[5] = new Employee("Коновалов Евгений Миронович", 158731, 4);
        arrStaff[6] = new Employee("Широков Юрий Дмитриевич", 77799, 3);
        arrStaff[7] = new Employee("Комиссаров Николай Кириллович", 67840, 3);
        arrStaff[8] = new Employee("Орлова Валерия Андреевна", 184905, 2);
        arrStaff[9] = new Employee("Карасева Виктория Николаевна", 186550, 5);
        allStaff(arrStaff);
        minSalaryStaff(arrStaff);
        maxSalaryStaff(arrStaff);
        sumSalaryStaff(arrStaff);
        averageSalaryStaff(arrStaff);
        allNameStaff(arrStaff);
        indexSalary(arrStaff);
        minSalaryStaffDepartment(arrStaff);
        maxSalaryStaffDepartment(arrStaff);
        sumSalaryStaffDepartment(arrStaff);
        averageSalaryStaffDepartment(arrStaff);
        allNameStaffDepartment(arrStaff);
        maxSalary(arrStaff);
        minSalary(arrStaff);
        deleteStaff(arrStaff);
        acceptStaff(arrStaff);
        allStaff(arrStaff);
        changeSalaryAndDepartmentStaff(arrStaff);
        allStaff(arrStaff);
        sortStaffDepartment(arrStaff);
    }

    public void allStaff(Employee[] arrStaff) {
        System.out.println();
        for (int i = 0; i < arrStaff.length; i++) {
            System.out.print(Employee.getCounter() + " " + arrStaff[i]);
            System.out.println();
        }
    }
    public void minSalaryStaff(Employee[] arrStaff) {
        double min = arrStaff[0].getSalaryStaff();
        String minStaff = "";
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getSalaryStaff() < min) {
                min = arrStaff[i].getSalaryStaff();
                minStaff = arrStaff[i].getStaff();
            }
        }
        System.out.println("Самая маленькая зарпалата - " + min + " " + minStaff);
    }
    public void maxSalaryStaff(Employee[] arrStaff) {
        double max = arrStaff[0].getSalaryStaff();
        String maxStaff = "";
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getSalaryStaff() > max) {
                max = arrStaff[i].getSalaryStaff();
                maxStaff = arrStaff[i].getStaff();
            }
        }
        System.out.println("Самая большая зарпалата - " + max + " " + maxStaff);
    }
    public void sumSalaryStaff(Employee[] arrStaff) {
        double sum = 0;
        for (int i = 0; i < arrStaff.length; i++) {

            sum = arrStaff[i].getSalaryStaff() + sum;
        }
        System.out.println("Сумма затрат за зарплаты - " + sum);

    }
    public void averageSalaryStaff(Employee[] arrStaff) {
        double avr = 0;
        double sum = 0d;
        for (int i = 0; i < arrStaff.length; i++) {

            sum = arrStaff[i].getSalaryStaff() + sum;
        }
        avr = sum / arrStaff.length;
        System.out.println("cредняя зарплата - " + avr);
    }
    public void allNameStaff(Employee[] arrStaff) {
        for (int i = 0; i < arrStaff.length; i++) {
            System.out.print(arrStaff[i].getStaff());
            System.out.println();
        }
    }
    public void indexSalary(Employee[] arrStaff) {
        double index = 5.5d;
        int j = 1;
        for (int i = 0; i < arrStaff.length; i++) {
            arrStaff[i].setSalaryStaff(index / 100 * arrStaff[i].getSalaryStaff() + arrStaff[i].getSalaryStaff());
            System.out.println(j + "  " + arrStaff[i]);
            j++;
        }
    }
    public void minSalaryStaffDepartment(Employee[] arrStaff) {
        int department = 1;
        double min = arrStaff[0].getSalaryStaff();
        String minStaff = "";
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getDepartmentNumber() == department) {
                if (arrStaff[i].getSalaryStaff() < min) {
                    min = arrStaff[i].getSalaryStaff();
                    minStaff = arrStaff[i].getStaff();
                }
            }
        }
        System.out.println("Самая маленькая зарпалата по отделу " + department + " составляет " + min + "руб" + " - " + minStaff);

    }
    public void maxSalaryStaffDepartment(Employee[] arrStaff) {
        double max = arrStaff[0].getSalaryStaff();
        int department = 1;
        String maxStaff = "";
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getDepartmentNumber() == department) {
                if (arrStaff[i].getSalaryStaff() > max) {
                    max = arrStaff[i].getSalaryStaff();
                    maxStaff = arrStaff[i].getStaff();
                }
            }
        }
        System.out.println("Самая маленькая зарпалата по отделу " + department + " составляет " + max + "руб" + " - " + maxStaff);
    }
    public void sumSalaryStaffDepartment(Employee[] arrStaff) {
        double sum = 0;
        int department = 1;
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getDepartmentNumber() == department) {
                sum = arrStaff[i].getSalaryStaff() + sum;
            }
        }
        System.out.println("Сумма затрат за зарплаты по отделу " + department + " составляет " + sum + "руб");

    }
    public void averageSalaryStaffDepartment(Employee[] arrStaff) {
        double avr = 0;
        double sum = 0d;
        int department = 1;
        int j = 0;
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getDepartmentNumber() == department) {
                sum = arrStaff[i].getSalaryStaff() + sum;
                j++;
            }
        }
        avr = sum / j;
        System.out.println("cредняя зарплата по отделу " + department + " составляет " + avr + "руб");
    }
    public void allNameStaffDepartment(Employee[] arrStaff) {
        int department = 1;
        int j = 1;
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getDepartmentNumber() == department) {
                System.out.print(j + " " + arrStaff[i].getStaff());
                System.out.println();
            }
            j++;
        }
    }
    public void minSalary(Employee[] arrStaff) {
        int j = 1;
        int min = 120_000;
        System.out.println(" Зарпалата меньше " + min + "руб у:");
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getSalaryStaff() < min) {
                System.out.print(j + " " + arrStaff[i].getStaff());
                System.out.println();
            }
            j++;
        }
    }
    public void maxSalary(Employee[] arrStaff) {
        int j = 1;
        int max = 210_000;
        System.out.println(" Зарпалата больше " + max + "руб у:");
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getSalaryStaff() >= max) {
                System.out.print(j + " " + arrStaff[i].getStaff());
                System.out.println();
            }
            j++;
        }
    }
    public void deleteStaff(Employee[] arrStaff) {
        String name = "Широков Юрий Дмитриевич";
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getStaff() == name) {
                arrStaff[i] = new Employee("Свободно", 0, 0);
            } else {
                continue;
            }
        }
    }
    public void acceptStaff(Employee[] arrStaff) {
        int j = 0;
        for (int i = 0; i < arrStaff.length; i++) {

            if (arrStaff[i].getStaff() == "Свободно") {
                arrStaff[i] = new Employee("Малахов Виталий Сергеевич", 353_254, 3);
                j++;
            } else {
                continue;
            }
        }
        if (j == 0) {
            System.out.println(" Вакантных мест нет, перезвоните позже");
        }
    }
    public void changeSalaryAndDepartmentStaff(Employee[] arrStaff) {
        double salary = 653_817;
        String staff = "Щербаков Илья Андреевич";
        int department = 0;                 //0-главный отдел)
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getStaff() == staff) {
                arrStaff[i].setSalaryStaff(salary);
                arrStaff[i].setDepartmentNumber(department);
            }
        }
    }
    public void sortStaffDepartment(Employee[] arrStaff) {
        Employee k;
        for (int i = 0; i < arrStaff.length-1; i++) {
            for (int j = 0; j < arrStaff[j].getDepartmentNumber(); j++) {
                if (j!=i){
                if (arrStaff[i].getDepartmentNumber() > arrStaff[j].getDepartmentNumber()) {
                    k=arrStaff[j];
                    arrStaff[j] = arrStaff[i];
                    arrStaff[j]=k;
                }
                }
            }
        }
        }
    }

