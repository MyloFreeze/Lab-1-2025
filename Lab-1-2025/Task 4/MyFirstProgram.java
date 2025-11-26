class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(0, 0);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                o.setOneNum(i);
                o.setSecNum(j);
                System.out.print(o.multiply());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
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