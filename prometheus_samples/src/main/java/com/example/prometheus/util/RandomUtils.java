package com.example.prometheus.util;

import java.util.Random;
import lombok.SneakyThrows;

public class RandomUtils {


    private static final Random RND = new Random();

    private static final int[] CLIENT_ERROR_HTTP_STATUSES = new int[]{400, 401, 404};

    public static int generateHttpStatus() {
        int rand = RND.nextInt(1000);
        if (rand <= 800) {
            return 200;
        }
        if (rand > 950) {
            return 500;
        }

        return CLIENT_ERROR_HTTP_STATUSES[rand % CLIENT_ERROR_HTTP_STATUSES.length];
    }

    public static void imitateFakeProcess() {
        int from = (int) (RND.nextDouble() * 1000 % 300) + 300;
        int to = (int) (RND.nextDouble() * 1000 % 1700) + 1;

        imitateFakeProcess(from, to);
    }


    public static void imitateFakeProcess(int millisFrom, int millisTo) {
        long toPause = (int) (RND.nextLong() + 1.0) % millisTo + millisFrom;

        imitateFakeProcess(toPause);
    }

    @SneakyThrows
    public static void imitateFakeProcess(long millisToPause) {
        Thread.sleep(Math.abs(millisToPause));
    }

}
