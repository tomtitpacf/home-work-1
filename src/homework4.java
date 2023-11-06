public class homework4 {
    public static void main(String[] args)
    {
        // task 1

        byte age = 17;

        if (age < 18)
        {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        else
        {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }

        // task 2

        byte temp = 3;

        if (temp < 5)
        {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else
        {
            System.out.println("Cегодня тепло, можно идти без шапки");
        }

        // task 3

        short speed = 77;

        if (speed <= 60)
        {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        else
        {
            System.out.println("Если возраст человека равен " + speed + ", то придется заплатить штраф");
        }

        // task 4

        byte age4 = 24;

        if (2 <= age4 && age4 <= 6)
        {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить " + "в детский сад");
        }

        if (7 <= age4 && age4 <= 17)
        {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить " + "в школу");
        }

        if (18 <= age4 && age4 <= 24)
        {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить " + "в университет");
        }

        if (age4 < 2)
        {
            System.out.println("Если возраст человека равен " + age4 + ", то ему не нужно ходить ");
        }
        else if (age4 > 24)
        {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить " + "на работу");
        }

        // task 5

        byte age5 = 5;

        if (age5 <= 5)
        {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему " + "нельзя кататься на аттракционе");
        }

        else if (5 < age5 && age5 < 14)
        {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему " + "можно кататься на аттракционе в сопровождении взрослого");
        }

        else
        {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему " + "можно кататься на аттракционе без сопровождения взрослого");
        }

        // task 6

        byte passengers = 103;

        byte seatPlaces = 60;
        byte allPlaces = 102;
        int standingPlaces = allPlaces - seatPlaces;

        if (passengers <= 60)
        {
            System.out.println("В вагоне есть сидячие места их  " + (seatPlaces - passengers) + ", стоячих мест  " + standingPlaces);
        }

        else if (passengers <= 102)
        {
            System.out.println("В вагоне нет сидячих мест" + ", стоячих мест  " + (allPlaces - passengers));
        }

        else
        {
            System.out.println("В вагоне нет свободных мест");
        }

        // task 7

        int one = 5;
        int two = 4;
        int three = 3;

        if (one > two && one > three)
        {
            System.out.println("Наибольшим числом является " + one);
        }
        else if (two > one && two > three )
        {
            System.out.println("Наибольшим числом является " + two);
        }
        else
        {
            System.out.println("Наибольшим числом является " + three);
        }

    }

}
