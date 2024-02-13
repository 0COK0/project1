package com.quest.chap08.Game01;

public class Slime extends Monster {

    @Override
    public void attack() {
        System.out.println("슬라임이 플레이어를 공격합니다.");
    }
    @Override
    public void damage() {
        System.out.println("슬라임이 데미지를 입었다.");
    }

    @Override
    public void die() {
        System.out.println("슬라임이 쓰러졌습니다.");
    }

    public void split() {
        System.out.println("슬라임이 분열 하였습니다.");
    }
}
