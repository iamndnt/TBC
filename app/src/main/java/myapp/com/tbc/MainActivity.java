package myapp.com.tbc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView b1,b2,b3,b4,b5,la1,la2,la3;
    Button batdau,reset;

    int a[]={R.drawable.la1co,R.drawable.la1ro,R.drawable.la1chuon,R.drawable.la1bich};
    int hai[]={R.drawable.la2co,R.drawable.la2ro,R.drawable.la2chuon,R.drawable.la2bich};
    int ba[]={R.drawable.la3co,R.drawable.la3ro,R.drawable.la3chuon,R.drawable.la3bich};
    int bon[]={R.drawable.la4co,R.drawable.la4ro,R.drawable.la4chuon,R.drawable.la4bich};
    int nam[]={R.drawable.la5co,R.drawable.la5ro,R.drawable.la5chuon,R.drawable.la5bich};
    int sau[]={R.drawable.la6co,R.drawable.la6ro,R.drawable.la6chuon,R.drawable.la6bich};
    int bay[]={R.drawable.la7co,R.drawable.la7ro,R.drawable.la7chuon,R.drawable.la7bich};
    int tam[]={R.drawable.la8co,R.drawable.la8ro,R.drawable.la8chuon,R.drawable.la8bich};
    int chin[]={R.drawable.la9co,R.drawable.la9ro,R.drawable.la9chuon,R.drawable.la9bich};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thamchieu();

        batdau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chuyen();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
    }

    private void reset() {
        b1.setImageResource(R.drawable.back);
        b2.setImageResource(R.drawable.back);
        b3.setImageResource(R.drawable.back);

        b1.animate().x(b5.getX()).y(b5.getY()).setDuration(2000).withEndAction(new Runnable() {
            @Override
            public void run() {
                b1.setX(b5.getX());
                b1.setY(b5.getY());
            }
        }).start();

        b2.animate().x(b5.getX()).y(b5.getY()).setDuration(2000).withEndAction(new Runnable() {
            @Override
            public void run() {
                b2.setX(b5.getX());
                b2.setY(b5.getY());
            }
        }).start();

        b3.animate().x(b5.getX()).y(b5.getY()).setDuration(2000).withEndAction(new Runnable() {
            @Override
            public void run() {
                b3.setX(b5.getX());
                b3.setY(b5.getY());
            }
        }).start();

        batdau.setClickable(true);
    }


    private void chuyen() {
        int a=card1();
        int b=card2();
        int c=card3();
        int res=(a+b+c)%10;
        String tb="Chúc mừng số điểm của bạn là "+res;
        if(res==0)
            tb="Bạn đã tròn";
        Toast.makeText(MainActivity.this,tb,Toast.LENGTH_SHORT).show();
        batdau.setClickable(false);
    }

    private int card1() {
        Random random = new Random();
        int so = random.ints(1, 10).findFirst().getAsInt();
        int loai=random.ints(0, 4).findFirst().getAsInt();

        if(so==1)
        {
                b1.setImageResource(a[loai]);
        }
        else if(so==2)
        {
            b1.setImageResource(hai[loai]);
        }
        else if(so==3)
        {
            b1.setImageResource(ba[loai]);
        }
        else if(so==4)
        {
            b1.setImageResource(bon[loai]);
        }
        else if(so==5)
        {
            b1.setImageResource(nam[loai]);
        }
        else if(so==6)
        {
            b1.setImageResource(sau[loai]);
        }
        else if(so==7)
        {
            b1.setImageResource(bay[loai]);
        }
        else if(so==8)
        {
            b1.setImageResource(tam[loai]);
        }
        else
            b1.setImageResource(chin[loai]);
        b1.animate().x(la1.getX()).y(la1.getY()).setDuration(2000).withEndAction(new Runnable() {
            @Override
            public void run() {
                b1.setX(la1.getX());
                b1.setY(la1.getY());
            }
        }).start();

        return so;
    }

    private int card2() {
        Random random = new Random();
        int so = random.ints(1, 10).findFirst().getAsInt();
        int loai=random.ints(0, 4).findFirst().getAsInt();

        if(so==1)
        {

            b2.setImageResource(a[loai]);
        }
        else if(so==2)
        {
            b2.setImageResource(hai[loai]);
        }
        else if(so==3)
        {
            b2.setImageResource(ba[loai]);
        }
        else if(so==4)
        {
            b2.setImageResource(bon[loai]);
        }
        else if(so==5)
        {
            b2.setImageResource(nam[loai]);
        }
        else if(so==6)
        {
            b2.setImageResource(sau[loai]);
        }
        else if(so==7)
        {
            b2.setImageResource(bay[loai]);
        }
        else if(so==8)
        {
            b2.setImageResource(tam[loai]);
        }
        else
            b2.setImageResource(chin[loai]);

        b2.animate().x(la2.getX()).y(la2.getY()).setDuration(2000).withEndAction(new Runnable() {
            @Override
            public void run() {
                b2.setX(la2.getX());
                b2.setY(la2.getY());
            }
        }).start();

        return so;
    }
    private int card3() {
        Random random = new Random();
        int so = random.ints(1, 10).findFirst().getAsInt();
        int loai=random.ints(0, 4).findFirst().getAsInt();

        if(so==1)
        {

            b3.setImageResource(a[loai]);
        }
        else if(so==2)
        {
            b3.setImageResource(hai[loai]);
        }
        else if(so==3)
        {
            b3.setImageResource(ba[loai]);
        }
        else if(so==4)
        {
            b3.setImageResource(bon[loai]);
        }
        else if(so==5)
        {
            b3.setImageResource(nam[loai]);
        }
        else if(so==6)
        {
            b3.setImageResource(sau[loai]);
        }
        else if(so==7)
        {
            b3.setImageResource(bay[loai]);
        }
        else if(so==8)
        {
            b3.setImageResource(tam[loai]);
        }
        else
            b3.setImageResource(chin[loai]);
        b3.animate().x(la3.getX()).y(la3.getY()).setDuration(2000).withEndAction(new Runnable() {
            @Override
            public void run() {
                b3.setX(la3.getX());
                b3.setY(la3.getY());
            }
        }).start();

        return so;

    }

    private void thamchieu() {
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        la1=findViewById(R.id.la1);
        la2=findViewById(R.id.la2);
        la3=findViewById(R.id.la3);

        batdau=findViewById(R.id.btnbatdau);
        reset=findViewById(R.id.btnreset);
    }
}