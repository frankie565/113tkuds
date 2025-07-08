
class StudentGradeSystem {

    
    static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }

    
    static void displayReport(int[] scores) {
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0;
        int sum = 0;
        int maxScore = scores[0], minScore = scores[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            char grade = getGrade(score);
            sum += score;

            if (score > maxScore) {
                maxScore = score;
                maxIndex = i;
            }
            if (score < minScore) {
                minScore = score;
                minIndex = i;
            }

            switch (grade) {
                case 'A': aCount++; break;
                case 'B': bCount++; break;
                case 'C': cCount++; break;
                case 'D': dCount++; break;
            }
        }

        double avg = (double) sum / scores.length;

        
        int aboveAvgCount = 0;
        for (int score : scores) {
            if (score > avg) {
                aboveAvgCount++;
            }
        }
        double aboveAvgRatio = (double) aboveAvgCount / scores.length * 100;

        System.out.println("====== 學生成績報告 ======");
        System.out.printf("全班平均：%.2f\n", avg);
        System.out.printf("最高分：%d（學生編號 %d）\n", maxScore, maxIndex);
        System.out.printf("最低分：%d（學生編號 %d）\n", minScore, minIndex);
        System.out.printf("A 等級人數：%d\n", aCount);
        System.out.printf("B 等級人數：%d\n", bCount);
        System.out.printf("C 等級人數：%d\n", cCount);
        System.out.printf("D 等級人數：%d\n", dCount);
        System.out.printf("高於平均分人數比例：%.2f%%\n", aboveAvgRatio);
        System.out.println("------------------------------");
        System.out.println("編號\t分數\t等級");
        System.out.println("------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%c\n", i, scores[i], getGrade(scores[i]));
        }

        System.out.println("==============================");
    }

    
    public static void main(String[] args) {
        int[] studentScores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        displayReport(studentScores);
    }
}
