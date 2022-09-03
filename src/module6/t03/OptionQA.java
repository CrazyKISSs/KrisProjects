package module6.t03;

public class OptionQA {
    long optionId;
    String name;
    boolean correct;

    public OptionQA(long optionId, String name, boolean correct) {
        this.optionId = optionId;
        this.name = name;
        this.correct = correct;
    }

    public long getOptionId() {
        return optionId;
    }

    public void setOptionId(long optionId) {
        this.optionId = optionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString(){
        String result;
        result = "" + this.optionId + " - " + this.name + "\n";
        return result;
    }


}
