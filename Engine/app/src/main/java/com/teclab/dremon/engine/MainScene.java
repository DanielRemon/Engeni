package com.teclab.dremon.engine;
/**
 * Created by Heat on 01/11/2016.
 */
public class MainScene extends DisplayContainer{

    npc bad;
    npc good;
    public MainScene(Resources resources){

        super(resources);
        for(int i=1; i<7;++i){
            bad = new npc("bad"+i, resources);
           good = new npc("good"+i, resources);
            bad.y = (int)(Math.random()*500.0f);
            good.x = (int)(Math.random()*500.0f);
            addChild(bad);
            addChild(good);
        }
    }

    @Override
    public void update() {

    }

}
