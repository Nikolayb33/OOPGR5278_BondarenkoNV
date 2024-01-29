import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    // 1) Переписать код в соответствии с Single Responsibility Principle:
    public class Employee {
        /*
         * поля
         */
        private String name;
        private Date dob;
        private int baseSalary;

        /*
         * конструктор
         */
        public Employee(String name, Date dob, int baseSalary) {
            this.name = name;
            this.dob = dob;
            this.baseSalary = baseSalary;
        }

        /*
         * метод выдающий информацию о рабочем (входит в область ответственности
         * рабочего)
         */
        public String getEmpInfo() {
            return "name - " + name + " , dob - " + dob.toString();
        }

        // public int calculateNetSalary() {
        // int tax = (int) (baseSalary * 0.25);//calculate in otherway
        // return baseSalary - tax;
        // }
    }

    public class Salary {
        /*
         * метод перенесли в отдельный класс
         */
        public int calculateNetSalary(Employee emp) {
            int tax = (int) (emp.baseSalary * 0.25);
            return emp.baseSalary - tax;
        }
    }

    // 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
    public class SpeedCalculation {
        /*
         * метод показывающий разрешающую скорость
         * разрешающая скорость есть у Авто и Автобусов, у других транспортных средств
         * (ТС) её нет
         * потенциально проезд запрещен поэтому остальные ТС возвращает 0.0
         */
        public double calculateAllowedSpeed(Vehicle vehicle) {

            /*
             * задача избавиться от ветвлений в соответствии с принципом OCP
             */
            return vehicle.getAllowedSpeed();

        }
    }

    public class Vehicle {
        int maxSpeed;
        String type;

        public Vehicle(int maxSpeed, String type) {
            this.maxSpeed = maxSpeed;
            this.type = type;
        }

        /*
         * метод возвращающий максимальную скорость
         */
        public int getMaxSpeed() {
            return this.maxSpeed;
        }

        /*
         * метод возвращает тип объекта
         */
        public String getType() {
            return this.type;
        }

        /*
         * как понял задание разрешено ездить только авто и автобусам
         * поэтому у ТС, от которого
         * наследуемся изначально разрешенная скорость 0
         */
        public double getAllowedSpeed() {
            return 0.0;
        }
    }

    public class Car extends Vehicle {
        /*
         * конструктор класса
         */
        public Car(int maxSpeed, String type) {
            super(maxSpeed, type);
        }

        /*
         * геттер для максимальной скорости авто
         */
        public int getMaxSpeed() {
            return this.maxSpeed;
        }

        /*
         * геттер для типа объекта
         */
        public String getType() {
            return this.type;
        }

        /*
         * метод возвращает разрешенную скорость
         */
        public double getAllowedSpeed() {
            return this.maxSpeed * 0.8;
        }

    }

    public class Bus extends Vehicle {
        /*
         * конструктор класса
         */
        public Bus(int maxSpeed, String type) {
            super(maxSpeed, type);
        }

        /*
         * геттер для максимальной скорости автобуса
         */
        public int getMaxSpeed() {
            return this.maxSpeed;
        }

        /*
         * геттер для типа объекта
         */
        public String getType() {
            return this.type;
        }

        /*
         * метод возвращает разрешенную скорость
         */
        public double getAllowedSpeed() {
            return this.maxSpeed * 0.6;
        }

    }
    // •Подсказка:

    // создайте два
    // дополнительных класса
    // Car и

    // Bus(наследников Vehicle), напишите метод calculateAllowedSpeed().
    // Использование этого метода позволит сделать класс SpeedCalculation
    // соответствующим OCP
    // •

    // 3) Переписать код в соответствии с Interface Segregation Principle:
    public interface Shape {
        double area();

        double volume();
    }
    /*
     * чтобы убрать объем у круга
     * надо убрать интерфейс Shape и создать другой интерфейс для фигуры
     */

    public interface Figure {
        double area();

    }

    public class Circle implements Figure {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return 2 * 3.14 * radius;
        }
    }

    public class Cube implements Shape {
        private int edge;

        public Cube(int edge) {
            this.edge = edge;
        }

        @Override
        public double area() {
            return 6 * edge * edge;
        }

        @Override
        public double volume() {
            return edge * edge * edge;
        }
    }
    // •Подсказка:

    // круг не
    // объемная фигура
    // и этому
    // классу не
    // нужен метод

    // volume().
    // •

    // 4) Переписать код в соответствии с Liskov Substitution Principle:
    public class Rectangle {
        private int width;
        private int height;

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int area() {
            return this.width * this.height;
        }
    }
    /*
     * класс делаем таким же как и его родителя (чтобы можно было использовать,
     *  где можно использовать родителя)
     */
    public class Square extends Rectangle {
        @Override
        public void setWidth(int width) {
            super.width = width;
            //super.height = width;
        }

        @Override
        public void setHeight(int height) {
            //super.width = height;
            super.height = height;
        }

        @Override
        public int area() {
            return super.width * super.height;
        }
    }

}
