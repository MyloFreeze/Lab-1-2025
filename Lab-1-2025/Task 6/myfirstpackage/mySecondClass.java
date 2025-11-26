package myfirstpackage;

public class MySecondClass {
    private int OneNum;
    private int SecNum;

    public MySecondClass(int OneNum, int SecNum) {
        this.OneNum = OneNum;
        this.SecNum = SecNum;
    }

    public void setOneNum(int OneNum) {
        this.OneNum = OneNum;
    }

    public void setSecNum(int SecNum) {
        this.SecNum = SecNum;
    }

    public int getOneNum() {
        return OneNum;
    }

    public int getSecNum() {
        return SecNum;
    }

    public int multiply() {
        return OneNum * SecNum;
    }
}