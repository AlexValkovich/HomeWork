//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]args){

        int mas1[]=new int[12];
        int max=0,index=0;

        for (int i=0;i<12;i++){

            mas1[i]=(int)Math.floor(Math.random()*31)-15;
            System.out.print(mas1[i] + " ");

        }
        for (int i=0;i<12;i++){
            if(mas1[i]>mas1[i-1]&&i!=-1){
                max=mas1[i];
                index=i;
            }
        }

        System.out.println("Самое большое число "+max+" и индекс его последнего вхождения "+index);

    }
}