package com.example.goldfishpairs;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;


public class playPairs extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_pairs);
        mShowingBack = true;
        //create 3 sets of animators for turning cards over

        mFlipIn = AnimatorInflater.loadAnimator(this,R.animator.flip_test_in);
        mFlipOut = AnimatorInflater.loadAnimator(this,R.animator.flip_test_out);
        mFlipIn2 = AnimatorInflater.loadAnimator(this,R.animator.flip_test_in);
        mFlipOut2 = AnimatorInflater.loadAnimator(this,R.animator.flip_test_out);
        mFlipIn3 = AnimatorInflater.loadAnimator(this,R.animator.flip_test_in);
        mFlipOut3 = AnimatorInflater.loadAnimator(this,R.animator.flip_test_out);



        //array to track which cards are flipped over, with 2 default cards
        aUsedCards = new cardClass[2];
        aUsedCards[0] = new cardClass(true,findViewById(R.id.testFish1),findViewById(R.id.img1),0);
        aUsedCards[1] = new cardClass(true,findViewById(R.id.testFish1_2),findViewById(R.id.img2),0);

        //card objects for all 40 cards
        card1 = new cardClass(true,findViewById(R.id.testFish1),findViewById(R.id.img1),1);
        card2 = new cardClass(true,findViewById(R.id.testFish1_2),findViewById(R.id.img2),1);
        card3 = new cardClass(true,findViewById(R.id.testFish2),findViewById(R.id.img3),2);
        card4 = new cardClass(true,findViewById(R.id.testFish2_2),findViewById(R.id.img4),2);
        card5 = new cardClass(true,findViewById(R.id.testFish3),findViewById(R.id.img5),3);
        card6 = new cardClass(true,findViewById(R.id.testFish3_2),findViewById(R.id.img6),3);
        card7 = new cardClass(true,findViewById(R.id.testFish4),findViewById(R.id.img7),4);
        card8 = new cardClass(true,findViewById(R.id.testFish4_2),findViewById(R.id.img8),4);
        card9 = new cardClass(true,findViewById(R.id.testFish5),findViewById(R.id.img9),5);
        card10 = new cardClass(true,findViewById(R.id.testFish5_2),findViewById(R.id.img10),5);
        card11 = new cardClass(true,findViewById(R.id.testFish6),findViewById(R.id.img11),6);
        card12 = new cardClass(true,findViewById(R.id.testFish6_2),findViewById(R.id.img12),6);
        card13 = new cardClass(true,findViewById(R.id.testFish7),findViewById(R.id.img13),7);
        card14 = new cardClass(true,findViewById(R.id.testFish7_2),findViewById(R.id.img14),7);
        card15 = new cardClass(true,findViewById(R.id.testFish8),findViewById(R.id.img15),8);
        card16 = new cardClass(true,findViewById(R.id.testFish8_2),findViewById(R.id.img16),8);
        card17 = new cardClass(true,findViewById(R.id.testFish9),findViewById(R.id.img17),9);
        card18 = new cardClass(true,findViewById(R.id.testFish9_2),findViewById(R.id.img18),9);
        card19 = new cardClass(true,findViewById(R.id.testFish10),findViewById(R.id.img19),10);
        card20 = new cardClass(true,findViewById(R.id.testFish10_2),findViewById(R.id.img20),10);
        card21 = new cardClass(true,findViewById(R.id.testFish11),findViewById(R.id.img21),11);
        card22 = new cardClass(true,findViewById(R.id.testFish11_2),findViewById(R.id.img22),11);
        card23 = new cardClass(true,findViewById(R.id.testFish12),findViewById(R.id.img23),12);
        card24 = new cardClass(true,findViewById(R.id.testFish12_2),findViewById(R.id.img24),12);
        card25 = new cardClass(true,findViewById(R.id.testFish13),findViewById(R.id.img25),13);
        card26 = new cardClass(true,findViewById(R.id.testFish13_2),findViewById(R.id.img26),13);
        card27 = new cardClass(true,findViewById(R.id.testFish14),findViewById(R.id.img27),14);
        card28 = new cardClass(true,findViewById(R.id.testFish14_2),findViewById(R.id.img28),14);
        card29 = new cardClass(true,findViewById(R.id.testFish15),findViewById(R.id.img29),15);
        card30 = new cardClass(true,findViewById(R.id.testFish15_2),findViewById(R.id.img30),15);
        card31 = new cardClass(true,findViewById(R.id.testFish16),findViewById(R.id.img31),16);
        card32 = new cardClass(true,findViewById(R.id.testFish16_2),findViewById(R.id.img32),16);
        card33 = new cardClass(true,findViewById(R.id.testFish17),findViewById(R.id.img33),17);
        card34 = new cardClass(true,findViewById(R.id.testFish17_2),findViewById(R.id.img34),17);
        card35 = new cardClass(true,findViewById(R.id.testFish18),findViewById(R.id.img35),18);
        card36 = new cardClass(true,findViewById(R.id.testFish18_2),findViewById(R.id.img36),18);
        card37 = new cardClass(true,findViewById(R.id.testFish19),findViewById(R.id.img37),19);
        card38 = new cardClass(true,findViewById(R.id.testFish19_2),findViewById(R.id.img38),19);
        card39 = new cardClass(true,findViewById(R.id.testFish20),findViewById(R.id.img39),20);
        card40 = new cardClass(true,findViewById(R.id.testFish20_2),findViewById(R.id.img40),20);




        //on click listeners for all 40 cards
        card1.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card1);
                addToUsedCards(card1);
                checkCards(aUsedCards);
            }
        });
        card2.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card2);
                addToUsedCards(card2);
                checkCards(aUsedCards);
            }
        });
        card3.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card3);
                addToUsedCards(card3);
                checkCards(aUsedCards);
            }
        });
        card4.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card4);
                addToUsedCards(card4);
                checkCards(aUsedCards);
            }
        });
        card5.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card5);
                addToUsedCards(card5);
                checkCards(aUsedCards);
            }
        });
        card6.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card6);
                addToUsedCards(card6);
                checkCards(aUsedCards);
            }
        });
        card7.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card7);
                addToUsedCards(card7);
                checkCards(aUsedCards);
            }
        });
        card8.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card8);
                addToUsedCards(card8);
                checkCards(aUsedCards);
            }
        });
        card9.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card9);
                addToUsedCards(card9);
                checkCards(aUsedCards);
            }
        });
        card10.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card10);
                addToUsedCards(card10);
                checkCards(aUsedCards);
            }
        });
        card11.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card11);
                addToUsedCards(card11);
                checkCards(aUsedCards);
            }
        });
        card12.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card12);
                addToUsedCards(card12);
                checkCards(aUsedCards);
            }
        });
        card13.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card13);
                addToUsedCards(card13);
                checkCards(aUsedCards);
            }
        });
        card14.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card14);
                addToUsedCards(card14);
                checkCards(aUsedCards);
            }
        });
        card15.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card15);
                addToUsedCards(card15);
                checkCards(aUsedCards);
            }
        });
        card16.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card16);
                addToUsedCards(card16);
                checkCards(aUsedCards);
            }
        });
        card17.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card17);
                addToUsedCards(card17);
                checkCards(aUsedCards);
            }
        });
        card18.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card18);
                addToUsedCards(card18);
                checkCards(aUsedCards);
            }
        });
        card19.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card19);
                addToUsedCards(card19);
                checkCards(aUsedCards);
            }
        });
        card20.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card20);
                addToUsedCards(card20);
                checkCards(aUsedCards);
            }
        });
        card21.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card21);
                addToUsedCards(card21);
                checkCards(aUsedCards);
            }
        });
        card22.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card22);
                addToUsedCards(card22);
                checkCards(aUsedCards);
            }
        });
        card23.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card23);
                addToUsedCards(card23);
                checkCards(aUsedCards);
            }
        });
        card24.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card24);
                addToUsedCards(card24);
                checkCards(aUsedCards);
            }
        });
        card25.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card25);
                addToUsedCards(card25);
                checkCards(aUsedCards);
            }
        });
        card26.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card26);
                addToUsedCards(card26);
                checkCards(aUsedCards);
            }
        });
        card27.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card27);
                addToUsedCards(card27);
                checkCards(aUsedCards);
            }
        });
        card28.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card28);
                addToUsedCards(card28);
                checkCards(aUsedCards);
            }
        });
        card29.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card29);
                addToUsedCards(card29);
                checkCards(aUsedCards);
            }
        });
        card30.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card30);
                addToUsedCards(card30);
                checkCards(aUsedCards);
            }
        });
        card31.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card31);
                addToUsedCards(card31);
                checkCards(aUsedCards);
            }
        });
        card32.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card32);
                addToUsedCards(card32);
                checkCards(aUsedCards);
            }
        });
        card33.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card33);
                addToUsedCards(card33);
                checkCards(aUsedCards);
            }
        });
        card34.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card34);
                addToUsedCards(card34);
                checkCards(aUsedCards);
            }
        });
        card35.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card35);
                addToUsedCards(card35);
                checkCards(aUsedCards);
            }
        });
        card36.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card36);
                addToUsedCards(card36);
                checkCards(aUsedCards);
            }
        });
        card37.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card37);
                addToUsedCards(card37);
                checkCards(aUsedCards);
            }
        });
        card38.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card38);
                addToUsedCards(card38);
                checkCards(aUsedCards);
            }
        });
        card39.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card39);
                addToUsedCards(card39);
                checkCards(aUsedCards);
            }
        });
        card40.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                flipCardTest(card40);
                addToUsedCards(card40);
                checkCards(aUsedCards);
            }
        });

        //array of all cards, then adding all cards to the array
        //this is used for tracking if all cards are flipped later
        allCards = new cardClass[40];

            allCards[0] = card1;
            allCards[1] = card2;
            allCards[2] = card3;
            allCards[3] = card4;
            allCards[4] = card5;
            allCards[5] = card6;
            allCards[6] = card7;
            allCards[7] = card8;
            allCards[8] = card9;
            allCards[9] = card10;
            allCards[10] = card11;
            allCards[11] = card12;
            allCards[12] = card13;
            allCards[13] = card14;
            allCards[14] = card15;
            allCards[15] = card16;
            allCards[16] = card17;
            allCards[17] = card18;
            allCards[18] = card19;
            allCards[19] = card20;
            allCards[20] = card21;
            allCards[21] = card22;
            allCards[22] = card23;
            allCards[23] = card24;
            allCards[24] = card25;
            allCards[25] = card26;
            allCards[26] = card27;
            allCards[27] = card28;
            allCards[28] = card29;
            allCards[29] = card30;
            allCards[30] = card31;
            allCards[31] = card32;
            allCards[32] = card33;
            allCards[33] = card34;
            allCards[34] = card35;
            allCards[35] = card36;
            allCards[36] = card37;
            allCards[37] = card38;
            allCards[38] = card39;
            allCards[39] = card40;


    }
    cardClass[] aUsedCards;
    cardClass[] allCards;


    private boolean mShowingBack;
    private Animator mFlipIn;
    private Animator mFlipOut;
    private Animator mFlipIn2;
    private Animator mFlipOut2;
    private Animator mFlipIn3;
    private Animator mFlipOut3;


    public int getScore() {
        return score;
    }

    //score variable
    public int score = 0;
    boolean animEnded = false;

    //declare all cards

        cardClass card1;
        cardClass card2;
        cardClass card3;
        cardClass card4;
        cardClass card5;
        cardClass card6;
        cardClass card7;
        cardClass card8;
        cardClass card9;
        cardClass card10;
        cardClass card11;
        cardClass card12;
        cardClass card13;
        cardClass card14;
        cardClass card15;
        cardClass card16;
        cardClass card17;
        cardClass card18;
        cardClass card19;
        cardClass card20;
        cardClass card21;
        cardClass card22;
        cardClass card23;
        cardClass card24;
        cardClass card25;
        cardClass card26;
        cardClass card27;
        cardClass card28;
        cardClass card29;
        cardClass card30;
        cardClass card31;
        cardClass card32;
        cardClass card33;
        cardClass card34;
        cardClass card35;
        cardClass card36;
        cardClass card37;
        cardClass card38;
        cardClass card39;
        cardClass card40;









    private void flipCardTest(cardClass card){
        if(card.showingBack){

            card.showingBack = false;
            mFlipIn3.setTarget(card.front);
            mFlipOut3.setTarget(card.back);

        }
        else{

            Toast.makeText(getApplicationContext(),getString(R.string.choose_another),Toast.LENGTH_LONG).show();
            return;

        }
        mFlipIn3.start();
        mFlipOut3.start();


    }
    public void checkCards(cardClass[] cArray)
    {
        mFlipOut3.addListener(new Animator.AnimatorListener() {


            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                //if both cards are not the default cards (meaning 2 have been flipped)
                if (cArray[0].id != 0 && cArray[1].id != 0){
                    score++;
                    if(cArray[0].id == cArray[1].id){
                        //they match
                        Toast.makeText(getApplicationContext(),getString(R.string.match),Toast.LENGTH_LONG).show();
                        checkWin();
                    }
                    else{
                        //they are not the same, flip back over
                        Toast.makeText(getApplicationContext(),getString(R.string.no_match),Toast.LENGTH_LONG).show();
                        mFlipIn.setTarget(cArray[0].back);
                        mFlipOut.setTarget(cArray[0].front);
                        mFlipIn.start();
                        mFlipOut.start();


                        mFlipIn2.setTarget(cArray[1].back);
                        mFlipOut2.setTarget(cArray[1].front);
                        //mFlipIn.start();
                        mFlipIn2.start();
                        mFlipOut2.start();

                        cArray[0].showingBack = true;
                        cArray[1].showingBack = true;

                    }
                    //set card array back to default
                    aUsedCards[0] = new cardClass(true,findViewById(R.id.testFish1),findViewById(R.id.img1),0);
                    aUsedCards[1] = new cardClass(true,findViewById(R.id.testFish1_2),findViewById(R.id.img2),0);
                }


            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }

        });

    }

    public void addToUsedCards(cardClass c)
    {
        if(aUsedCards[0].id == 0){
            aUsedCards[0] = c;
        }
        else
        {
            aUsedCards[1] = c;
        }
    }

    public void checkWin()
    {
        for (int i = 0; i <allCards.length;i++)
        {
            if(allCards[i].showingBack == true){
                return;
            }
        }
        Toast.makeText(getApplicationContext(),getString(R.string.congratulations)+ score,Toast.LENGTH_LONG).show();

    }

}




            
