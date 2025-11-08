import java.util.Random;
public class Main {
    public static void main(String[] args){
        //BONUS!!!

        Random rand=new Random(System.currentTimeMillis());
        int students=5;
        int quizes=4;
        int[][] scores=new int[students][quizes];
        for(int i=0;i<students;i++){
            for (int j=0;j<quizes;j++){
                scores[i][j]=rand.nextInt(101);
            }
        }//Create Table
        System.out.println("Scores Table:");
        for(int i=0;i<students;i++){
            for (int j=0;j<quizes;j++){
                System.out.printf("%4d",scores[i][j]);
            }
            System.out.println();
        }
        System.out.println("Student Averages:");
        for(int i=0;i<students;i++){
            int sum=0;
            for (int j=0;j<quizes;j++){
                sum+=scores[i][j];
            }
            double avg=sum/(double)quizes;
            System.out.printf("Student %d: %.2f\n",i,avg);
        }
        System.out.println("Quiz Averages");
        for (int j=0;j<quizes;j++){
            int sumj=0;
            for (int i=0;i<students;i++){
                sumj+=scores[i][j];
            }
            double average=sumj/(double)students;
            System.out.printf("Quiz %d: %.2f\n",j,average);

        }
        //higher score
        int maxScore=0;
        int maxStudent=0;
        int maxQuiz=0;
        for(int i=0;i<students;i++){
            for (int j=0;j<quizes;j++){
                if(scores[i][j]>maxScore){
                    maxScore=scores[i][j];
                    maxStudent=i;
                    maxQuiz=j;
                }

            }
        }
        System.out.println("Highest Score:");
        System.out.println("Score: " + maxScore + " at (Student " + maxStudent + ", Quiz " + maxQuiz + ")");


    }
}