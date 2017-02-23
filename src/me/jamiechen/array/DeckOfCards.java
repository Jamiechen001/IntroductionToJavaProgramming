package me.jamiechen.array;

/**
 * 从一副 52 张的牌中随机挑出 4 张牌
 *
 * Created by JamieChen on 2017/2/14 0014.
 */
public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"黑桃", "红桃", "方片", "梅花"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        // 初始化牌组
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        // 打乱牌组
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // 抽取前 4 张牌并显示
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.printf("牌号 %-3d: %2s%2s\n", deck[i], suit, rank);
        }
    }
}
