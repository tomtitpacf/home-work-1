public class homework5 {
    public static void main(String[] args) {

//task 1 & 2

        String clientOS = "Android";
        int clientOfDate = 2015;

        if (clientOS == "IOS") {
            if (clientOfDate <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }

        } else if (clientOS == "Android") {
            if (clientOfDate <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        }

//task 3

        int year = 2021;
        double a = year % 4;
        double b = year % 100;
        double c = year % 400;

        if (a == 0 && year > 1584) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год не является високосным");
                }
            } else {
                System.out.println(year + " год является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }

// task 4

        int diliveryDistance = 95;
        int diliveryTimeDays = 1;

        if (diliveryDistance > 100) {
            System.out.println("Доставка на " + diliveryDistance + " км невозможна");
        }
        else {
            if (diliveryDistance > 60 && diliveryDistance <= 100) {
                diliveryTimeDays = diliveryTimeDays + 2;
                System.out.println("Доставка в пределах от 60 до 100 км занимает " + diliveryTimeDays + " дня");
            }
            else {
                if (diliveryDistance > 20 && diliveryDistance <= 60) {
                    diliveryTimeDays = diliveryTimeDays + 1;
                    System.out.println("Доставка в пределах от 20 до 60 км занимает " + diliveryTimeDays + " дня");
                }
                else {
                    System.out.println("Доставка в пределах 20 км занимает " + diliveryTimeDays + " день");
                }
            }
        }

//task 5

        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Вы указали несуществующий номер месяца");

        }
    }
}
