
// Answer gotten from https://stackoverflow.com/questions/13465098/decimal-to-hexadecimal-converter-in-java

// 405. ConvertANumberToHexadecimal

class ImageSmoother {
    public int[][] solution(int[][] img) {
        int[][] test = new int[][] {{1,2,3},{1,2,3}};
        return test;
    }

    public static void main(String[] args) {
        ImageSmoother imageSmoother = new ImageSmoother();
        System.out.println(imageSmoother.solution(new int[][] {{1,1,1},{1,0,1},{1,1,1}}));
        System.out.println(imageSmoother.solution(new int[][] {{100,200,100},{200,50,200},{100,200,100}}));
    }
}

