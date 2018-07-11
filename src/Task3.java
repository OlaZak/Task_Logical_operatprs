
//Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.

public class Task3 {
    public void task3(int numb1,int numb2,int numb3,int numb4,int numb5){
        int min =0;
        int max =0;
        //found min
        if (numb1<numb2 && numb1<numb3 && numb1<numb4 && numb1<numb5)min = numb1;
        else if (numb2<numb1 && numb2<numb3 && numb2<numb4 && numb2<numb5)min = numb2;
        else if (numb3<numb1 && numb3<numb2 && numb3<numb4 && numb3<numb5)min = numb3;
        else if (numb4<numb1 && numb4<numb3 && numb4<numb2 && numb4<numb5)min = numb4;
        else min = numb5;
        System.out.println("Min number is:"+ min);


        // found max
        if (numb1>numb2 && numb1>numb3 && numb1>numb4 && numb1>numb5)max = numb1;
        else if (numb2>numb1 && numb2>numb3 && numb2>numb4 && numb2>numb5)max = numb2;
        else if (numb3>numb1 && numb3>numb2 && numb3>numb4 && numb3>numb5)max = numb3;
        else if (numb4>numb1 && numb4>numb3 && numb4>numb2 && numb4>numb5)max = numb4;
        else max = numb5;
        System.out.println("Max number is:"+ max);




    }
}
