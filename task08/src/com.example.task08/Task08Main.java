package com.example.task08;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
         */
    }

    static long mult(int[] arr) {

        if (arr.length == 0)
            return 0;

        long[] b = Arrays.stream(arr).asLongStream().toArray();
        OptionalLong a = Arrays.stream(b).reduce((x, y) -> x*y);
        long num = a.getAsLong();
        return num;
    }

}