package com.anwarsharifiqra.mcalcproapp;

import androidx.appcompat.app.AppCompatActivity;


import android.hardware.SensorEvent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import ca.roumani.i2c.MPro;

public class MainActivity extends AppCompatActivity  {

    private TextView score;
    private TextView questionNo;
    private TextView question;
    private EditText answer;
    private Button button;
    private TextView log;
    int currentQuestionIndex = -1;
    int showIndex = 1;
    int userScore = 0;
    String record ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score = findViewById(R.id.scoreID);
        questionNo = findViewById(R.id.questionNo);
        question = findViewById(R.id.questionID);
        answer = findViewById(R.id.editTextTextPersonName);
        button = findViewById(R.id.button);
        log = findViewById(R.id.logID);
        score.setText("Your score is 0");
        String msg = "Thanks For Playing";
        Toast endToast = Toast.makeText(this,msg, Toast.LENGTH_LONG);


        log.setText("");

        Game gameInstace = new Game();
        String[] questionsAnswers = new String[9];
        String[] questions = new String[9];
        String[]  answers= new String[9];
        for (int i = 0; i < 9; i++) {
            questionsAnswers[i] = gameInstace.qa();
            String lines[] = questionsAnswers[i].split("\\r?\\n");
            questions[i] = lines[0];
            answers[i] = lines[1];
        }
        question.setText(questions[0]);
        questionNo.setText("#"+showIndex);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userAnswer;
                log.setText("");



                currentQuestionIndex++;
                if (currentQuestionIndex < 9){
                if (currentQuestionIndex == 0){
                    userAnswer = answer.getText().toString();
                       if (userAnswer.equals(answers[0])){
                           userScore++;
                           score.setText("Your Score is "+userScore);
                           record += questions[0]+"\n Your answer is "+userAnswer+" which is " +
                                   "correct\n";

                       }
                       else {
                           record += questions[0]+"\n Your answer is "+userAnswer+" which is " +
                                   "Incorrect.\n The correct answer is "+answers[0]+"\n";
                       }
                    question.setText(questions[1]);
                }
                else {
               switch (currentQuestionIndex){
                   case 1:

                       userAnswer = answer.getText().toString();
                      if (userAnswer.equals(answers[1])){
                          userScore++;
                          score.setText("Your Score is "+userScore);
                          record += questions[1]+"\n Your answer is "+userAnswer+" which is " +
                                  "correct\n";

                      }
                      else {
                          record += questions[1]+"\n Your answer is "+userAnswer+" which is " +
                                  "Incorrect.\n The correct answer is "+answers[1]+"\n";
                      }
                       question.setText(questions[2]);
                      break;
                   case 2:

                        userAnswer = answer.getText().toString();
                       if (userAnswer.equals(answers[2])){
                           userScore++;
                           score.setText("Your Score is "+userScore);
                           record += questions[2]+"\n Your answer is "+userAnswer+" which is " +
                                   "correct\n";

                       }
                       else {
                           record += questions[2]+"\n Your answer is "+userAnswer+" which is " +
                                   "Incorrect.\n The correct answer is "+answers[2]+"\n";
                       }
                       question.setText(questions[3]);
                       break;
                   case 3:

                       userAnswer = answer.getText().toString();
                       if (userAnswer.equals(answers[currentQuestionIndex])){
                           userScore++;
                           score.setText("Your Score is "+userScore);
                           record += questions[currentQuestionIndex]+"\n Your answer is "+userAnswer+" which is " +
                                   "correct\n";

                       }
                       else {
                           record += questions[currentQuestionIndex]+"\n Your answer is "+userAnswer+" which is " +
                                   "Incorrect.\n The correct answer is "+answers[currentQuestionIndex]+"\n";
                       }
                       question.setText(questions[currentQuestionIndex + 1]);
                       break;
                   case 4:

                       userAnswer = answer.getText().toString();
                       if (userAnswer.equals(answers[4])){
                           userScore++;
                           score.setText("Your Score is "+userScore);
                           record += questions[currentQuestionIndex]+"\n Your answer is "+userAnswer+" which is " +
                                   "correct\n";

                       }
                       else {
                           record += questions[currentQuestionIndex]+"\n Your answer is "+userAnswer+" which is " +
                                   "Incorrect.\n The correct answer is "+answers[currentQuestionIndex]+"\n";
                       }
                       question.setText(questions[currentQuestionIndex + 1]);
                       break;
                   case 5:

                       userAnswer = answer.getText().toString();
                       if (userAnswer.equals(answers[5])){
                           userScore++;
                           score.setText("Your Score is "+userScore);
                           record += questions[currentQuestionIndex]+"\n Your answer is "+userAnswer+" which is " +
                                   "correct\n";

                       }
                       else {
                           record += questions[currentQuestionIndex]+"\n Your answer is "+userAnswer+" which is " +
                                   "Incorrect.\n The correct answer is "+answers[currentQuestionIndex]+"\n";
                       }
                       question.setText(questions[currentQuestionIndex + 1]);
                       break;
                   case 6:

                       userAnswer = answer.getText().toString();
                       if (userAnswer.equals(answers[6])){
                           userScore++;
                           score.setText("Your Score is "+userScore);
                           record += questions[currentQuestionIndex]+"\n Your answer is "+userAnswer+" which is " +
                                   "correct\n";

                       }
                       else {
                           record += questions[currentQuestionIndex]+"\n Your answer is "+userAnswer+" which is " +
                                   "Incorrect.\n The correct answer is "+answers[currentQuestionIndex]+"\n";
                       }
                       question.setText(questions[currentQuestionIndex + 1]);
                       break;
                   case 7:

                       userAnswer = answer.getText().toString();
                       if (userAnswer.equals(answers[7])){
                           userScore++;
                           score.setText("Your Score is "+userScore);
                           record += questions[currentQuestionIndex]+"\n Your answer is "+userAnswer+" which is " +
                                   "correct\n";

                       }
                       else {
                           record += questions[currentQuestionIndex]+"\n Your answer is "+userAnswer+" which is " +
                                   "Incorrect.\n The correct answer is "+answers[currentQuestionIndex]+"\n";
                       }
                       question.setText(questions[currentQuestionIndex + 1]);
                       break;
                   case 8:

                       userAnswer = answer.getText().toString();
                       if (userAnswer.equals(answers[8])){
                           userScore++;
                           score.setText("Your Score is "+userScore);
                           record += questions[currentQuestionIndex]+"\n Your answer is "+userAnswer+" which is " +
                                   "correct\n";

                       }
                       else {
                           record += questions[currentQuestionIndex]+"\n Your answer is "+userAnswer+" which is " +
                                   "Incorrect.\n The correct answer is "+answers[currentQuestionIndex]+"\n";
                       }
                       question.setText(questions[currentQuestionIndex + 1]);
                       break;



               }
                }
//                int showIndex = currentQuestionIndex - 1;
            showIndex++;
               questionNo.setText("#"+showIndex);
               log.setText(record);
               score.setText("Your score is "+userScore);
               answer.setText("");

            }
//                else {
////                    endToast.show();
//                    record+="Thanks for Playing with us";
//                    log.setText(record);
//                    score.setText("Your score is "+userScore);
//                    answer.setText("");
//                }
            }
        });


    }

}