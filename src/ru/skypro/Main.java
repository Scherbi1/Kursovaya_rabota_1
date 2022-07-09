package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here

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
        maxSalary (arrStaff);
        minSalary (arrStaff);
    }


    public static void allStaff(Employee[] arrStaff) {
        for (int i = 0; i < arrStaff.length; i++) {
            System.out.print(Employee.getCounter() + " " + arrStaff[i]);
            System.out.println();
        }
    }

    public static void minSalaryStaff(Employee[] arrStaff) {
       double min=999999999;
        String minStaff="";
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getSalaryStaff() < min) {
                min=arrStaff[i].getSalaryStaff();
                minStaff= arrStaff[i].getStaff();
            }
        }
        System.out.println("Самая маленькая зарпалата - " + min + " " +  minStaff);
    }

    public static void maxSalaryStaff(Employee[] arrStaff) {
        double max=0;
        String maxStaff="";
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getSalaryStaff() > max) {
                max=arrStaff[i].getSalaryStaff();
                maxStaff= arrStaff[i].getStaff();
            }
        }
        System.out.println("Самая большая зарпалата - " + max + " " +  maxStaff);
    }

    public static void sumSalaryStaff(Employee[] arrStaff) {
        double sum=0;
        for (int i = 0; i < arrStaff.length; i++) {

                sum=arrStaff[i].getSalaryStaff()+sum;
            }
        System.out.println("Сумма затрат за зарплаты - " + sum );

    }

    public static void averageSalaryStaff(Employee[] arrStaff) {
        double avr=0;
        double sum=0d;
        for (int i = 0; i < arrStaff.length; i++) {

            sum=arrStaff[i].getSalaryStaff()+sum;
        }
            avr=sum/arrStaff.length;
        System.out.println("cредняя зарплата - " + avr );
    }
    public static void allNameStaff(Employee[] arrStaff) {
        for (int i = 0; i < arrStaff.length; i++) {
            System.out.print( arrStaff[i].getStaff());
            System.out.println();
        }
    }

     public static void indexSalary(Employee[] arrStaff) {
        double index=5.5d;
         int j = 1;
        for (int i = 0; i < arrStaff.length; i++) {
           arrStaff[i].setSalaryStaff(index/100 * arrStaff[i].getSalaryStaff()+arrStaff[i].getSalaryStaff());
            System.out.println(j + "  " +  arrStaff[i]);
            j++;
        }
    }


    public static void minSalaryStaffDepartment(Employee[] arrStaff) {
        int department = 1;
        double min = 999999999;
        String minStaff = "";
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getDepartmentNumber() == department) {
                if (arrStaff[i].getSalaryStaff() < min) {
                    min = arrStaff[i].getSalaryStaff();
                    minStaff = arrStaff[i].getStaff();
                }
            }
        }
            System.out.println("Самая маленькая зарпалата по отделу "+ department + " составляет " + min + "руб" + " - " + minStaff);

    }
    public static void maxSalaryStaffDepartment(Employee[] arrStaff) {
        double max=0;
        int department = 1;
        String maxStaff="";
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getDepartmentNumber() == department) {
                if (arrStaff[i].getSalaryStaff() > max) {
                    max = arrStaff[i].getSalaryStaff();
                    maxStaff = arrStaff[i].getStaff();
                }
            }
        }
        System.out.println("Самая маленькая зарпалата по отделу "+ department + " составляет " + max + "руб" + " - " + maxStaff);
    }

    public static void sumSalaryStaffDepartment(Employee[] arrStaff) {
        double sum=0;
        int department = 1;
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getDepartmentNumber() == department) {
                sum = arrStaff[i].getSalaryStaff() + sum;
            }
        }
        System.out.println("Сумма затрат за зарплаты по отделу " +  department + " составляет "+ sum + "руб");

    }

    public static void averageSalaryStaffDepartment(Employee[] arrStaff) {
        double avr=0;
        double sum=0d;
        int department = 1;
        int j=0;
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getDepartmentNumber() == department) {
                sum = arrStaff[i].getSalaryStaff() + sum;
                j++;
            }
        }
        avr=sum/j;
        System.out.println("cредняя зарплата по отделу " +  department + " составляет " + avr + "руб" );
    }
    public static void allNameStaffDepartment(Employee[] arrStaff) {
        int department = 1;
        int j=1;
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getDepartmentNumber() == department) {
                System.out.print(  j + " " + arrStaff[i].getStaff());
                System.out.println();
            }
            j++;
        }
    }
    public static void minSalary (Employee[] arrStaff) {
        int j=1;
        int min=120_000;
        System.out.println(" Зарпалата меньше " + min + "руб у:");
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getSalaryStaff()<min) {
                System.out.print(  j + " " + arrStaff[i].getStaff());
                System.out.println();
            }
            j++;
        }
    }
    public static void maxSalary (Employee[] arrStaff){
        int j=1;
        int max = 210_000;
        System.out.println(" Зарпалата больше " + max + "руб у:");
        for (int i = 0; i < arrStaff.length; i++) {
            if (arrStaff[i].getSalaryStaff()>=max) {
                System.out.print(  j + " " + arrStaff[i].getStaff());
                System.out.println();
            }
            j++;
        }
    }
}
