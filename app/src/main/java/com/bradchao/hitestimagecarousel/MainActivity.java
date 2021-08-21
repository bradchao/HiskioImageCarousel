package com.bradchao.hitestimagecarousel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private ImageCarousel carousel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carousel = findViewById(R.id.carousel);
        carousel.registerLifecycle(getLifecycle());

        LinkedList<CarouselItem> imgs = new LinkedList<>();
        imgs.add(new CarouselItem(R.drawable.img0,"img0"));
        imgs.add(new CarouselItem(R.drawable.img1,"img1"));
        imgs.add(new CarouselItem(R.drawable.img2,"img2"));

        carousel.setData(imgs);
        carousel.setAutoPlay(true);
        carousel.setAutoPlayDelay(3000);
        carousel.setAutoWidthFixing(true);
        carousel.setTouchToPause(true);
        carousel.setInfiniteCarousel(true);

    }
}