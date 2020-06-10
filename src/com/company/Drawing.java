package com.company;

import java.util.Arrays;

public class Drawing {
    int rows;
    int collums;
    char sym;
    char[][] table;

    Drawing(int rows, int collums, char sym){
        this.rows = rows;
        this.collums = collums;
        this.sym = sym;
        this.table = new char[rows][collums];
        for (char[] line : this.table){
            Arrays.fill(line,sym);
        }
        System.out.println("ты идиот.");
    }

    Drawing(){
        System.out.println("Ты идиот?");
    }

    public void print(){
        TwoDimentionalArrayTask.printTable(this.table);
    }

    public void setPoint(int x, int y, char sym){
        this.table[x][y] = sym;
    }

    public void drawVerticalLine(int vert, int firstp, int secondp, char sym){
        if (firstp > secondp){
            firstp = firstp + secondp;
            secondp = firstp - secondp;
            firstp = firstp - secondp;
        }

        for(int i = firstp; i < secondp; i++){
            this.setPoint(vert, i, sym);
        }

    }

    public void drawHorizontalLine(int hor, int firstp, int secondp, char sym) {
        if (firstp > secondp){
            firstp = firstp + secondp;
            secondp = firstp - secondp;
            firstp = firstp - secondp;
        }

        for(int i = firstp; i < secondp; i++){
            this.setPoint(i, hor, sym);
        }
    }

    public void drawRectangle(int fx, int fy, int sx, int sy, char sym){
        if (fx < sx){
            fx = fx + sx;
            sx = fx - sx;
            fx = fx -sx;
        }
        if (fy < sy){
            fy = fy + sy;
            sy = fy - sy;
            fy = fy -sy;
        }
        for(int x = fx; x < fx - fy - 1; x++){
            for (int y = sx; y < sx - sy - 1; y++){
                this.setPoint(x, y, sym);
            }
        }
    }

    //public void drawCircle(int centerx, int centery, int rad, char sym){
      //  for (int x = 0; x < this.table.length - 1; x++){
        //    for(int y = 0; y < this.table[0].length - 1; x++){
          //      if (((this.table[x]) * (this.table[x]) - (centery * centery)) < rad * rad){
            //        this.setPoint(x, y, sym);
              //  }
            //}
        //}
    //}

    public void draw(int x, int y, Drawing d){
        int countx = -1;
        int county = -1;

        for(int dx = x; dx < this.table.length - 1; dx++){
            countx++;
            for(int dy = y; dy < this.table[0].length - 1; dy++){
                county++;
                this.table[dx][dy] = d.table[countx][county];
            }
            countx = -1;
            county = -1;
        }
    }

}
