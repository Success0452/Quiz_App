package com.famous.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Global Variables
    RadioGroup questionOneAnswer;
    EditText questionTwoAnswer;
    RadioGroup questionThreeAnswer;
    CheckBox questionFourAnswerOne;
    CheckBox questionFourAnswerTwo;
    RadioGroup questionFiveAnswer;

    Button submit;

    //initialize int variable for counting Correct Answer
    int Correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // locate view for answerOne
        questionOneAnswer = findViewById(R.id.question1);

        // locate view for answerTwo
        questionTwoAnswer = findViewById(R.id.question_two_correct);

        // locate view for answerThree
         questionThreeAnswer = findViewById(R.id.question2);

        // locate view for answerFour1
        questionFourAnswerOne = findViewById(R.id.question_four_correct1);

        // locate view for answerFour2
        questionFourAnswerTwo = findViewById(R.id.question_four_correct2);

        // locate view for answerFive
         questionFiveAnswer = findViewById(R.id.question5);


    }

    //Initialization of SubmitButton
    public void SubmitBtn(View view) {
        CheckThroughTheQuestion();

        //Display Toast Message of correct answer
        Toast.makeText(this, Correct + " Out Of 5", Toast.LENGTH_LONG).show();
    }

    //boolean method that verify the right answer
    private boolean RadioQuestion1() {

        return questionOneAnswer.getCheckedRadioButtonId() == R.id.question_one_correct;
    }

    //boolean method that verify the right answer
    private boolean EditQuestion2(){
        return questionTwoAnswer.getText().toString().equalsIgnoreCase("Naira");
    }

    //boolean method that verify the right answer
    private boolean RadioQuestion3(){
        return questionThreeAnswer.getCheckedRadioButtonId() == R.id.question_three_correct;
    }

    //boolean method that verify the right answer
    private boolean CheckBoxQuestion4() {
        return questionFourAnswerOne.isChecked() && questionFourAnswerTwo.isChecked();
    }

    //boolean method that verify the right answer
    private boolean RadioQuestion5(){
        return questionFiveAnswer.getCheckedRadioButtonId() == R.id.question_five_correct;
    }


    //Computation of answered questions
    private void CheckThroughTheQuestion() {
        Correct = 0;

        if (RadioQuestion1())
        {
            Correct = Correct + 1;
        }

        if (EditQuestion2())
        {
            Correct = Correct + 1;
        }

        if (RadioQuestion3())
        {
            Correct = Correct + 1;
        }

        if (CheckBoxQuestion4())
        {
            Correct = Correct + 1;
        }

        if (RadioQuestion5())
        {
            Correct = Correct + 1;
        }
    }



}