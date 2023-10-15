public class Main {
    public static void main(String[] args) {

        // task 1
        var dog = 8.0 ;
        var cat = 3.6 ;
        var paper = 763789 ;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 2

        dog = dog + 4 ;
        cat = cat + 4 ;
        paper = paper + 4 ;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 3

        dog = dog - 3.5 ;
        cat = cat - 1.6 ;
        paper = paper - 7639 ;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 4

        var friend = 19 ;
        System.out.println(friend);

        friend = friend + 2 ;
        System.out.println(friend);

        friend = friend / 7 ;
        System.out.println(friend);

        //task 5

        var frog = 3.5 ;
        System.out.println(frog);

        frog = frog * 10 ;
        System.out.println(frog);

        frog = frog / 3.5 ;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        //task 6

        var firstBoxerWeight = 78.2 ;
        var secondBoxerWeight = 82.7 ;

        System.out.println(firstBoxerWeight + secondBoxerWeight +" kg" );

        System.out.println(secondBoxerWeight - firstBoxerWeight +" kg" );

        //task 7

        System.out.println(Math.max(firstBoxerWeight,secondBoxerWeight) - Math.min(firstBoxerWeight, secondBoxerWeight) + " kg ");

        System.out.println(Math.max(firstBoxerWeight,secondBoxerWeight) % Math.min(firstBoxerWeight, secondBoxerWeight) + " kg ");


        //task 8

        var allWorkingHours  = 640 ;
        var personalWorkTime = 8 ;

        var workers = allWorkingHours / personalWorkTime ;
        System.out.println("Всего работников в компании - " + workers + " человек" );

        var newAllWorkingHours = allWorkingHours + 94 ;

        var newWorkers = newAllWorkingHours / personalWorkTime ;
        System.out.println("Всего работников в компании - " + newWorkers + " человек" );

    }

}