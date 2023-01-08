package day10switchloops;
import  java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {


       // Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
        //Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

        //Kullanicidan bir ulke ismi aliniz.Alinan ulke adina gore kisaltmalari yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("ulke adini giriniz..");
        String countryName= input.nextLine();
        switch (countryName.toLowerCase()){
            case "america" :
                System.out.println("us");
                break;
            case "england":
                System.out.println("uk");
                break;
            case "germany":
                System.out.println("de");
                break;
            case "turkey":
                System.out.println("tr");
                break;
            case "ındıa":
                System.out.println("ın");
                break;
            case "peru":
                System.out.println("pe");
                break;
            case "spain":
                System.out.println("es");
                break;
            case "bulgaria":
                System.out.println("bg");
                break;
            case "albania":
                System.out.println("al");
                break;
            case "france":
                System.out.println("fr");
                break;
            default:
                System.out.println("tanımlı ulke giriniz");

        }



    }

}
