package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bg = Bitmap.createBitmap(720,1280, Bitmap.Config.ARGB_8888);
        ImageView img = (ImageView) findViewById(R.id.image);
        img.setBackgroundDrawable(new BitmapDrawable(bg));
        Canvas c = new Canvas(bg);
        Paint p = new Paint();
        p.setColor(Color.BLUE);
        p.setTextSize(30);
        c.drawText("Rectangle",420,150,p);
        c.drawRect(350,200,650,400,p);
        c.drawText("Circle",450,450,p);
        c.drawCircle(500,600,100,p);
        c.drawText("Triangle",420,750,p);
//        Path path = new Path();
//        Point pa = new Point(620,720);
//        Point pb = new Point(720,920);
//        Point pc = new Point(920,620);
//        path.lineTo(pa.x,pa.y);
//        path.lineTo(pb.x,pb.y);
//        path.lineTo(pc.x,pc.y);
//        path.lineTo(pa.x,pa.y);
//        c.drawPath(path,p);
    }
}