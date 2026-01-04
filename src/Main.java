import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~Bine ati venit~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Operatiuni matematice

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("MENIU");
            System.out.println("1. Operatiuni matematice de baza :: + - * / ");
            System.out.println("2. Ridicarea la putere a unui numar.");
            System.out.println("3. Calcularea procentului.");
            System.out.println("4. Calcularea sin, cos, tg, ctg");
            System.out.println("5. Geometrie");
            System.out.println("6. Algebra");
            System.out.println("7. Convertori");
            System.out.println("0. EXIT");

            System.out.print("Alegeti o optiune :: ");
            int option = scanner.nextInt(); scanner.nextLine();

                switch (option){
                    case 0:
                        running = false; break;
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
                            System.out.println("Rezultat :: " + firstNumber + " " + operator + " " + secondNumber + " = " + result);
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
                        System.out.println("\n~~~~ GEOMETRIE ~~~~");
                        System.out.println("1. Aria cercului");
                        System.out.println("2. Circumferinta cercului");
                        System.out.println("3. Aria patratului");
                        System.out.println("4. Perimetrul patratului");
                        System.out.println("5. Aria dreptunghiului");
                        System.out.println("6. Perimetrul dreptunghiului");
                        System.out.println("7. Aria triunghiului");
                        System.out.println("8. Volumul cubului");
                        System.out.println("0. Inapoi la meniul principal");

                        int geomOption = scanner.nextInt(); scanner.nextLine();

                        switch (geomOption){
                            case 1:
                                
                        }

                }
            }









    }
}
