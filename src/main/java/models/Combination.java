package models;

import type.Color;
import type.ResultComparative;

import java.util.*;

public class Combination {

    public static final int NUMBER_COLORS = 4;
    public static final String PATTERN = "^(?!.*(.).*\1)[rgybmc]{4}$";
    private final List<Color> combination;

    protected Combination(String combination) {
        if(combination == null){
            this.combination = Combination.getRandomCombination();
        }else{
            this.combination = new ArrayList<>();
            for (char ch : combination.toCharArray()) {
                this.combination.add(Color.getColor(ch));
            }
        }

    }

    public static List<Color> getRandomCombination(){
        List<Color> propositions = new ArrayList<>(List.of(Color.values()));
        int[] listIndex = new int[2];
        do{
            for (int i = 0; i< 2; i++){
                listIndex[i] = new Random().nextInt(6);
            }
        }while (listIndex[0] != listIndex[1]);

        for(int index : listIndex){
            if(propositions.size() > index) {
                propositions.remove(index);
            }
        }


        Collections.shuffle(propositions);
        return propositions;
    }

    public ResultComparative compare(Combination other){
            int black = 0;
            int white = 0;

        for(int i = 0; i < this.combination.size(); i++){
            if(this.combination.get(i) == other.combination.get(i)){
                black ++;
            }else if(this.combination.contains(other.combination.get(i))){
                white ++;
            }
        }

        return new ResultComparative(black, white);
    }

    public String toStringSecret(){
        return "*".repeat(combination.size());
    }

    @Override
    public String toString() {
        StringBuilder word = new StringBuilder();
        for(Color color : combination){
            word.append(color.toString());
        }

        return word.toString();
    }
}
