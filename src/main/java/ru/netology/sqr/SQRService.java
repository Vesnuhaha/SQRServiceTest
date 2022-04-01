package ru.netology.sqr;

public class SQRService {

    public int calculateSquaresService(int start, int finish) {
        int num = 0;
        for (int i = 10; i <= 99; i++) {
            int j = i * i;
            if (j >= start && j <= finish) {
                num = num + 1;
            }
        }
        return num;
    }
}