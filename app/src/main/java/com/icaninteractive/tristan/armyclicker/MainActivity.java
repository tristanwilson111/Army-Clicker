package com.icaninteractive.tristan.armyclicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double currencyAmount = 10000.00;
    private int armyHealth = 75;
    private int soldierCount = 0;
    private int soldierCost = 100;
    private int tankCount = 0;
    private int tankCost = 500;
    private int planeCount = 0;
    private int planeCost = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button dollarButton = (Button) findViewById(R.id.dollarButton);

        dollarButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setArmyHealth((int)(getCurrencyAmount()/10));
                setCurrencyAmount(getCurrencyAmount()+1.00);
                TextView t = (TextView) findViewById(R.id.currencyCount);
                t.setText(String.format("%.02f",getCurrencyAmount()));
            }
        });

        final Button hireSoldier = (Button) findViewById(R.id.hireSoldier);
        hireSoldier.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setCurrencyAmount(getCurrencyAmount()-getSoldierCost());
                setSoldierCount(getSoldierCount()+1);

                TextView t = (TextView) findViewById(R.id.soldierCount);
                t.setText(""+getSoldierCount());

                TextView c = (TextView) findViewById(R.id.currencyCount);
                c.setText(""+getCurrencyAmount());
            }
        });

        final Button buyTank = (Button) findViewById(R.id.buyTank);
        buyTank.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setCurrencyAmount(getCurrencyAmount()-getTankCost());
                setTankCount(getTankCount()+1);

                TextView t = (TextView) findViewById(R.id.tankCount);
                t.setText(""+getTankCount());

                TextView c = (TextView) findViewById(R.id.currencyCount);
                c.setText(""+getCurrencyAmount());
            }
        });

        final Button buyPlane = (Button) findViewById(R.id.buyPlane);
        buyPlane.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setCurrencyAmount(getCurrencyAmount()-getPlaneCost());
                setPlaneCount(getPlaneCount()+1);

                TextView t = (TextView) findViewById(R.id.planeCount);
                t.setText(""+getPlaneCount());

                TextView c = (TextView) findViewById(R.id.currencyCount);
                c.setText(""+getCurrencyAmount());
            }
        });
    }
    public double getCurrencyAmount() {
        return currencyAmount;
    }
    public void setCurrencyAmount(double currencyAmount) {
        this.currencyAmount = currencyAmount;
    }
    public int getArmyHealth() {
        return armyHealth;
    }
    public void setArmyHealth(int armyHealth){
        this.armyHealth = armyHealth;
    }
    //Units Counts
    public int getSoldierCount() {
        return soldierCount;
    }
    public void setSoldierCount(int soldierCount) {
        this.soldierCount = soldierCount;
    }
    public int getTankCount() {
        return tankCount;
    }
    public void setTankCount(int tankCount) {
        this.tankCount = tankCount;
    }
    public int getPlaneCount() {
        return planeCount;
    }
    public void setPlaneCount(int planeCount) {
        this.planeCount = planeCount;
    }
    //Units Costs
    public int getSoldierCost() {
        return soldierCost;
    }
    public void setSoldierCost(int soldierCost) {
        this.soldierCost = soldierCost;
    }
    public int getTankCost() {
        return tankCost;
    }
    public void setTankCost(int tankCost) {
        this.tankCost = tankCost;
    }
    public int getPlaneCost() {
        return planeCost;
    }
    public void setPlaneCost(int planeCost) {
        this.planeCost = planeCost;
    }
}