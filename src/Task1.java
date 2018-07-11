
//Даны 4 числа типа int. Сравнить их и вывести наименьшее на консоль.

public class Task1 {
    public void task1(int numb1,int numb2,int numb3,int numb4){
        if (numb1 < numb2 && numb1 < numb3 && numb1 < numb4)
            System.out.println("Min number is:" + numb1);
        else if (numb2 < numb1 && numb2 < numb3 && numb2 < numb4)
            System.out.println("Min number is:" + numb2);
        else if (numb3 < numb1 && numb3 < numb2 && numb3 < numb4)
            System.out.println("Min number is:" + numb3);
        else
            System.out.println("Min number is:" + numb4);
    }
}
