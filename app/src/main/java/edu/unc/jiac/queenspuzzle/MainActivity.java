package edu.unc.jiac.queenspuzzle;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageButton buttonGrid[][]=new ImageButton[8][8];//rows first, then column
    private String t = "imageButton";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
        linkArray();

        showPop("App Started");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void linkArray(){
        //row 1
        buttonGrid[0][0]=(ImageButton) findViewById(R.id.imageButton1_1);
        buttonGrid[0][1]=(ImageButton) findViewById(R.id.imageButton1_2);
        buttonGrid[0][2]=(ImageButton) findViewById(R.id.imageButton1_3);
        buttonGrid[0][3]=(ImageButton) findViewById(R.id.imageButton1_4);
        buttonGrid[0][4]=(ImageButton) findViewById(R.id.imageButton1_5);
        buttonGrid[0][5]=(ImageButton) findViewById(R.id.imageButton1_6);
        buttonGrid[0][6]=(ImageButton) findViewById(R.id.imageButton1_7);
        buttonGrid[0][7]=(ImageButton) findViewById(R.id.imageButton1_8);

        //row 2
        buttonGrid[1][0]=(ImageButton) findViewById(R.id.imageButton2_1);
        buttonGrid[1][1]=(ImageButton) findViewById(R.id.imageButton2_2);
        buttonGrid[1][2]=(ImageButton) findViewById(R.id.imageButton2_3);
        buttonGrid[1][3]=(ImageButton) findViewById(R.id.imageButton2_4);
        buttonGrid[1][4]=(ImageButton) findViewById(R.id.imageButton2_5);
        buttonGrid[1][5]=(ImageButton) findViewById(R.id.imageButton2_6);
        buttonGrid[1][6]=(ImageButton) findViewById(R.id.imageButton2_7);
        buttonGrid[1][7]=(ImageButton) findViewById(R.id.imageButton2_8);

        //row 3
        buttonGrid[2][0]=(ImageButton) findViewById(R.id.imageButton3_1);
        buttonGrid[2][1]=(ImageButton) findViewById(R.id.imageButton3_2);
        buttonGrid[2][2]=(ImageButton) findViewById(R.id.imageButton3_3);
        buttonGrid[2][3]=(ImageButton) findViewById(R.id.imageButton3_4);
        buttonGrid[2][4]=(ImageButton) findViewById(R.id.imageButton3_5);
        buttonGrid[2][5]=(ImageButton) findViewById(R.id.imageButton3_6);
        buttonGrid[2][6]=(ImageButton) findViewById(R.id.imageButton3_7);
        buttonGrid[2][7]=(ImageButton) findViewById(R.id.imageButton3_8);

        //row 4
        buttonGrid[3][0]=(ImageButton) findViewById(R.id.imageButton4_1);
        buttonGrid[3][1]=(ImageButton) findViewById(R.id.imageButton4_2);
        buttonGrid[3][2]=(ImageButton) findViewById(R.id.imageButton4_3);
        buttonGrid[3][3]=(ImageButton) findViewById(R.id.imageButton4_4);
        buttonGrid[3][4]=(ImageButton) findViewById(R.id.imageButton4_5);
        buttonGrid[3][5]=(ImageButton) findViewById(R.id.imageButton4_6);
        buttonGrid[3][6]=(ImageButton) findViewById(R.id.imageButton4_7);
        buttonGrid[3][7]=(ImageButton) findViewById(R.id.imageButton4_8);

        //row 5
        buttonGrid[4][0]=(ImageButton) findViewById(R.id.imageButton5_1);
        buttonGrid[4][1]=(ImageButton) findViewById(R.id.imageButton5_2);
        buttonGrid[4][2]=(ImageButton) findViewById(R.id.imageButton5_3);
        buttonGrid[4][3]=(ImageButton) findViewById(R.id.imageButton5_4);
        buttonGrid[4][4]=(ImageButton) findViewById(R.id.imageButton5_5);
        buttonGrid[4][5]=(ImageButton) findViewById(R.id.imageButton5_6);
        buttonGrid[4][6]=(ImageButton) findViewById(R.id.imageButton5_7);
        buttonGrid[4][7]=(ImageButton) findViewById(R.id.imageButton5_8);

        //row 6
        buttonGrid[5][0]=(ImageButton) findViewById(R.id.imageButton6_1);
        buttonGrid[5][1]=(ImageButton) findViewById(R.id.imageButton6_2);
        buttonGrid[5][2]=(ImageButton) findViewById(R.id.imageButton6_3);
        buttonGrid[5][3]=(ImageButton) findViewById(R.id.imageButton6_4);
        buttonGrid[5][4]=(ImageButton) findViewById(R.id.imageButton6_5);
        buttonGrid[5][5]=(ImageButton) findViewById(R.id.imageButton6_6);
        buttonGrid[5][6]=(ImageButton) findViewById(R.id.imageButton6_7);
        buttonGrid[5][7]=(ImageButton) findViewById(R.id.imageButton6_8);

        //row 7
        buttonGrid[6][0]=(ImageButton) findViewById(R.id.imageButton7_1);
        buttonGrid[6][1]=(ImageButton) findViewById(R.id.imageButton7_2);
        buttonGrid[6][2]=(ImageButton) findViewById(R.id.imageButton7_3);
        buttonGrid[6][3]=(ImageButton) findViewById(R.id.imageButton7_4);
        buttonGrid[6][4]=(ImageButton) findViewById(R.id.imageButton7_5);
        buttonGrid[6][5]=(ImageButton) findViewById(R.id.imageButton7_6);
        buttonGrid[6][6]=(ImageButton) findViewById(R.id.imageButton7_7);
        buttonGrid[6][7]=(ImageButton) findViewById(R.id.imageButton7_8);

        //row 8
        buttonGrid[7][0]=(ImageButton) findViewById(R.id.imageButton8_1);
        buttonGrid[7][1]=(ImageButton) findViewById(R.id.imageButton8_2);
        buttonGrid[7][2]=(ImageButton) findViewById(R.id.imageButton8_3);
        buttonGrid[7][3]=(ImageButton) findViewById(R.id.imageButton8_4);
        buttonGrid[7][4]=(ImageButton) findViewById(R.id.imageButton8_5);
        buttonGrid[7][5]=(ImageButton) findViewById(R.id.imageButton8_6);
        buttonGrid[7][6]=(ImageButton) findViewById(R.id.imageButton8_7);
        buttonGrid[7][7]=(ImageButton) findViewById(R.id.imageButton8_8);

    }
    public void question(View v){
        ViewDialog tutorial = new ViewDialog();
        tutorial.showDialog(this, "", R.layout.question);

    }
    public void onClick(View v){
        //showPop(Integer.toString(v.getId()));
        //showPop("separater");
        //showPop(Integer.toString(R.id.imageButton1_1));
        for(int r=0;r<8;r++){
            for(int c=0;c<8;c++){
                if(v.getId()==buttonGrid[r][c].getId()){//match click to grid
                    if(v.getTag().equals("empty")){//clicked on empty grid
                        if(violation(r,c)==false) {
                            setQueen(r, c);
                            buttonGrid[r][c].setTag(getString(R.string.queen));
                        }else{
                            showPop("Violated Rule, Can't be Placed");
                        }
                    }else if(v.getTag().equals("queen")){//clicked on a queen
                        setEmpty(r,c);
                        buttonGrid[r][c].setTag(getString(R.string.empty));
                    }
                }
            }
        }
        //gave up
        if(v.getId()==R.id.button){
            giveUp();
        }
    }
    public void showPop(String s){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, s, duration);
        toast.show();

    }
    public boolean isEven(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }
    public void setQueen(int r, int c){
        if(isEven(r)){//on row 2, 4, 6
            if(isEven(c)){//on white grid
                buttonGrid[r][c].setBackgroundResource(R.drawable.whitequeen);
            }else{
                buttonGrid[r][c].setBackgroundResource(R.drawable.bluequeen);
            }
        }else{
            if(isEven(c)){//on white grid
                buttonGrid[r][c].setBackgroundResource(R.drawable.bluequeen);
            }else{
                buttonGrid[r][c].setBackgroundResource(R.drawable.whitequeen);
            }
        }
    }
    public void setEmpty(int r, int c){
        if(isEven(r)){//on row 2, 4, 6
            if(isEven(c)){//on white grid
                buttonGrid[r][c].setBackgroundResource(R.drawable.white);
            }else{
                buttonGrid[r][c].setBackgroundResource(R.drawable.blue);
            }
        }else{
            if(isEven(c)){//on white grid
                buttonGrid[r][c].setBackgroundResource(R.drawable.blue);
            }else{
                buttonGrid[r][c].setBackgroundResource(R.drawable.white);
            }
        }
    }
    public boolean violation(int row, int column){
        boolean condition=false;
        //check row
        for(int c=0;c<8;c++){
            if(buttonGrid[row][c].getTag().equals("queen")){
                condition=true;
            }
        }

        //check column
        for(int r=0;r<8;r++){
            if(buttonGrid[r][column].getTag().equals("queen")){
                condition=true;
            }
        }

        //check upper Right diagonal
        for(int  r=row, c=column; r>=0&&c<8;r+=-1,c+=1){
            if(buttonGrid[r][c].getTag().equals("queen")){
                condition=true;
            }
        }

        //check upper Left diagonal
        for(int  r=row, c=column; r>=0&&c>=0;r+=-1,c+=-1){
            if(buttonGrid[r][c].getTag().equals("queen")){
                condition=true;
            }
        }
        //check Lower Left diagonal
        for(int  r=row, c=column; r<8&&c>=0;r+=1,c+=-1){
            if(buttonGrid[r][c].getTag().equals("queen")){
                condition=true;
            }
        }
        //check Lower Right diagonal
        for(int  r=row, c=column; r<8&&c<8;r+=1,c+=1){
            if(buttonGrid[r][c].getTag().equals("queen")){
                condition=true;
            }
        }

        return condition;
    }
    public void giveUp(){
        int maxc=-1, input;
        //loop to find last location of queen
        for(int r=0;r<8;r++){
            for(int c=0;c<8;c++){
                if(buttonGrid[r][c].getTag().equals("queen")){//found a queen placed
                    if(c>maxc){
                        maxc=c;
                    }
                }
            }
        }
        input=maxc+1;
        if(!putqueen(input)){
            showPop("No Solution");
        }else{
            showPop("Solution as Follows");
        }
    }
    public void cleangame(View v){
        for(int r=0;r<8;r++){
            for(int c=0;c<8;c++){
                setEmpty(r, c);
                buttonGrid[r][c].setTag(getString(R.string.empty));
            }
        }
    }

    public boolean putqueen(int column){//return true if there is a solution
        if(column>=8){
            return true;
        }else{
            boolean queenPlaced=false;
            int row=0;

            while(!queenPlaced && row<8){
                if(violation(row,column)){//can't place a queen at current spot
                    ++row;
                }else{
                    setQueen(row, column);
                    buttonGrid[row][column].setTag(getString(R.string.queen));
                    queenPlaced=putqueen(column+1);
                    if(!queenPlaced){
                        setEmpty(row,column);
                        buttonGrid[row][column].setTag(getString(R.string.empty));
                        ++row;
                    }
                }
            }
            return queenPlaced;

        }
    }
}
