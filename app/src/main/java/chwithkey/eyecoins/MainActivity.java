package chwithkey.eyecoins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout;

import org.json.JSONException;

import chwithkey.standvolleyframe.base.Base_Act;

public class MainActivity extends Base_Act implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        varInit();

        setupToolbar();

        setupIncomeReLayout();
        setupCostReLayout();
        setupInvestReLayout();
        setupCreditReLay();
        setupDebitReLayout();
        setupDiscussReLayout();
    }

    @Override
    public void varInit() {

    }

    @Override
    protected void setupToolbar() {
    }

    private void setupIncomeReLayout() {
        final RelativeLayout income_rl = (RelativeLayout) findViewById(R.id.main_income_rl);
        income_rl.setOnClickListener(this);
    }

    private void setupCostReLayout() {
        final RelativeLayout cost_rl = (RelativeLayout) findViewById(R.id.main_cost_rl);
        cost_rl.setOnClickListener(this);
    }

    private void setupInvestReLayout() {
        final RelativeLayout invest_rl = (RelativeLayout) findViewById(R.id.main_invest_rl);
        invest_rl.setOnClickListener(this);
    }

    private void setupCreditReLay() {
        final RelativeLayout credit_rl = (RelativeLayout) findViewById(R.id.main_credit_rl);
        credit_rl.setOnClickListener(this);
    }

    private void setupDebitReLayout() {
        final RelativeLayout debit_rl = (RelativeLayout) findViewById(R.id.main_debit_rl);
        debit_rl.setOnClickListener(this);
    }

    private void setupDiscussReLayout() {
        final RelativeLayout discuss_rl = (RelativeLayout) findViewById(R.id.main_discuss_rl);
        discuss_rl.setOnClickListener(this);
    }

    @Override
    public void onMultiHandleResponse(String s, String s1) throws JSONException {

    }

    @Override
    public void onNullResponse(String s) throws JSONException {

    }

    @Override
    public void onPermissionAccepted(int i) {

    }

    @Override
    public void onPermissionRefused(int i) {

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();

        switch (v.getId()) {
            case R.id.main_income_rl:
                break;

            case R.id.main_cost_rl:
                break;

            case R.id.main_invest_rl:
                break;

            case R.id.main_credit_rl:
                break;

            case R.id.main_debit_rl:
                break;

            case R.id.main_discuss_rl:
                break;
        }

        startActivity(intent);
    }
}
