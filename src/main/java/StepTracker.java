import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 protected ArrayList<Integer> dps;
 protected int tol; // post-grading addition

 public StepTracker(int tol) {
    dps = new ArrayList<Integer>();
    this.tol = tol; // post-grading addition
 }

 public void addDailySteps(int steps) {
    dps.add(steps);
 }

 public int activeDays() {
    int cnt = 0;
    for (int d : dps) {
        if (d >= tol) cnt++; // post grading addition: d >= 10_000 ]=> d >= tol
    }
    return cnt;
 }

 public double averageSteps() {
    if (dps.size() == 0) return 0D; // post-grading addition
    double sum = 0;
    for (int d : dps) sum += d;
    return sum / dps.size();
 }
} 
