
//Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.

public class Task4 {
    public void task4(String name, String name1){
                            // Variant 1
//        if (name == name1)
//            System.out.println("People have the same name:" + name);
//        else
//            System.out.println("People have different name");

                            // Variant 2
    String result = (name==name1) ? "People have the same name" : "People have different name";
        System.out.println(result);




    }
}
