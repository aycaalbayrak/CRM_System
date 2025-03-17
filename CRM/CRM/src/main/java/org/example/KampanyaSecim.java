package org.example;

import java.util.*;

public class KampanyaSecim {
    public static List<Kampanya> enIyiKampanyalariBul(List<Kampanya> kampanyalar, double butce) {
        int n = kampanyalar.size();
        int W = (int) (butce * 100);
        double[][] dp = new double[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            Kampanya kampanya = kampanyalar.get(i - 1);
            int maliyet = (int) (kampanya.getMaliyet() * 100);

            for (int w = 0; w <= W; w++) {
                if (maliyet <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], kampanya.getGetiri() + dp[i - 1][w - maliyet]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        List<Kampanya> secilenler = new ArrayList<>();
        int w = W;
        for (int i = n; i > 0 && w > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                secilenler.add(kampanyalar.get(i - 1));
                w -= (int) (kampanyalar.get(i - 1).getMaliyet() * 100);
            }
        }

        return secilenler;
    }
}