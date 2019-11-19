package com.leyou.upload.test;

/**
 * @ClassName Demo
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/9/25
 * @Version V1.0
 **/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import java.util.Scanner;

public class Demo {
    public static int findKthNumber(int n, int k) {
        int curr = 1;
        k = k - 1;
        while (k > 0) {
            long steps = 0, first = curr, last = curr + 1;
            while (first <= n) {
                steps += Math.min((long)n + 1, last) - first;
                first *= 10;
                last *= 10;
            }
            if (steps <= k) {
                curr += 1;
                k -= steps;
            } else {
                curr *= 10;
                k -= 1;
            }
        }
        return curr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findKthNumber(n,k));
    }
}