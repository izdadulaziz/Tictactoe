package iz.android.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView tvTurn;
	TextView tvScore;

	Button btn0;
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;

	/*
	  0 = o
	  1 = x
	*/
	int turn = 1;

	

	private void initVariable() {
		tvTurn = findViewById(R.id.text_view_frist_turn);
		tvScore = findViewById(R.id.text_view_score);

		btn0 = findViewById(R.id.button_0);
		btn1 = findViewById(R.id.button_1);
		btn2 = findViewById(R.id.button_2);
		btn3 = findViewById(R.id.button_3);
		btn4 = findViewById(R.id.button_4);
		btn5 = findViewById(R.id.button_5);
		btn6 = findViewById(R.id.button_6);
		btn7 = findViewById(R.id.button_7);
		btn8 = findViewById(R.id.button_8);

	}

	private void initListener() {

		btn0.setOnClickListener(v -> {
			if (turn == 0) {

				btn0.setBackground(getResources().getDrawable(R.drawable.o));

				setTurn();
				
				setTVTurn();

			} else if (turn == 1) {

				btn0.setBackground(getResources().getDrawable(R.drawable.x));

				setTurn();
				
				setTVTurn();

			}
		});

		btn1.setOnClickListener(v -> {
			if (turn == 0) {

				btn1.setBackground(getResources().getDrawable(R.drawable.o));

				setTurn();
				
				setTVTurn();

			} else if (turn == 1) {

				btn1.setBackground(getResources().getDrawable(R.drawable.x));

				setTurn();
				
				setTVTurn();

			}
		});

		btn2.setOnClickListener(v -> {
			if (turn == 0) {

				btn2.setBackground(getResources().getDrawable(R.drawable.o));

				setTurn();
				
				setTVTurn();

			} else if (turn == 1) {

				btn2.setBackground(getResources().getDrawable(R.drawable.x));

				setTurn();
				
				setTVTurn();

			}
		});

		btn3.setOnClickListener(v -> {
			if (turn == 0) {

				btn3.setBackground(getResources().getDrawable(R.drawable.o));

				setTurn();
				
				setTVTurn();

			} else if (turn == 1) {

				btn3.setBackground(getResources().getDrawable(R.drawable.x));

				setTurn();
				
				setTVTurn();

			}
		});

		btn4.setOnClickListener(v -> {
			if (turn == 0) {

				btn4.setBackground(getResources().getDrawable(R.drawable.o));

				setTurn();
				
				setTVTurn();

			} else if (turn == 1) {

				btn4.setBackground(getResources().getDrawable(R.drawable.x));

				setTurn();
				
				setTVTurn();

			}
		});

		btn5.setOnClickListener(v -> {
			if (turn == 0) {

				btn5.setBackground(getResources().getDrawable(R.drawable.o));
				
				setTurn();
				
				setTVTurn();

			} else if (turn == 1) {

				btn5.setBackground(getResources().getDrawable(R.drawable.x));

				setTurn();
				
				setTVTurn();

			}
		});

		btn6.setOnClickListener(v -> {
			if (turn == 0) {

				btn6.setBackground(getResources().getDrawable(R.drawable.o));

				setTurn();
				
				setTVTurn();

			} else if (turn == 1) {

				btn6.setBackground(getResources().getDrawable(R.drawable.x));

				setTurn();
				
				setTVTurn();

			}
		});

		btn7.setOnClickListener(v -> {
			if (turn == 0) {

				btn7.setBackground(getResources().getDrawable(R.drawable.o));
				
				setTurn();
				
				setTVTurn();

			} else if (turn == 1) {

				btn7.setBackground(getResources().getDrawable(R.drawable.x));

				setTurn();
				
				setTVTurn();

			}
		});

		btn8.setOnClickListener(v -> {
			if (turn == 0) {

				btn8.setBackground(getResources().getDrawable(R.drawable.o));

				setTurn();
				
				setTVTurn();

			} else if (turn == 1) {

				btn8.setBackground(getResources().getDrawable(R.drawable.x));

				setTurn();
				
				setTVTurn();

			}
		});

	}
	
	private void setTurn() {

		if (turn == 0)
			turn = 1;
		else
			turn = 0;

	}
	
	private int getTurn(){
		return turn;
	}
	
	private void  setTVTurn(){
		
		if(getTurn() == 1){
			
			tvTurn.setText("X Turn");
			
		}else{
			
			tvTurn.setText("O Turn");
			
		}
		
	}
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initVariable();

		initListener();
		
		setTVTurn();
	}
}