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
        indexSalary(arrStaff, 4.2);
        minSalaryStaffDepartment(arrStaff, 1);
        maxSalaryStaffDepartment(arrStaff, 1);
        sumSalaryStaffDepartment(arrStaff, 1);
        averageSalaryStaffDepartment(arrStaff, 1);
        allNameStaffDepartment(arrStaff,1);
        maxSalary(arrStaff,210000);
        minSalary(arrStaff, 120000);
        deleteStaff(arrStaff,"Широков Юрий Дмитриевич");
        acceptStaff(arrStaff, "Малахов Виталий Сергеевич", 433_333, 1);
        changeSalaryAndDepartmentStaff(arrStaff, "Щербаков Илья Андреевич", 780_390, 2);
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
    public void indexSalary(Employee[] arrStaff, double index) {
        int j = 1;
        for (int i = 0; i < arrStaff.length; i++) {
            arrStaff[i].setSalaryStaff(index / 100 * arrStaff[i].getSalaryStaff() + arrStaff[i].getSalaryStaff());
            System.out.println(j + "  " + arrStaff[i]);
            j++;
        }
    }
    public void minSalaryStaffDepartment(Employee[] arrStaff,int department) {
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
    public void maxSalaryStaffDepartment(Employee[] arrStaff, int department) {
        double max = arrStaff[0].getSalaryStaff();
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
    public void sumSalaryStaffDepartment(Employee[] arrStaff, int department) {
        double sum = 0;
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getDepartmentNumber() == department) {
                sum = arrStaff[i].getSalaryStaff() + sum;
            }
        }
        System.out.println("Сумма затрат за зарплаты по отделу " + department + " составляет " + sum + "руб");

    }
    public void averageSalaryStaffDepartment(Employee[] arrStaff, int department) {
        double avr = 0;
        double sum = 0d;
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
    public void allNameStaffDepartment(Employee[] arrStaff, int department) {
        int j = 1;
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getDepartmentNumber() == department) {
                System.out.print(j + " " + arrStaff[i].getStaff());
                System.out.println();
            }
            j++;
        }
    }
    public void minSalary(Employee[] arrStaff, int min) {
        int j = 1;
        System.out.println(" Зарпалата меньше " + min + "руб у:");
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getSalaryStaff() < min) {
                System.out.print(j + " " + arrStaff[i].getStaff());
                System.out.println();
            }
            j++;
        }
    }
    public void maxSalary(Employee[] arrStaff,int max) {
        int j = 1;
        System.out.println(" Зарпалата больше " + max + "руб у:");
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getSalaryStaff() >= max) {
                System.out.print(j + " " + arrStaff[i].getStaff());
                System.out.println();
            }
            j++;
        }
    }
    public void deleteStaff(Employee[] arrStaff,String name) {

        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getStaff() == name) {
                arrStaff[i] = new Employee(null, 0, 0 );
            } else {
                continue;
            }
        }
    }
    public void acceptStaff( Employee[] arrStaff, String staff,double salaryStaff,int departmentNumber) {
        int j = 0;
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getStaff() == null) {
                arrStaff[i] = new Employee(staff, salaryStaff, departmentNumber);
                j++;
                break;
            } else {
                continue;
            }
        }
        if (j == 0) {
            System.out.println(" Вакантных мест нет, перезвоните позже");
        }
    }
    public void changeSalaryAndDepartmentStaff(Employee[] arrStaff, String staff, double salary, int department) {
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getStaff() == staff) {
                arrStaff[i].setSalaryStaff(salary);
                arrStaff[i].setDepartmentNumber(department);
            }
        }
    }
    public void sortStaffDepartment(Employee[] arrStaff) {
        for (int i = 1; i < 6 ; i++) {
            System.out.println("Отдел номер " + i);
            for (int j = 0; j < arrStaff.length; j++) {
                if (arrStaff[j].getDepartmentNumber()==i) {
                    System.out.println( arrStaff[j].getStaff()+ " " + arrStaff[j].getSalaryStaff());
                }
            }
        }
    }
    }

