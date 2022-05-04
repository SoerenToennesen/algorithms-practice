
// 495. Teemo Attacking

class TeemoAttacking {
    public int solution(int[] timeSeries, int duration) {
        int totalDuration = 0;
        if (timeSeries.length == 0) return 0;
        if (timeSeries.length == 1) return duration;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i] + duration >= timeSeries[i+1]) { //overlap
                totalDuration += timeSeries[i+1] - timeSeries[i] - 1;
            } else {
                totalDuration += duration;
            }
        }
        return totalDuration + duration;
    }

    public static void main(String[] args) {
        TeemoAttacking teemoAttacking = new TeemoAttacking();
        System.out.println(teemoAttacking.solution(new int[] {1,4}, 2)); //4
        System.out.println(teemoAttacking.solution(new int[] {1,2}, 2)); //3
    }
}

