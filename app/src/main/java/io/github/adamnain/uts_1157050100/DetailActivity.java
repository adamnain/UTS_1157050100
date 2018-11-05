package io.github.adamnain.uts_1157050100;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.tv_home_team_detail)
    TextView tvHomeTeam;

    @BindView(R.id.tv_home_score_detail)
    TextView tvHomeScore;

    @BindView(R.id.tv_home_lineup_defense)
    TextView tvHomeDefense;

    @BindView(R.id.tv_home_lineup_midfield)
    TextView tvHomeMidfield;

    @BindView(R.id.tv_home_lineup_forward)
    TextView tvHomeForward;

    @BindView(R.id.tv_away_team_detail)
    TextView tvAwayTeam;

    @BindView(R.id.tv_away_score_detail)
    TextView tvAwayScore;

    @BindView(R.id.tv_away_lineup_defense)
    TextView tvAwayDefense;

    @BindView(R.id.tv_away_lineup_midfield)
    TextView tvAwayMidfield;

    @BindView(R.id.tv_away_lineup_forward)
    TextView tvAwayForward;

    private String homeTeam, homeScore, homeGoalkeeper, homeDefense, homeMidfield, homeForward,
            awayTeam, awayScore, awayGoalkeeper, awayDefense, awayMidfield, awayForward;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ButterKnife.bind(this);
        getIntentData();

        tvHomeTeam.setText(homeTeam);
        tvHomeScore.setText(homeScore);
        tvHomeDefense.setText(homeDefense);
        tvHomeMidfield.setText(homeMidfield);
        tvHomeForward.setText(homeForward);
        tvAwayTeam.setText(awayTeam);
        tvAwayScore.setText(awayScore);
        tvAwayDefense.setText(awayDefense);
        tvAwayMidfield.setText(awayMidfield);
        tvAwayForward.setText(awayForward);
    }

    private void getIntentData(){
        homeTeam = getIntent().getStringExtra("homeTeam");
        homeScore = getIntent().getStringExtra("homeScore");
        homeGoalkeeper = getIntent().getStringExtra("homeGoalkeeper");
        homeDefense = getIntent().getStringExtra("homeDefense");
        homeMidfield = getIntent().getStringExtra("homeMidfield");
        homeForward = getIntent().getStringExtra("homeForward");
        awayTeam = getIntent().getStringExtra("awayTeam");
        awayScore = getIntent().getStringExtra("awayScore");
        awayGoalkeeper = getIntent().getStringExtra("awayGoalkeeper");
        awayDefense = getIntent().getStringExtra("awayDefense");
        awayMidfield = getIntent().getStringExtra("awayMidfield");
        awayForward =  getIntent().getStringExtra("awayForward");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_news) {
            String url = "https://www.goal.com/id/liga-primer/jadwal-hasil/2kwbbcootiqqgmrzs6o5inle5";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
