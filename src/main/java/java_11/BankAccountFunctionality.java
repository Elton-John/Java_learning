package java_11;

import java.util.*;

public class BankAccountFunctionality {

    public static void main(String[] args) {
        List<BankAccount> bankAccountsList = new ArrayList<>();
        printOption();
       // selectOption(bankAccountsList);


    }

//    private static void selectOption(List<BankAccount> bankAccountList) {
//        Scanner scanner = new Scanner(System.in);
//        String option = scanner.nextLine();
//
//        switch (option) {
//            case "C":
//                System.out.println("type a number, which will be your account number:");
//                String number = scanner.nextLine();
//                BankAccount bankAccount = new BankAccount(number);
//                addToBankAccountList(bankAccount, bankAccountList);
//                System.out.println("Your bank account created.");
//                bankAccount.printInfo();
//
//                printWillContinue(scanner, bankAccountList);
//                break;
//            case "B":
//                System.out.println("Type your account number: ");
//                String numberFromUser = scanner.nextLine();
//                for (BankAccount account : bankAccountList) {
//                    if (account.getNumber().equals(numberFromUser)) {
//                        account.printInfo();
//                    } else {
//                        System.out.println("Account not exist.");
//                    }
//                }
//                break;
//            case "D":
//                System.out.println("Type your account number: ");
//                String numberFromUser2 = scanner.nextLine();
//                for (BankAccount account : bankAccountList) {
//                    if (account.getNumber().equals(numberFromUser2)) {
//                        System.out.println("Type the amount, which your want to deposite");
//                        int amount = scanner.nextInt();
//                        account.depositCash(amount);
//                    } else {
//                        System.out.println("Account not exist.");
//                    }
//                }
//                break;
//
//
//        }
//    }

    private static void addToBankAccountList(BankAccount bankAccount, List bankAccountsList) {
        bankAccountsList.add(bankAccount);
    }

    private static void printWillContinue(Scanner scanner, List bankAccountsList) {
        System.out.println("Will you to continue? Type YES or NOT");
        String willContinue = scanner.nextLine();
        switch (willContinue) {
            case "YES":
                printOption();
              //  selectOption(bankAccountsList);
                //break;
            case "NOT":
                System.out.println("Bye! Bye!");
                break;
            default:
                System.out.println("Can't understand you. Try again. Type YES or NOT");
                printWillContinue(scanner, bankAccountsList);
        }
    }

    private static void printOption() {

        System.out.println("Decide what you want to do. Select option:");
        System.out.println("create new bank account ----- press C");
        System.out.println("check your account balance -- press B");
        System.out.println("deposit your cash ----------- press D");
        System.out.println("withdraw your cash ---------- press W");
    }
}
