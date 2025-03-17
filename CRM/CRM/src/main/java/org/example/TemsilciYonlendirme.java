package org.example;

import java.util.*;

public class TemsilciYonlendirme {
    public static void musteriAtamaDP(List<Musteri> musteriler, List<Temsilci> temsilciler) {
        int m = musteriler.size();
        int n = temsilciler.size();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                Temsilci temsilci = temsilciler.get(j - 1);
                Musteri musteri = musteriler.get(i - 1);

                if (temsilci.getSehir().equals(musteri.getSehir()) && temsilci.getKapasite() > temsilci.getAtanmisMusteriler().size()) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        for (int i = m, j = n; i > 0 && j > 0; ) {
            if (dp[i][j] > dp[i - 1][j - 1]) {
                Temsilci temsilci = temsilciler.get(j - 1);
                Musteri musteri = musteriler.get(i - 1);
                temsilci.musteriEkle(musteri);
                i--;
                j--;
            } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
    }
}