package wednesday.course;

public class Exam {
    public void setPassLimit(int passLimit) {
        this.passLimit = passLimit;
    }

    private int passLimit;

    public void setResult(int result) {
        this.result = result;
    }

    private int result;

    public boolean hasPassed(){

        if (result > passLimit){
            return true;
        }
        return false;
    }
}
