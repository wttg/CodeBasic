package ACMTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wt on 2016/10/14.
 */
public class Word {
    public static Data data;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int row = cin.nextInt();//行
        int col = cin.nextInt();//列
        char test[][] = new char[row][col];
        for(int i = 0;i<row;i++)
            for(int j = 0;j<row;j++)
                test[i][j] = cin.next().charAt(0);

        List<Data> datas = new LinkedList<>();
        for(int i = 0;i<row;i++)
            for(int j = 0;j<col;j++)
            {
                data = new Data(test[i][j]);
                if(i!=0&&i!=row-1&&j!=0&&j!=col-1)
                    data.setTop(test[i-1][j]);
                else
                    data.setTop('#');
                if(i==0&&j==0) {
                    data.setTop('#');
                    data.setLeft('#');
                    data.setRight(test[i][j+1]);
                    data.setDown(test[i+1][j]);
                }
                if(i==0&&j==row-1) {
                    data.setTop('#');
                    data.setLeft(test[i][j-1]);
                    data.setRight('#');
                    data.setDown(test[i+1][j]);
                }
                if(i==row-1&&j==0) {
                    data.setTop(test[i-1][j]);
                    data.setLeft('#');
                    data.setRight(test[i][j+1]);
                    data.setDown('#');
                }
                if(i==row-1&&j==row-1) {
                    data.setTop(test[i][j-1]);
                    data.setLeft(test[i-1][j]);
                    data.setRight('#');
                    data.setDown('#');
                }

            }
    }



}
class Data{
    private char obj;
    public Data(char obj){
        this.obj = obj;
    }
    private char left = '#';
    private char right= '#';
    private char top = '#';

    public char getLeft() {
        return left;
    }

    public void setLeft(char left) {
        this.left = left;
    }

    public char getRight() {
        return right;
    }

    public void setRight(char right) {
        this.right = right;
    }

    public char getTop() {
        return top;
    }

    public void setTop(char top) {
        this.top = top;
    }

    public char getDown() {
        return down;
    }

    public void setDown(char down) {
        this.down = down;
    }

    private char down = '#';



}
