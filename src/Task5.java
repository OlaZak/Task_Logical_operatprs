
//Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.

public class Task5 {
    public void task5(int monthNum) {


                if (monthNum == 1 || monthNum == 2 || monthNum == 12)
                    System.out.println("Season is winter");
                else if (monthNum == 3 || monthNum == 4 || monthNum == 5)
                    System.out.println("Season is spring");
                else if (monthNum == 6 || monthNum == 7 || monthNum == 8)
                    System.out.println("Season is summer");
                else if (monthNum == 9 || monthNum == 10 || monthNum == 11)
                    System.out.println("Season is autumn");
                else System.out.println("Incorrect value");


        //                Other variant

//        switch (monthNum) {
//            case 1:
//                System.out.println("Season is winter");
//                break;
//            case 2:
//                System.out.println("Season is winter");
//                break;
//            case 3:
//                System.out.println("Season is spring");
//                break;
//            case 4:
//                System.out.println("Season is spring");
//                break;
//            case 5:
//                System.out.println("Season is spring");
//                break;
//            case 6:
//                System.out.println("Season is summer");
//                break;
//            case 7:
//                System.out.println("Season is summer");
//                break;
//            case 8:
//                System.out.println("Season is summer");
//                break;
//            case 9:
//                System.out.println("Season is autumn");
//                break;
//            case 10:
//                System.out.println("Season is autumn");
//                break;
//            case 11:
//                System.out.println("Season is autumn");
//                break;
//            case 12:
//                System.out.println("Season is winter");
//                break;
//            default:
//                System.out.println("Incorrect value");}



    }

    }

