class Scorecard {
    private boolean[] results;
    private int count = 0;

    Scorecard(int questions) {
        results = new boolean[questions];
    }

    void recordAnswer(boolean answer) {
        if (count < results.length) {
            results[count] = answer;
            count++;
        }
    }

    int getScore() {
        int score = 0;

        for (int i = 0; i < count; i++)
            if (results[i])
                score++;

        return score;
    }
}

class Main {
    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println(sc.getScore());
    }
}
