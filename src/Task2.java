
//Вывести на консоль количество максимальных чисел среди этих четырех.

public class Task2 {
    public void task2(int numb1, int numb2, int numb3, int numb4) {


        int  numbOfMax=0, max=0;

        if(numb1>numb2 && numb1>numb3 && numb1>numb4){
            max = numb1;
            numbOfMax = 1;
        }else if(numb2>numb1 && numb2>numb3 && numb2>numb4){
            max = numb2;
            numbOfMax = 1;
        }else if(numb3>numb1 && numb3>numb2 && numb3>numb4){
            max = numb3;
            numbOfMax =1;
        }else if(numb4>numb1 && numb4>numb2 && numb4>numb3){
            max = numb3;
            numbOfMax = 1;


        }else if(numb1==numb2 && numb1>numb3 && numb1>numb4 ){
            numbOfMax = 2;
            max = numb1;
        }else if(numb1==numb3 && numb1>numb2 && numb1>numb4) {
            numbOfMax = 2;
            max = numb1;
        }else if(numb1==numb4 && numb1>numb2 && numb1>numb3){
            numbOfMax = 2;
            max = numb1;
        }else if(numb2==numb3 && numb2>numb1 && numb1>numb4){
            numbOfMax = 2;
            max =numb2;
        }else if(numb2==numb4 && numb2>numb1 && numb2>numb3){
            numbOfMax = 2;
            max = numb2;
        }else if(numb3==numb4 && numb3>numb1 && numb3>numb2){
            numbOfMax = 2;
            max = numb3;


        }else if(numb1==numb2 && numb1==numb3 && numb1>numb4){
            numbOfMax = 3;
            max = numb1;
        }else if(numb1==numb2 && numb1==numb4 && numb1>numb3){
            numbOfMax = 3;
            max = numb1;
        }else if(numb1==numb3 && numb1==numb4 && numb1>numb2){
            numbOfMax = 3;
            max = numb1;
        }else if(numb2==numb3 && numb2==numb4 && numb2>numb1){
            numbOfMax = 3;
            max = numb2;


        }else if(numb1==numb2 && numb1==numb3 && numb1==numb4){
            numbOfMax = 4;
            max = numb1;
        }

        System.out.println("Number of maximum numbers:" + numbOfMax);
        System.out.println("Maximum number:" + max);
        System.out.println();
    }}