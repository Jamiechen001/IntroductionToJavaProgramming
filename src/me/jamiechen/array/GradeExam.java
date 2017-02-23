package me.jamiechen.array;

/**
 * 程序给测验评分并显示结果，它将每个学生的答案与正确答案进行比较，统计正确答案的个数并显示
 *
 * Created by JamieChen on 2017/2/15 0015.
 */
public class GradeExam {
    public static void main(String[] args) {

        char[][] answer = {
                {'A','B','A','C','C','D','E','E','A','D'},
                {'D','B','A','B','C','A','E','E','A','D'},
                {'E','D','D','A','C','B','E','E','A','D'},
                {'C','B','A','E','D','C','E','E','A','D'},
                {'A','B','D','C','C','D','E','E','A','D'},
                {'B','B','E','C','C','D','E','E','A','D'},
                {'B','B','A','C','C','D','E','E','A','D'},
                {'E','B','E','C','C','D','E','E','A','D'}};

                char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

                for (int i = 0; i < answer.length; i++) {

                    int correctCount = 0;
                    for (int j = 0; j < answer[i].length; j++) {
                        if (answer[i][j] == keys[j])
                        correctCount++;
                    }

                    System.out.println("Student " + i + "'s correct count is " + correctCount);
                }
    }
}
