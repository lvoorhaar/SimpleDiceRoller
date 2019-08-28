package com.lennyvoorhaar.simplediceroller;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        this.random = new Random();
        TextView rollHistory = findViewById(R.id.history);
        rollHistory.setMovementMethod(new ScrollingMovementMethod());
        if (savedInstanceState != null) {
            rollHistory.setText(savedInstanceState.getString("savedHistory"));
            TextView result_d4 = findViewById(R.id.result_d4);
            result_d4.setText(savedInstanceState.getString("savedD4"));
            TextView result_d6 = findViewById(R.id.result_d6);
            result_d6.setText(savedInstanceState.getString("savedD6"));
            TextView result_d8 = findViewById(R.id.result_d8);
            result_d8.setText(savedInstanceState.getString("savedD8"));
            TextView result_d10 = findViewById(R.id.result_d10);
            result_d10.setText(savedInstanceState.getString("savedD10"));
            TextView result_d12 = findViewById(R.id.result_d12);
            result_d12.setText(savedInstanceState.getString("savedD12"));
            TextView result_d20 = findViewById(R.id.result_d20);
            result_d20.setText(savedInstanceState.getString("savedD20"));
            TextView result_d100 = findViewById(R.id.result_d100);
            result_d100.setText(savedInstanceState.getString("savedD100"));
            TextView result_dx = findViewById(R.id.result_dx);
            result_dx.setText(savedInstanceState.getString("savedDx"));
        }
    }

    protected void onSaveInstanceState(Bundle savedInstanceState) {
        TextView history = findViewById(R.id.history);
        String historyString = history.getText().toString();
        savedInstanceState.putString("savedHistory", historyString);
        TextView result_d4 = findViewById(R.id.result_d4);
        String d4String = result_d4.getText().toString();
        savedInstanceState.putString("savedD4", d4String);
        TextView result_d6 = findViewById(R.id.result_d6);
        String d6String = result_d6.getText().toString();
        savedInstanceState.putString("savedD6", d6String);
        TextView result_d8 = findViewById(R.id.result_d8);
        String d8String = result_d8.getText().toString();
        savedInstanceState.putString("savedD8", d8String);
        TextView result_d10 = findViewById(R.id.result_d10);
        String d10String = result_d10.getText().toString();
        savedInstanceState.putString("savedD10", d10String);
        TextView result_d12 = findViewById(R.id.result_d12);
        String d12String = result_d12.getText().toString();
        savedInstanceState.putString("savedD12", d12String);
        TextView result_d20 = findViewById(R.id.result_d20);
        String d20String = result_d20.getText().toString();
        savedInstanceState.putString("savedD20", d20String);
        TextView result_d100 = findViewById(R.id.result_d100);
        String d100String = result_d100.getText().toString();
        savedInstanceState.putString("savedD100", d100String);
        TextView result_dx = findViewById(R.id.result_dx);
        String dxString = result_dx.getText().toString();
        savedInstanceState.putString("savedDx", dxString);
        super.onSaveInstanceState(savedInstanceState);
    }

    public void rollD4(View view) {
        TextView result = findViewById(R.id.result_d4);
        TextView numberOfRolls = findViewById(R.id.number_d4);
        if (numberOfRolls.getText().toString().trim().length() > 0) {
            int rolls = Integer.parseInt(numberOfRolls.getText().toString());
            int rolledNumber = roll(4, rolls);
            result.setText(Integer.toString(rolledNumber));
        } else {
            result.setText("0");
        }
    }

    public void rollD6(View view) {
        TextView result = findViewById(R.id.result_d6);
        TextView numberOfRolls = findViewById(R.id.number_d6);
        if (numberOfRolls.getText().toString().trim().length() > 0) {
            int rolls = Integer.parseInt(numberOfRolls.getText().toString());
            int rolledNumber = roll(6, rolls);
            result.setText(Integer.toString(rolledNumber));
        } else {
            result.setText("0");
        }
    }

    public void rollD8(View view) {
        TextView result = findViewById(R.id.result_d8);
        TextView numberOfRolls = findViewById(R.id.number_d8);
        if (numberOfRolls.getText().toString().trim().length() > 0) {
            int rolls = Integer.parseInt(numberOfRolls.getText().toString());
            int rolledNumber = roll(8, rolls);
            result.setText(Integer.toString(rolledNumber));
        } else {
            result.setText("0");
        }
    }

    public void rollD10(View view) {
        TextView result = findViewById(R.id.result_d10);
        TextView numberOfRolls = findViewById(R.id.number_d10);
        if (numberOfRolls.getText().toString().trim().length() > 0) {
            int rolls = Integer.parseInt(numberOfRolls.getText().toString());
            int rolledNumber = roll(10, rolls);
            result.setText(Integer.toString(rolledNumber));
        } else {
            result.setText("0");
        }
    }

    public void rollD12(View view) {
        TextView result = findViewById(R.id.result_d12);
        TextView numberOfRolls = findViewById(R.id.number_d12);
        if (numberOfRolls.getText().toString().trim().length() > 0) {
            int rolls = Integer.parseInt(numberOfRolls.getText().toString());
            int rolledNumber = roll(12, rolls);
            result.setText(Integer.toString(rolledNumber));
        } else {
            result.setText("0");
        }
    }

    public void rollD20(View view) {
        TextView result = findViewById(R.id.result_d20);
        TextView numberOfRolls = findViewById(R.id.number_d20);
        if (numberOfRolls.getText().toString().trim().length() > 0) {
            int rolls = Integer.parseInt(numberOfRolls.getText().toString());
            int rolledNumber = roll(20, rolls);
            result.setText(Integer.toString(rolledNumber));
        } else {
            result.setText("0");
        }
    }

    public void rollD100(View view) {
        TextView result = findViewById(R.id.result_d100);
        TextView numberOfRolls = findViewById(R.id.number_d100);
        if (numberOfRolls.getText().toString().trim().length() > 0) {
            int rolls = Integer.parseInt(numberOfRolls.getText().toString());
            int rolledNumber = roll(100, rolls);
            result.setText(Integer.toString(rolledNumber));
        } else {
            result.setText("0");
        }
    }

    public void rollDx(View view) {
        TextView result = findViewById(R.id.result_dx);
        TextView numberOfRolls = findViewById(R.id.number_dx);
        TextView numberOfSides = findViewById(R.id.sides_dx);
        if (numberOfRolls.getText().toString().trim().length() > 0 &&
                numberOfSides.getText().toString().trim().length() > 0 &&
                !numberOfSides.getText().toString().trim().equals("0")) {
            int rolls = Integer.parseInt(numberOfRolls.getText().toString());
            int sides = Integer.parseInt(numberOfSides.getText().toString());
            int rolledNumber = roll(sides,rolls);
            result.setText(Integer.toString(rolledNumber));
        } else {
            result.setText("0");
        }

    }

    public int roll(int sides, int rolls) {
        int total = 0;
        int rolledNumber = 0;
        String recentHistory = "roll " + rolls + "d" + sides + "\n";
        for (int i = 0; i < rolls; i++) {
            rolledNumber = random.nextInt(sides) + 1;
            total += rolledNumber;
            recentHistory += rolledNumber + ", ";
        }
        recentHistory += "total: " + total + "\n" + "\n";
        TextView history = findViewById(R.id.history);
        String getHistory = history.getText().toString();
        String newHistory = recentHistory + getHistory;
        history.setText(newHistory);
        return total;
    }
}
