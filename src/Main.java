import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~ Bine ati venit ~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Operatiuni matematice

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("~~~~~~~~~~~~~~~~~~ MENIU ~~~~~~~~~~~~~~~~~~~");
            System.out.println("1. Operatiuni matematice de baza :: + - * / ");
            System.out.println("2. Ridicarea la putere a unui numar.");
            System.out.println("3. Calcularea procentului.");
            System.out.println("4. Calcularea sin, cos, tg, ctg");
            System.out.println("5. Geometrie");
            System.out.println("6. Algebra");
            System.out.println("7. Convertori");
            System.out.println("0. EXIT");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            System.out.print("Alegeti o optiune :: ");
            int option = scanner.nextInt(); scanner.nextLine();

                switch (option){
                    case 0:
                        running = false;
                        System.out.println("La revedere ... ");break;
                    case 1:
                        boolean inMainMenu = true;

                        System.out.println("\n-+*\\ OPERATIUNI MATEMATICE DE BAZA /*+-");
                        System.out.println("\n ~~~~ Alegeti operatiunea ~~~~");
                        System.out.println("\tAdunarea   :: + ");
                        System.out.println("\tScaderea   :: - ");
                        System.out.println("\tInmultirea :: * ");
                        System.out.println("\tImpartirea :: / ");
                        System.out.println("\tIntoarcere in meniu :: 0 ");

                        System.out.println("Alegeti o operatiune :: ");

                        char operator = scanner.next().charAt(0);
                        scanner.nextLine();

                        if (operator == '0'){
                            inMainMenu = false;// iesim din meniiul de operatii matematice
                            break;
                        }

                        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                            System.out.println("Operator invalid. Incercati din nou.");
                            continue;// verificam daca operatorul este valid
                        }

                        //citim numerele
                        System.out.print("Introduceti primul numar :: ");
                        double firstNumber = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Introduceti al doilea numar :: ");
                        double secondNumber = scanner.nextDouble();
                        scanner.nextLine();

                        double result = 0;
                        boolean validOperation = true;


                        switch (operator) {
                            case '+':
                                result = firstNumber + secondNumber;
                                break;

                            case '-':
                                result = firstNumber - secondNumber;
                                break;

                            case '*':
                                result = firstNumber * secondNumber;
                                break;
                            case '/':
                                if (secondNumber != 0) {
                                    result = firstNumber / secondNumber;
                                } else {
                                    System.out.println("Eroare: Impartire la zero!");
                                    validOperation = false;
                                }
                                break;
                        }

                        if (validOperation) {
                            System.out.print("Rezultat :: " + firstNumber + " " + operator + " " + secondNumber + " = ");
                            System.out.printf("%.2f ",result);
                            System.out.println();
                        }

                         // intrebam utilizatorul daca vrea sa faca o alta operatiune
                        System.out.print("\nDoriti o alta operatiune? ( da/nu ) :: ");
                        String confirm = scanner.nextLine();
                        if (confirm.equalsIgnoreCase("nu")){
                            inMainMenu = false;
                        }
                    break;

                    case 2:
                        System.out.println("\n~~~~ RIDICARE LA PUTERE ~~~~");
                        System.out.print("Introduceti baza :: ");
                        double base = scanner.nextDouble(); scanner.nextLine();

                        System.out.print("Introduceti exponentul :: ");
                        double exponent = scanner.nextDouble(); scanner.nextLine();

                        double powerResult = Math.pow(base,exponent);
                        System.out.println("Rezultat :: " + base + " ^ " + exponent + " = " + powerResult);
                        break;

                    case 3:
                        System.out.println("\n~~~~ CALCUL PROCENT ~~~~");
                        System.out.print("Introduceti numarul total :: ");
                        double total = scanner.nextDouble();scanner.nextLine();

                        System.out.print("Introduceti procentul :: ");
                        double percentage = scanner.nextDouble();scanner.nextLine();

                        double percentageResult = (total * percentage) / 100;
                        System.out.println(percentage + " % din " + total + " = " + percentageResult);
                        break;

                    case 4:
                        System.out.println("\n~~~~ FUNCTII TRIGONOMETRICE ~~~~");
                        System.out.print("Introduceti unghiul in grade :: ");
                        double angle = scanner.nextDouble();scanner.nextLine();

                        // convertim din grade in radiani
                        double radians = Math.toRadians(angle);

                        System.out.println("sin(" + angle + "°) = " + Math.sin(radians));
                        System.out.println("cos(" + angle + "°) = " + Math.cos(radians));

                        // verificam pentru tangenta si contagenta
                        if (Math.cos(radians) != 0){
                            System.out.println("tg(" + angle + "°) = " + Math.tan(radians));
                        }
                        else {
                            System.out.println("tg(" + angle + "°) = nedefenit.");
                        }

                        if (Math.sin(radians) != 0){
                            System.out.println("ctg(" + angle + "°) = " + Math.tan(radians));
                        }
                        else {
                            System.out.println("ctg(" + angle + "°) = nedefenit.");
                        }
                        break;

                    case 5:
                        inMainMenu = true;

                        while (inMainMenu){
                            System.out.println("\n~~~~ GEOMETRIE ~~~~");
                            System.out.println("1. Aria cercului");
                            System.out.println("2. Circumferinta cercului");
                            System.out.println("3. Aria patratului");
                            System.out.println("4. Perimetrul patratului");
                            System.out.println("5. Aria dreptunghiului");
                            System.out.println("6. Perimetrul dreptunghiului");
                            System.out.println("7. Aria triunghiului");
                            System.out.println("8. Volumul cubului");
                            System.out.println("9. Volumul sferei");
                            System.out.println("0. Inapoi la meniul principal");

                            System.out.print("Alegeti o optiune :: ");
                            int geomOption = scanner.nextInt(); scanner.nextLine();

                            switch (geomOption){
                                case 0:
                                    inMainMenu = false;
                                    break;
                                case 1:
                                    System.out.print("Raza cercului :: ");

                                    if (scanner.hasNextDouble()){
                                        double radius = scanner.nextDouble();scanner.nextLine();

                                        if (radius > 0){
                                            double circleAria = Math.PI * radius * radius;
                                            System.out.printf("Aria cercului cu raza de %.2f = %.2f\n ",radius,circleAria);
                                        }
                                        else  if (radius == 0){
                                            System.out.println("Raza 0 produce un cerc degenerat. Aria = 0.");
                                        }
                                        else {
                                            System.out.println("Eroare.Raza nu poate avea valori negative!.");
                                            System.out.println("Valoarea absoluta :: " + Math.abs(radius));
                                        }
                                    }
                                    else {
                                        System.out.println("Eroare. Introduceti o valoare valida.");
                                        scanner.next();
                                    }
                                    break;

                                case 2:
                                    System.out.print("Raza cercului :: ");
                                    if (scanner.hasNextDouble()){
                                        double radius = scanner.nextDouble();scanner.nextLine();

                                        if(radius >= 0){
                                            double circumference = 2 * Math.PI * radius;
                                            System.out.printf("Circumferinta cercului cu raza de %.2f = %.2f\n", radius,circumference);
                                        }
                                        else {
                                            System.out.println("Eroare. Raza nu poate avea valori negative!");
                                        }
                                    }
                                    else {
                                        System.out.println("Eroare. Introduceti o valoare valida.");
                                        scanner.next();
                                    }
                                    break;

                                case 3:
                                    System.out.print("Latura patratului :: ");
                                    if (scanner.hasNextDouble()){
                                        double side = scanner.nextDouble();scanner.nextLine();
                                        if (side > 0){
                                            double squareArea = side * side;
                                            System.out.printf("Aria patratului cu latura de %.2f = %.2f\n",side,squareArea);
                                        }
                                        else if (side == 0){
                                            System.out.println("Latura 0 produce un patrat degenerat.");
                                        }
                                        else {
                                            System.out.println("Eroare. Latura nu poate avea valori negative!");
                                        }
                                    }
                                    else {
                                        System.out.println("Eroare. Introduceti o valoare valida.");
                                        scanner.next();
                                    }
                                    break;

                                case 4:
                                    System.out.print("Latura patratului :: ");
                                    if (scanner.hasNextDouble()){
                                        double side = scanner.nextDouble();scanner.nextLine();
                                        if (side > 0){
                                            double squarePerimeter = 4 * side;
                                            System.out.printf("Perimetrul patratului cu latura de %.2f = %.2f\n",side,squarePerimeter);
                                        }
                                        else if (side == 0){
                                            System.out.println("Latura 0 produce un patrat degenerat.");
                                        }
                                        else {
                                            System.out.println("Eroare. Latura nu poate avea valori negative!");
                                        }
                                    }
                                    else {
                                        System.out.println("Eroare. Introduceti o valoare valida.");
                                        scanner.next();
                                    }
                                    break;
                                case 5:
                                    System.out.print("Lungimea dreptunghiului :: ");
                                    if (scanner.hasNextDouble()){
                                        double length = scanner.nextDouble();scanner.nextLine();

                                        System.out.print("Latimea dreptunghiului :: ");
                                        if (scanner.hasNextDouble()){
                                            double high = scanner.nextDouble();scanner.nextLine();

                                            if (length > 0 && high > 0){
                                                double rectangleArea = length * high;
                                                System.out.printf("Aria dreptunghiului cu lungimea si latimea de %.2f x %.2f = %.2f\n",length,high,rectangleArea);
                                            }
                                            else if (length == 0 || high == 0){
                                                System.out.println("Valoarea 0 produce un dreptunghi degenerat.");
                                            }
                                            else {
                                                System.out.println("Eroare. Dimensiunile nu pot avea valori negative");
                                                scanner.next();
                                            }
                                        }
                                        else {
                                            System.out.println("Eroare. Dimensiunile nu pot avea valori negative");
                                            scanner.next();
                                        }
                                    }
                                    break;

                                case 6:
                                    System.out.print("Lungimea dreptunghiului :: ");
                                    if (scanner.hasNextDouble()){
                                        double length = scanner.nextDouble();scanner.nextLine();

                                        System.out.print("Latimea dreptunghiului :: ");
                                        if (scanner.hasNextDouble()){
                                            double high = scanner.nextDouble();scanner.nextLine();

                                            if (length > 0 && high > 0){
                                                double rectanglePerimeter = 2 * length + 2 * high;
                                                System.out.printf("Perimetrul dreptunghiului cu lungimea si latimea de %.2f x %.2f = %.2f\n",length,high,rectanglePerimeter);
                                            }
                                            else if (length == 0 || high == 0){
                                                System.out.println("Valoarea 0 produce un dreptunghi degenerat.");
                                            }
                                            else {
                                                System.out.println("Eroare. Dimensiunile nu pot avea valori negative");
                                                scanner.next();
                                            }
                                        }
                                        else {
                                            System.out.println("Eroare. Dimensiunile nu pot avea valori negative");
                                            scanner.next();
                                        }
                                    }
                                    break;

                                case 7:
                                    boolean inTriangleMenu = true;

                                    while (inTriangleMenu){
                                        System.out.println("~~~~ ARIA TRIUNGHIULUI ~~~~");
                                        System.out.println("1. Baza si inaltume");
                                        System.out.println("2. Formula lui Heron( 3 laturi )");
                                        System.out.println("0. Intoarcere in meniu");

                                        System.out.print("Alegeti o optiune :: ");
                                        int triangleOption = scanner.nextInt();scanner.nextLine();

                                        switch (triangleOption){
                                            case 0:
                                                inTriangleMenu = false;
                                                break;

                                            case 1:
                                                System.out.print("Introduceti baza :: ");
                                                if (scanner.hasNextDouble()){
                                                    base = scanner.nextDouble();scanner.nextLine();

                                                    System.out.print("Introduceti inaltimea :: ");
                                                    if (scanner.hasNextDouble()){
                                                        double height = scanner.nextDouble();scanner.nextLine();

                                                        if (base > 0 && height > 0){
                                                            double triangleArea = (base * height) / 2;
                                                            System.out.printf("Aria triunghiului cu baza si inaltimea de %.2f x %.2f = %.2f\n",base,height,triangleArea);
                                                        }
                                                        else if (base == 0 || height == 0){
                                                            System.out.println("Dimensiuninile cu valoare de 0 produce un triunghi degenerat");
                                                        }
                                                        else {
                                                            System.out.println("Dimensiunile trebuie sa aiba valori pozitive!");
                                                        }
                                                    }
                                                    else {
                                                        System.out.println("Eroare. Dimensiunile nu pot avea valori negative!");
                                                        scanner.next();
                                                    }
                                                }
                                                else {
                                                    System.out.println("Eroare. Dimensiunile nu pot avea valori negative!");
                                                    scanner.next();
                                                }
                                                break;

                                            case 2:
                                                System.out.print("Introduceti latura a ::");

                                                if (scanner.hasNextDouble()){
                                                    double a = scanner.nextDouble();scanner.nextLine();

                                                    System.out.print("Introduceti latura b :: ");
                                                    if (scanner.hasNextDouble()){
                                                        double b = scanner.nextDouble();scanner.nextLine();

                                                        System.out.print("Introduceti latura c :: ");
                                                        if (scanner.hasNextDouble()){
                                                            double c = scanner.nextDouble();scanner.nextLine();

                                                            if(a > 0 && b > 0 && c > 0){
                                                                if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)){
                                                                    double semiperimeter = (a + b + c) / 2;
                                                                    double heronArea = Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter -c));
                                                                    System.out.printf("Aria triunghilui dupa Heron cu laturile a, b ,c -- %.2f x %.2f x %.2f = %.2f\n",a,b,c,heronArea);
                                                                }
                                                                else {
                                                                    System.out.println("Eroare! Laturile nu formeaza un triunghi valid!");
                                                                }
                                                            }
                                                            else {
                                                                System.out.println("Eroare! Laturile trebuie sa aiba o valoare pozitiva!");
                                                            }
                                                        }
                                                        else {
                                                            System.out.println("Eroare! Laturile nu trebuie sa aiba o valoare negativa!");
                                                            scanner.next();
                                                        }
                                                    }
                                                    else {
                                                        System.out.println("Eroare! Laturile nu trebuie sa aiba o valoare negativa!");
                                                        scanner.next();
                                                    }
                                                }
                                                else {
                                                    System.out.println("Eroare! Laturile nu trebuie sa aiba o valoare negativa!");
                                                    scanner.next();
                                                }
                                                break;

                                            default:
                                                System.out.println("Optiune invalida!");

                                        }
                                    }
                                    break;
                                case 8:
                                    System.out.print("Introduceti latura cubului :: ");
                                    if (scanner.hasNextDouble()){
                                        double side = scanner.nextDouble();scanner.nextLine();

                                        if (side > 0){
                                            double cubeVolume = side * side * side;
                                            System.out.printf("Volumul cubului cu latura de %.2f = %.2f\n",side,cubeVolume);
                                        }
                                        else if (side == 0){
                                            System.out.println("Valoarea 0 produce un cub degenerat.");
                                        }
                                        else {
                                            System.out.println("Eroare! Latura nu poate avea valoare negativa!");
                                        }
                                    }
                                    else {
                                        System.out.println("Eroare! Latura nu poate avea valoare negativa!");
                                        scanner.next();
                                    }
                                    break;

                                case 9:
                                    System.out.print("Introduceti raza sferei :: ");

                                    if (scanner.hasNextDouble()){
                                        double radius = scanner.nextDouble();scanner.nextLine();

                                        if(radius > 0){
                                            double sphereVolume = (4/3) * Math.PI * Math.pow(radius,3);
                                            System.out.printf("Volumul sferei cu raza de %.2f = %.2f\n",radius,sphereVolume);
                                        }
                                        else if (radius == 0){
                                            System.out.println("Valoarea 0 a razei formeaza o sfera degenerata.");
                                        }
                                        else {
                                            System.out.println("Eroare! Raza nu poate avea valoare negativa!");
                                        }
                                    }
                                    else {
                                        System.out.println("Eroare! Raza nu poate avea valoare negativa!");
                                        scanner.next();
                                    }
                                    break;

                                default:
                                    System.out.println("Optiune invalida!");

                            }
                        }
                        break;

                    case 6:
                        inMainMenu = true;

                        while (inMainMenu){
                            System.out.println("~~~~ ALGEBRA ~~~~");
                            System.out.println("1. Rezolvare ecuație de gradul 1: ax + b = 0");
                            System.out.println("2. Rezolvare ecuație de gradul 2: ax² + bx + c = 0");
                            System.out.println("3. Calcul factorial");
                            System.out.println("0. Inapoi in meniu principal");

                            System.out.println("Alegeti o optiune :: ");
                            int algebraOption = scanner.nextInt();scanner.nextLine();

                            switch (algebraOption){
                                case 0:
                                    inMainMenu = false;
                                    break;

                                case 1:
                                    System.out.print("Introduceti valoarea a :: ");
                                    double a = scanner.nextDouble();scanner.nextLine();

                                    System.out.print("Introduceti valoarea lui b :: ");
                                    double b = scanner.nextDouble();scanner.nextLine();

                                    if (a == 0){
                                        if (b == 0){
                                            System.out.println("Infinitate de solutii!");
                                        }
                                        else {
                                            System.out.println("Ecuatia nu are solutii!");
                                        }
                                    }
                                    else {
                                        double x = -b / a;
                                        System.out.printf("x = %.2f\n",x);
                                    }
                                    break;

                                case 2:
                                    System.out.print("Introduceti valoarea lui a :: ");
                                    a = scanner.nextDouble();scanner.nextLine();
                                    System.out.print("Introduceti valoarea lui b :: ");
                                    b = scanner.nextDouble();scanner.nextLine();
                                    System.out.print("Introduceti valoarea lui c :: ");
                                    double c = scanner.nextDouble();scanner.nextLine();

                                    double delta = b * b - 4 * a * c;

                                    if (delta < 0){
                                        System.out.println("Ecuatia nu are solutii!");
                                    }
                                    else if (delta == 0){
                                        double x = -b / (2 * a);
                                        System.out.printf("x = %.2f\n",x);
                                    }
                                    else {
                                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                                        System.out.printf("x1 = %.2f\n",x1);
                                        System.out.printf("x2 = %.2f\n",x2);
                                    }
                                    break;
                                case 3:
                                    System.out.print("Introduceti valoarea N :: ");
                                    int n = scanner.nextInt();scanner.nextLine();

                                    long factorial = 1;

                                    for (int i = 1; i <= n; i++){
                                        factorial *= i;
                                    }
                                    System.out.println(n + " ! = " + factorial);
                                    break;

                                default:
                                    System.out.println("Optiune invalida!");
                            }
                        }
                        break;

                    case 7:
                        inMainMenu = true;

                        while (inMainMenu){
                            System.out.println("~~~~ CONVERTORI ~~~~");
                            System.out.println("1. Grade Celsius <-> Fahrenheit");
                            System.out.println("2. Metri <-> Pasi");
                            System.out.println("3. Kilograme <-> Pounds");
                            System.out.println("4. Litri <-> Galoane");
                            System.out.println("0. Intorcere in meniul principal");

                            System.out.println("Alegeti o optiune :: ");
                            int convOption = scanner.nextInt();scanner.nextLine();

                            switch (convOption){
                                case 0:
                                    inMainMenu = false;
                                    break;

                                case 1:
                                    System.out.println("~~~~ Grade Celsius <-> Fahrenheit ~~~~");
                                    System.out.println("1. Grade Celsius <-> Fahrenheit");
                                    System.out.println("1. Grade Fahrenheit <-> Celsius");

                                    double celsius, fahrenheit;

                                    System.out.print("Alegeti o optiune :: ");
                                    int tempChoice = scanner.nextInt();scanner.nextLine();

                                    if (tempChoice == 1){
                                        System.out.print("Celsius :: ");
                                        celsius = scanner.nextDouble();scanner.nextLine();
                                        fahrenheit = celsius * 9/5 + 32;

                                        System.out.println(celsius + "°C = " + fahrenheit + "°F");
                                    }
                                    else if (tempChoice == 2){
                                        System.out.print("Fahrenheit :: ");
                                        fahrenheit = scanner.nextDouble();scanner.nextLine();
                                        celsius = (fahrenheit - 32) * 5/9;

                                        System.out.println(fahrenheit + "°F = " + celsius + "°C");
                                    }
                                    else {
                                        System.out.println("Optiune invalida");
                                    }
                                    break;

                                case 2:
                                    System.out.println("~~~~ Metri <-> Pasi ~~~~");
                                    System.out.println("1. Metri <-> Pasi");
                                    System.out.println("2. Feet <-> Metri");

                                    double metri, feet;

                                    System.out.print("Alegeti o optiune :: ");
                                    int distanceChoice = scanner.nextInt();scanner.nextLine();

                                    if (distanceChoice == 1){
                                        System.out.print("Metri :: ");
                                        metri = scanner.nextDouble();scanner.nextLine();
                                        feet = metri * 3.28084;

                                        System.out.print(metri + " metri = " + feet + " pasi.");
                                    }
                                    else if (distanceChoice == 2){
                                        System.out.print("Feet :: ");
                                        feet = scanner.nextDouble();scanner.nextLine();
                                        metri = feet * 0.3048;

                                        System.out.println(feet + " pasi = " + metri + " metri.");
                                    }
                                    else {
                                        System.out.println("Optiune invalida!");
                                    }
                                    break;

                                case 3:
                                    System.out.println("~~~~ Kilograme <-> Pounds ~~~~");
                                    System.out.println("1. Kilograme <-> Pounds");
                                    System.out.println("2. Kilograme <-> Pounds");

                                    double kilogram, pounds;

                                    System.out.print("Alegeti o optiune :: ");
                                    int weightChoice = scanner.nextInt();scanner.nextLine();

                                    if (weightChoice == 1){
                                        System.out.print("Kilograme :: ");
                                        kilogram = scanner.nextDouble();scanner.nextLine();
                                        pounds = kilogram * 2.20462;

                                        System.out.println(kilogram + " kilograme = " + pounds + " pounds.");
                                    }
                                    else if (weightChoice == 2){
                                        System.out.print("Pounds :: ");
                                        pounds = scanner.nextDouble();scanner.nextLine();
                                        kilogram = pounds * 0.45359237;

                                        System.out.println(pounds + " ponds = " + kilogram + " kilograme.");
                                    }
                                    else {
                                        System.out.println("Optiune invalida!");
                                    }
                                    break;

                                case 4:
                                    System.out.println("~~~~ Litri <-> Galoane ~~~~");
                                    System.out.println("1. Litri <-> Galoane");
                                    System.out.println("2. Litri <-> Galoane");

                                    double liter, galon;

                                    System.out.print("Alegeti o optiune :: ");
                                    int liquidChoice = scanner.nextInt();scanner.nextLine();

                                    if (liquidChoice == 1){
                                        System.out.print("Litri :: ");
                                        liter = scanner.nextDouble();scanner.nextLine();
                                        galon = liter / 3.78541;

                                        System.out.println(liter + " litri = " + galon + " galoane.");
                                    }
                                    else if (liquidChoice == 2){
                                        System.out.print("Galoane :: ");
                                        galon = scanner.nextDouble();scanner.nextLine();
                                        liter = galon * 3.785;

                                        System.out.println(galon + " galoane = " + liter + " litri.");
                                    }
                                    else {
                                        System.out.println("Optiune invalida!");
                                    }
                                    break;

                                default:
                                    System.out.println("Optiune invalida!");

                            }
                        }
                        break;

                    default:
                        System.out.println("Optiune invalida!");

                }
            }
    }
}
