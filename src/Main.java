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
            System.out.println("0. EXIT");

            System.out.print("Alegeti o optiune :: ");
            int option = scanner.nextInt(); scanner.nextLine();

                switch (option){
                    case 0:
                        running = false; break;
                    case 1:
                        boolean inMainMenu = true;

                        System.out.println("Operatiuni matematice de baza");
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
                        System.out.println("\n~~~~ Ridicare la putere ~~~~");
                        System.out.print("Introduceti baza :: ");
                        double base = scanner.nextDouble(); scanner.nextLine();

                        System.out.print("Introduceti exponentul :: ");
                        double exponent = scanner.nextDouble(); scanner.nextLine();

                        double powerResult = Math.pow(base,exponent);
                        System.out.println("Rezultat :: " + base + " ^ " + exponent + " = " + powerResult);
                        break;

                    


                }
            }









    }
}
